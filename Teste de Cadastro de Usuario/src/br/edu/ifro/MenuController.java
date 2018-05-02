/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author 03264268256
 */
public class MenuController implements Initializable {

    @FXML
    private TextField txtX;
    @FXML
    private TextField txtY;
    @FXML
    private TextField txtResultado;
    @FXML
    private Button btnSomar;
    @FXML
    private Button btnSubtrair;
    @FXML
    private Button btnMultiplicar;
    @FXML
    private Button btnDividir;
    @FXML
    private Button btnCadastrarAluno;
    
    @FXML
    private void somar(){
        double x = Double.parseDouble(txtX.getText());
        double y = Double.parseDouble(txtY.getText());
        
        txtResultado.setText(String.valueOf(x + y));
    }
    
    @FXML
    private void subtrair(){
        double x = Double.parseDouble(txtX.getText());
        double y = Double.parseDouble(txtY.getText());
        
        txtResultado.setText(String.valueOf(x - y));
    }
    
    @FXML
    private void multiplicar(){
        double x = Double.parseDouble(txtX.getText());
        double y = Double.parseDouble(txtY.getText());
        
        txtResultado.setText(String.valueOf(x * y));
    }
    
    @FXML
    private void dividir(){
        double x = Double.parseDouble(txtX.getText());
        double y = Double.parseDouble(txtY.getText());
        
        txtResultado.setText(String.valueOf(x / y));
    }
    
    @FXML
    private void cadastrar(){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("CadastroUsuario.fxml"));
            Scene scene = new Scene(fxmlLoader.load(),320,200);
            Stage stage = new Stage();
            stage.setTitle("Cadastrar Aluno");
            stage.setScene(scene);
            stage.show();
        }
        catch(IOException e){

        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
