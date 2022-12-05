/*Create the class PromissoryNote with the following functionality:
the constructor public PromissoryNote() creates a new promissory note
the method public void setLoan(String toWhom, double value) which stores the information about loans to specific people.
the method public double howMuchIsTheDebt(String whose) which returns the entity of the debt held by the parameter person
*/

import java.util.HashMap;

public class PromissoryNote {
    HashMap<String, Double> notes = new HashMap<>();
    public void PromissoryNote(){
        this.notes = new HashMap<>();
    }
    public void setLoan(String toWhom, double value){
        this.notes.put(toWhom, value);
    }
    public double howMuchIsDebt(String whose){
        if(this.notes.get(whose) != null){
            return notes.get(whose);
        }
        return 0d;
    }

}