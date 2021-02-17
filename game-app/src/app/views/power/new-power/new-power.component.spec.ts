import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NewPowerComponent } from './new-power.component';

describe('NewPowerComponent', () => {
  let component: NewPowerComponent;
  let fixture: ComponentFixture<NewPowerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NewPowerComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NewPowerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
