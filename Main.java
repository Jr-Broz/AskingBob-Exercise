/*Bob only ever answers one of five things:

"Sure." This is his response if you ask him a question, such as "How are you?" The convention used for questions is that it ends with a question mark.

"Whoa, chill out!" This is his answer if you YELL AT HIM. The convention used for yelling is ALL CAPITAL LETTERS.

"Calm down, I know what I'm doing!" This is what he says if you yell a question at him.

"Fine. Be that way!" This is how he responds to silence. The convention used for silence is nothing, or various combinations of whitespace characters.

"Whatever." This is what he answers to anything else.*/

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        askBob();
    }

    public static void askBob(){

        System.out.println("Hi, my name is bob, you can ask me anything.");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("----------------------------------------");
        System.out.println("You wanna ask me a question?");
        System.out.println("----------------------------------------");
        String userAnswr = sc.nextLine();
        sc.close();
        
        if(userAnswr.endsWith("?")){

             System.out.println("Sure.");
            
        }
        else if(userAnswr.isEmpty() == true){

            System.out.println("Fine. Be that way!");
        }

       else  if(userAnswr == userAnswr.toUpperCase() == true){

         System.out.println("Whoa, chill out!");
        }       

        
         else if(userAnswr.equals(userAnswr.toUpperCase()) == true && userAnswr.endsWith("?") == true){

            System.out.println("Calm down, I know what I'm doing!");
        }

        else{

                System.out.println("Whatever");
        }
            
    }
}