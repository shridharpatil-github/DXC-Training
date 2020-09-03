import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NewMatchesComponent } from './new-matches.component';
import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

describe('NewMatchesComponent', () => {
  let component: NewMatchesComponent;
  let fixture: ComponentFixture<NewMatchesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NewMatchesComponent ],
      schemas: [
        CUSTOM_ELEMENTS_SCHEMA
      ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NewMatchesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
