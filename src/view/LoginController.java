/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author MarcdukScorpion
 */
public class LoginController implements Initializable {

   @FXML TextField cjUsuario;
   @FXML PasswordField cjPassword;
   @FXML Button btnLogin;
   @FXML Label lblError;
   
   
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    @FXML
    void iniciarSesion(ActionEvent evt){
    
        System.out.println("  hola");
    
    }
    
}
