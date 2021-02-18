import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { MatDialogRef } from '@angular/material/dialog';
import { PowerService } from 'src/app/shared/service/power.service';

@Component({
  selector: 'app-new-power',
  templateUrl: './new-power.component.html',
  styleUrls: ['./new-power.component.css']
})
export class NewPowerComponent implements OnInit {
  public powerForm: any;
  public points: number = 50;

  constructor(
    public dialogRef: MatDialogRef<NewPowerComponent>,
    private fb: FormBuilder,
    private service: PowerService
  ) { }

  ngOnInit(): void {
    this.initializerForm();
  }

  initializerForm(){
    this.powerForm = this.fb.group({
      name: ['', [Validators.required]],
      description: ['', [Validators.required]],
      icon_name: ['', [Validators.required]],
    });

    this.powerForm.physical_attack = 1;
    this.powerForm.magic_attack = 1;
    this.powerForm.physical_defense = 1;
    this.powerForm.magic_defense = 1;
    this.powerForm.stamina_consumption = 1;
    this.powerForm.magic_consumption = 1;
    this.powerForm.duration_shifts = 1;
    this.powerForm.shifts_off = 1;
  }

  close(){
    this.dialogRef.close(true);
    this.powerForm.reset();
  }

  physicalAttackMinus(){
    if(this.powerForm.physical_attack > 1){
      this.powerForm.physical_attack--;
      this.points++;
      this.updatePassiveEffects();
    }
  }

  physicalAttackPlus(){
    if(this.points > 0){
      this.powerForm.physical_attack++;
      this.points--;
      this.updatePassiveEffects();
    }
  }

  magicAttackMinus(){
    if(this.powerForm.magic_attack > 1){
      this.powerForm.magic_attack--;
      this.points++;
      this.updatePassiveEffects();
    }
  }

  magicAttackPlus(){
    if(this.points > 0){
      this.powerForm.magic_attack++;
      this.points--;
      this.updatePassiveEffects();
    }
  }

  physicalDefenseMinus(){
    if(this.powerForm.physical_defense > 1){
      this.powerForm.physical_defense--;
      this.points++;
      this.updatePassiveEffects();
    }
  }

  physicalDefensePlus(){
    if(this.points > 0){
      this.powerForm.physical_defense++;
      this.points--;
      this.updatePassiveEffects();
    }
  }

  magicDefenseMinus(){
    if(this.powerForm.magic_defense > 1){
      this.powerForm.magic_defense--;
      this.points++;
      this.updatePassiveEffects();
    }
  }

  magicDefensePlus(){
    if(this.points > 0){
      this.powerForm.magic_defense++;
      this.points--;
      this.updatePassiveEffects();
    }
  }

  durationShiftsMinus(){
    if(this.powerForm.duration_shifts > 1){
      this.powerForm.duration_shifts--;
      this.points++;
      this.updatePassiveEffects();
    }
  }

  durationShiftsPlus(){
    if(this.points > 0){
      this.powerForm.duration_shifts++;
      this.points--;
      this.updatePassiveEffects();
    }
  }

  updatePassiveEffects(){
    this.updateShiftsOff();
    this.updateStaminaConsumption();
    this.updateMagicConsumption();
  }

  updateShiftsOff(){
    this.powerForm.shifts_off = Math.ceil(this.powerForm.duration_shifts * 
    ((this.powerForm.physical_attack + this.powerForm.magic_attack +
      this.powerForm.physical_defense + this.powerForm.magic_defense) * .1));
  }

  updateStaminaConsumption(){
    this.powerForm.stamina_consumption = this.powerForm.duration_shifts *
    (10 * (this.powerForm.physical_attack + this.powerForm.physical_defense) +
    (this.powerForm.magic_attack +  this.powerForm.magic_defense));
  }

  updateMagicConsumption(){
    this.powerForm.magic_consumption = this.powerForm.duration_shifts *
    (10 * (this.powerForm.magic_attack +  this.powerForm.magic_defense) +
    (this.powerForm.physical_attack + this.powerForm.physical_defense));
  }

  save(){
    this.service.post(this.powerForm.value).subscribe(result => {});
    this.dialogRef.close(true);
    this.powerForm.reset();
    window.location.reload();
  }
}
