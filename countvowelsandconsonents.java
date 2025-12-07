import java.util.Scanner;

public class countvowelsandconsonents {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many letters:");
        int n = scanner.nextInt();

        char[] arr = new char[n];

        System.out.println("Enter the letters:");

for(int i=0 ; i < arr.length ; i++){
    arr[i]=scanner.next().charAt(0);
}
int vowels=0;
String vowelschar=" ";
String consonantchar=" ";
int consonants=0;
for(int j=0 ; j < arr.length ; j++){
    char ch = Character.toUpperCase(arr[j]);
     if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels++;
                vowelschar=vowelschar+arr[j];
            } else if (ch >= 'A' && ch <= 'Z') { 
                consonants++;
                 consonantchar=consonantchar+arr[j];
            }
}
System.out.println("the vowels are count are "+vowels+ "meanwhile the consonants are "+consonants);
System.out.println("the vowels are "+vowelschar+"the consonants are "+consonantchar);
    }
    
}
