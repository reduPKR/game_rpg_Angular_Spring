import { Component, Inject, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { Power } from 'src/app/shared/model/power.model';
import { PowerService } from 'src/app/shared/service/power.service';

@Component({
  selector: 'app-edit-power',
  templateUrl: './edit-power.component.html',
  styleUrls: ['./edit-power.component.css']
})
export class EditPowerComponent implements OnInit {
  public powerForm: any;
  public points: number = 50;

  constructor(
    public dialogRef: MatDialogRef<EditPowerComponent>,
    private fb: FormBuilder,
    private service: PowerService,
    @Inject(MAT_DIALOG_DATA) public power: Power
  ) { }

  ngOnInit(): void {
    this.initializerForm();
  }

  initializerForm(){
    this.powerForm = this.fb.group({
      id: this.power.id,
      name: [this.power.name, [Validators.required]],
      description: [this.power.description, [Validators.required]],
      icon_name: [this.power.icon_name, [Validators.required]],
      physical_attack:  this.power.physical_attack,
      magic_attack:  this.power.magic_attack,
      physical_defense:  this.power.physical_defense,
      magic_defense:  this.power.magic_defense,
      stamina_consumption:  this.power.stamina_consumption,
      magic_consumption:  this.power.magic_consumption,
      duration_shifts:  this.power.duration_shifts,
      shifts_off:  this.power.shifts_off
    });
  }

  close(){
    this.dialogRef.close(true);
    this.powerForm.reset();
  }

  physicalAttackMinus(){
    console.log(this.powerForm.value.physical_attack)
    if(this.powerForm.value.physical_attack > 1){
      this.powerForm.value.physical_attack--;
      this.points++;
      this.updatePassiveEffects();
    }
  }

  physicalAttackPlus(){
    console.log(this.powerForm.value.physical_attack)
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
    this.service.put(this.powerForm.value).subscribe(result => {});
    this.dialogRef.close(true);
    this.powerForm.reset();
    window.location.reload();
  }
}
