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
  public newPowerForm: any;

  constructor(
    public dialogRef: MatDialogRef<NewPowerComponent>,
    private fb: FormBuilder,
    private service: PowerService
  ) { }

  ngOnInit(): void {
    this.initializerForm();
  }

  initializerForm(){
    this.newPowerForm = this.fb.group({
      name: ['', [Validators.required]],
      description: ['', [Validators.required]],
      icon_name: ['', [Validators.required]],
      physical_attack: ['', [Validators.required]],
      magic_attack: ['', [Validators.required]],
      physical_defense: ['', [Validators.required]],
      magic_defense: ['', [Validators.required]],
      stamina_consumption: ['', [Validators.required]],
      magic_consumption: ['', [Validators.required]],
    });
  }

  close(){
    this.dialogRef.close(true);
    this.newPowerForm.reset();
  }
}
