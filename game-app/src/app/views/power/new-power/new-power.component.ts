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
  }

  close(){
    this.dialogRef.close(true);
    this.powerForm.reset();
  }

  physicalAttackMinus(){
    if(this.powerForm.physical_attack > 1){
      this.powerForm.physical_attack--;
      this.points++;
    }
  }

  physicalAttackPlus(){
    if(this.points > 0){
      this.powerForm.physical_attack++;
      this.points--;
    }
  }

 

}
