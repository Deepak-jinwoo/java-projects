import java.util.Scanner;

public class palindromecheck {
    public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
      boolean Palindrome = true;
         System.out.println("enter how many numbers");
        int n = scanner.nextInt();
        char[]arr=new char[n];
     
      
       
        System.out.println("enter the words");
        for(int i=0 ; i < arr.length ; i++){
            arr[i]=scanner.next().charAt(0);
        }
        for(int j=0;j<arr.length/2;j++){
            if (Character.toUpperCase(arr[j])!=Character.toUpperCase(arr[arr.length-1-j])) {
             Palindrome   = false;
             break;
            }
        }
        if (!Palindrome) {
            System.out.println("it is not palindrome");        
        }
        else{
            System.out.println("it is a palindrome");
        }



    }
    
}
