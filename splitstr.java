import java.util.Scanner;

public class splitstr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scanner.nextLine();
String[] arr=word.split("");
System.out.println("enter number to target");
int target = scanner.nextInt();

    System.out.println(arr[target-1]);
}



    
}