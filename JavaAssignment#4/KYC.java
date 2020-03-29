import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class KYC {
   public void findRange(String signUpDates, String currDates){

       String newDate=signUpDates.substring(0,6)+ currDates.substring(6);

       LocalDate lowerRangeDate = LocalDate.parse(newDate,
               DateTimeFormatter.ofPattern("dd-LL-yyyy"));

       LocalDate currLocalDate=LocalDate.parse(currDates,
               DateTimeFormatter.ofPattern("dd-LL-yyyy"));

       String lowerDateString=lowerRangeDate.minusDays(30).
               format(DateTimeFormatter.ofPattern("dd-LL-yyyy"));

       String upperDateString=lowerRangeDate.plusDays(30).
               format(DateTimeFormatter.ofPattern("dd-LL-yyyy"));

       if(checkAnniversary(signUpDates,currDates)){

           System.out.println("No range");
       }
       else {

           System.out.print(lowerDateString);

           int result = lowerRangeDate.plusDays(30).compareTo(currLocalDate);

           if (result <= 0)

                 System.out.println("  " + upperDateString);
             else

               System.out.println("  " + currDates);
       }
   }
    public boolean checkAnniversary(String signUpDates, String currDates) {

        String signUpYear = signUpDates.substring(6,10);

        String currYear = currDates.substring(6,10);

        if (signUpYear.equals(currYear))

            return true;

        return false;
    }

}
