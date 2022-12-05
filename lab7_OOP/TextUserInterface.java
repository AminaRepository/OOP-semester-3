import java.util.Scanner;

public class TextUserInterface {
    private  Scanner reader;
    private Dictionary dictionary;
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start(){
        while(true){
            System.out.print("Statement: ");
            String command = this.reader.nextLine();
            if(command.equals("quit")){
                System.out.println("Cheers!");
                break;
            }
            else if(command.equals("add")){
                String word = reader.nextLine();
                String translation = reader.nextLine();
                this.dictionary.add(word, translation);
            }
            else{
                System.out.print("Unknown statement");
            }
        }
    }
}