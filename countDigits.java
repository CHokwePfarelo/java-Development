import java.util.Scanner;

public class countDigits{

int count = 0;

  int CountD(){
   Scanner scan = new Scanner(System.in);
      int number = scan.nextInt();
       System.out.print("Enter a number");


    for(int i =0;i< number.length();i++){

        count++;
    }
     
       return count;
  }

   public static void main(String arguments[]){
        
      countDigits numbOfDigits = new countDigits();

      int Digits  = numbOfDigits.CountD();

      System.out.println(Digits + "detected");



   }

































}