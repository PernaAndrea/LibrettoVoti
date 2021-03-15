
package it.polito.tdp.librettovoti;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import it.polito.tdp.librettovoti.model.Libretto;
import it.polito.tdp.librettovoti.model.Voto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class FXMLController {
	
	private Libretto model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label txtEsame;

    @FXML
    private Label txtVoto;

    @FXML
    private Label txtData;

    @FXML
    private TextArea txtResult;
    
    // 3 abbiamo aggiunto la variabile modello e questo metodo 
    public void setModel(Libretto model) {
    	this.model=model;
    }

    @FXML
    void handleInserisci(ActionEvent event) {

    	//Leggi e controlla i dati 
    	
    	String nomeEsame = txtEsame.getText();
    	if(nomeEsame.length()==0) {
    		txtResult.setText("Errore nome esame vuoto");
    		return;
    	}
    	String votoEsame = txtVoto.getText();
    	int votoInt = Integer.parseInt(votoEsame);
    	String dataEsame = txtData.getText();
    	LocalDate data = LocalDate.parse(dataEsame);
    	//TODO : aggiungere tutti i controlli da fare su questi dati
    	
    	//Esegui l'azione 
    	
    	Voto voto = new Voto(nomeEsame,votoInt,data);
    	model.add(voto);
    	
    	//Aggiorna i dati  ( nella View ) 
    	txtResult.setText(model.toString());
    	
    }

    @FXML
    void initialize() {
        assert txtEsame != null : "fx:id=\"txtEsame\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtVoto != null : "fx:id=\"txtVoto\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtData != null : "fx:id=\"txtData\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}