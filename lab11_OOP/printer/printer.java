package printer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class printer {
    File file;
    public void printer(String filePath) throws Exception {
        this.file = new File(filePath);
    }

    public void printWhichLineContains (String word) throws FileNotFoundException {
        Scanner scanned = new Scanner(this.file);
        String data = scanned.toString();
        String[] lines = data.split("\n");
        for(var line : lines){
            if(line.contains(word)){
                System.out.println(line);
            }
        }
        if(word.equals("")){
            System.out.println(data);
        }
    }
}
