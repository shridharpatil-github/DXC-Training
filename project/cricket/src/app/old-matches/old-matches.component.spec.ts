import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OldMatchesComponent } from './old-matches.component';
import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

describe('OldMatchesComponent', () => {
  let component: OldMatchesComponent;
  let fixture: ComponentFixture<OldMatchesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ OldMatchesComponent ],
      schemas: [
        CUSTOM_ELEMENTS_SCHEMA
      ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OldMatchesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
