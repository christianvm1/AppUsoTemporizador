/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusotemporizador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import temporizador.Temporizador;

/**
 *
 * @author chris
 */
public class AppUsoTemporizadorController implements Initializable {

    @FXML
    private Temporizador temp;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        temp.iniciaTemporizador();
    }    

    @FXML
    private void acaba(ActionEvent event) {
        System.out.println("Se acabo el tiempo");
    }
    
}
