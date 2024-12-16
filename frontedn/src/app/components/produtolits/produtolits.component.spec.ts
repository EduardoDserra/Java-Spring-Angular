import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProdutolitsComponent } from './produtolits.component';

describe('ProdutolitsComponent', () => {
  let component: ProdutolitsComponent;
  let fixture: ComponentFixture<ProdutolitsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ProdutolitsComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProdutolitsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
