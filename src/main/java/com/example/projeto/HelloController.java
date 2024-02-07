package com.example.projeto;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private ComboBox comboMode;

    @FXML
    private Label textLabel;

    @FXML
    private Button changeView;

    @FXML
    private Button clear;

    @FXML
    private Button delete;

    @FXML
    private Button div;

    @FXML
    private Button mult;

    @FXML
    private Button sub;

    @FXML
    private Button som;

    @FXML
    private Button equal;

    @FXML
    private Button negative;

    @FXML
    private Button point;

    @FXML
    private Button num9;

    @FXML
    private Button num8;

    @FXML
    private Button num7;

    @FXML
    private Button num6;

    @FXML
    private Button num5;

    @FXML
    private Button num4;

    @FXML
    private Button num3;

    @FXML
    private Button num2;

    @FXML
    private Button num1;

    @FXML
    private Button num0;

    List<String> mode;

    private boolean start = true;

    private boolean cont = true;

    private String operator = "";

    private float number1 = 0;

    private float number2 = 0;

    private float numb = 0;

    private int aux = 0;

    private Stage stage1;

    private Scene scene1;

    private Stage stage2;

    private Scene scene2;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //cria uma lista e insere os dados da lista na combobox ComboMode
        mode = Arrays.asList("Básica","Gráfica");
        comboMode.getItems().addAll(mode);
        comboMode.getSelectionModel().select("Básica");
    }

    @FXML
    private void onChangePressed(ActionEvent event) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("second.fxml"));
        Parent root = loader.load();
        stage1 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage1.setScene(scene1);
        stage1.show();
    }

    @FXML
    private void onGraficaPressed(ActionEvent event) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("grafica.fxml"));
        Parent root = loader.load();
        stage2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene2 = new Scene(root);
        stage2.setScene(scene2);
        stage2.show();
    }

    @FXML
    private void handleButtonNumber(ActionEvent event){
        if (start){
            textLabel.setText("");
            start = false;
        }

        //guarda o valor do numero que foi carregado e esrecre na Label textLabel
        String value = ((Button)event.getSource()).getText();
        textLabel.setText(textLabel.getText() + value);
    }

    @FXML
    private void handleBinaryOperator(ActionEvent event){
        //gurada o valor do operador que foi pressionado
        String value = ((Button)event.getSource()).getText();

        //verifica se o operador é diferente de igual, caso seja guarda o valor presente na Label na variavel number1, caso nao seja guarda na variavel number 2
        if (!value.equals("=")){
            if (!operator.isEmpty()){
                return;
            }

            //verifica se foi feito reset ou não, caso tenha a variavel number1 fica com o valor presente na Label textLabel, caso não tenha fica com o valor da ultima operacao feita
            if (cont) {
                operator = value;
                number1 = Float.parseFloat(textLabel.getText());
                textLabel.setText("");
            }
            else {
                operator = value;
                number1 = numb;
                textLabel.setText("");
            }
        }
        else {
            if (operator.isEmpty()){
                return;
            }
            number2 = Float.parseFloat(textLabel.getText());
            float result = calculateBinary(number1, operator, number2);
            numb = result;
            operator = "";
            textLabel.setText(String.valueOf(result));
            cont = false;
        }
    }

    public float calculateBinary(float number1, String operator, float number2){
        //realiza a operalção dependendo do valor do operador
        switch (operator){
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                if (number2 == 0){
                    return 0;
                }
                return number1 / number2;
            default:
                break;
        }
        return 0;
    }

    public void handleNegativeButton(ActionEvent event){//esta função faz com seja possivel inserir valores negativos
        textLabel.setText("-" + textLabel.getText());
    }

    @FXML
    public void handleDeleteButton(ActionEvent event){//esta função elimina o último caractere iserido na Label textLabel
        String text = textLabel.getText();
        if (!text.isEmpty()) {
            String newText = text.substring(0, text.length() - 1);
            textLabel.setText(newText);
        }
    }

    public void reset(){//esta função volta tudo aos valores iniciais
        operator = "";
        start = true;
        cont = true;
        textLabel.setText("");
    }
}