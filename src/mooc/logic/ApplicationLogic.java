package mooc.logic;

/*
constructor public ApplicationLogic(UserInterface ui). It receives as parameter a class which implements the interface UserInterface.
Note: your application logic has to see the interface and therefore to import it; in other words, the line import mooc.ui.UserInterface
must appear at the beginning of the file
method public void execute(int howManyTimes) prints the string "The application logic works" as many times as it is defined
by its parameter variable. After each "The application logic works" printout, the code has to call the update() method of the
 object which implements the interface UserInterface and which was assigned to the constructor as its parameter.
 */

import mooc.ui.UserInterface;

public class ApplicationLogic {
    UserInterface userInterface;
    public ApplicationLogic(UserInterface ui){
        userInterface = ui;
    }
    public void execute (int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("The application logic works.");
            userInterface.update();
        }
    }
}
