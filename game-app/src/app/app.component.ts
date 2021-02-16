import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent{
  title: string = "Home";

  constructor(private router: Router){
  }

  goToHome(){
    this.title = "Home";
    this.router.navigate([""]);
  }

  goToCharacter(){
    this.title = "Personagem";
    this.router.navigate(["character"]);
  }
}
