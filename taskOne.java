import java.util.Scanner;

class taskOne{

 boolean search(int elem[]){
    
      
  Scanner objct = new Scanner(System.in);
   System.out.println("Enter a number");
    int input = objct.nextInt();

  for(int i=0;i<elem.length;i++){
    
     if(elem[i] == input){ 

     return true;}

     // else{ return false;}
  } return false;

    
 }


public static void main(String args[]){
 int [] array = {2,3,5,7};

   taskOne obj = new taskOne();


  boolean match = obj.search(array);
        if(match){
         System.out.println("A match has been found");

        }
         else{ System.out.println("No match is found");
      }
      
      }
}


