import java.util.Scanner;

public class AlphabetChecker {

    public int[] checkAlphabets(String inputString){

        int alphabetsPosition[]=new int[26];

        inputString=inputString.toLowerCase().trim();

        for(int index=0;index<inputString.length();index++){

            char character=inputString.charAt(index);

            if(Character.isLetter(character)){

                int characterIndex=character-'a';

                //increments the count of letter in the array
                alphabetsPosition[characterIndex]+=1;

            }
        }
        return alphabetsPosition;

    }

    public boolean checkAlphabetCount(int alphabetsPosition[]){

        for(int index=0;index<alphabetsPosition.length;index++){

            if(alphabetsPosition[index]<=0){

                return false;
            }
        }
        return true;
    }

}

// The above class has two methods :
// The time complexity of checkAlphabets method is O(stringLength)
//The time complexity of checkAlphabetCount is O(26) since the length of alphabetPosition array is constant
//The total time complexity is O(n),  where n is the length of the string.
//The space Complexity is O(1), because array size remains constant.