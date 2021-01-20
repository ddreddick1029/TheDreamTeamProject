package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class OnOffClick {
	private final int milsec = 1000;
	
	Timeline timeline;										//timeline object that makes the timer possible
	public int timepassed; 									//keeps track of the time passed
															//These variables represent the points scored by each wrestler
	Main names = new Main();
	Match currentMatch = new CollegeMatch();
	public String redPoints;
	public String greenPoints;
	public String p = "1";									//p stands for period as in what period the match is in
	
															//the ActionListener Class adds points to each wrestler's 
	ActionListener red = new ActionListener();				//Score as the match goes on as well as keeping track of the current period
	ActionListener green = new ActionListener();
	ActionListener period = new ActionListener();
	
	@FXML private Label main_timer_label;					//These are declaring the label names for labels in the UI						
    @FXML private ResourceBundle resources;
    @FXML private URL location;
    @FXML private Label red_score;
    @FXML private Label green_score;
    @FXML private Button start_button;
    @FXML private Button stop_button;
    @FXML private Label period_label;
    @FXML private Label green_label;
    @FXML private Label red_label;
     
    														//timer stuff by Caleb Hopkins
    														//This marks the begining of Button Related Clicks

    @FXML													//This starts the Timer
    void startClicked(ActionEvent event) {
		timeline.play();
    }
    
    @FXML													//this pauses the Timer
    void stopClicked(ActionEvent event) {
		timeline.pause();
    }
    
    @FXML
    void resetClicked(ActionEvent event) {					//Resets the timer 
    	timeline.stop();
    	timepassed = 0;
    	main_timer_label.setText("00:00");
    }
	
    
    //The rest of this class was written by Dee
    @FXML
    void redOne(ActionEvent event) {						//calls ActionListener to add 1 point for red on the scoreboard
    	if (p.contentEquals("1"))
    		currentMatch.setRedp1(1);
    	if (p.contentEquals("2"))
    		currentMatch.setRedp2(1);
    	if (p.contentEquals("3"))
    		currentMatch.setRedp3(1);
    	if (p.contentEquals("OT1"))
    		currentMatch.setRedp4(1);
    	if (p.contentEquals("OT2"))
    		currentMatch.setRedp5(1);
    	if (p.contentEquals("OT3"))
    		currentMatch.setRedp6(1);
    	if (p.contentEquals("OT4"))
    		currentMatch.setRedp7(1);
    	if (p.contentEquals("OT5"))
    		currentMatch.setRedp8(1);
    	if (p.contentEquals("OT6"))
    		currentMatch.setRedp9(1);

    	redPoints = red.addOne();
    	red_score.setText(redPoints);
    }
    @FXML
    void redTwo(ActionEvent event) {						//calls ActionListener to add 2 points for red to the scoreboard
    	if (p.contentEquals("1"))
    		currentMatch.setRedp1(2);
    	if (p.contentEquals("2"))
    		currentMatch.setRedp2(2);
    	if (p.contentEquals("3"))
    		currentMatch.setRedp3(2);
    	if (p.contentEquals("OT1"))
    		currentMatch.setRedp4(2);
    	if (p.contentEquals("OT2"))
    		currentMatch.setRedp5(2);
    	if (p.contentEquals("OT3"))
    		currentMatch.setRedp6(2);
    	if (p.contentEquals("OT4"))
    		currentMatch.setRedp7(2);
    	if (p.contentEquals("OT5"))
    		currentMatch.setRedp8(2);
    	if (p.contentEquals("OT6"))
    		currentMatch.setRedp9(2);
    	
    	redPoints = red.addTwo();
    	red_score.setText(redPoints);
    }
    @FXML
    void redFour(ActionEvent event) {						//calls ActionListener to add 4 points for red to the scoreboard
    	if (p.contentEquals("1"))
    		currentMatch.setRedp1(4);
    	if (p.contentEquals("2"))
    		currentMatch.setRedp2(4);
    	if (p.contentEquals("3"))
    		currentMatch.setRedp3(4);
    	if (p.contentEquals("OT1"))
    		currentMatch.setRedp4(4);
    	if (p.contentEquals("OT2"))
    		currentMatch.setRedp5(4);
    	if (p.contentEquals("OT3"))
    		currentMatch.setRedp6(4);
    	if (p.contentEquals("OT4"))
    		currentMatch.setRedp7(4);
    	if (p.contentEquals("OT5"))
    		currentMatch.setRedp8(4);
    	if (p.contentEquals("OT6"))
    		currentMatch.setRedp9(4);
    	
    	redPoints = red.addFour();
    	red_score.setText(redPoints);
    }
    
    @FXML
    void redMinus(ActionEvent event) {						//calls ActionListener to take points off the scoreboard for red
    	if (p.contentEquals("1"))
    		currentMatch.setRedp1(-1);
    	if (p.contentEquals("2"))
    		currentMatch.setRedp2(-1);
    	if (p.contentEquals("3"))
    		currentMatch.setRedp3(-1);
    	if (p.contentEquals("OT1"))
    		currentMatch.setRedp4(-1);
    	if (p.contentEquals("OT2"))
    		currentMatch.setRedp5(-1);
    	if (p.contentEquals("OT3"))
    		currentMatch.setRedp6(-1);
    	if (p.contentEquals("OT4"))
    		currentMatch.setRedp7(-1);
    	if (p.contentEquals("OT5"))
    		currentMatch.setRedp8(-1);
    	if (p.contentEquals("OT6"))
    		currentMatch.setRedp9(-1);
    	
    	redPoints = red.minus();
    	red_score.setText(redPoints);
    }
    
    @FXML
    void greenOne(ActionEvent event) {						//calls ActionListener to add 1 point for green to the scoreboard
    	if (p == "1")
    		currentMatch.setGreenp1(1);
    	if (p == "2")
    		currentMatch.setGreenp2(1);
    	if (p == "3")
    		currentMatch.setGreenp3(1);
    	if (p == "OT1")
    		currentMatch.setGreenp4(1);
    	if (p == "OT2")
    		currentMatch.setGreenp5(1);
    	if (p == "OT3")
    		currentMatch.setGreenp6(1);
    	if (p == "OT4")
    		currentMatch.setGreenp7(1);
    	if (p == "OT5")
    		currentMatch.setGreenp8(1);
    	if (p == "OT6")
    		currentMatch.setGreenp9(1);
    	
    	greenPoints = green.addOne();
    	green_score.setText(greenPoints);
    }
    @FXML
    void greenTwo(ActionEvent event) {						//calls ActionListener to add 2 points for green to the scoreboard
    	if (p.contentEquals("1"))
    		currentMatch.setGreenp1(2);
    	if (p.contentEquals("2"))
    		currentMatch.setGreenp2(2);
    	if (p.contentEquals("3"))
    		currentMatch.setGreenp3(2);
    	if (p.contentEquals("OT1"))
    		currentMatch.setGreenp4(2);
    	if (p.contentEquals("OT2"))
    		currentMatch.setGreenp5(2);
    	if (p.contentEquals("OT3"))
    		currentMatch.setGreenp6(2);
    	if (p.contentEquals("OT4"))
    		currentMatch.setGreenp7(2);
    	if (p.contentEquals("OT5"))
    		currentMatch.setGreenp8(2);
    	if (p.contentEquals("OT6"))
    		currentMatch.setGreenp9(2);
    	
    	greenPoints = green.addTwo();
    	green_score.setText(greenPoints);
    }
    @FXML
    void greenFour(ActionEvent event) {						//calls ActionListener to add 4 points for green to the scoreboard
    	if (p.contentEquals("1"))
    		currentMatch.setGreenp1(4);
    	if (p.contentEquals("2"))
    		currentMatch.setGreenp2(4);
    	if (p.contentEquals("3"))
    		currentMatch.setGreenp3(4);
    	if (p.contentEquals("OT1"))
    		currentMatch.setGreenp4(4);
    	if (p.contentEquals("OT2"))
    		currentMatch.setGreenp5(4);
    	if (p.contentEquals("OT3"))
    		currentMatch.setGreenp6(4);
    	if (p.contentEquals("OT4"))
    		currentMatch.setGreenp7(4);
    	if (p.contentEquals("OT5"))
    		currentMatch.setGreenp8(4);
    	if (p.contentEquals("OT6"))
    		currentMatch.setGreenp9(4);
    	
    	greenPoints = green.addFour();
    	green_score.setText(greenPoints);
    }
    
    @FXML
    void greenMinus(ActionEvent event) {					//calls ActionListener to take points off of the scoreboard for green

    	if (p.contentEquals("1"))
    		currentMatch.setGreenp1(-1);
    	if (p.contentEquals("2"))
    		currentMatch.setGreenp2(-1);
    	if (p.contentEquals("3"))
    		currentMatch.setGreenp3(-1);
    	if (p.contentEquals("OT1"))
    		currentMatch.setGreenp4(-1);
    	if (p.contentEquals("OT2"))
    		currentMatch.setGreenp5(-1);
    	if (p.contentEquals("OT3"))
    		currentMatch.setGreenp6(-1);
    	if (p.contentEquals("OT4"))
    		currentMatch.setGreenp7(-1);
    	if (p.contentEquals("OT5"))
    		currentMatch.setGreenp8(-1);
    	if (p.contentEquals("OT6"))
    		currentMatch.setGreenp9(-1);
    	
    	greenPoints = green.minus();
    	green_score.setText(greenPoints);
    }
    
    @FXML													//moves the match to the second period
    void forward(ActionEvent event) {
    	p = period.nextPeriod();
    	period_label.setText(p);
    }
    
    @FXML													//moves the match back a period
    void back(ActionEvent event) {
    	p = period.backPeriod();
    	System.out.println(p);
    	period_label.setText(p);
    }
    
    @FXML
    void submit_match(ActionEvent event) {
    	currentMatch.submitMatch();
    	currentMatch.printMatch();
    }
    
    														// This method is called by the FXMLLoader when initialization is complete
    @FXML 
    void initialize() {
    														//assert stuff is all auto generated
        assert red_score != null : "fx:id=\"red_score\" was not injected: check your FXML file 'GUI.fxml'.";
        assert green_score != null : "fx:id=\"green_score\" was not injected: check your FXML file 'GUI.fxml'.";
        assert main_timer_label != null : "fx:id=\"main_timer_label\" was not injected: check your FXML file 'GUI.fxml'.";
        assert start_button != null : "fx:id=\"start_button\" was not injected: check your FXML file 'GUI.fxml'.";
        assert stop_button != null : "fx:id=\"stop_button\" was not injected: check your FXML file 'GUI.fxml'.";
        assert period_label != null : "fx:id=\"period_label\" was not injected: check your FXML file 'GUI.fxml'.";
        
        													//Sets the names of each wrestler in the scoreboard
        green_label.setText(names.getGreen());
        red_label.setText(names.getRed());
        
        													//creates timeline function that can be started or stopped by a simple 
    	timeline = new Timeline(new KeyFrame(Duration.millis(milsec), (ActionEvent ae) -> {
			
    		timepassed += 1;
    		int min;
			int sec;
			String stringtime;
			
			min = timepassed/60;
			sec = timepassed%60;
			
			if(sec < 10) {									//main_timer_label.setText(min + ":0" + sec); for displaying on the main timer
				stringtime = "0" + Integer.toString(min) + ":0" + Integer.toString(sec);
			}
			else {											//main_timer_label.setText(min + ":" + sec); for displaying on the main timer
				stringtime = "0" + Integer.toString(min) + ":" + Integer.toString(sec);
			}
			String tps = stringtime;
			main_timer_label.setText(tps);
		}));
		timeline.setCycleCount(Animation.INDEFINITE);
    	
    }

}