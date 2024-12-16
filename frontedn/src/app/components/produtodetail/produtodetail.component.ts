import { Component, Inject } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Produto } from '../../models/produto';
import { ActivatedRoute } from '@angular/router';



@Component({
  selector: 'app-produtodetail',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './produtodetail.component.html',
  styleUrl: './produtodetail.component.css'
})
export class ProdutodetailComponent {

  produto: Produto = new Produto(0,"");

  router = Inject(ActivatedRoute);

  constructor(){
    let id = this.router.snapshot.params['id'];
    if (id > 0) {
      this.findById(id);
    }
  }

  findById(id: number){
    let produtoRetornado: Produto = new Produto(id, "tv");
    this.produto = produtoRetornado;
  }

  salvar(){
    alert('Salvo com sucesso!')
  }

}
