/**
 * 
 */
package application;

import java.awt.event.ActionEvent;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

/**
 * @author terre_000
 *
 */
public class ActionEventButtons implements Initializable {
	
	@FXML
	private Button wizard_button;
	@FXML
	private Button priest_button;
	@FXML
	private Button knight_button;
	@FXML
	private Button archer_button;
	@FXML
	private Button thief_button;
	@FXML
	private Button str_minus;
	@FXML
	private Button str_plus;
	@FXML
	private Button dex_minus;
	@FXML
	private Button dex_plus;
	@FXML
	private Button int_minus;
	@FXML
	private Button int_plus;
	@FXML
	private Button con_minus;
	@FXML
	private Button con_plus;
	@FXML
	private Button lck_minus;
	@FXML
	private Button lck_plus;
	@FXML
	private Button gen_btn;
	@FXML
	private Button save_btn;
	@FXML
	private Button delete_btn;
	@FXML
	private Button exit_btn;
	@FXML
	private Button female_button;
	@FXML
	private Button male_button;
	@FXML
	private ImageView spriteWindow;
	@FXML
	private ImageView save1_window;
	@FXML
	private ImageView save2_window;
	@FXML
	private ImageView save3_window;
	@FXML
	private TextArea desc_box;
	@FXML
	private TextArea stat_box;
	@FXML
	private TextArea fname_box;
	@FXML
	private TextArea lname_box;
	@FXML
	private Text str_stat;
	@FXML
	private Text dex_stat;
	@FXML
	private Text int_stat;
	@FXML
	private Text con_stat;
	@FXML
	private Text lck_stat;
	@FXML
	private Text free_stat;
	
	String pixelImgM = "base_m.gif";
	String pixelImgF = "base_f.gif";
	boolean male = true;
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		File file = new File("src/images/base_m.gif");
        Image baseM = new Image(file.toURI().toString());
        spriteWindow.setImage(baseM);
        File file1 = new File("src/images/priest1_f.png");
        Image priestSave = new Image(file1.toURI().toString());
        save1_window.setImage(priestSave);
        str_stat.setText("0");
        dex_stat.setText("0");
        int_stat.setText("0");
        con_stat.setText("0");
        lck_stat.setText("0");
        free_stat.setText("0");
        desc_box.setText("Welcome to Cool Pixel Character Creator!");
        stat_box.setText("Begin by selecting a class for your character!");
        
	}
	
	
	public void setSpriteWindow(String sprite){
		File file = new File("src/images/"+sprite+"");
        Image image = new Image(file.toURI().toString());
        spriteWindow.setImage(image);
	}
	
	
	
	
	private void handleButtonAction(ActionEvent event) {
	     // Button was clicked, do something...
	     pixelImgM = "wizard_m.gif";
	     setSpriteWindow(pixelImgM);
	     str_stat.setText("3");
		 dex_stat.setText("5");
		 int_stat.setText("15");
		 con_stat.setText("10");
		 lck_stat.setText("0");
		 free_stat.setText("3");
	 }



	
	
}

