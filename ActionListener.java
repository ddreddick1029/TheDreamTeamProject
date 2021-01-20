//This File was written By Dee
package application;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class ActionListener {

    public Label counter;
    private int number;

    public void addPoints(ActionEvent points) {
        counter.setText(addOne());   // prints the updated number
        counter.setText(addTwo());
        counter.setText(addFour());
        counter.setText(minus());
        counter.setText(nextPeriod());
        counter.setText(backPeriod());
    }

    String addOne() {
        number +=1;
        return Integer.toString(number);
    }                                 /* updates the number by
                                         adding 1 and returns it 
                                         as a string */
    String addTwo() {
        number +=2;
        return Integer.toString(number);
    }
    String addFour() {
        number +=4;
        return Integer.toString(number);
    }
    String minus() {
    	if (number > 0)
    		number -=1;
			return Integer.toString(number);
    }
    
    String nextPeriod() {//this method goes to the next period of the match
    	if (number < 9)//9 is the number of periods including overtime
    		{
    		number +=1;
    		switch(number)
    			{
    		case 1:
    			return Integer.toString(number);
    		case 2:
    			return Integer.toString(number);
    		case 3:
    			return Integer.toString(number);
    		case 4:
    			return "OT1";
    		case 5:
    			return "OT2";
    		case 6:
    			return "OT3";
    		case 7:
    			return "OT4";
    		case 8:
    			return "OT5";
    		case 9:
    			return "OT6";
    			}
    		}
    	else 
    		number = number+0;
    		return "OT6";
    	
    	
    }
    String backPeriod() {//this method goes back a period in a match
    	if (number == 1)
    	{
    		number = 1;
    		return Integer.toString(number);
    	}
    	if (number > 1)
    	{
    		number -= 1;
    	switch(number)
		{
		case 1:
			return Integer.toString(number);
		case 2:
			return Integer.toString(number);
		case 3:
			return Integer.toString(number);
		case 4:
			return "OT1";
		case 5:
			return "OT2";
		case 6:
			return "OT3";
		case 7:
			return "OT4";
		case 8:
			return "OT5";
		case 9:
			return "OT6";
		}//end of switch
    	}//end of if
    	else
    		number = number+0;
    		return "OT6";
    }
}