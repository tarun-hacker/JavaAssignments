import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

    boolean checkPattern(String sentence){

        String regularExpression="^[A-Z]+(.*)\\.$";

        Pattern pattern=Pattern.compile(regularExpression);

        Matcher matcher=pattern.matcher(sentence);

        return matcher.matches();
    }



}
