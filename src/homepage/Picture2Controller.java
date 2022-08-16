/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homepage;

import java.awt.Color;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author gogan
 */
public class Picture2Controller implements Initializable {

    @FXML
    private Button backButtonM;
    @FXML
    private Button goHomeButtonM;
    @FXML
    private Button closeButtonM;
    @FXML
    private CheckBox darkMoodM;
    @FXML
    private Button aboutUsM;
    @FXML
    private AnchorPane freamPıc2;
    @FXML
    private Button doneButton;
    @FXML
    private RadioButton purpleRadıo;
    @FXML
    private RadioButton blueRadıo;
    @FXML
    private RadioButton blackRadıo;
    @FXML
    private RadioButton grayRadıo;
    @FXML
    private RadioButton whıteRadıo;
    @FXML
    private Button B1_11;
    @FXML
    private Button B2_0;
    @FXML
    private Button B0_9;
    @FXML
    private Button B0_8;
    @FXML
    private Button B0_7;
    @FXML
    private Button B0_6;
    @FXML
    private Button B0_5;
    @FXML
    private Button B6_2;
    @FXML
    private Button B0_4;
    @FXML
    private Button B0_3;
    @FXML
    private Button B0_2;
    @FXML
    private Button B0_1;
    @FXML
    private Button B1_10;
    @FXML
    private Button B1_9;
    @FXML
    private Button B1_8;
    @FXML
    private Button B1_6;
    @FXML
    private Button B1_7;
    @FXML
    private Button B1_5;
    @FXML
    private Button B1_4;
    @FXML
    private Button B1_3;
    @FXML
    private Button B1_2;
    @FXML
    private Button B1_1;
    @FXML
    private Button B0_17;
    @FXML
    private Button B0_16;
    @FXML
    private Button B0_15;
    @FXML
    private Button B0_14;
    @FXML
    private Button B0_13;
    @FXML
    private Button B0_12;
    @FXML
    private Button B0_11;
    @FXML
    private Button B0_10;
    @FXML
    private Button B2_15;
    @FXML
    private Button B1_0;
    @FXML
    private Button B6_1;
    @FXML
    private Button B5_0;
    @FXML
    private Button B3_0;
    @FXML
    private Button B6_0;
    @FXML
    private Button B1_17;
    @FXML
    private Button B1_16;
    @FXML
    private Button B1_15;
    @FXML
    private Button B1_14;
    @FXML
    private Button B1_13;
    @FXML
    private Button B1_12;
    @FXML
    private Button B2_14;
    @FXML
    private Button B2_13;
    @FXML
    private Button B2_12;
    @FXML
    private Button B2_11;
    @FXML
    private Button B2_10;
    @FXML
    private Button B2_9;
    @FXML
    private Button B2_8;
    @FXML
    private Button B2_7;
    @FXML
    private Button B2_6;
    @FXML
    private Button B2_5;
    @FXML
    private Button B2_4;
    @FXML
    private Button B2_2;
    @FXML
    private Button B2_3;
    @FXML
    private Button B2_1;
    @FXML
    private Button B3_13;
    @FXML
    private Button B3_1;
    @FXML
    private Button B2_17;
    @FXML
    private Button B2_16;
    @FXML
    private Button B3_12;
    @FXML
    private Button B3_11;
    @FXML
    private Button B3_10;
    @FXML
    private Button B3_9;
    @FXML
    private Button B3_8;
    @FXML
    private Button B3_7;
    @FXML
    private Button B3_6;
    @FXML
    private Button B3_5;
    @FXML
    private Button B3_4;
    @FXML
    private Button B3_3;
    @FXML
    private Button B3_2;
    @FXML
    private Button B4_1;
    @FXML
    private Button B3_17;
    @FXML
    private Button B3_16;
    @FXML
    private Button B3_15;
    @FXML
    private Button B3_14;
    @FXML
    private Button B4_17;
    @FXML
    private Button B4_16;
    @FXML
    private Button B4_15;
    @FXML
    private Button B4_14;
    @FXML
    private Button B4_13;
    @FXML
    private Button B4_12;
    @FXML
    private Button B4_11;
    @FXML
    private Button B4_10;
    @FXML
    private Button B4_9;
    @FXML
    private Button B4_8;
    @FXML
    private Button B4_7;
    @FXML
    private Button B4_6;
    @FXML
    private Button B4_5;
    @FXML
    private Button B4_4;
    @FXML
    private Button B4_3;
    @FXML
    private Button B4_2;
    @FXML
    private Button B6_13;
    @FXML
    private Button B5_17;
    @FXML
    private Button B5_16;
    @FXML
    private Button B5_15;
    @FXML
    private Button B5_14;
    @FXML
    private Button B5_13;
    @FXML
    private Button B5_12;
    @FXML
    private Button B5_11;
    @FXML
    private Button B5_10;
    @FXML
    private Button B5_9;
    @FXML
    private Button B5_8;
    @FXML
    private Button B5_7;
    @FXML
    private Button B5_6;
    @FXML
    private Button B5_5;
    @FXML
    private Button B5_4;
    @FXML
    private Button B5_3;
    @FXML
    private Button B5_2;
    @FXML
    private Button B5_1;
    @FXML
    private Button B15_1;
    @FXML
    private Button B6_12;
    @FXML
    private Button B6_11;
    @FXML
    private Button B6_10;
    @FXML
    private Button B6_9;
    @FXML
    private Button B6_8;
    @FXML
    private Button B6_7;
    @FXML
    private Button B6_6;
    @FXML
    private Button B6_5;
    @FXML
    private Button B6_4;
    @FXML
    private Button B6_3;
    @FXML
    private Button B0_0;
    @FXML
    private Button B6_16;
    @FXML
    private Button B6_15;
    @FXML
    private Button B6_14;
    @FXML
    private Button B6_17;
    @FXML
    private Button B7_15;
    @FXML
    private Button B7_14;
    @FXML
    private Button B7_12;
    @FXML
    private Button B7_11;
    @FXML
    private Button B7_10;
    @FXML
    private Button B7_9;
    @FXML
    private Button B7_8;
    @FXML
    private Button B7_7;
    @FXML
    private Button B7_13;
    @FXML
    private Button B7_6;
    @FXML
    private Button B7_5;
    @FXML
    private Button B7_4;
    @FXML
    private Button B7_3;
    @FXML
    private Button B7_2;
    @FXML
    private Button B7_1;
    @FXML
    private Button B7_0;
    @FXML
    private Button B7_17;
    @FXML
    private Button B7_16;
    @FXML
    private Button B8_17;
    @FXML
    private Button B8_16;
    @FXML
    private Button B8_15;
    @FXML
    private Button B8_14;
    @FXML
    private Button B8_13;
    @FXML
    private Button B8_12;
    @FXML
    private Button B8_11;
    @FXML
    private Button B8_10;
    @FXML
    private Button B8_9;
    @FXML
    private Button B8_8;
    @FXML
    private Button B8_7;
    @FXML
    private Button B8_6;
    @FXML
    private Button B8_5;
    @FXML
    private Button B8_4;
    @FXML
    private Button B8_3;
    @FXML
    private Button B8_2;
    @FXML
    private Button B8_1;
    @FXML
    private Button B8_0;
    @FXML
    private Button B9_17;
    @FXML
    private Button B9_16;
    @FXML
    private Button B9_15;
    @FXML
    private Button B9_14;
    @FXML
    private Button B9_13;
    @FXML
    private Button B9_12;
    @FXML
    private Button B9_11;
    @FXML
    private Button B9_10;
    @FXML
    private Button B9_9;
    @FXML
    private Button B9_8;
    @FXML
    private Button B9_7;
    @FXML
    private Button B9_6;
    @FXML
    private Button B9_5;
    @FXML
    private Button B9_4;
    @FXML
    private Button B9_3;
    @FXML
    private Button B9_2;
    @FXML
    private Button B9_1;
    @FXML
    private Button B9_0;
    @FXML
    private Button B10_16;
    @FXML
    private Button B10_15;
    @FXML
    private Button B10_14;
    @FXML
    private Button B10_13;
    @FXML
    private Button B10_12;
    @FXML
    private Button B10_11;
    @FXML
    private Button B10_10;
    @FXML
    private Button B10_9;
    @FXML
    private Button B10_8;
    @FXML
    private Button B10_7;
    @FXML
    private Button B10_6;
    @FXML
    private Button B10_5;
    @FXML
    private Button B10_4;
    @FXML
    private Button B10_3;
    @FXML
    private Button B10_2;
    @FXML
    private Button B10_1;
    @FXML
    private Button B10_0;
    @FXML
    private Button B10_17;
    @FXML
    private Button B11_17;
    @FXML
    private Button B11_16;
    @FXML
    private Button B11_15;
    @FXML
    private Button B11_14;
    @FXML
    private Button B11_13;
    @FXML
    private Button B11_12;
    @FXML
    private Button B11_11;
    @FXML
    private Button B11_10;
    @FXML
    private Button B11_9;
    @FXML
    private Button B11_8;
    @FXML
    private Button B11_7;
    @FXML
    private Button B11_6;
    @FXML
    private Button B11_5;
    @FXML
    private Button B11_4;
    @FXML
    private Button B11_3;
    @FXML
    private Button B11_2;
    @FXML
    private Button B11_1;
    @FXML
    private Button B11_0;
    @FXML
    private Button B12_16;
    @FXML
    private Button B12_15;
    @FXML
    private Button B12_14;
    @FXML
    private Button B12_13;
    @FXML
    private Button B12_12;
    @FXML
    private Button B12_11;
    @FXML
    private Button B12_10;
    @FXML
    private Button B12_9;
    @FXML
    private Button B12_8;
    @FXML
    private Button B12_7;
    @FXML
    private Button B12_6;
    @FXML
    private Button B12_5;
    @FXML
    private Button B12_4;
    @FXML
    private Button B12_3;
    @FXML
    private Button B12_2;
    @FXML
    private Button B12_1;
    @FXML
    private Button B12_0;
    @FXML
    private Button B12_17;
    @FXML
    private Button B13_16;
    @FXML
    private Button B13_15;
    @FXML
    private Button B13_14;
    @FXML
    private Button B13_13;
    @FXML
    private Button B13_12;
    @FXML
    private Button B13_11;
    @FXML
    private Button B13_10;
    @FXML
    private Button B13_9;
    @FXML
    private Button B13_8;
    @FXML
    private Button B13_7;
    @FXML
    private Button B13_6;
    @FXML
    private Button B13_5;
    @FXML
    private Button B13_4;
    @FXML
    private Button B13_3;
    @FXML
    private Button B13_2;
    @FXML
    private Button B13_1;
    @FXML
    private Button B13_0;
    @FXML
    private Button B13_17;
    @FXML
    private Button B14_13;
    @FXML
    private Button B14_12;
    @FXML
    private Button B14_11;
    @FXML
    private Button B14_10;
    @FXML
    private Button B14_9;
    @FXML
    private Button B14_8;
    @FXML
    private Button B14_7;
    @FXML
    private Button B14_6;
    @FXML
    private Button B14_5;
    @FXML
    private Button B14_4;
    @FXML
    private Button B14_3;
    @FXML
    private Button B14_2;
    @FXML
    private Button B14_1;
    @FXML
    private Button B14_0;
    @FXML
    private Button B14_17;
    @FXML
    private Button B14_16;
    @FXML
    private Button B14_15;
    @FXML
    private Button B14_14;
    @FXML
    private Button B15_16;
    @FXML
    private Button B15_15;
    @FXML
    private Button B15_14;
    @FXML
    private Button B15_13;
    @FXML
    private Button B15_12;
    @FXML
    private Button B15_11;
    @FXML
    private Button B15_10;
    @FXML
    private Button B15_9;
    @FXML
    private Button B15_8;
    @FXML
    private Button B15_7;
    @FXML
    private Button B15_6;
    @FXML
    private Button B15_5;
    @FXML
    private Button B15_4;
    @FXML
    private Button B15_3;
    @FXML
    private Button B15_2;
    @FXML
    private Button B15_0;
    @FXML
    private Button B4_0;
    @FXML
    private Button B15_17;
    @FXML
    private Button B16_16;
    @FXML
    private Button B16_15;
    @FXML
    private Button B16_14;
    @FXML
    private Button B16_13;
    @FXML
    private Button B16_12;
    @FXML
    private Button B16_11;
    @FXML
    private Button B16_10;
    @FXML
    private Button B16_9;
    @FXML
    private Button B16_8;
    @FXML
    private Button B16_7;
    @FXML
    private Button B16_6;
    @FXML
    private Button B16_5;
    @FXML
    private Button B16_4;
    @FXML
    private Button B16_3;
    @FXML
    private Button B16_2;
    @FXML
    private Button B16_1;
    @FXML
    private Button B16_0;
    @FXML
    private Button B16_17;
    @FXML
    private Button B18_;
    @FXML
    private Button B17_17;
    @FXML
    private Button B17_16;
    @FXML
    private Button B17_15;
    @FXML
    private Button B17_14;
    @FXML
    private Button B17_13;
    @FXML
    private Button B17_12;
    @FXML
    private Button B17_11;
    @FXML
    private Button B17_10;
    @FXML
    private Button B17_9;
    @FXML
    private Button B17_8;
    @FXML
    private Button B17_7;
    @FXML
    private Button B17_6;
    @FXML
    private Button B17_5;
    @FXML
    private Button B17_4;
    @FXML
    private Button B17_3;
    @FXML
    private Button B17_2;
    @FXML
    private Button B17_1;
    @FXML
    private Button B17_0;
    @FXML
    private Button B18_16;
    @FXML
    private Button B18_15;
    @FXML
    private Button B18_14;
    @FXML
    private Button B18_13;
    @FXML
    private Button B18_12;
    @FXML
    private Button B18_11;
    @FXML
    private Button B18_10;
    @FXML
    private Button B18_9;
    @FXML
    private Button B18_8;
    @FXML
    private Button B18_7;
    @FXML
    private Button B18_6;
    @FXML
    private Button B18_5;
    @FXML
    private Button B18_4;
    @FXML
    private Button B18_3;
    @FXML
    private Button B18_2;
    @FXML
    private Button B18_1;
    @FXML
    private Button B18_17;
    @FXML
    private Button B0_18;
    @FXML
    private Button B0_19;
    @FXML
    private Button B0_20;
    @FXML
    private Button B1_18;
    @FXML
    private Button B1_19;
    @FXML
    private Button B1_20;
    @FXML
    private Button B2_18;
    @FXML
    private Button B2_19;
    @FXML
    private Button B2_20;
    @FXML
    private Button B3_18;
    @FXML
    private Button B3_19;
    @FXML
    private Button B3_20;
    @FXML
    private Button B4_18;
    @FXML
    private Button B4_19;
    @FXML
    private Button B4_20;
    @FXML
    private Button B5_18;
    @FXML
    private Button B5_19;
    @FXML
    private Button B5_20;
    @FXML
    private Button B6_18;
    @FXML
    private Button B6_19;
    @FXML
    private Button B6_20;
    @FXML
    private Button B7_18;
    @FXML
    private Button B7_19;
    @FXML
    private Button B7_20;
    @FXML
    private Button B8_18;
    @FXML
    private Button B8_19;
    @FXML
    private Button B8_20;
    @FXML
    private Button B9_18;
    @FXML
    private Button B9_19;
    @FXML
    private Button B9_20;
    @FXML
    private Button B10_18;
    @FXML
    private Button B10_19;
    @FXML
    private Button B10_20;
    @FXML
    private Button B11_18;
    @FXML
    private Button B11_19;
    @FXML
    private Button B11_20;
    @FXML
    private Button B12_18;
    @FXML
    private Button B12_19;
    @FXML
    private Button B12_20;
    @FXML
    private Button B13_18;
    @FXML
    private Button B13_19;
    @FXML
    private Button B13_20;
    @FXML
    private Button B14_18;
    @FXML
    private Button B14_19;
    @FXML
    private Button B14_20;
    @FXML
    private Button B15_18;
    @FXML
    private Button B15_19;
    @FXML
    private Button B15_20;
    @FXML
    private Button B16_18;
    @FXML
    private Button B16_19;
    @FXML
    private Button B16_20;
    @FXML
    private Button B17_18;
    @FXML
    private Button B17_19;
    @FXML
    private Button B17_20;
    @FXML
    private Button B18_18;
    @FXML
    private Button B18_19;
    @FXML
    private Button B18_20;
    @FXML
    private Button B19_0;
    @FXML
    private Button B20_0;
    @FXML
    private Button B21_0;
    @FXML
    private Button B22_0;
    @FXML
    private Button B23_0;
    @FXML
    private Button B23_1;
    @FXML
    private Button B23_2;
    @FXML
    private Button B23_3;
    @FXML
    private Button B23_4;
    @FXML
    private Button B23_5;
    @FXML
    private Button B23_6;
    @FXML
    private Button B23_7;
    @FXML
    private Button B23_8;
    @FXML
    private Button B23_9;
    @FXML
    private Button B23_10;
    @FXML
    private Button B23_11;
    @FXML
    private Button B23_12;
    @FXML
    private Button B23_13;
    @FXML
    private Button B23_14;
    @FXML
    private Button B23_15;
    @FXML
    private Button B23_16;
    @FXML
    private Button B23_17;
    @FXML
    private Button B23_18;
    @FXML
    private Button B23_19;
    @FXML
    private Button B23_20;
    @FXML
    private Button B22_20;
    @FXML
    private Button B21_20;
    @FXML
    private Button B20_20;
    @FXML
    private Button B19_20;
    @FXML
    private Button B19_19;
    @FXML
    private Button B20_19;
    @FXML
    private Button B21_19;
    @FXML
    private Button B22_19;
    @FXML
    private Button B19_1;
    @FXML
    private Button B20_1;
    @FXML
    private Button B21_1;
    @FXML
    private Button B22_1;
    @FXML
    private Button B22_2;
    @FXML
    private Button B22_3;
    @FXML
    private Button B22_4;
    @FXML
    private Button B22_5;
    @FXML
    private Button B19_2;
    @FXML
    private Button B20_2;
    @FXML
    private Button B21_2;
    @FXML
    private Button B22_6;
    @FXML
    private Button B22_7;
    @FXML
    private Button B22_8;
    @FXML
    private Button B22_9;
    @FXML
    private Button B22_10;
    @FXML
    private Button B22_11;
    @FXML
    private Button B22_12;
    @FXML
    private Button B22_13;
    @FXML
    private Button B22_14;
    @FXML
    private Button B22_15;
    @FXML
    private Button B22_16;
    @FXML
    private Button B22_17;
    @FXML
    private Button B22_18;
    @FXML
    private Button B21_18;
    @FXML
    private Button B20_18;
    @FXML
    private Button B19_18;
    @FXML
    private Button B19_3;
    @FXML
    private Button B20_3;
    @FXML
    private Button B21_3;
    @FXML
    private Button B19_4;
    @FXML
    private Button B20_4;
    @FXML
    private Button B21_4;
    @FXML
    private Button B19_5;
    @FXML
    private Button B20_5;
    @FXML
    private Button B21_5;
    @FXML
    private Button B19_6;
    @FXML
    private Button B20_6;
    @FXML
    private Button B21_6;
    @FXML
    private Button B19_7;
    @FXML
    private Button B20_7;
    @FXML
    private Button B21_7;
    @FXML
    private Button B19_8;
    @FXML
    private Button B20_8;
    @FXML
    private Button B21_8;
    @FXML
    private Button B19_9;
    @FXML
    private Button B20_9;
    @FXML
    private Button B21_9;
    @FXML
    private Button B19_10;
    @FXML
    private Button B20_10;
    @FXML
    private Button B21_10;
    @FXML
    private Button B19_11;
    @FXML
    private Button B20_11;
    @FXML
    private Button B21_11;
    @FXML
    private Button B19_12;
    @FXML
    private Button B20_12;
    @FXML
    private Button B21_12;
    @FXML
    private Button B19_13;
    @FXML
    private Button B20_13;
    @FXML
    private Button B21_13;
    @FXML
    private Button B19_14;
    @FXML
    private Button B20_14;
    @FXML
    private Button B21_14;
    @FXML
    private Button B19_15;
    @FXML
    private Button B20_15;
    @FXML
    private Button B21_15;
    @FXML
    private Button B19_16;
    @FXML
    private Button B20_16;
    @FXML
    private Button B19_17;
    @FXML
    private Button B20_17;
    @FXML
    private Button B21_16;
    @FXML
    private Button B21_17;
    @FXML
    private Button B18_0;
    @FXML
    private Button bFall;
    @FXML
    private ImageView backImageP;
    @FXML
    private ImageView aboutImageP;
    @FXML
    private ImageView homeImageP;
    @FXML
    private Label labelOfCoordnate;
    
