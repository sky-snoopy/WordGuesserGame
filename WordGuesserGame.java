import java.util.Arrays;
import java.util.Scanner;
public class WordGuesserGame {
    public static void main(String[] args) {
        System.out.println("Welcome to Word Guesser Game!");
        System.out.println("You have 5 attempts remaining to guess the secret word: _ _ _ "); 

        for(int i=5; i<=5;--i)
        {
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            String secret = "dog";

            //System.out.println(answer.equals(secret));

            if(answer.equals(secret) == true)
            {
                System.out.println("Wow, really? It's correct... Good job! ");
                break;
            }
            else
            {
                System.out.println("Ha! Incorrect! You have " + i + " attempts remaining. Try again!");
                
            }
           
        }
}
}
