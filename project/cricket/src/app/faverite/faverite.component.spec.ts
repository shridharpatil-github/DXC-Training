import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FaveriteComponent } from './faverite.component';
import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

describe('FaveriteComponent', () => {
  let component: FaveriteComponent;
  let fixture: ComponentFixture<FaveriteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FaveriteComponent ],
      schemas: [
        CUSTOM_ELEMENTS_SCHEMA
      ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FaveriteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
