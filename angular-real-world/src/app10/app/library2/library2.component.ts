import {LibraryComponentDivide} from '../library4/library4.component'

export class LibraryComponentSuma {
    libraryComponentDivide: LibraryComponentDivide; 
     add (number1:number, number2:number) {
        return number1 + number2 + this.libraryComponentDivide.divide(20,2);
    }
    constructor(){
        this.libraryComponentDivide = new LibraryComponentDivide();
      }
}
