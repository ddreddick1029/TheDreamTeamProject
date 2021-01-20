package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Timer {
	
	@FXML private Label main_timer_label;
	
	protected int length = 60;
	
	public Timer() {//constructor for a timer without a period length
		length = 60;
	}
	
	public double startTimer(double on) {
		return on-1;
		//countdown loop
		/*for(int i = (int) on; i>=0;i--) {
			int min;
			int sec;
			
			min = i/60;
			sec = i%60;
			
			if(sec < 10) {
				//main_timer_label.setText(min + ":0" + sec); for displaying on the main timer
				System.out.println(min + ":0" + sec);
			}
			else {
				//main_timer_label.setText(min + ":" + sec); for displaying on the main timer
				System.out.println(min + ":" + sec);
			}
			
			stopTimer(1000);//needs to be replaced with a better system that can handle events during the pause
		}*/
	}
	public void stopTimer(int off) {                            //inspired from this stackoverflow thread 
			try
			{
				Thread.sleep(off);                             //https://stackoverflow.com/questions/24104313/how-do-i-make-a-delay-in-java
			}
			catch(InterruptedException ex)
			{
				Thread.currentThread().interrupt();
			}
		
	}
	
}
