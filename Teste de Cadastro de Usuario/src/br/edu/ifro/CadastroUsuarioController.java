/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import br.edu.ifro.modelo.Aluno;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * FXML Controller class
 *
 * @author 03264268256
 */
public class CadastroUsuarioController implements Initializable {

    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtApelido;
    @FXML
    private Button btnSalvar;
    @FXML
    private Button btnCancelar;
    
    @FXML
    public void fechar(){
        Stage stage = (Stage) btnCancelar.getScene().getWindow();
        stage.close();
    }
    
    @FXML
    public void salvar(){
        String nome = txtNome.getText();
        String apelido = txtApelido.getText();
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();
        
        Aluno aluno1 = new Aluno();
        aluno1.setNome(nome);
        aluno1.setApelido(apelido);
        
        em.getTransaction().begin();
        
        em.persist(aluno1);
        
        em.getTransaction().commit();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
