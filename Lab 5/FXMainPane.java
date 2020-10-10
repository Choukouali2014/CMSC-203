package application;




import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * This panel is the basic panel, inside which other panels are placed.  
 * Before beginning to implement, design the structure of your GUI in order to 
 * understand what panels go inside which ones, and what buttons or other components
 * go in which panels.  
 * @author ralexander
 *
 */
//make the main panel's layout be a VBox
public class FXMainPane extends VBox {

	//student Task #2:
	//  declare five buttons, a label, and a textfield
	Button Hello,Howdy,Chinese,Clear, Exit, French ;
	
	Label label;
	TextField textfield ;
	//  declare two HBoxes
	HBox box_1;
	HBox box_2;
	
	//student Task #4:
	//  declare an instance of DataManager
	 DataManager dataManager;
	/**
	 * The MainPanel constructor sets up the entire GUI in this approach.  Remember to
	 * wait to add a component to its containing component until the container has
	 * been created.  This is the only constraint on the order in which the following 
	 * statements appear.
	 */
	FXMainPane() {
		//student Task #2:
		//  instantiate the buttons, label, and textfield
		
		Hello = new Button("Hello");
		French = new Button("French");
		Howdy = new Button("Howdy");
		Chinese = new Button("Chinese");
		Clear = new Button("Clear");
		Exit = new Button("Exit");
		label = new Label("Feedback");
		 textfield = new TextField();
		//  instantiate the HBoxes
				 box_1 = new HBox();
				 box_2 = new HBox();
		//student Task #4:
		
		//Event
				 Hello.setOnAction(new ButtonHandler());
				 Howdy.setOnAction(new ButtonHandler());
				 Chinese.setOnAction(new ButtonHandler());
				 French.setOnAction(new ButtonHandler());
				 Clear.setOnAction(new ButtonHandler());
				 Exit.setOnAction(new ButtonHandler());
		
		//  instantiate the DataManager instance
				 dataManager = new DataManager();
				 
		//  set margins and set alignment of the components
				 Insets inset = new Insets(5);
				 
		
		//student Task #3:
		//  add the label and textfield to one of the HBoxes
				 box_1.getChildren().addAll(label,textfield);
		//  add the buttons to the other HBox
				 box_2.getChildren().addAll(Hello,Howdy,Chinese,French,Clear,Exit);
				 box_1.setAlignment(Pos.CENTER);
				 box_2.setAlignment(Pos.CENTER);
				 HBox.setMargin(textfield, inset);
				 box_2.setMargin(Hello, inset);
				 box_2.setMargin(Howdy, inset);
				 box_2.setMargin(Chinese, inset);
				 box_2.setMargin(French, inset);
				 box_2.setMargin(Clear, inset);
				 box_2.setMargin(Exit, inset);
				 
				 //  add the HBoxes to this FXMainPanel (a VBox)
				 this.getChildren().addAll(box_1,box_2);
		
	}
	
	//Task #4:
	//  create a private inner class to handle the button clicks
	class ButtonHandler implements EventHandler<ActionEvent>{
		public void handle(ActionEvent event) {
			EventTarget eventTarget  = event.getTarget();
			if(eventTarget == Hello) {
				textfield.setText(dataManager.getHello());
			}else if(eventTarget == Howdy) {
				textfield.setText(dataManager.getHowdy());
			}else if(eventTarget == French) {
				textfield.setText(dataManager.getFrench());
			}else if(eventTarget == Chinese) {
				textfield.setText(dataManager.getChinese());
			}else if(eventTarget == Clear) {
				textfield.setText("");
			}else {
				Platform.exit();
				System.exit(0);
			}
		}

		
	}
	
}
	