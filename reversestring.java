import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the string name");
        String name = scanner.nextLine();
        String[]arr = name.split("");
        String palindrome="";
        for(int i=arr.length-1 ; i>=0 ; i--){
            System.out.println(arr[i]);    
            palindrome=palindrome+arr[i];         
        }

            if(palindrome.equals(name)){
                System.out.println("it is palindrome");
            }
            else{
                System.out.println("it is not a palindrome");
            }
        
    }
    
}
