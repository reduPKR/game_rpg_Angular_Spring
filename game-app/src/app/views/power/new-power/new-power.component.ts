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
      physical_attack:  [1, [Validators.required]],
      magic_attack:  [1, [Validators.required]],
      physical_defense:  [1, [Validators.required]],
      magic_defense:  [1, [Validators.required]],
      stamina_consumption:  [1, [Validators.required]],
      magic_consumption:  [1, [Validators.required]],
      duration_shifts:  [1, [Validators.required]],
      shifts_off:  [1, [Validators.required]]
    });
  }

  close(){
    this.dialogRef.close(true);
    this.powerForm.reset();
  }

  physicalAttackMinus(){
    if(this.powerForm.value.physical_attack > 1){
      this.powerForm.value.physical_attack--;
      this.points++;
      this.updatePassiveEffects();
    }
  }

  physicalAttackPlus(){
    if(this.points > 0){
      this.powerForm.value.physical_attack++;
      this.points--;
      this.updatePassiveEffects();
    }
  }

  magicAttackMinus(){
    if(this.powerForm.value.magic_attack > 1){
      this.powerForm.value.magic_attack--;
      this.points++;
      this.updatePassiveEffects();
    }
  }

  magicAttackPlus(){
    if(this.points > 0){
      this.powerForm.value.magic_attack++;
      this.points--;
      this.updatePassiveEffects();
    }
  }

  physicalDefenseMinus(){
    if(this.powerForm.value.physical_defense > 1){
      this.powerForm.value.physical_defense--;
      this.points++;
      this.updatePassiveEffects();
    }
  }

  physicalDefensePlus(){
    if(this.points > 0){
      this.powerForm.value.physical_defense++;
      this.points--;
      this.updatePassiveEffects();
    }
  }

  magicDefenseMinus(){
    if(this.powerForm.value.magic_defense > 1){
      this.powerForm.value.magic_defense--;
      this.points++;
      this.updatePassiveEffects();
    }
  }

  magicDefensePlus(){
    if(this.points > 0){
      this.powerForm.value.magic_defense++;
      this.points--;
      this.updatePassiveEffects();
    }
  }

  durationShiftsMinus(){
    if(this.powerForm.value.duration_shifts > 1){
      this.powerForm.value.duration_shifts--;
      this.points++;
      this.updatePassiveEffects();
    }
  }

  durationShiftsPlus(){
    if(this.points > 0){
      this.powerForm.value.duration_shifts++;
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
    this.powerForm.value.shifts_off = Math.ceil(this.powerForm.value.duration_shifts * 
    ((this.powerForm.value.physical_attack + this.powerForm.value.magic_attack +
      this.powerForm.value.physical_defense + this.powerForm.value.magic_defense) * .1));
  }

  updateStaminaConsumption(){
    this.powerForm.value.stamina_consumption = this.powerForm.value.duration_shifts *
    (10 * (this.powerForm.value.physical_attack + this.powerForm.value.physical_defense) +
    (this.powerForm.value.magic_attack +  this.powerForm.value.magic_defense));
  }

  updateMagicConsumption(){
    this.powerForm.value.magic_consumption = this.powerForm.value.duration_shifts *
    (10 * (this.powerForm.value.magic_attack +  this.powerForm.value.magic_defense) +
    (this.powerForm.value.physical_attack + this.powerForm.value.physical_defense));
  }

  save(){
    this.service.post(this.powerForm.value).subscribe(result => {});
    this.dialogRef.close(true);
    this.powerForm.reset();
    window.location.reload();
  }
}
