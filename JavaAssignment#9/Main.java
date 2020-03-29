/*Using the documentation for java.util.regex.Pattern as a resource,
 write and test a regular expression that checks a sentence
 to see that it begins with a capital letter and ends with a period.

 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        RegularExpression regularExpression=new RegularExpression();

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the sentence");

        if(regularExpression.checkPattern(scanner.nextLine())){

            System.out.println(" The given sentence begins with UpperCase letter and ends with period.");
        }

        else{

            System.out.println(" The given sentence does not begins with UpperCase letter and ends with period.");
        }
    }
}


/*
    Input:
    Enter the sentence
    Mohammed fazil ali.

    Enter the sentence
    The quick brown fox jumps over the lazy dog,

    Output:
    The given sentence begins with UpperCase letter and ends with period.

    The given sentence does not begins with UpperCase letter and ends with period.

 */
