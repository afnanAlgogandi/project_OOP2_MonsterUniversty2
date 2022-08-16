/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homepage;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Najlaa Alshatri
 */
public class HomePage extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        /******************************************/
        try {
            // Load the FXML file.
            Parent parent = FXMLLoader.load(getClass().getResource("HomePage.fxml"));

            // Build the scene graph.
            Scene scene = new Scene(parent);

            // Display our window, using the scene graph.
            stage.setTitle(" Monsters University");
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            System.out.println("FXML Loading Error");
        }

        /**************************************/
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}