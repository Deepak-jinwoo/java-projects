import java.util.Scanner;
public class helloworld{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first num");       
        int num1 = sc.nextInt();
        System.out.println("enter second num");       
        int num2 = sc.nextInt();
        System.out.println("enter third num");       
        int num3 = sc.nextInt();
        if ((num1>num2)&&(num1>num3)) {
            System.out.println("the" +num1+ "is big one");        
        }
         else if((num2>num3)&&(num2>num1)) {
            System.out.println("the" +num2+ "is big one");
            
        }
        else {
            System.out.println("the " +num3+ " is big one");
            
        }
        

        

    }
}