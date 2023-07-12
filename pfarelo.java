import java.util.Scanner;

class pfarelo{
    
    
    
   //function
     String revert(String input){

   String[] letters = input.split("");

        String empty = "";

     for(int i=input.length()-1;i>-1;i--){

       empty = empty+letters[i];
    
        }
     return empty;
      
  }
  
  
  public static void main(String args[]){

   Scanner Objct = new Scanner(System.in);

   System.out.print("Enter the name to revert :");
   
      String input = Objct.nextLine();
      

        pfarelo mm = new pfarelo();
 
    
  String revered = mm.revert(input);
   System.out.println("revered output:" + revered);
}}