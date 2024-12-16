import { Component, inject } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  standalone: true,
  imports:[FormsModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  usuario! : string;
  senha!: string;

 constructor(private routert : Router){}

  logar(){
  
    this.routert.navigate(['admin/produtos']);
  }

}
