/*
I/O
Using TextFile and a Map<Character,Integer>, create a program that
takes the file name as a command line argument and counts the
occurrence of all the different characters.
Save the results in a text file.
 */



import java.io.File;

public class Main {
    public static void main(String[] args) {

        if (args.length > 0) {

            File inputFile = new File(args[0]);

            File outputFile=new File(args[1]);

            LetterCount letterCount = new LetterCount();

            letterCount.findLetterCount(inputFile,outputFile);

        }
        else {

            System.out.println("No command line " +
                    "arguments found.");
        }

    }
}
