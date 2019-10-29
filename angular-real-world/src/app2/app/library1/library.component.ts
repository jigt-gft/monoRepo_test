
import {LibraryComponentSuma} from '../library2/library2.component';
import {LibraryComponentMultiplication} from '../library3/library3.component';

export class LibraryComponent {
  
  componentSuma: LibraryComponentSuma;
  componentMultiplication: LibraryComponentMultiplication;

  constructor(){
    this.componentSuma = new LibraryComponentSuma();
    this.componentMultiplication = new LibraryComponentMultiplication();
  }

  suma(){
    return this.componentSuma.add(10,20);
  }

  multiplication(){
    return this.componentMultiplication.multiplication(10,20);
  }
}
