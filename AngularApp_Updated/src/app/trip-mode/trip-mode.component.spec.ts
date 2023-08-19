import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TripModeComponent } from './trip-mode.component';

describe('TripModeComponent', () => {
  let component: TripModeComponent;
  let fixture: ComponentFixture<TripModeComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TripModeComponent]
    });
    fixture = TestBed.createComponent(TripModeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
