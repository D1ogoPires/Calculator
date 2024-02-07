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

public class Second implements Initializable {
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

    @FXML
    private Button sqrt;

    @FXML
    private Button cbrt;

    @FXML
    private Button quad;

    @FXML
    private Button tri;

    @FXML
    private Button fac;

    @FXML
    private Button sin;

    @FXML
    private Button cos;

    @FXML
    private Button tan;

    @FXML
    private Button log;

    @FXML
    private Button ln;


    List<String> mode;

    private boolean start = true;

    private boolean cont = true;

    private String operator = "";

    private float number1 = 0;

    private float number2 = 0;

    private float numb = 0;

    private int aux = 0;

    private Stage stage;

    private Scene scene;

    private Stage stage2;

    private Scene scene2;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mode = Arrays.asList("Básica","Gráfica");
        comboMode.getItems().addAll(mode);
        comboMode.getSelectionModel().select("Básica");
    }

    @FXML
    private void onChangePressed(ActionEvent event) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Parent root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
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

        //caso o operador ser vazio guardanos o valor da Label textLabel na variavel number1, caso nao seja vazia guardamos na variável number2
        if (operator.isEmpty()) {
            String value = ((Button) event.getSource()).getText();
            textLabel.setText(textLabel.getText() + value);
            number1 = Float.parseFloat(textLabel.getText());
        }
        else{
            String value = ((Button) event.getSource()).getText();
            textLabel.setText(textLabel.getText() + value);
            number2 = Float.parseFloat(textLabel.getText());
        }
    }

    @FXML
    private void handleBinaryOperator(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();

        //caso nao tenha sido feito reset o valor da variavel number1 assume o valor da ultima operação realizada
        if (!cont) {
            if (!operator.isEmpty()) {
                return;
            } else {
                number1 = numb;
                operator = value;
                textLabel.setText("");
            }
        }
        else {
            if (!operator.isEmpty()) {
                return;
            } else {
                operator = value;
                textLabel.setText("");
            }
        }
    }

    @FXML
    private void handleUnaryOperator(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();

        //caso o operator esteja vazia o valor é guardado na variável number1, caso contrário na variável number2
        if (operator.isEmpty()) {
            //calcula o valor da operação dependendo do valor de value
            switch (value) {
                case "√":
                    number1 = (float) Math.sqrt(Float.parseFloat(textLabel.getText()));
                    textLabel.setText("√" + textLabel.getText());
                    break;

                case "∛":
                    number1 = (float) Math.cbrt(Float.parseFloat(textLabel.getText()));
                    textLabel.setText("∛" + textLabel.getText());
                    break;

                case "x^2":
                    float num = Float.parseFloat(textLabel.getText());
                    number1 = num * num;
                    textLabel.setText(textLabel.getText() + "^2");
                    break;

                case "x^3":
                    float num2 = Float.parseFloat(textLabel.getText());
                    number1 = num2 * num2 * num2;
                    textLabel.setText(textLabel.getText() + "^3");
                    break;

                case "n!":
                    int fac = 1;
                    for (int i = 1; i <= Float.parseFloat(textLabel.getText()); i++) {
                        fac = fac * i;
                    }
                    number1 = fac;
                    textLabel.setText(textLabel.getText() + "!");
                    break;

                case "sin":
                    number1 = (float) Math.sin(Float.parseFloat(textLabel.getText()));
                    textLabel.setText("sin(" + textLabel.getText() + ")");
                    break;

                case "cos":
                    number1 = (float) Math.cos(Float.parseFloat(textLabel.getText()));
                    textLabel.setText("cos(" + textLabel.getText() + ")");
                    break;

                case "tan":
                    number1 = (float) Math.tan(Float.parseFloat(textLabel.getText()));
                    textLabel.setText("tan(" + textLabel.getText() + ")");
                    break;

                case "log":
                    number1 = (float) Math.log10(Float.parseFloat(textLabel.getText()));
                    textLabel.setText("log(" + textLabel.getText() + ")");
                    break;

                case "ln":
                    number1 = (float) Math.log(Float.parseFloat(textLabel.getText()));
                    textLabel.setText("ln(" + textLabel.getText() + ")");
                    break;
            }
        } else {
            //calcula o valor da operação dependendo do valor de value
            switch (value) {
                case "√":
                    number2 = (float) Math.sqrt(Float.parseFloat(textLabel.getText()));
                    textLabel.setText("√" + textLabel.getText());
                    break;

                case "∛":
                    number2 = (float) Math.cbrt(Float.parseFloat(textLabel.getText()));
                    textLabel.setText("∛" + textLabel.getText());
                    break;

                case "x^2":
                    float num = Float.parseFloat(textLabel.getText());
                    number2 = num * num;
                    textLabel.setText(textLabel.getText() + "^2");
                    break;

                case "x^3":
                    float num2 = Float.parseFloat(textLabel.getText());
                    number2 = num2 * num2 * num2;
                    textLabel.setText(textLabel.getText() + "^3");
                    break;

                case "n!":
                    int fac = 1;
                    for (int i = 1; i <= Float.parseFloat(textLabel.getText()); i++) {
                        fac = fac * i;
                    }
                    number2 = fac;
                    textLabel.setText(textLabel.getText() + "!");
                    break;

                case "sin":
                    number2 = (float) Math.sin(Float.parseFloat(textLabel.getText()));
                    textLabel.setText("sin(" + textLabel.getText() + ")");
                    break;

                case "cos":
                    number2 = (float) Math.cos(Float.parseFloat(textLabel.getText()));
                    textLabel.setText("cos(" + textLabel.getText() + ")");
                    break;

                case "tan":
                    number2 = (float) Math.tan(Float.parseFloat(textLabel.getText()));
                    textLabel.setText("tan(" + textLabel.getText() + ")");
                    break;

                case "log":
                    number2 = (float) Math.log10(Float.parseFloat(textLabel.getText()));
                    textLabel.setText("log(" + textLabel.getText() + ")");
                    break;

                case "ln":
                    number2 = (float) Math.log(Float.parseFloat(textLabel.getText()));
                    textLabel.setText("ln(" + textLabel.getText() + ")");
                    break;
            }

        }
    }

    @FXML
    public void handleEqualButton(ActionEvent event){
        //caso o operador esta vazio é mostrado o valor de number1 pois é uma operação envolvendo apenas um valor, caso contrário é mostrado o valor de result
        if (operator.isEmpty()){
            textLabel.setText(String.valueOf(number1));
            cont = false;
        }
        else {
            float result = calculateBinary(number1, operator, number2);
            numb = result;
            cont = false;
            operator = "";
            textLabel.setText(String.valueOf(result));
        }
    }

    public float calculateBinary(float number1, String operator, float number2){
        //faz uma operacção dependendo do valor do operator
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

    @FXML
    private void handleNegativeButton(ActionEvent event){//permite o input de valores negativos
        textLabel.setText("-" + textLabel.getText());
    }

    @FXML
    private void handleDeleteButton(ActionEvent event){//permite eliminar o último caractere inserido na Label textLabel
        String text = textLabel.getText();
        if (!text.isEmpty()) {
            String newText = text.substring(0, text.length() - 1);
            textLabel.setText(newText);
        }

        if (operator.isEmpty()){
            number1 = Float.parseFloat(textLabel.getText());
        }
        else {
            number2 = Float.parseFloat(textLabel.getText());
        }
    }

    @FXML
    private void reset(){//esta função volta tudo aos valores iniciais
        operator = "";
        start = true;
        cont = true;
        textLabel.setText("");
    }


}
