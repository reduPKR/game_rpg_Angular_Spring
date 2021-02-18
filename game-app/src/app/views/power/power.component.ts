import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { Power } from 'src/app/shared/model/power.model';
import { PowerService } from 'src/app/shared/service/power.service';
import { NewPowerComponent } from './new-power/new-power.component';

@Component({
  selector: 'app-power',
  templateUrl: './power.component.html',
  styleUrls: ['./power.component.css']
})
export class PowerComponent implements OnInit {
  powers_list: Power[] = [];

  constructor(
    public service: PowerService,
    public dialog: MatDialog 
  ) { }

  ngOnInit(): void {
    this.getAll();
  }

  getAll(){
    this.service.getAll().subscribe(
      data=>{
        this.powers_list = data.content;
      }
    )
  }

  newPower(){
    const dialogRef = this.dialog.open(NewPowerComponent, {
      minWidth: '800px',
    });

    dialogRef.afterClosed().subscribe(result => {
      console.log('Bye');
    });
  }

  delete(id: any){
    console.log("1 -> "+id)
    this.service.delete(id).subscribe(result => {});
    window.location.reload();
  }
}
