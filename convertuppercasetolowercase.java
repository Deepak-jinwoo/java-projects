import java.util.Scanner;

public class convertuppercasetolowercase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String");
        String letter = scanner.nextLine();
        
        for(int i=0;i<letter.length();i++){
           char ch= letter.charAt(i);
      
            if(ch>='a' &&  ch<='z'){
                char bang=(char)(ch-32);
                System.out.print(bang);
            }
            else{
                char bang=(char)(ch+32);
                System.out.print(bang);
            }
        }

    }
    
}
