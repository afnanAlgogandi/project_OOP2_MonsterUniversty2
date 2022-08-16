/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homepage;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author gogan
 */
public class InformationController implements Initializable {

    @FXML
    private Button goHomeButton;
    @FXML
    private Button clearButton;
    @FXML
    private Button startChoseButton;
    @FXML
    private TextField nameText;
    @FXML
    private TextField emailText;
    @FXML
    private TextField phoneNumText;
    @FXML
    private Label ErrorLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
    
     @FXML
    private void startChoseButtonAction(ActionEvent event) throws Exception {
        
       String EmailForm = "^[A-Za-z0-9+_.-]+@(.+)$";
          String PhoneNumberForm = "^\\d{10}$";
          
          boolean EmailMatch = emailText.getText().matches(EmailForm);
          boolean PhoneNumberMatch = phoneNumText.getText().matches(PhoneNumberForm);
          boolean Empty = nameText.getText().trim().isEmpty() || emailText.getText().trim().isEmpty() 
                     || phoneNumText.getText().trim().isEmpty();
      
            if(Empty==true){
                ErrorLabel.setText("Please enter your information.");
            }
            else{
               if(EmailMatch==false){
                       ErrorLabel.setText("Please enter correct email");
               }
               if(PhoneNumberMatch==false){
                       ErrorLabel.setText("Please enter correct phone number");
               }
            }
          
            if (Empty==false && EmailMatch==true && PhoneNumberMatch==true){  
              
                writeToFile();
          try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("chosse.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }
     }
    }
     @FXML
    private void clearButtonAction(ActionEvent event) throws Exception {
        
         nameText.setText("");
         emailText.setText("");
         phoneNumText.setText("");
        
    }
    
    private void writeToFile() {
          
         // Create the file .
         BufferedWriter PlayerInfoFile;
         
        try {
            PlayerInfoFile = new BufferedWriter(new FileWriter("PlayerInformation.txt",false));
            
            // Write to the file.
            PlayerInfoFile.write((String) nameText.getText() + "\n");
            PlayerInfoFile.write((String) emailText.getText() + "\n");
            PlayerInfoFile.write((String) phoneNumText.getText() + "\n");
            
            //show confirmation message
            System.out.println("Player information is added successfully");
            PlayerInfoFile.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error wrting to file");
        } catch (IOException ex) {
            System.out.println("Error wrting to file");
        }
    }
    
}
