import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PrincipalComponent } from './components/layouts/principal/principal.component';
import { LoginComponent } from './components/layouts/login/login.component';
import { ProdutolitsComponent } from './components/produtolits/produtolits.component';
import { ProdutodetailComponent } from './components/produtodetail/produtodetail.component';
import { CategorialistComponent } from './components/categorialist/categorialist.component';
import { CategoriadetailsComponent } from './components/categoriadetails/categoriadetails.component';
import { MenuComponent } from './components/layouts/menu/menu.component';
import { FormsModule } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';

@NgModule({
  declarations: [
    AppComponent,
    ProdutolitsComponent,
    CategorialistComponent,
    CategoriadetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MenuComponent,
    LoginComponent,
    FormsModule,
    ProdutodetailComponent,
    
   
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
