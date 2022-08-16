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
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.effect.ImageInput;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author gogan
 */
public class Picture1Controller implements Initializable {

    @FXML
    private AnchorPane freamPıc1;
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
    private Button B18_0;
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
    private Button bFall;
    @FXML
    private Button doneButton;
    @FXML
    private Label labelOfCoordnate;
    @FXML
    private RadioButton lightGreenRadio;
    @FXML
    private ToggleGroup colorPanel;
    @FXML
    private RadioButton greenRadio;
    @FXML
    private RadioButton darkGreenRadio;
    @FXML
    private RadioButton brownRadio;
    @FXML
    private RadioButton blackRadio;
    @FXML
    private RadioButton whiteRadio;
    @FXML
    private RadioButton blueRadio;
    @FXML
    private CheckBox darkMoodCheck;
    @FXML
    private ImageView homeImageG;
    @FXML
    private ImageView aboutImageG;
    @FXML
    private ImageView backImageG;
    @FXML
    private Button aboutUsButtonM;
    @FXML
    private Button backButtonM;
    @FXML
    private Button goHomeButtonM;
    @FXML
    private Button kkkk;
    @FXML
    private ScrollPane scrollCoor;
    @FXML
    private GridPane graid;
    
    private static String color ;
    
    public Button[] arrB;
   
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
         initializeButtonArray();
        
    }    
    
    public void initializeButtonArray() { 

    arrB = new Button[343];  
    
    arrB[0] = B0_0; arrB[1] =B0_1; arrB[2] =B0_2; arrB[3] =B0_3; arrB[4] =B0_4; arrB[5] =B0_5; arrB[6] =B0_6; arrB[7] =B0_7; arrB[9] =B0_8; arrB[10] =B0_9; arrB[11] =B0_10; arrB[12] =B0_11; arrB[13] =B0_12; arrB[14] =B0_13; arrB[15] =B0_14; arrB[16] =B0_15; arrB[17] =B0_16; arrB[18] =B0_17;
    arrB[19] = B1_0; arrB[20] =B1_1; arrB[21] =B1_2; arrB[22] =B1_3; arrB[23] =B1_4; arrB[24] =B1_5; arrB[25] =B1_6; arrB[26] =B1_7; arrB[27] =B1_8; arrB[28] =B1_9; arrB[29] =B1_10; arrB[30] =B1_11; arrB[31] =B1_12; arrB[32] =B1_13; arrB[33] =B1_14; arrB[34] =B1_15; arrB[35] =B1_16; arrB[36] =B1_17;
    arrB[37] = B2_0; arrB[38] =B2_1; arrB[39] =B2_2; arrB[40] =B2_3; arrB[41] =B2_4; arrB[42] =B2_5; arrB[43] =B2_6; arrB[44] =B2_7; arrB[45] =B2_8; arrB[46] =B2_9; arrB[47] =B2_10; arrB[48] =B2_11; arrB[49] =B2_12; arrB[50] =B2_13; arrB[51] =B2_14; arrB[52] =B2_15; arrB[53] =B2_16; arrB[54] =B2_17;
    arrB[55] = B3_0; arrB[56] =B3_1; arrB[57] =B3_2; arrB[58] =B3_3; arrB[59] =B3_4; arrB[60] =B3_5; arrB[61] =B3_6; arrB[62] =B3_7; arrB[63] =B3_8; arrB[64] =B3_9; arrB[65] =B3_10; arrB[66] =B3_11; arrB[67] =B3_12; arrB[68] =B3_13; arrB[69] =B3_14; arrB[70] =B3_15; arrB[71] =B3_16; arrB[72] =B3_17;
    arrB[73] = B4_0; arrB[74] =B4_1; arrB[75] =B4_2; arrB[76] =B4_3; arrB[77] =B4_4; arrB[78] =B4_5; arrB[79] =B4_6; arrB[80] =B4_7; arrB[81] =B4_8; arrB[82] =B4_9; arrB[83] =B4_10; arrB[84] =B4_11; arrB[85] =B4_12; arrB[86] =B4_13; arrB[87] =B4_14; arrB[88] =B4_15; arrB[89] =B4_16; arrB[90] =B4_17;
    arrB[91] = B5_0; arrB[92] =B5_1; arrB[93] =B5_2; arrB[94] =B5_3; arrB[95] =B5_4; arrB[96] =B5_5; arrB[97] =B5_6; arrB[98] =B5_7; arrB[99] =B5_8; arrB[100] =B5_9; arrB[101] =B5_10; arrB[102] =B5_11; arrB[103] =B5_12; arrB[104] =B5_13; arrB[105] =B5_14; arrB[106] =B5_15; arrB[107] =B5_16; arrB[108] =B5_17;
    arrB[109] = B6_0; arrB[110] =B6_1; arrB[111] =B6_2; arrB[112] =B6_3; arrB[113] =B6_4; arrB[114] =B6_5; arrB[115] =B6_6; arrB[116] =B6_7; arrB[117] =B6_8; arrB[118] =B6_9; arrB[119] =B6_10; arrB[120] =B6_11; arrB[121] =B6_12; arrB[122] =B6_13; arrB[123] =B6_14; arrB[124] =B6_15; arrB[125] =B6_16; arrB[126] =B6_17;
    arrB[127] = B7_0; arrB[128] =B7_1; arrB[129] =B7_2; arrB[130] =B7_3; arrB[131] =B7_4; arrB[132] =B7_5; arrB[133] =B7_6; arrB[134] =B7_7; arrB[135] =B7_8; arrB[136] =B7_9; arrB[137] =B7_10; arrB[138] =B7_11; arrB[139] =B7_12; arrB[140] =B7_13; arrB[141] =B7_14; arrB[142] =B7_15; arrB[143] =B7_16; arrB[144] =B7_17;
    arrB[145] = B8_0; arrB[146] =B8_1; arrB[147] =B8_2; arrB[148] =B8_3; arrB[149] =B8_4; arrB[150] =B8_5; arrB[151] =B8_6; arrB[152] =B8_7; arrB[153] =B8_8; arrB[154] =B8_9; arrB[155] =B8_10; arrB[156] =B8_11; arrB[157] =B8_12; arrB[158] =B8_13; arrB[159] =B8_14; arrB[160] =B8_15; arrB[161] =B8_16; arrB[162] =B8_17;
    arrB[163] = B9_0; arrB[164] =B9_1; arrB[165] =B9_2; arrB[166] =B9_3; arrB[167] =B9_4; arrB[168] =B9_5; arrB[169] =B9_6; arrB[170] =B9_7; arrB[171] =B9_8; arrB[172] =B9_9; arrB[173] =B9_10; arrB[174] =B9_11; arrB[175] =B9_12; arrB[176] =B9_13; arrB[177] =B9_14; arrB[178] =B9_15; arrB[179] =B9_16; arrB[180] =B9_17;
    arrB[181] = B10_0; arrB[182] =B10_1; arrB[183] =B10_2; arrB[184] =B10_3; arrB[185] =B10_4; arrB[186] =B10_5; arrB[187] =B10_6; arrB[188] =B10_7; arrB[189] =B10_8; arrB[190] =B10_9; arrB[191] =B10_10; arrB[192] =B10_11; arrB[193] =B10_12; arrB[194] =B10_13; arrB[195] =B10_14; arrB[196] =B10_15; arrB[197] =B10_16; arrB[198] =B10_17;
    arrB[199] = B11_0; arrB[200] =B11_1; arrB[201] =B11_2; arrB[202] =B11_3; arrB[203] =B11_4; arrB[204] =B11_5; arrB[205] =B11_6; arrB[206] =B11_7; arrB[207] =B11_8; arrB[208] =B11_9; arrB[209] =B11_10; arrB[210] =B11_11; arrB[211] =B11_12; arrB[212] =B11_13; arrB[213] =B11_14; arrB[214] =B11_15; arrB[215] =B11_16; arrB[216] =B11_17;
    arrB[217] = B12_0; arrB[218] =B12_1; arrB[219] =B12_2; arrB[220] =B12_3; arrB[221] =B12_4; arrB[222] =B12_5; arrB[223] =B12_6; arrB[224] =B12_7; arrB[225] =B12_8; arrB[226] =B12_9; arrB[227] =B12_10; arrB[228] =B12_11; arrB[229] =B12_12; arrB[230] =B12_13; arrB[231] =B12_14; arrB[232] =B12_15; arrB[233] =B12_16; arrB[234] =B12_17;
    arrB[235] = B13_0; arrB[236] =B13_1; arrB[237] =B13_2; arrB[238] =B13_3; arrB[239] =B13_4; arrB[240] =B13_5; arrB[241] =B13_6; arrB[242] =B13_7; arrB[243] =B13_8; arrB[244] =B13_9; arrB[245] =B13_10; arrB[246] =B13_11; arrB[247] =B13_12; arrB[248] =B13_13; arrB[249] =B13_14; arrB[250] =B13_15; arrB[251] =B13_16; arrB[252] =B13_17;
    arrB[253] = B14_0; arrB[254] =B14_1; arrB[255] =B14_2; arrB[256] =B14_3; arrB[257] =B14_4; arrB[258] =B14_5; arrB[259] =B14_6; arrB[260] =B14_7; arrB[261] =B14_8; arrB[262] =B14_9; arrB[263] =B14_10; arrB[264] =B14_11; arrB[265] =B14_12; arrB[266] =B14_13; arrB[267] =B14_14; arrB[268] =B14_15; arrB[269] =B14_16; arrB[270] =B14_17;
    arrB[271] = B15_0; arrB[272] =B15_1; arrB[273] =B15_2; arrB[274] =B15_3; arrB[275] =B15_4; arrB[276] =B15_5; arrB[277] =B15_6; arrB[278] =B15_7; arrB[279] =B15_8; arrB[280] =B15_9; arrB[281] =B15_10; arrB[282] =B15_11; arrB[283] =B15_12; arrB[284] =B15_13; arrB[285] =B15_14; arrB[286] =B15_15; arrB[287] =B15_16; arrB[288] =B15_17;
    arrB[289] = B16_0; arrB[290] =B16_1; arrB[291] =B16_2; arrB[292] =B16_3; arrB[293] =B16_4; arrB[294] =B16_5; arrB[295] =B16_6; arrB[296] =B16_7; arrB[297] =B16_8; arrB[298] =B16_9; arrB[299] =B16_10; arrB[300] =B16_11; arrB[301] =B16_12; arrB[302] =B16_13; arrB[303] =B16_14; arrB[304] =B16_15; arrB[305] =B16_16; arrB[306] =B16_17;
    arrB[307] = B17_0; arrB[308] =B17_1; arrB[309] =B17_2; arrB[310] =B17_3; arrB[311] =B17_4; arrB[312] =B17_5; arrB[313] =B17_6; arrB[314] =B17_7; arrB[315] =B17_8; arrB[316] =B17_9; arrB[317] =B17_10; arrB[318] =B17_11; arrB[319] =B17_12; arrB[320] =B17_13; arrB[321] =B17_14; arrB[322] =B17_15; arrB[323] =B17_16; arrB[324] =B17_17;
    arrB[325] = B18_0; arrB[326] =B18_1; arrB[327] =B18_2; arrB[328] =B18_3; arrB[329] =B18_4; arrB[330] =B18_5; arrB[331] =B18_6; arrB[332] =B18_7; arrB[333] =B18_8; arrB[334] =B18_9; arrB[335] =B18_10; arrB[336] =B18_11; arrB[337] =B18_12; arrB[338] =B18_13; arrB[339] =B18_14; arrB[340] =B18_15; arrB[341] =B18_16; arrB[342] =B18_17;
    } 

    @FXML
    private void darkMoodActıon(ActionEvent event) {
           //Dark Mode
          if(darkMoodCheck.isSelected()){
               freamPıc1.setStyle("-fx-background-color: black");
               blackRadio.setStyle("-fx-Foreground-color: #c7c7c7");
               
               
          }
          else {
               freamPıc1.setStyle("-fx-background-color: # ffffff");
               blackRadio.setStyle("-fx-Foreground-color: #black");
              
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
              
              if(lightGreenRadio.isSelected()){
                  color ="LightGreen";
                  labelOfCoordnate.setText("E7 E8 E9 E10\nF10 F11\nG11 G12 G15 G16 G17\n H11 H12 "
                          + " \nI11\nJ11\nK3 K11\n L3 L4 L10 L11 L15 L16 L17\nM4 M5 M6 "
                          + "M7 M8 M9 M10\nN4 N5 N6 N7 N8 N9 N10 N12\n" + "O6 O7 O8 O9\nP9 P10"
                          + "\nQ11 Q12 Q13 Q14 Q15");
              }
              else if(greenRadio.isSelected()){
                  color ="Green";
                  labelOfCoordnate.setText("B11 B12 B13 B14 B15\nC9 C10\nD6 D7 D8 D9\nE4 E5 E6"
                          + " E11 E12\nF3 F4 F12 F13\nG2 G3 G5 G13\n H2 H4 H13\n"
                          + "I2 I4 I18\nJ2 J4 J13\nK2 K5 K13\nL2 L13\nM3 M13");
              }
              else if(darkGreenRadio.isSelected()){
                  color ="DarkGreen";
                  labelOfCoordnate.setText("D10 D11\nF5 F17\nG4 G14\nH3 H5\nI3 I5\nJ3 J5\n"
                          + "K4\nL5 L14\nM17\nO10 O11");
              }
              else if(blackRadio.isSelected()){
                  color ="Black";
                  labelOfCoordnate.setText("A11 A12 A13 A14 A15\nB9 B10 B16\nC6 C7 C8 C11 C12 C13 C14 C15 C16\n"
                          + "D4 D5 D12\nE0 E1 E2 E3 E13 E17 E18\nF0 F14 F15 F16 F18\nG1 G18\nH1 H14 H15 H16 H17 H18\n"
                          + "I1 I7 I14\nJ1 J14\nK1 K14 K15 K16 K17 K18\nL1 L18\nM0 M14 M15 M16 M18\n"
                          + "N0 N1 N2 N3 N13 N17 N18\nO4 O5 O12\nP6 P7 P8 P11 P12 P13 P14 P15 P16\nQ9 Q10 "
                          + "Q16\nR11 R12 R13 R14 R15");
              }
              else if(blueRadio.isSelected()){
                   color ="Blue";
                  labelOfCoordnate.setText("H6 H7 H8 \nI6 I8 \nJ6 J7 J8");
              }
              else if(brownRadio.isSelected()){
                  color ="Brown";
                  labelOfCoordnate.setText("F1 F2 \nM1 M2");
              }
              else {
                  color ="White";
                  labelOfCoordnate.setText("");
              }
    }
    @FXML
    private void coloring(ActionEvent event){
        
         if(color == "LightGreen"){
                   
                   for (int i=0;i<343;i++){
                   if(event.getSource() == arrB[i]){
                       arrB[i].setStyle("-fx-background-color: #82bf6e; ");
                   }
               } 
                   
               
          }
          else if(color == "Green"){
                
                     for (int i=0;i<343;i++){
                   if(event.getSource() == arrB[i]){
                       arrB[i].setStyle("-fx-background-color: #57aa57; ");
                   }
               } 
              
          }
          else if(color == "DarkGreen"){
              
              
                    for (int i=0;i<343;i++){
                   if(event.getSource() == arrB[i]){
                       arrB[i].setStyle("-fx-background-color: #348f35; ");
                   }
               } 
              
          }
          else if(color == "Black"){
              
              for (int i=0;i<343;i++){
                   if(event.getSource() == arrB[i]){
                       arrB[i].setStyle("-fx-background-color: #000000; ");
                   }
               } 
                   
              
          }
          else if(color == "White"){
              
                   for (int i=0;i<343;i++){
                   if(event.getSource() == arrB[i]){
                       arrB[i].setStyle("-fx-background-color: #ffffff; ");
                   }
               } 
              
          }
          else if(color == "Brown"){
              
               for (int i=0;i<343;i++){
                   if(event.getSource() == arrB[i]){
                       arrB[i].setStyle("-fx-background-color: #c3a07b; ");
                   }
               } 
              
          }
          else if(color == "Blue"){
              
              for (int i=0;i<343;i++){
                   if(event.getSource() == arrB[i]){
                       arrB[i].setStyle("-fx-background-color: #68a4ff; ");
                   }
               } 
              
          }
          else {
              
              for (int i=0;i<343;i++){
                   if(event.getSource() == arrB[i]){
                       arrB[i].setStyle("-fx-background-color: #ffffff; ");
                   }
               }
              
          }
    }
    
    @FXML
    private void fallAllButton(ActionEvent event) {
        
        /*    LightGreen  ("E7 E8 E9 E10\nF10 F11\nG11 G12 G15 G16 G17\n H11 H12 "
                          + " \nI11\nJ11\nK3 K11\n L3 L4 L10 L11 L15 L16 L17\nM4 M5 M6 "
                          + "M7 M8 M9 M10\nN4 N5 N6 N7 N8 N9 N10 N12\n" + "O6 O7 O8 O9\nP9 P10"
                          + "\nQ11 Q12 Q13 Q14 Q15");
        
             Green";      ("B11 B12 B13 B14 B15\nC9 C10\nD6 D7 D8 D9\nE4 E5 E6"
                          + " E11 E12\nF3 F4 F12 F13\nG2 G3 G5 G13\n H2 H4 H13\n"
                          + "I2 I4 I18\nJ2 J4 J13\nK2 K5 K13\nL2 L13\nM3 M13");
           
             "DarkGreen";  ("D10 D11\nF5 F17\nG4 G14\nH3 H5\nI3 I5\nJ3 J5\n"
                          + "K4\nL5 L14\nM17\nO10 O11");
        
              "Black";     ("A11 A12 A13 A14 A15\nB9 B10 B16\nC6 C7 C8 C11 C12 C13 C14 C15 C16\n"
                          + "D4 D5 D12\nE0 E1 E2 E3 E13 E17 E18\nF0 F14 F15 F16 F18\nG1 G18\nH1 H14 H15 H16 H17 H18\n"
                          + "I1 I7 I14\nJ1 J14\nK1 K14 K15 K16 K17 K18\nL1 L18\nM0 M14 M15 M16 M18\n"
                          + "N0 N1 N2 N3 N13 N17 N18\nO4 O5 O12\nP6 P7 P8 P11 P12 P13 P14 P15 P16\nQ9 Q10 "
                          + "Q16\nR11 R12 R13 R14 R15");
        
        
              Blue"   "H6 H7 H8 \nI6 I8 \nJ6 J7 J8");
        
        
              "Brown"   ("F1 F2 \nM1 M2");
              } */
           
    }
    
}
