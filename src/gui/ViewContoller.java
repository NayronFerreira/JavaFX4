package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewContoller {
	
	@FXML
	private Button btCalcular;
	@FXML
	private TextField valor1;
	@FXML
	private TextField valor2;
	
	@FXML
	private Label lbResultado;
	
	@FXML
	public void onBtTestAction() {
		
		try {
		double valorOne = Double.parseDouble(valor1.getText());
		double valorT = Double.parseDouble(valor2.getText());
		double soma = valorOne+valorT;
		lbResultado.setText(String.format("%.2f", soma));
		}catch(NumberFormatException x) {
			Alerts.showAlert("Erro de conteúdo", null, x.getMessage(), AlertType.ERROR);
		}
	}
	

}
