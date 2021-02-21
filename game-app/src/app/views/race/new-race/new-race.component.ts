import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { MatDialogRef } from '@angular/material/dialog';
import { RaceService } from 'src/app/shared/service/race.service';

@Component({
  selector: 'app-new-race',
  templateUrl: './new-race.component.html',
  styleUrls: ['./new-race.component.css']
})
export class NewRaceComponent implements OnInit {
  public raceForm: any;
  public points: number = 100;

  constructor(
    public dialogRef: MatDialogRef<NewRaceComponent>,
    public fb: FormBuilder,
    public service: RaceService
  ) { }

  ngOnInit(): void {
    this.initializerForm();
  }

  initializerForm(){
    this.raceForm = this.fb.group({
      name: ['', [Validators.required]],
      description: ['', [Validators.required]],
      // skill_points:{
      //   health: 1,
      //   magic: 1,
      //   stamina: 1,
      //   health_regeneration: 1,
      //   magic_regeneration: 1,
      //   stamina_regeneration: 1,
      //   physical_attack: 1,
      //   magic_attack: 1,
      //   physical_defense: 1,
      //   magic_defense: 1,
      //   ability: 1
      // }
    });
  }

  close(){
    this.dialogRef.close(true);
    this.raceForm.reset();
  }

  healthMinus(){
    if(this.raceForm.value.skill_points.health > 1){
      this.points++;
      this.raceForm.value.skill_points.health--;
    }
  }

  healthPlus(){
    if(this.points > 0){
      this.points--;
      this.raceForm.value.skill_points.health++;
    }
  }

  magicMinus(){
    if(this.raceForm.value.skill_points.magic > 1){
      this.points++;
      this.raceForm.value.skill_points.magic--;
    }
  }

  magicPlus(){
    if(this.points > 0){
      this.points--;
      this.raceForm.value.skill_points.magic++;
    }
  }

  staminaMinus(){
    if(this.raceForm.value.skill_points.stamina > 1){
      this.points++;
      this.raceForm.value.skill_points.stamina--;
    }
  }

  staminaPlus(){
    if(this.points > 0){
      this.points--;
      this.raceForm.value.skill_points.stamina++;
    }
  }

  healthRegenerationMinus(){
    if(this.raceForm.value.skill_points.health_regeneration > 1){
      this.points++;
      this.raceForm.value.skill_points.health_regeneration--;
    }
  }

  healthRegenerationPlus(){
    if(this.points > 0){
      this.points--;
      this.raceForm.value.skill_points.health_regeneration++;
    }
  }

  magicRegenerationMinus(){
    if(this.raceForm.value.skill_points.magic_regeneration > 1){
      this.points++;
      this.raceForm.value.skill_points.magic_regeneration--;
    }
  }

  magicRegenerationPlus(){
    if(this.points > 0){
      this.points--;
      this.raceForm.value.skill_points.magic_regeneration++;
    }
  }

  staminaRegenerationMinus(){
    if(this.raceForm.value.skill_points.stamina_regeneration > 1){
      this.points++;
      this.raceForm.value.skill_points.stamina_regeneration--;
    }
  }

  staminaRegenerationPlus(){
    if(this.points > 0){
      this.points--;
      this.raceForm.value.skill_points.stamina_regeneration++;
    }
  }

  physicalAttackMinus(){
    if(this.raceForm.value.skill_points.physical_attack > 1){
      this.raceForm.value.skill_points.physical_attack--;
      this.points++;
    }
  }

  physicalAttackPlus(){
    if(this.points > 0){
      this.raceForm.value.skill_points.physical_attack++;
      this.points--;
    }
  }

  magicAttackMinus(){
    if(this.raceForm.value.skill_points.magic_attack > 1){
      this.raceForm.value.skill_points.magic_attack--;
      this.points++;
    }
  }

  magicAttackPlus(){
    if(this.points > 0){
      this.raceForm.value.skill_points.magic_attack++;
      this.points--;
    }
  }

  physicalDefenseMinus(){
    if(this.raceForm.value.skill_points.physical_defense > 1){
      this.raceForm.value.skill_points.physical_defense--;
      this.points++;
    }
  }

  physicalDefensePlus(){
    if(this.points > 0){
      this.raceForm.value.skill_points.physical_defense++;
      this.points--;
    }
  }

  magicDefenseMinus(){
    if(this.raceForm.value.skill_points.magic_defense > 1){
      this.raceForm.value.skill_points.magic_defense--;
      this.points++;
    }
  }

  magicDefensePlus(){
    if(this.points > 0){
      this.raceForm.value.skill_points.magic_defense++;
      this.points--;
    }
  }

  abilityMinus(){
    if(this.raceForm.value.skill_points.ability > 1){
      this.raceForm.value.skill_points.ability--;
      this.points++;
    }
  }

  abilityPlus(){
    if(this.points > 0){
      this.raceForm.value.skill_points.ability++;
      this.points--;
    }
  }

  save(){
    this.service.post(this.raceForm.value).subscribe(result => {});
    // this.dialogRef.close(true);
    // this.raceForm.reset();
    // window.location.reload();
  }
}
