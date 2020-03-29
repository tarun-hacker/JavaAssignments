/* A vampire number v is a number with an even number of digits n,
  that can be factored into two numbers x and y each with n/2 digits and
  not both with trailing zeroes, where v contains precisely all the digits from x and from y, in any order.
 Write a java program to print first 100 vampire numbers.
 */

public class VampireNumber {
    int number;
    public void setDigits(int number, int digits[]){
        int index=0;
        int remainder=0;
        while(number!=0){
            remainder=number%10;
            digits[index]=remainder;
            number/=10;
            index++;
        }
    }
    public int getDigitCount(int number){
        int count=0;
        while(number!=0){
            count++;
            number/=10;
        }
        return count;
    }
    public boolean isUnique(int digits[]){
        for(int index=0;index<digits.length;index++){
            for (int nextIndex=index+1;nextIndex<=digits.length-1;nextIndex++){
                if(digits[index]==digits[nextIndex])
                    return false;
            }
        }
        return true;
    }
    public boolean findVampireNum(int number){
        int digitCount=getDigitCount(number);
        int digits[]=new int[digitCount];
        setDigits(number,digits);
        for(int i=0;i<  digitCount;i++){

            for(int j=0;j<digitCount;j++){

                for(int k=0;k<digitCount;k++){

                    for(int l=0;l<digitCount;l++){

                        int fang = (digits[i]*10 + digits[j]) * (digits[k]*10 + digits[l]);
                        int checkUnique[]={digits[j],digits[k],digits[l],digits[i]};

                        if(fang==number && isUnique(checkUnique)){
                            System.out.println((digits[i]+""+ digits[j])+" "+(digits[k] +""+ digits[l]));
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }
    public void getVampireNumbers(){
        int count=0;
        for(int number=100;count<=100;number++){
            if(getDigitCount(number)>=4 && (getDigitCount(number)%2)==0) {
                if (findVampireNum(number) == true) {
                    System.out.println(number);
                    count++;
                }
            }
        }
    }

    public static void main(String[] args) {
        VampireNumber vampireNumber=new VampireNumber();
        vampireNumber.getVampireNumbers();
    }
}
