import java.io.File;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindingFiles {
    String pattern;

    ArrayList<String> foundFiles;

    public FindingFiles(String pattern){
        this.pattern=pattern;

        foundFiles=new ArrayList<>();
    }

    // Checks whether regular expression matches the file name
    public boolean patternMatched(String regx, String filename){

        Pattern pattern=Pattern.compile(regx);

        Matcher matcher=pattern.matcher(filename);

        return matcher.matches();
    }


    //Add files names that matched the pattern to the arraylist foundFiles
    public ArrayList<String> findFiles(File[] files){

        for(File file:files){

            if(file.isDirectory()){

                findFiles(file.listFiles());
            }

            else {

                if(patternMatched(pattern,file.getName())){

                        System.out.println(file.getName());

                        foundFiles.add(file.getAbsolutePath());
                    }
            }
        }
        return foundFiles;

    }

}
