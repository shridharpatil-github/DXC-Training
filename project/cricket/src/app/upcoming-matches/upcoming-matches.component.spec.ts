import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpcomingMatchesComponent } from './upcoming-matches.component';
import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

describe('UpcomingMatchesComponent', () => {
  let component: UpcomingMatchesComponent;
  let fixture: ComponentFixture<UpcomingMatchesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpcomingMatchesComponent ],
      schemas: [
        CUSTOM_ELEMENTS_SCHEMA
      ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpcomingMatchesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
