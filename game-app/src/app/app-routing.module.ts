import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CharacterComponent } from './views/character/character.component';
import { HomeComponent } from './views/home/home.component';
import { PowerComponent } from './views/power/power.component';
import { RaceComponent } from './views/race/race.component';

const routes: Routes = [
  {path: "", component: HomeComponent},
  {path: "power", component: PowerComponent},
  {path: "character", component: CharacterComponent},
  {path: "race", component: RaceComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
