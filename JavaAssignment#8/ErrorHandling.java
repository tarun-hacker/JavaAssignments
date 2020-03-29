
import java.util.Scanner;

class dollarException extends Exception{
    public dollarException(String exceptionMsg){
        super(exceptionMsg);

    }

}
class atTheRateException extends Exception{
    public atTheRateException(String exceptionMsg){
        super(exceptionMsg);

    }
}
class exclamationException extends Exception{
    public exclamationException(String excetionMsg){

        super(excetionMsg);

    }
}
public class ErrorHandling {
    void throwExceptions(String input) {

        try {

            if (input.equals("$"))

                throw new dollarException("Dollar Exception");

            else if (input.equals("@"))

                throw new atTheRateException(" @ Exception");

            else if (input.equals("!"))

                throw new exclamationException("Exclamation Exception");

            else if (input.equals(""))

                throw new NullPointerException("Invalid String");

            else

                System.out.println(input);


        } catch (dollarException | atTheRateException | exclamationException e) {

            System.out.println(e.getMessage());
        } catch (NullPointerException e) {

            System.out.println(e.getMessage());

            e.printStackTrace();

        } finally {
            System.out.println("finally block excecuted");

        }
    }
}

