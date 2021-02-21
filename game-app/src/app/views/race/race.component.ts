import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { Race } from 'src/app/shared/model/race.module';
import { RaceService } from 'src/app/shared/service/race.service';

@Component({
  selector: 'app-race',
  templateUrl: './race.component.html',
  styleUrls: ['./race.component.css']
})
export class RaceComponent implements OnInit {
  list_breeds: Race[] = []

  constructor(
    public service: RaceService,
    public dialog: MatDialog
  ) { }

  ngOnInit(): void {
    this.getAll();
  }

  getAll(){
    this.service.getAll().subscribe(
      data=>{
        this.list_breeds = data.content
      }
    )
  }

  newRace(){

  }

  edit(race: any){

  }

  delete(id: any){
    
  }

}
