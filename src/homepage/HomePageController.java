/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homepage;

import java.awt.event.ItemEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.MenuItem;
import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author gogan
 */
public class HomePageController implements Initializable {

    @FXML
    private MenuItem closeAction;
    @FXML
    private CheckMenuItem darkMoodCheckM;
    @FXML
    private MenuItem aboutUsM;
    @FXML
    private ImageView imageBackGrond;
    @FXML
    private ImageView startButton;
    @FXML
    private ImageView aboutUsButton;
    @FXML
    private Button aboutUSButton;
    @FXML
    private Button startButton1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void aboutUsButtontMActionM(ActionEvent event) {
        
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AboutUs.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }
    }

    @FXML
    private void aboutUsButtontAction(MouseEvent event) {
        
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AboutUs.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }
    }

    
    @FXML
    private void closeAction(ActionEvent event) {
        System.exit(0);
    }

    
    @FXML
    private void aboutUsButtontMActionM(ItemEvent event) {
        
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AboutUs.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }
    }

    @FXML
    private void startButtonAction(ActionEvent event) {
        
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("information.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }
    }
    
    @FXML
    private void darkMoodActıon(ActionEvent event) {
         
        ImageInput d = new ImageInput();
            d.setSource(new Image("file:/C:/Users/gogan/.cache/tooling/gradle/homePage/src/homepage/DarkModeBackground.jpg"));
           
        ImageInput l = new ImageInput();
            l.setSource(new Image("C:\\Users\\gogan\\.cache\\tooling\\gradle\\homePage\\src\\homepage\\HomeBackground.png"));
               
          
           imageBackGrond.setEffect(d);
          
    }
    
    
}
