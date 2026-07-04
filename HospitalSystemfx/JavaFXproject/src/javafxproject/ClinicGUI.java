
package javafxproject;

import java.util.ArrayList; 
import javafx.application.Application; 
import static javafx.application.Application.launch; 
import javafx.event.ActionEvent; 
import javafx.event.EventHandler; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.control.TextArea; 
import javafx.scene.layout.Background; 
import javafx.scene.layout.BackgroundFill; 
import javafx.scene.layout.GridPane; 
import javafx.scene.paint.Color; 
import javafx.scene.text.Font; 
import javafx.scene.text.FontWeight; 
import javafx.scene.text.Text; 
import javafx.stage.Stage; 
 
 
public class ClinicGUI extends Application { 
 
    @Override 
    public void start(Stage stage) { 
 
        GridPane grid = new GridPane(); 
        grid.setAlignment(Pos.CENTER); 
        grid.setHgap(10); 
        grid.setVgap(10); 
        grid.setPadding(new Insets(30)); 
 
        Text welcomeMsg = new Text("          ------HOSPITAL SYSTEM ------  "); 
        welcomeMsg.setFont(Font.font("Tahoma", FontWeight.EXTRA_BOLD, 16)); 
 
        grid.setBackground(new Background(new BackgroundFill(Color.AZURE, null, null))); 
        welcomeMsg.setFill(Color.BLUE); 
 
        grid.add(welcomeMsg, 0, 0, 2, 1); 
 
        TextArea tArea = new TextArea(); 
        tArea.setEditable(false); 
 
        grid.add(tArea, 0, 1, 2, 1); 
 
        Button btn = new Button("Show List"); 
        btn.setOnAction(new EventHandler<ActionEvent>() { 
            @Override 
            public void handle(ActionEvent event) { 
 
                ArrayList<Clinic> list = Main.List; 
                String s = ""; 
                for (Clinic c : list) { 
                    s += c + "\n=========================\n"; 
                } 
                tArea.setText(s); 
            } 
 
        }); 
 
        grid.add(btn, 0, 2); 
 
        Scene scene = new Scene(grid, 400, 300); 
 
        stage.setScene(scene); 
        stage.setTitle("Hospital Application"); 
        stage.show(); 
        stage.setResizable(false); 
 
    } 
 
    public static void main(String[] args) { 
        launch(args); 
    } 
}