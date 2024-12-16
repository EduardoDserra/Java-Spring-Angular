import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CategoriadetailsComponent } from './categoriadetails.component';

describe('CategoriadetailsComponent', () => {
  let component: CategoriadetailsComponent;
  let fixture: ComponentFixture<CategoriadetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [CategoriadetailsComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CategoriadetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
