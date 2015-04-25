/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author yamamoto
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label lMessage;
    @FXML
    private TextField tfName;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("Your name is " + tfName.getText());
        lMessage.setText("Hello world! " + tfName.getText());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
