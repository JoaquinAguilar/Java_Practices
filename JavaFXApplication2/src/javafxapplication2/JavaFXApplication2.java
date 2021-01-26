/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Propietario
 */
public class JavaFXApplication2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button(); //Nodo
//        EventoBtn eb=new EventoBtn();
        btn.setText("Say 'Hello World'");
//        btn.setOnAction(eb);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) { //Clase anonima
                System.out.println("Hello World!");
            }
        });
        
        Button btn2=new Button();
        btn2.setText("Otro Boton");
        btn2.setOnAction(
                     evento -> System.out.println("Kawaii Desho"));
        
        VBox root = new VBox(); //layout.   VBox(vertical) HBox(Horizontal)
        root.getChildren().add(btn);      //Nodo se agrega al layout
        root.getChildren().add(btn2);
        Scene scene = new Scene(root, 300, 250);  //Layout -> Escena
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
