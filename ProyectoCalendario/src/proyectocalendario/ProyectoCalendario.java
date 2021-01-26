/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocalendario;

import com.calendarfx.model.Calendar;
import com.calendarfx.view.CalendarView;
import com.calendarfx.view.MonthView;
import com.calendarfx.view.YearView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import jfxtras.labs.icalendaragenda.scene.control.agenda.ICalendarAgenda;


/**
 *
 * @author Cinth
 */
public class ProyectoCalendario extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        YearView Cal = new YearView();
        MonthView cm = new MonthView();
        CalendarView cv= new CalendarView();
        Calendar vCalendar = new Calendar();
//        ICalendarAgenda agenda = new ICalendarAgenda(vCalendar);
        BorderPane root = new BorderPane();
        root.setCenter(cm);
        Scene scene = new Scene(root, 1500, 1000);
        primaryStage.setScene(scene);
        primaryStage.show();
        
//        StackPane root = new StackPane();
//        root.getChildren().add();
//        
//        Scene scene = new Scene(root, 300, 250);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
