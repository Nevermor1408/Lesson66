package JARFILES;


public class LibraryInterface {
    
   public static void main(String[]args){
       Book b1,b2,b3,b4,b5;
       b1 = new Book(" From Russia with love ", " greg hines");
       b2 = new Book(" Living Smart ", " rita Langill");
       b3 = new Book(" Singing in the Rain ", " harry Conner ");
       b4 = new Book(" Good Housekeeping ", " Pat Burns ");
       b5 = new Book(" To be a Model ", " Lisa lahey ");
       System.out.println(" Here are the books available: ");
       System.out.println(b1);
       System.out.println(b2);
       System.out.println(b3);
       System.out.println(b4);
       System.out.println(b5);
       Patron p = new Patron (" Miles Davis");
       System.out.println(" Learing 4 books to "+ p.getName());
       if(p.borrow(b1)) System.out.println(b1.getTitle()+" Succesfully Borrowed. ");
       else System.out.println(b1.getTitle()+" Could not be borrowed.");
       
       if(p.borrow(b2)) System.out.println(b2.getTitle()+" Succesfully Borrowed. ");
       else System.out.println(b2.getTitle()+" Could not be borrowed.");
   
       if(p.borrow(b3)) System.out.println(b3.getTitle()+" Succesfully Borrowed. ");
       else System.out.println(b3.getTitle()+" Could not be borrowed.");
   
       if(p.borrow(b4)) System.out.println(b4.getTitle()+" Succesfully Borrowed. ");
       else System.out.println(b4.getTitle()+" Could not be borrowed.");
       
       System.out.println("-------\nAttempting to return the first book: \n-------------");
       if(p.returnBook(b1)) System.out.println(b1.getTitle()+" Succesffully returned. ");
       else System.out.println(b1.getTitle()+" Was Not Borrowed Out");
       System.out.println("-----\nHere is a list of books currently lent to: "+ p.getName()+"\n----");
       if(p.hasBook(b1)) System.out.println(b1);
       if(p.hasBook(b2)) System.out.println(b2);
       if(p.hasBook(b3)) System.out.println(b3);
       if(p.hasBook(b4)) System.out.println(b4);
       if(p.hasBook(b5)) System.out.println(b5);
   }
}
