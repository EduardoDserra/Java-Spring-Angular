import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProdutodetailComponent } from './produtodetail.component';

describe('ProdutodetailComponent', () => {
  let component: ProdutodetailComponent;
  let fixture: ComponentFixture<ProdutodetailComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ProdutodetailComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProdutodetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
