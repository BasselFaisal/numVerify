import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NumDataComponent } from './num-data.component';

describe('NumDataComponent', () => {
  let component: NumDataComponent;
  let fixture: ComponentFixture<NumDataComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NumDataComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NumDataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
