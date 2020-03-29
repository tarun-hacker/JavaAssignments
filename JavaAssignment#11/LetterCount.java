import java.io.*;
import java.util.HashMap;

public class LetterCount {
    public void findLetterCount(File inputFile, File outputFile) {

        try {

            FileReader fileReader = new FileReader(inputFile);

            int i;

            HashMap<Character, Integer> letterCountMap = new HashMap<>();

            while ((i = fileReader.read()) != -1) {

                char letter = (char) i;

                if (letterCountMap.containsKey(letter) && Character.isLetter(letter)) {

                    letterCountMap.put(letter, letterCountMap.get(letter) + 1);

                }
                else if (Character.isLetter(letter)){

                    letterCountMap.put(letter, 1);
                }
            }
            writeToFile(letterCountMap, outputFile);

        }
        catch (IOException e) {

            e.printStackTrace();
        }

    }

    public void writeToFile(HashMap<Character, Integer> letterCountMap, File file) {

        try {

            FileWriter writer = new FileWriter(file);

            PrintWriter printWriter = new PrintWriter(writer);

            for (char key : letterCountMap.keySet()) {

                printWriter.println(key +" "+letterCountMap.get(key));
            }

            printWriter.close();
        }
        catch (IOException e) {

            e.printStackTrace();
        }

    }


}