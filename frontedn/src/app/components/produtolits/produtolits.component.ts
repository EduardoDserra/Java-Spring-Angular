import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Produto } from '../../models/produto';

@Component({
  selector: 'app-produtolits',
  standalone: false,
  templateUrl: './produtolits.component.html',
  styleUrl: './produtolits.component.css'
})
export class ProdutolitsComponent {

  lista: Produto[] = [];


  constructor(){
    this.lista.push(new Produto(1, 'tv'))
  }

  deletById(produto : Produto){
   if (confirm("Tem certeza que deseja deletar este item?")){
   let indice = this.lista.findIndex( x => {return x.id == produto.id} )
   this.lista.splice(indice, 1)
    }
  }

}
