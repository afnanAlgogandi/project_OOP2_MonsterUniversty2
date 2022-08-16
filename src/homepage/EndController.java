/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homepage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javax.swing.ImageIcon;

/**
 * FXML Controller class
 *
 * @author gogan
 */
public class EndController implements Initializable {

    @FXML
    private Label nameFromFıleText;
    @FXML
    private Button goHomeButton;
    @FXML
    private ImageView MonstersLicenseIcon;
    
    private Image p;
    private String UserName;
    
    String License[] = {"MonstersLicense1.jpg","MonstersLicense2.jpg","MonstersLicense3.jpg",
            "MonstersLicense4.jpg","MonstersLicense5.jpg","MonstersLicense6.jpg"};

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        UserName = FromTheFile();
        nameFromFıleText.setText(UserName);
        
        Random rand = new Random();
        int RandLicense = rand.nextInt(License.length);
        p = new Image (License[RandLicense]);
        MonstersLicenseIcon.setImage(p);
    }    

    @FXML
    private void goHomeButton(ActionEvent event) throws Exception {
    
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HomePage.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }
    }
    
    private String FromTheFile() {
          
         // Create the file.
        BufferedReader PlayerInfoFile;
        
        String PlayerName = null;
        
        try {
            PlayerInfoFile = new BufferedReader(new FileReader("PlayerInformation.txt"));
            
            // Read the name from the file.
            PlayerName = PlayerInfoFile.readLine();
            
            //show confirmation message
            System.out.println("Player information is read successfully");
            PlayerInfoFile.close();
            
        } catch (IOException ex) {
             System.out.println(ex);
        }
        return PlayerName;
    }
    
    
}
