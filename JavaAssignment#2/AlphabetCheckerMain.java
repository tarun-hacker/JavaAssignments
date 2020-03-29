/*
Write a java function that checks if the input string
contains all the letters of the alphabet a-z (case-insensitive).
Write time and space complexity of your solution
as comments in the source file.

 */
import java.util.Scanner;

public class AlphabetCheckerMain {

    public static void main(String[] args) {

        AlphabetChecker ac=new AlphabetChecker();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");

        String inputString=sc.nextLine();

        boolean isContains= ac.checkAlphabetCount(ac.checkAlphabets(inputString));

        if(isContains==true){

            System.out.println("Input String contains all alphabets");
        }

        else
            System.out.println("Input String does not contains all alphabets ");
    }
}

/*
    Input :
    Enter the String
    The quick brown fox jumps over the lazy dog
    Enter the String
    Fazil Ali

    Output:
    Input String contains all alphabets
    Input String does not contains all alphabets

 */