
	package it.polito.tdp.librettovoti;

	import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import it.polito.tdp.librettovoti.model.Libretto;
import it.polito.tdp.librettovoti.model.Voto;
import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.scene.control.DatePicker;
	import javafx.scene.control.TextArea;
	import javafx.scene.control.TextField;

	public class FXMLController {
		
		private Libretto model= new Libretto() ;
	

	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private TextField txtEsame;

	    @FXML
	    private TextField txtVoto;

	    @FXML
	    private DatePicker pickerEsame;

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
    	if(nomeEsame.length()==0) { // ci accontentiamo che l'utente abbia scritto qualcosa
    		txtResult.setText("Errore nome esame vuoto");
    		return;
    	}
    	
    	String votoEsame = txtVoto.getText();
    	int votoInt =0;
    	try {
    	votoInt = Integer.parseInt(votoEsame);
    	}catch( NumberFormatException e) {
    		txtResult.setText("Errore: il voto deve essere numerico");
    		return; 
    	}
    	
    	if(votoInt<18 || votoInt>30) {
    		txtResult.setText("Errore: il voto deve essere compreso tra 18 e 30");
    		return;
    	}
    	/*
    	String dataEsame = txtData.getText();
    	LocalDate data;
    	try {
    	data = LocalDate.parse(dataEsame);
    	}catch(DateTimeParseException ee) {
    		txtResult.setText("Errore: la data deve essere nel formato YYYY-MM-DD");
    		return;
    	}*/ 
    	LocalDate data = pickerEsame.getValue(); 
    	if(data==null) {
    		txtResult.setText("Errore: la data è obbligatoria");
    		return;
    	}
    	
    	//TODO : aggiungere tutti i controlli da fare su questi dati
    	
    	//Esegui l'azione 
    	
    	Voto votoo = new Voto(nomeEsame,votoInt,data);
    	model.add(votoo);
    	
    	//Aggiorna i dati  ( nella View ) 
    	txtResult.setText(model.toString());
    	txtEsame.setText("");
    	txtVoto.setText("");
    //	txtData.clear();
    	pickerEsame.setValue(null);
    	
    	
    }

    @FXML
    void initialize() {
        assert txtEsame != null : "fx:id=\"txtEsame\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtVoto != null : "fx:id=\"txtVoto\" was not injected: check your FXML file 'Scene.fxml'.";
        assert pickerEsame != null : "fx:id=\"pickerEsame\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
