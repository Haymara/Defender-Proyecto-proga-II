/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.defender.controller;

import com.jfoenix.controls.JFXButton;
import cr.ac.una.defender.util.FlowController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Haymara
 */
public class MenuGameController extends Controller implements Initializable {

    @FXML
    private JFXButton btnSalir;
    @FXML
    private JFXButton btnReiniciar;
    @FXML
    private JFXButton btnContinuar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onActionBtnSalir(ActionEvent event) {
        getStage().close();
        FlowController.getInstance().goViewInWindow("MenuPartidaView");
    }

    @FXML
    private void onActionBtnReiniciar(ActionEvent event) {
    }

    @Override
    public void initialize() {
    }

    @FXML
    private void onActionBtnContinuar(ActionEvent event) {
        getStage().close();
    }
    
}
