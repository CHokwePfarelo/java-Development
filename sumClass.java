public class sumClass {
    public static void main(String arguments[]){
       int [] numbers = {1,2,3};

       

        int sum = 0;

        for(int i = 0;i<arguments.length;i++){
           sum=+Integer.parseInt(arguments[i])+ sum;  //Argumenst are converted to string so convert them back to int.
        }
        System.out.println("sum :" + sum);
    }
    
}
