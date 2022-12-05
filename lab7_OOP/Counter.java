/*My mother always took a little red counter to the grocery store.
The counter was used to keep a tally of the amount of money she would have spent so far on that visit to the store if she
bought everything in the basket. The counter had a four-digit display, increment buttons for each digit, and a reset button.
An overflow indicator came up red if more money was entered than the $99.99  it would register. (This was a long  time ago.)
Write and implement the member functions of a class Counter  that simulates and slightly generalizes the behavior of this
grocery store counter.
The constructor should create a Counter  object that can count up to the constructor’s argument.
That is, Counter(9999)  should provide a counter that can count up to  9999 .
A newly constructed counter displays a reading of 0
The member function  void reset( ); sets the counter’s number to 0.
The member function  void incr1( );  increments the units digits by 1,
void incr10( );  increments the tens digit by  1,  and void incr100( );  and
void incr1000( );  increment the next two digits, respectively.
Accounting for any carrying when you increment should require no further action than adding an appropriate number to the
private data member. A member function bool overflow( );  detects overflow.
(Overflow is the result of incrementing the counter’s private data member beyond the maximum entered at counter construction.)
Use this class to provide a simulation of my mother’s little red clicker. Even though the display is an integer,
in the simulation, the rightmost (lower order) two digits are always thought of as cents and tens of cents,
the next digit is dollars, and the fourth digit is tens of dollars*/

public class Counter {
    int units, tens, hundreds, thousands;
    public void Counter(){
        this.units = 0;
        this.tens = 0;
        this.hundreds = 0;
        this.thousands = 0;
    }
    public void reset(){
        this.units = 0;
        this.tens = 0;
        this.hundreds = 0;
        this.thousands = 0;
    }
    public void incr1(){
        this.units += 1;
        if(this.units == 10){
            this.units = 0;
            this.tens += 1;
        }
        if(this.tens == 10){
            this.tens = 0;
            this.hundreds += 1;
        }
        if(this.hundreds == 10){
            this.hundreds = 0;
            this.thousands += 1;
        }
        if(this.thousands == 10){
            System.out.println("Overflow");
            this.thousands = 9;
        }
    }
    public void incr10(){
        this.tens += 1;
        if(this.tens == 10){
            this.tens = 0;
            this.hundreds += 1;
        }
        if(this.hundreds == 10){
            this.hundreds = 0;
            this.thousands += 1;
        }
        if(this.thousands == 10){
            System.out.println("Overflow");
            this.thousands = 9;
        }
    }
    public void incr100(){
        this.hundreds += 1;
        if(this.hundreds == 10){
            this.hundreds = 0;
            this.thousands += 1;
        }
        if(this.thousands == 10){
            System.out.println("Overflow");
            this.thousands = 9;
        }
    }
    public void incr1000(){
        this.thousands += 1;
        if(this.thousands == 10){
            System.out.println("Overflow");
            this.thousands = 9;
        }
    }
    public String toString(){
        return "The counter is at " + this.thousands + this.hundreds + "." + this.tens + this.units + "$";
    }
}
