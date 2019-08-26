/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.edwinaquino.siatema;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 *
 * @author programacion
 */
public class FXMLDocumentController implements Initializable {
    
    
    @FXML private TextField txtResult;
    @FXML private Button btnC;
    @FXML private Button btnSiete;
    @FXML private Button btnOcho;
    @FXML private Button btnNueve;
    @FXML private Button btnDivision;
    @FXML private Button btnCuatro;
    @FXML private Button btnCinco;
    @FXML private Button btnSeis;
    @FXML private Button btnMultiplicacion;
    @FXML private Button btnUno;
    @FXML private Button btnDos;
    @FXML private Button btnTres;
    @FXML private Button btnResta;
    @FXML private Button btnPunto;
    @FXML private Button btnCero;
    @FXML private Button btnIgual;
    @FXML private Button btnSuma;
    @FXML private Button btnRaiz;
    @FXML private Button btnPotencia;
    @FXML private Button btnPorcentaje;
    
    public int op;
    public float dato1,dato2;
    public double resultado;
    public DecimalFormat decimal= new DecimalFormat ("##.###");
    public double porciento; 
    @FXML
    
    private void handleButtonAction(ActionEvent event) {
        if (event.getSource() == btnUno)
            txtResult.setText(txtResult.getText()+"1");
        else if (event.getSource() == btnSiete)
            txtResult.setText(txtResult.getText()+"7");
        else if (event.getSource() == btnOcho)
            txtResult.setText(txtResult.getText()+"8");
        else if (event.getSource() == btnNueve)
            txtResult.setText(txtResult.getText()+"9");
        else if (event.getSource() == btnCuatro)
            txtResult.setText(txtResult.getText()+"4");
        else if (event.getSource() == btnCinco)
            txtResult.setText(txtResult.getText()+"5");
        else if (event.getSource() == btnSeis)
            txtResult.setText(txtResult.getText()+"6");
        else if (event.getSource() == btnDos)
            txtResult.setText(txtResult.getText()+"2");
        else if (event.getSource() == btnTres)
            txtResult.setText(txtResult.getText()+"3");
        else if (event.getSource() == btnCero)
            txtResult.setText(txtResult.getText()+"0");
        else if (event.getSource() == btnPunto){
            if(! txtResult.getText().contains("."))
            txtResult.setText(txtResult.getText()+".");
        }
        else if (event.getSource() == btnSuma){
            dato1 = Float.parseFloat(txtResult.getText());
            txtResult.setText("");
            op = 1;
        }
        else if (event.getSource() == btnResta){
            dato1 = Float.parseFloat(txtResult.getText());
            txtResult.setText("");
            op = 2;
        }
        else if (event.getSource() == btnMultiplicacion){
            dato1 = Float.parseFloat(txtResult.getText());
            txtResult.setText("");
            op = 3;
        }
        else if (event.getSource() == btnDivision){
            dato1 = Float.parseFloat(txtResult.getText());
            txtResult.setText("");
            op = 4;
        }
        else if (event.getSource() == btnPotencia){
            dato1 = Float.parseFloat(txtResult.getText());
            txtResult.setText("");
            op = 5;
        }  
         else if (event.getSource() == btnPorcentaje){
            op = 6;
        }
        else if (event.getSource() == btnRaiz){
            dato1 = Float.parseFloat(txtResult.getText());
            txtResult.setText("");
            op = 7;
        }
        else if (event.getSource() == btnC){
            txtResult.setText("");
        }
        else if (event.getSource() == btnIgual){
            dato2 = Float.parseFloat(txtResult.getText());
            txtResult.setText("");
            switch (op){
                case 1:
                    resultado = dato1 + dato2; //en la suma sucesuva se peciona igual porcada número
                    txtResult.setText(String.valueOf(resultado));
                break ;
                case 2:
                    resultado = dato1 - dato2; //en la resta sucesuva se peciona igual porcada número
                    txtResult.setText(String.valueOf(resultado));
                break ;
                case 3:
                    resultado = dato1 * dato2;
                    txtResult.setText(String.valueOf(resultado));
                break ;
                case 4:
                    if (dato2 == 0){
                        txtResult.setText("Math Error");
                    }
                    else {
                        resultado = dato1 / dato2;
                        txtResult.setText(String.valueOf(resultado));
                    }
                break ;
                case 5:
                    resultado = Math.pow(dato1,dato2);
                    txtResult.setText(String.valueOf(resultado));
                break ;
                case 6:
                    porciento = dato2 / 100;
                    resultado = dato1 * porciento;
                    txtResult.setText(String.valueOf(resultado));
                break ;
                case 7:
                    resultado = Math.pow(dato1,1/dato2);
                    txtResult.setText(String.valueOf(decimal.format(resultado)));
                break ;
              
                    
                    
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
