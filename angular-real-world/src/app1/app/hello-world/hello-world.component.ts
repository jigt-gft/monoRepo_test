import {Component} from '@angular/core';
import {format} from 'date-fns';

import {LibraryModule} from '../library1/library.module';
import {LibraryComponentSuma} from '../library2/library2.component';
import {LibraryComponentMultiplication} from '../library3/library3.component';
import {LibraryComponentDivide} from '../library4/library4.component';


@Component({
  selector: 'hello-world',
  templateUrl: 'hello-world.component.html',
  styleUrls: ['./hello-world.component.scss']
})
export class HelloWorldComponent {
  service: LibraryModule;
  componentSuma: LibraryComponentSuma;
  componentMultiplication: LibraryComponentMultiplication;
  componentDivide: LibraryComponentDivide;
  nameFirst: string;
  nameLast: string;
  date: string = format(new Date(), 'MMMM D, YYYY');

  constructor(){
    this.service = new LibraryModule();
    this.nameFirst = this.service.firstName;
    this.nameLast= this.service.lastName;
    this.componentSuma = new LibraryComponentSuma();
    this.componentMultiplication = new LibraryComponentMultiplication();
    this.componentDivide = new LibraryComponentDivide();
  }

  suma(){
    return this.componentSuma.add(10,20);
  }

  multiplication(){
    return this.componentMultiplication.multiplication(10,20);
  }
  divide(){
    return this.componentDivide.divide(20,2)
  }
}