    private String color;
    
    public Button[] arrB;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        initializeButtonArray();
            
    }    
    
    public void initializeButtonArray() { 

    arrB = new Button[505];  
    
    arrB[0] = B0_0; arrB[1] =B0_1; arrB[2] =B0_2; arrB[3] =B0_3; arrB[4] =B0_4; arrB[5] =B0_5; arrB[6] =B0_6; arrB[7] =B0_7; arrB[9] =B0_8; arrB[10] =B0_9; arrB[11] =B0_10; arrB[12] =B0_11; arrB[13] =B0_12; arrB[14] =B0_13; arrB[15] =B0_14; arrB[16] =B0_15; arrB[17] =B0_16; arrB[18] =B0_17;arrB[19] = B0_18; arrB[20] =B0_19; arrB[21] =B0_20;
    arrB[22] =B1_0; arrB[23] =B1_1; arrB[24] =B1_2; arrB[25] =B1_3; arrB[26] =B1_4; arrB[27] =B1_5; arrB[28] =B1_6; arrB[29] =B1_7; arrB[30] =B1_8; arrB[31] =B1_9; arrB[32] =B1_10; arrB[33] =B1_11; arrB[34] =B1_12; arrB[35] =B1_13; arrB[36] =B1_14;arrB[37] = B1_15; arrB[38] =B1_16; arrB[39] =B1_17; arrB[40] =B1_18; arrB[41] =B1_19; arrB[42] =B1_20; 
    arrB[43] =B2_0; arrB[44] =B2_1; arrB[45] =B2_2; arrB[46] =B2_3; arrB[47] =B2_4; arrB[48] =B2_5; arrB[49] =B2_6; arrB[50] =B2_7; arrB[51] =B2_8; arrB[52] =B2_9; arrB[53] =B2_10; arrB[54] =B2_11;arrB[55] = B2_12; arrB[56] =B2_13; arrB[57] =B2_14; arrB[58] =B2_15; arrB[59] =B2_16; arrB[60] =B2_17; arrB[61] =B2_18; arrB[62] =B2_19; arrB[63] =B2_20; 
    arrB[64] =B3_0; arrB[65] =B3_1; arrB[66] =B3_2; arrB[67] =B3_3; arrB[68] =B3_4; arrB[69] =B3_5; arrB[70] =B3_6; arrB[71] =B3_7; arrB[72] =B3_8;arrB[73] = B3_9; arrB[74] =B3_10; arrB[75] =B3_11; arrB[76] =B3_12; arrB[77] =B3_13; arrB[78] =B3_14; arrB[79] =B3_15; arrB[80] =B3_16; arrB[81] =B3_17; arrB[82] =B3_18; arrB[83] =B3_19; arrB[84] =B3_20;
    arrB[85] =B4_0; arrB[86] =B4_1; arrB[87] =B4_2; arrB[88] =B4_3; arrB[89] =B4_4; arrB[90] =B4_5; arrB[91] =B4_6; arrB[92] =B4_7; arrB[93] =B4_8; arrB[94] =B4_9; arrB[95] =B4_10; arrB[96] =B4_11; arrB[97] =B4_12; arrB[98] =B4_13; arrB[99] =B4_14; arrB[100] =B4_15; arrB[101] =B4_16; arrB[102] =B4_17; arrB[103] =B4_18; arrB[104] =B4_19; arrB[105] =B4_20;
    arrB[106] = B5_0; arrB[107] =B5_1; arrB[108] =B5_2; arrB[109] =B5_3; arrB[110] =B5_4; arrB[111] =B5_5; arrB[112] =B5_6; arrB[113] =B5_7; arrB[114] =B5_8; arrB[115] =B5_9; arrB[116] =B5_10; arrB[117] =B5_11; arrB[118] =B5_12; arrB[119] =B5_13; arrB[120] =B5_14; arrB[121] =B5_15; arrB[122] =B5_16; arrB[123] =B5_17; arrB[124] =B5_18; arrB[125] =B5_19; arrB[126] =B5_20;
    arrB[127] = B6_0; arrB[128] =B6_1; arrB[129] =B6_2; arrB[130] =B6_3; arrB[131] =B6_4; arrB[132] =B6_5; arrB[133] =B6_6; arrB[134] =B6_7; arrB[135] =B6_8; arrB[136] =B6_9; arrB[137] =B6_10; arrB[138] =B6_11; arrB[139] =B6_12; arrB[140] =B6_13; arrB[141] =B6_14; arrB[142] =B6_15; arrB[143] =B6_16; arrB[144] =B6_17;arrB[145] = B6_18; arrB[146] =B6_19; arrB[147] =B6_20;
    arrB[148] = B7_0; arrB[149] =B7_1; arrB[150] =B7_2; arrB[151] =B7_3; arrB[152] =B7_4; arrB[153] =B7_5; arrB[154] =B7_6; arrB[155] =B7_7; arrB[156] =B7_8; arrB[157] =B7_9; arrB[158] =B7_10; arrB[159] =B7_11; arrB[160] =B7_12; arrB[161] =B7_13; arrB[162] =B7_14;arrB[163] = B7_15; arrB[164] =B7_16; arrB[165] =B7_17; arrB[166] =B7_18; arrB[167] =B7_19; arrB[168] =B7_20;
    arrB[169] = B8_0; arrB[170] =B8_1; arrB[171] =B8_2; arrB[172] =B8_3; arrB[173] =B8_4; arrB[174] =B8_5; arrB[175] =B8_6; arrB[176] =B8_7; arrB[177] =B8_8; arrB[178] =B8_9; arrB[179] =B8_10; arrB[180] =B8_11;arrB[181] = B8_12; arrB[182] =B8_13; arrB[183] =B8_14; arrB[184] =B8_15; arrB[185] =B8_16; arrB[186] =B8_17; arrB[187] =B8_18; arrB[188] =B8_19; arrB[189] =B8_20;
    arrB[190] = B9_0; arrB[191] =B9_1; arrB[192] =B9_2; arrB[193] =B9_3; arrB[194] =B9_4; arrB[195] =B9_5; arrB[196] =B9_6; arrB[197] =B9_7; arrB[198] =B9_8;arrB[199] = B9_9; arrB[200] =B9_10; arrB[201] =B9_11; arrB[202] =B9_12; arrB[203] =B9_13; arrB[204] =B9_14; arrB[205] =B9_15; arrB[206] =B9_16; arrB[207] =B9_17; arrB[208] =B9_18; arrB[209] =B9_19; arrB[210] =B9_20;
    arrB[211] = B10_0; arrB[212] =B10_1; arrB[213] =B10_2; arrB[214] =B10_3; arrB[215] =B10_4; arrB[216] =B10_5;arrB[217] = B10_6; arrB[218] =B10_7; arrB[219] =B10_8; arrB[220] =B10_9; arrB[221] =B10_10; arrB[222] =B10_11; arrB[223] =B10_12; arrB[224] =B10_13; arrB[225] =B10_14; arrB[226] =B10_15; arrB[227] =B10_16; arrB[228] =B10_17; arrB[229] =B10_18; arrB[230] =B10_19; arrB[231] =B10_20;
    arrB[232] = B11_0; arrB[233] =B11_1; arrB[234] =B11_2;arrB[235] = B11_3; arrB[236] =B11_4; arrB[237] =B11_5; arrB[238] =B11_6; arrB[239] =B11_7; arrB[240] =B11_8; arrB[241] =B11_9; arrB[242] =B11_10; arrB[243] =B11_11; arrB[244] =B11_12; arrB[245] =B11_13; arrB[246] =B11_14; arrB[247] =B11_15; arrB[248] =B11_16; arrB[249] =B11_17; arrB[250] =B11_18; arrB[251] =B11_19; arrB[252] =B11_20;
    arrB[253] = B12_0; arrB[254] =B12_1; arrB[255] =B12_2; arrB[256] =B12_3; arrB[257] =B12_4; arrB[258] =B12_5; arrB[259] =B12_6; arrB[260] =B12_7; arrB[261] =B12_8; arrB[262] =B12_9; arrB[263] =B12_10; arrB[264] =B12_11; arrB[265] =B12_12; arrB[266] =B12_13; arrB[267] =B12_14; arrB[268] =B12_15; arrB[269] =B12_16; arrB[270] =B12_17; arrB[271] =B12_18; arrB[272] =B12_19; arrB[273] =B12_20; 
    arrB[274] = B13_0; arrB[275] =B13_1; arrB[276] =B13_2; arrB[277] =B13_3; arrB[278] =B13_4; arrB[279] =B13_5; arrB[280] =B13_6; arrB[281] =B13_7; arrB[282] =B13_8; arrB[283] =B13_9; arrB[284] =B13_10; arrB[285] =B13_11; arrB[286] =B13_12; arrB[287] =B13_13; arrB[288] =B13_14; arrB[289] =B13_15; arrB[290] =B13_16; arrB[291] =B13_17; arrB[292] =B13_18; arrB[293] =B13_19; arrB[294] =B13_20; 
    arrB[295] = B14_0; arrB[296] =B14_1; arrB[297] =B14_2; arrB[298] =B14_3; arrB[299] =B14_4; arrB[300] =B14_5; arrB[301] =B14_6; arrB[302] =B14_7; arrB[303] =B14_8; arrB[304] =B14_9; arrB[305] =B14_10; arrB[306] =B14_11; arrB[307] =B14_12; arrB[308] =B14_13; arrB[309] =B14_14; arrB[310] =B14_15; arrB[311] =B14_16; arrB[312] =B14_17; arrB[313] =B14_18; arrB[314] =B14_19; arrB[315] =B14_20; 
    arrB[316] = B15_0; arrB[317] =B15_1; arrB[318] =B15_2; arrB[319] =B15_3; arrB[320] =B15_4; arrB[321] =B15_5; arrB[322] =B15_6; arrB[323] =B15_7; arrB[324] =B15_8; arrB[325] =B15_9; arrB[326] =B15_10; arrB[327] =B15_11; arrB[328] =B15_12; arrB[329] =B15_13; arrB[330] =B15_14; arrB[331] =B15_15; arrB[332] =B15_16; arrB[333] =B15_17; arrB[334] =B15_18; arrB[335] =B15_19; arrB[336] =B15_20; 
    arrB[337] = B16_0; arrB[338] =B16_1; arrB[339] =B16_2; arrB[340] =B16_3; arrB[341] =B16_4; arrB[342] =B16_5; arrB[343] =B16_6; arrB[344] =B16_7; arrB[345] =B16_8; arrB[346] =B16_9; arrB[347] =B16_10; arrB[348] =B16_11; arrB[349] =B16_12; arrB[350] =B16_13; arrB[351] =B16_14; arrB[352] =B16_15; arrB[353] =B16_16; arrB[354] =B16_17; arrB[355] =B16_18; arrB[356] =B16_19; arrB[357] =B16_20; 
    arrB[358] = B17_0; arrB[359] =B17_1; arrB[360] =B17_2; arrB[361] =B17_3; arrB[362] =B17_4; arrB[363] =B17_5; arrB[364] =B17_6; arrB[365] =B17_7; arrB[366] =B17_8; arrB[367] =B17_9; arrB[368] =B17_10; arrB[369] =B17_11; arrB[370] =B17_12; arrB[371] =B17_13; arrB[372] =B17_14; arrB[373] =B17_15; arrB[374] =B17_16; arrB[375] =B17_17; arrB[376] =B17_18; arrB[377] =B17_19; arrB[378] =B17_20; 
    arrB[379] = B18_0; arrB[380] =B18_1; arrB[381] =B18_2; arrB[382] =B18_3; arrB[383] =B18_4; arrB[384] =B18_5; arrB[385] =B18_6; arrB[386] =B18_7; arrB[387] =B18_8; arrB[388] =B18_9; arrB[389] =B18_10; arrB[390] =B18_11; arrB[391] =B18_12; arrB[392] =B18_13; arrB[393] =B18_14; arrB[394] =B18_15; arrB[395] =B18_16; arrB[396] =B18_17; arrB[397] =B18_18; arrB[398] =B18_19; arrB[399] =B18_20; 
    arrB[400] = B19_0; arrB[401] =B19_1; arrB[402] =B19_2; arrB[403] =B19_3; arrB[404] =B19_4; arrB[405] =B19_5; arrB[406] =B19_6; arrB[407] =B19_7; arrB[408] =B19_8; arrB[409] =B19_9; arrB[410] =B19_10; arrB[411] =B19_11; arrB[412] =B19_12; arrB[413] =B19_13; arrB[414] =B19_14; arrB[415] =B19_15; arrB[416] =B19_16; arrB[417] =B19_17; arrB[418] =B19_18; arrB[419] =B19_19; arrB[420] =B19_20; 
    arrB[421] = B20_0; arrB[422] =B20_1; arrB[423] =B20_2; arrB[424] =B20_3; arrB[425] =B20_4; arrB[426] =B20_5; arrB[427] =B20_6; arrB[428] =B20_7; arrB[429] =B20_8; arrB[430] =B20_9; arrB[431] =B20_10; arrB[432] =B20_11; arrB[433] =B20_12; arrB[434] =B20_13; arrB[435] =B20_14; arrB[436] =B20_15; arrB[437] =B20_16; arrB[438] =B20_17; arrB[439] =B20_18; arrB[440] =B20_19; arrB[441] =B20_20;
    arrB[442] = B21_0; arrB[443] =B21_1; arrB[444] =B21_2; arrB[445] =B21_3; arrB[446] =B21_4; arrB[447] =B21_5; arrB[448] =B21_6; arrB[449] =B21_7; arrB[450] =B21_8; arrB[451] =B21_9; arrB[452] =B21_10; arrB[453] =B21_11; arrB[454] =B21_12; arrB[455] =B21_13; arrB[456] =B21_14; arrB[457] =B21_15; arrB[458] =B21_16; arrB[459] =B21_17; arrB[460] =B21_18; arrB[461] =B21_19; arrB[462] =B21_20; 
    arrB[463] = B22_0; arrB[464] =B22_1; arrB[465] =B22_2; arrB[466] =B22_3; arrB[467] =B22_4; arrB[468] =B22_5; arrB[469] =B22_6; arrB[470] =B22_7; arrB[471] =B22_8; arrB[472] =B22_9; arrB[473] =B22_10; arrB[474] =B22_11; arrB[475] =B22_12; arrB[476] =B22_13; arrB[477] =B22_14; arrB[478] =B22_15; arrB[479] =B22_16; arrB[480] =B22_17; arrB[481] =B22_18; arrB[482] =B22_19; arrB[483] =B22_20; 
    arrB[484] = B23_0; arrB[485] =B23_1; arrB[486] =B23_2; arrB[487] =B23_3; arrB[488] =B23_4; arrB[489] =B23_5; arrB[490] =B23_6; arrB[491] =B23_7; arrB[492] =B23_8; arrB[493] =B23_9; arrB[494] =B23_10; arrB[495] =B23_11; arrB[496] =B23_12; arrB[497] =B23_13; arrB[498] =B23_14; arrB[499] =B23_15; arrB[500] =B23_16; arrB[501] =B23_17; arrB[502] =B23_18; arrB[503] =B23_19; arrB[504] =B23_20; 
    } 


    @FXML
    private void darkMoodActıon(ActionEvent event) {
        
        //Dark Mode
          if(darkMoodM.isSelected()){
               freamPıc2.setStyle("-fx-background-color: black");
               blackRadıo.setStyle("-fx-Foreground-color: #c7c7c7");
               
               
          }
          else {
               freamPıc2.setStyle("-fx-background-color: # ffffff");
               blackRadıo.setStyle("-fx-Foreground-color: #black");
              
          }
    } 
    
    
    
    @FXML
    private void doneAction(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("end.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }
    }
    
    @FXML
    private void backAction(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("chosse.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }
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
    private void aboutUsButtontMActionM(ActionEvent event) {
        
       try {
            
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("aboutUsPhoto.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
            
          
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }
    }
    
    
    @FXML
    private void fillCoordnate(ActionEvent event) {
              
              if(purpleRadıo.isSelected()){
                  color ="Purple";
                  labelOfCoordnate.setText("D20\nE16\nF7 F9 F10 F12 F14 F19\nG12 G13\nH16 H17 H19\nI15 I16\nM15 M16\n"
                          + "N16 N18 N19\nP7 P9 P10 P12 P14\nQ16");
              }
              else if(blueRadıo.isSelected()){
                  color ="Blue";
                  labelOfCoordnate.setText("E15 E20\nF6 F8 F11 F15 F16 F20\nG5 G6 G7 G8 G9 G10 G11 G15\nH5 H6 H7 "
                          + "H9 H10 H11 H12 H13 H18 H20\nI5 I6 I7 I8 I9 I10 I11 I12 I13 I17 I18 I19 I20\n"
                          + "J5 J6 J7 J8 J10 J11 J12 J13 J15 J16 J17 J18 J20\nK5 K6 K7 K8 K10 K11 K12 K13 K15 "
                          + "K16 K17 K18\nL5 L6 L7 L8 L10 L11 L12 L13 L15 L16 L17 L18 L20\nM5 M6 M7 M8 M9 M10 M11 M12 M13\n"
                          + "M17 M18 M19 M20\nN5 N6 N7 N9 N10 N11 N12 N13 N17 N20\nO5 O6 O7 O8 O9 O10 O11 O12 O13 O15\n"
                          + "P6 P8 P11 P15 P16\nQ15");
              }
              else if(grayRadıo.isSelected()){
                  color ="Silver";
                  labelOfCoordnate.setText("E3 E4 E5\nF4\nP4\nQ3 Q4 Q5");
              }
              else if(blackRadıo.isSelected()){
                  color ="Black";
                  labelOfCoordnate.setText("C20 C21\nD3 D4 D5 D6 D14 D15 D19 D21\nE2 E6 E7 E8 E9 E10 E11 E12 E14 E17 E19 E21\n"
                          + "F3 F5 F13 F17 F18 F21\nG4 G14 G16 G17 G18 G19 G20\nH4 H8 H14 H15 H21\nI4 I14 I21\n"
                          + "J4 J9 J14 J19 J21\nK4 K9 K14 K19 K20\nL4 L9 L14 L19 L21\nM4 M14 M21\nN4 N8 N14 N15 N21\n"
                          + "O4 O14 O16 O17 O18 O19 O20\nP3 P5 P13 P17\nQ2 Q6 Q7 Q8 Q9 Q10 Q11 Q12 Q14 Q17\n"
                          + "S3 S4 S5 S15 S16");
              }
              else{
                  color ="White";
                  labelOfCoordnate.setText("");
              
          }
              
              
    }
    
    @FXML
    private void coloring(ActionEvent event){
        
         if(color == "Purple"){
                   
                   for (int i=0;i<505;i++){
                   if(event.getSource() == arrB[i]){
                       arrB[i].setStyle("-fx-background-color: #a76dbd; ");
                   }
               } 
                   
               
          }
          else if(color == "Blue"){
                
                     for (int i=0;i<505;i++){
                   if(event.getSource() == arrB[i]){
                       arrB[i].setStyle("-fx-background-color: #67aee4; ");
                   }
               } 
              
          }
          else if(color == "Silver"){
              
              
                    for (int i=0;i<505;i++){
                   if(event.getSource() == arrB[i]){
                       arrB[i].setStyle("-fx-background-color: #a19e9e; ");
                   }
               } 
              
          }
          else if(color == "Black"){
              
              for (int i=0;i<505;i++){
                   if(event.getSource() == arrB[i]){
                       arrB[i].setStyle("-fx-background-color: #000000; ");
                   }
               } 
                   
              
          }
          else if(color == "White"){
              
                   for (int i=0;i<505;i++){
                   if(event.getSource() == arrB[i]){
                       arrB[i].setStyle("-fx-background-color: #ffffff; ");
                   }
               } 
              
          }
          else {
              
              for (int i=0;i<505;i++){
                   if(event.getSource() == arrB[i]){
                       arrB[i].setStyle("-fx-background-color: #ffffff; ");
                   }
               }
              
          }
    }
    
    @FXML
    private void fallAllButton(ActionEvent event) {
        // purple ("D20\nE16\nF7 F9 F10 F12 F14 F19\nG12 G13\nH16 H17 H19\nI15 I16\nM15 M16\n N16 N18 N19\nP7 P9 P10 P12 P14\nQ16");
        
        /*   blue ("E15 E20\nF6 F8 F11 F15 F16 F20\nG5 G6 G7 G8 G9 G10 G11 G15\nH5 H6 H7 "
                          + "H9 H10 H11 H12 H13 H18 H20\nI5 I6 I7 I8 I9 I10 I11 I12 I13 I17 I18 I19 I20\n"
                          + "J5 J6 J7 J8 J10 J11 J12 J13 J15 J16 J17 J18 J20\nK5 K6 K7 K8 K10 K11 K12 K13 K15 "
                          + "K16 K17 K18\nL5 L6 L7 L8 L10 L11 L12 L13 L15 L16 L17 L18 L20\nM5 M6 M7 M8 M9 M10 M11 M12 M13\n"
                          + "M17 M18 M19 M20\nN5 N6 N7 N9 N10 N11 N12 N13 N17 N20\nO5 O6 O7 O8 O9 O10 O11 O12 O13 O15\n"
                          + "P6 P8 P11 P15 P16\nQ15"); */
         // gray ("E3 E4 E5\nF4\nP4\nQ3 Q4 Q5");
         
          /* black ("C20 C21\nD3 D4 D5 D6 D14 D15 D19 D21\nE2 E6 E7 E8 E9 E10 E11 E12 E14 E17 E19 E21\n"
                          + "F3 F5 F13 F17 F18 F21\nG4 G14 G16 G17 G18 G19 G20\nH4 H8 H14 H15 H21\nI4 I14 I21\n"
                          + "J4 J9 J14 J19 J21\nK4 K9 K14 K19 K20\nL4 L9 L14 L19 L21\nM4 M14 M21\nN4 N8 N14 N15 N21\n"
                          + "O4 O14 O16 O17 O18 O19 O20\nP3 P5 P13 P17\nQ2 Q6 Q7 Q8 Q9 Q10 Q11 Q12 Q14 Q17\n"
                          + "S3 S4 S5 S15 S16"); */
              
    }
    
    
}
