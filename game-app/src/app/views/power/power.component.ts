import { Component, OnInit } from '@angular/core';
import { Power } from 'src/app/shared/model/power.model';
import { PowerService } from 'src/app/shared/service/power.service';

@Component({
  selector: 'app-power',
  templateUrl: './power.component.html',
  styleUrls: ['./power.component.css']
})
export class PowerComponent implements OnInit {
  powers_list: Power[] = [];

  constructor(
    public service: PowerService
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
}
