import java.util.Scanner;

public class countvowandconsonats {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the words");
        String statement=scanner.nextLine();
        String[]arr = statement.split("");
        int vowels=0;
        int consonants=0;
        char ch;
        for(int i=0; i<arr.length;i++){
             ch= Character.toLowerCase(statement.charAt(i));
        
         if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            
            }
        }
        System.out.println("the vowels are"+vowels);
        System.out.println("the consonants are"+consonants);

    }
    
}
