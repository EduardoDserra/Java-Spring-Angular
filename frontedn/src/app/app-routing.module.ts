import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/layouts/login/login.component';
import { PrincipalComponent } from './components/layouts/principal/principal.component';
import { ProdutolitsComponent } from './components/produtolits/produtolits.component';
import { ProdutodetailComponent } from './components/produtodetail/produtodetail.component';
import { CategorialistComponent } from './components/categorialist/categorialist.component';

const routes: Routes = [
  {path: "", redirectTo: "login", pathMatch: 'full'},
  {path: "login", component: LoginComponent},
  {path: "admin", component: PrincipalComponent, children: [
    {path: "produtos", component: ProdutolitsComponent},
    {path: "produtos/new", component: ProdutodetailComponent},
    {path: "produtos/edit/:id", component: ProdutodetailComponent},
    {path: "categorias", component: CategorialistComponent},
    {path: "categorias/new", component: CategorialistComponent},
    {path: "categorias/edit/:id", component: CategorialistComponent}
  ]},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
