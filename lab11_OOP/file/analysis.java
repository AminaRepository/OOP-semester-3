package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class analysis {
    File file;
    public void Analysis(File file){
        this.file = file;
    }
    public int lines() throws FileNotFoundException {
        Scanner scanned = new Scanner(file);
        String data = scanned.toString();
        String[] lines = data.split("\n");
        return lines.length;
    }

    public int characters() throws FileNotFoundException {
        int characters = 0;
        Scanner scanned = new Scanner(file);
        String data = scanned.toString();
        String[] lines = data.split("\n");
        for(var line : lines){
            characters += line.length();
        }
        return characters;
    }
}
