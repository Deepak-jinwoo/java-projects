import java.util.Scanner;
public class spaces{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter string");
        String input = scanner.nextLine(); 
String result = "";
for (int i = 0; i < input.length(); i++) {
    char ch = input.charAt(i);
    if (ch != ' ') {
        result += ch;
    }
}
System.out.println("String without spaces: " + result);
}
}