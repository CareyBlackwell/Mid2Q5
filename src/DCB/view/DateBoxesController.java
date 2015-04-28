package DCB.view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

public class DateBoxesController {
	@FXML
	private ComboBox<String> Month;
	@FXML
	private ComboBox<Integer> Day;
	@FXML
	private ComboBox<Integer> Year;
	
	public DateBoxesController() {
	}
	ObservableList<String> monthList = FXCollections.observableArrayList(
			"1,January", "2,Febuary", "3,March", "4,April", "5,May", "6,June", "7,July", "8,August", "9,September", "10,October", 
			"11,November", "12,December");
	
	ObservableList<Integer> days27 = FXCollections.observableArrayList(
			1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27);
	
	ObservableList<Integer> days28 = FXCollections.observableArrayList(
			1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28);
	
	ObservableList<Integer> days30 = FXCollections.observableArrayList(
			1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30);
	
	ObservableList<Integer> days31 = FXCollections.observableArrayList(
			1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31);
	
	ObservableList<Integer> daysnull = FXCollections.observableArrayList();
			
	ObservableList<Integer> yearList = FXCollections.observableArrayList(
			2010,2011,2012,2013,2014,2015,2016,2017,2018,2019,2020);
	
	
	private Stage mainStage;
	
	@FXML
    private void initialize() {
		Month.getItems().setAll(monthList);
		Year.getItems().setAll(yearList);
		
		Month.setValue("4,April");
		Year.setValue(2015);
		
		Day.getItems().setAll(getDays());
		
		Day.setValue(27);
		}
	
	@FXML
	private void handleMonths(){
		Day.getItems().removeAll(days31);
		Day.getItems().setAll(getDays());
	}
	@FXML
	private void handleYears(){
		Day.getItems().removeAll(days31);
		Day.getItems().setAll(getDays());
	}
	private ObservableList<Integer> getDays(){
		if (Month.getValue()=="1,January" || Month.getValue()=="3,March" || Month.getValue()=="5,May" || Month.getValue()=="7,July" || 
				Month.getValue()=="8,August" || Month.getValue()=="10,October" || Month.getValue()=="12,December" ){
			return days31;
		}
		else if(Month.getValue()=="4,April" || Month.getValue()=="6,June" || Month.getValue()=="9,September" || Month.getValue()=="11,November"){
			return days30;
		}
		else if(Month.getValue()=="2,Febuary"){
			if(Year.getValue()==2012 || Year.getValue()==2016 || Year.getValue()==2018 ){
				return days28;
			}
			else{ return days27;}
		}
		return daysnull;
	}
}

