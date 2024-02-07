package com.example.projeto;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class Grafica implements Initializable {
    @FXML
    private Label formula1;

    @FXML
    private Label formula2;

    @FXML
    private Label formula3;

    @FXML
    private Label formula4;

    @FXML
    private Label formula5;

    @FXML
    private LineChart grafico;

    @FXML
    private Button botaoSin;

    @FXML
    private Button botaoCos;

    @FXML
    private Button botaotan;

    @FXML
    private Button botaoLog;

    @FXML
    private Button botaoLn;

    @FXML
    private Button botaoPa;

    @FXML
    private Button botaoRaiz;

    @FXML
    private Button botaoElev;

    @FXML
    private Button botaoX;

    @FXML
    private Button div;

    @FXML
    private Button mult;

    @FXML
    private Button min;

    @FXML
    private Button som;

    @FXML
    private Button ponto;

    @FXML
    private Button clear;

    @FXML
    private Button delete;

    @FXML
    private Button equal;

    @FXML
    private Button botao9;

    @FXML
    private Button botao8;

    @FXML
    private Button botao7;

    @FXML
    private Button botao6;

    @FXML
    private Button botao5;

    @FXML
    private Button botao4;

    @FXML
    private Button botao3;

    @FXML
    private Button botao2;

    @FXML
    private Button botao1;

    @FXML
    private Button botao0;

    @FXML
    private ComboBox combo;

    private Stage stage;
    private Scene scene;
    List<String> mode;

    private int aux = 0;

    private int aux2 = 0;

    private String s1 = "";

    private String s2 = "";

    private String s3 = "";

    private String s4 = "";

    private String s5 = "";

    private double cons = 1;

    XYChart.Series<String, Double> series;


    @FXML
    private void onBasicaPressed(ActionEvent event) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Parent root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mode = Arrays.asList("Básica","Gráfica");
        combo.getItems().addAll(mode);
        combo.getSelectionModel().select("Gráfica");


    }

    @FXML
    private void handleNumGrid(ActionEvent event){
        if (aux > 4){
            return;
        }
        else {
            aux2 = 1;
            if (aux == 0){
                String value = ((Button) event.getSource()).getText();
                formula1.setText(formula1.getText() + value);
            } else if (aux == 1) {
                String value = ((Button) event.getSource()).getText();
                formula2.setText(formula2.getText() + value);
            } else if (aux == 2) {
                String value = ((Button) event.getSource()).getText();
                formula3.setText(formula3.getText() + value);
            } else if (aux == 3) {
                String value = ((Button) event.getSource()).getText();
                formula4.setText(formula4.getText() + value);
            } else if (aux == 4) {
                String value = ((Button) event.getSource()).getText();
                formula5.setText(formula5.getText() + value);
            }
        }
        s1 = formula1.getText();
        s2 = formula2.getText();
        s3 = formula3.getText();
        s4 = formula4.getText();
        s5 = formula5.getText();
    }

    @FXML
    private void handleSymGrid(ActionEvent event){
        String value = ((Button) event.getSource()).getText();
        if (aux > 4){
            return;
        }
        else {
            switch (value){
                case "sin":
                    if (aux == 0){
                        formula1.setText("sin(" + formula1.getText() + ")");
                    } else if (aux == 1) {
                        formula2.setText("sin(" + formula2.getText() + ")");
                    } else if (aux == 2) {
                        formula3.setText("sin(" + formula3.getText() + ")");
                    } else if (aux == 3) {
                        formula4.setText("sin(" + formula4.getText() + ")");
                    } else if (aux == 4) {
                        formula5.setText("sin(" + formula5.getText() + ")");
                    }
                    break;

                case "cos":
                    if (aux == 0){
                        formula1.setText("cos(" + formula1.getText() + ")");
                    } else if (aux == 1) {
                        formula2.setText("cos(" + formula2.getText() + ")");
                    } else if (aux == 2) {
                        formula3.setText("cos(" + formula3.getText() + ")");
                    } else if (aux == 3) {
                        formula4.setText("cos(" + formula4.getText() + ")");
                    } else if (aux == 4) {
                        formula5.setText("cos(" + formula5.getText() + ")");
                    }
                    break;

                case "tan":
                    if (aux == 0){
                        formula1.setText("tan(" + formula1.getText() + ")");
                    } else if (aux == 1) {
                        formula2.setText("tan(" + formula2.getText() + ")");
                    } else if (aux == 2) {
                        formula3.setText("tan(" + formula3.getText() + ")");
                    } else if (aux == 3) {
                        formula4.setText("tan(" + formula4.getText() + ")");
                    } else if (aux == 4) {
                        formula5.setText("tan(" + formula5.getText() + ")");
                    }
                    break;

                case "log":
                    if (aux == 0){
                        formula1.setText("log(" + formula1.getText() + ")");
                    } else if (aux == 1) {
                        formula2.setText("log(" + formula2.getText() + ")");
                    } else if (aux == 2) {
                        formula3.setText("log(" + formula3.getText() + ")");
                    } else if (aux == 3) {
                        formula4.setText("log(" + formula4.getText() + ")");
                    } else if (aux == 4) {
                        formula5.setText("log(" + formula5.getText() + ")");
                    }
                    break;

                case "ln":
                    if (aux == 0){
                        formula1.setText("ln(" + formula1.getText() + ")");
                    } else if (aux == 1) {
                        formula2.setText("ln(" + formula2.getText() + ")");
                    } else if (aux == 2) {
                        formula3.setText("ln(" + formula3.getText() + ")");
                    } else if (aux == 3) {
                        formula4.setText("ln(" + formula4.getText() + ")");
                    } else if (aux == 4) {
                        formula5.setText("ln(" + formula5.getText() + ")");
                    }
                    break;

                case "√":
                    if (aux == 0){
                        formula1.setText("√" + formula1.getText());
                    } else if (aux == 1) {
                        formula2.setText("√" + formula2.getText());
                    } else if (aux == 2) {
                        formula3.setText("√" + formula3.getText());
                    } else if (aux == 3) {
                        formula4.setText("√" + formula4.getText());
                    } else if (aux == 4) {
                        formula5.setText("√" + formula5.getText());
                    }
                    break;

                case "^":
                    if (aux == 0){
                        formula1.setText(formula1.getText() + "^");
                    } else if (aux == 1) {
                        formula2.setText(formula2.getText() + "^");
                    } else if (aux == 2) {
                        formula3.setText(formula3.getText() + "^");
                    } else if (aux == 3) {
                        formula4.setText(formula4.getText() + "^");
                    } else if (aux == 4) {
                        formula5.setText(formula5.getText() + "^");
                    }
                    break;

                case "x":
                    if (aux == 0){
                        formula1.setText(formula1.getText() + "x");
                    } else if (aux == 1) {
                        formula2.setText(formula2.getText() + "x");
                    } else if (aux == 2) {
                        formula3.setText(formula3.getText() + "x");
                    } else if (aux == 3) {
                        formula4.setText(formula4.getText() + "x");
                    } else if (aux == 4) {
                        formula5.setText(formula5.getText() + "x");
                    }
                    break;

                case "( )":
                    if (aux == 0){
                        formula1.setText("(" + formula1.getText() + ")");
                    } else if (aux == 1) {
                        formula2.setText("(" + formula2.getText() + ")");
                    } else if (aux == 2) {
                        formula3.setText("(" + formula3.getText() + ")");
                    } else if (aux == 3) {
                        formula4.setText("(" + formula4.getText() + ")");
                    } else if (aux == 4) {
                        formula5.setText("(" + formula5.getText() + ")");
                    }
                    break;
            }
        }
    }

    @FXML
    private void handleOperator(ActionEvent event){
        String value = ((Button) event.getSource()).getText();


        if (aux > 4){
            return;
        }
        else {
            switch (value){
                case "/":
                    if (aux2 == 1){
                        if (aux == 0){
                            formula1.setText(formula1.getText() + "/");
                        } else if (aux == 1) {
                            formula2.setText(formula2.getText() + "/");
                        } else if (aux == 2) {
                            formula3.setText(formula3.getText() + "/");
                        } else if (aux == 3) {
                            formula4.setText(formula4.getText() + "/");
                        } else if (aux == 4) {
                            formula5.setText(formula5.getText() + "/");
                        }
                    }
                    else {
                        return;
                    }
                    break;

                case "*":
                   if (aux2 == 1){
                       if (aux == 0){
                           formula1.setText(formula1.getText() + "*");
                       } else if (aux == 1) {
                           formula2.setText(formula2.getText() + "*");
                       } else if (aux == 2) {
                           formula3.setText(formula3.getText() + "*");
                       } else if (aux == 3) {
                           formula4.setText(formula4.getText() + "*");
                       } else if (aux == 4) {
                           formula5.setText(formula5.getText() + "*");
                       }
                   }
                   else{
                       return;
                   }
                    break;

                case "-":
                    if (aux2 == 1){
                        if (aux == 0){
                            formula1.setText(formula1.getText() + "-");
                        } else if (aux == 1) {
                            formula2.setText(formula2.getText() + "-");
                        } else if (aux == 2) {
                            formula3.setText(formula3.getText() + "-");
                        } else if (aux == 3) {
                            formula4.setText(formula4.getText() + "-");
                        } else if (aux == 4) {
                            formula5.setText(formula5.getText() + "-");
                        }
                    }
                    else{
                        return;
                    }
                    break;

                case "+":
                    if (aux2 == 1){
                        if (aux == 0){
                            formula1.setText(formula1.getText() + "+");
                        } else if (aux == 1) {
                            formula2.setText(formula2.getText() + "+");
                        } else if (aux == 2) {
                            formula3.setText(formula3.getText() + "+");
                        } else if (aux == 3) {
                            formula4.setText(formula4.getText() + "+");
                        } else if (aux == 4) {
                            formula5.setText(formula5.getText() + "+");
                        }
                    }
                    else{
                        return;
                    }
                    break;
            }
        }
    }

    @FXML
    private void equalPressed(ActionEvent event){
        if (s1 != "x" && !s1.isEmpty() && aux == 0){
            s1 = s1.replaceAll("[^0-9]", "");
            cons = Double.parseDouble(s1);
        }
        if (s2 != "x" && !s2.isEmpty() && aux == 1){
            s2 = s2.replaceAll("[^0-9]", "");
            cons = Double.parseDouble(s2);
        }
        if (s3 != "x" && !s3.isEmpty() && aux == 2){
            s3 = s3.replaceAll("[^0-9]", "");
            cons = Double.parseDouble(s3);
        }
        if (s4 != "x" && !s4.isEmpty() && aux == 3){
            s4 = s4.replaceAll("[^0-9]", "");
            cons = Double.parseDouble(s4);
        }
        if (s5 != "x" && !s5.isEmpty() && aux == 4){
            s5 = s5.replaceAll("[^0-9]", "");
            cons = Double.parseDouble(s5);
        }

        draw();

        aux++;
        aux2 = 0;
    }

    private void draw(){
        series = new XYChart.Series();



        if (aux > 4){
            return;
        }
        else {
            if (aux == 0){
                if (formula1.getText().contains("sin")){
                    for (double x = -5; x <= 5; x += 0.1){
                        double y = Math.sin(cons * x);
                        series.getData().add(new XYChart.Data<String, Double>(String.valueOf(x), y));
                    }

                    grafico.getData().add(series);
                } else if (formula1.getText().contains("cos")) {
                    for (double x = -5; x <= 5; x += 0.1){
                        double y = Math.cos(cons * x);
                        series.getData().add(new XYChart.Data<String, Double>(String.valueOf(x), y));
                    }

                    grafico.getData().add(series);
                } else if (formula1.getText().contains("tan")) {
                    for (double x = -5; x <= 5; x += 0.1){
                        double y = Math.tan(cons * x);
                        series.getData().add(new XYChart.Data<String, Double>(String.valueOf(x), y));
                    }

                    grafico.getData().add(series);
                } else if (formula1.getText().contains("log")) {
                    for (double x = -5; x <= 5; x += 0.1){
                        double y = Math.log10(cons * x);
                        series.getData().add(new XYChart.Data<String, Double>(String.valueOf(x), y));
                    }

                    grafico.getData().add(series);
                } else if (formula1.getText().contains("ln")) {
                    for (double x = -5; x <= 5; x += 0.1){
                        double y = Math.log(cons * x);
                        series.getData().add(new XYChart.Data<String, Double>(String.valueOf(x), y));
                    }

                    grafico.getData().add(series);
                } else if (formula1.getText().contains("^")) {
                    for (double x = -5; x <= 5; x += 0.1){
                        double y = Math.pow(Integer.parseInt(s1), x);
                        series.getData().add(new XYChart.Data<String, Double>(String.valueOf(x), y));
                    }

                    grafico.getData().add(series);
                }


            }
            if (aux == 1){
                if (formula2.getText().contains("sin")){
                    for (double x = -5; x <= 5; x += 0.1){
                        double y = Math.sin(cons * x);
                        series.getData().add(new XYChart.Data<String, Double>(String.valueOf(x), y));
                    }

                    grafico.getData().add(series);
                } else if (formula2.getText().contains("cos")) {
                    for (double x = -5; x <= 5; x += 0.1){
                        double y = Math.cos(cons * x);
                        series.getData().add(new XYChart.Data<String, Double>(String.valueOf(x), y));
                    }

                    grafico.getData().add(series);
                } else if (formula2.getText().contains("tan")) {
                    for (double x = -5; x <= 5; x += 0.1){
                        double y = Math.tan(cons * x);
                        series.getData().add(new XYChart.Data<String, Double>(String.valueOf(x), y));
                    }

                    grafico.getData().add(series);
                } else if (formula2.getText().contains("log")) {
                    for (double x = -5; x <= 5; x += 0.1){
                        double y = Math.log10(cons * x);
                        series.getData().add(new XYChart.Data<String, Double>(String.valueOf(x), y));
                    }

                    grafico.getData().add(series);
                } else if (formula2.getText().contains("ln")) {
                    for (double x = -5; x <= 5; x += 0.1){
                        double y = Math.log(cons * x);
                        series.getData().add(new XYChart.Data<String, Double>(String.valueOf(x), y));
                    }

                    grafico.getData().add(series);
                } else if (formula2.getText().contains("^")) {
                    for (double x = -5; x <= 5; x += 0.1){
                        double y = Math.pow(Integer.parseInt(s2), x);
                        series.getData().add(new XYChart.Data<String, Double>(String.valueOf(x), y));
                    }

                    grafico.getData().add(series);
                }


            }
            if (aux == 2){
                if (formula3.getText().contains("sin")){
                    for (double x = -5; x <= 5; x += 0.1){
                        double y = Math.sin(cons * x);
                        series.getData().add(new XYChart.Data<String, Double>(String.valueOf(x), y));
                    }

                    grafico.getData().add(series);
                } else if (formula3.getText().contains("cos")) {
                    for (double x = -5; x <= 5; x += 0.1){
                        double y = Math.cos(cons * x);
                        series.getData().add(new XYChart.Data<String, Double>(String.valueOf(x), y));
                    }

                    grafico.getData().add(series);
                } else if (formula3.getText().contains("tan")) {
                    for (double x = -5; x <= 5; x += 0.1){
                        double y = Math.tan(cons * x);
                        series.getData().add(new XYChart.Data<String, Double>(String.valueOf(x), y));
                    }

                    grafico.getData().add(series);
                } else if (formula3.getText().contains("log")) {
                    for (double x = -5; x <= 5; x += 0.1){
                        double y = Math.log10(cons * x);
                        series.getData().add(new XYChart.Data<String, Double>(String.valueOf(x), y));
                    }

                    grafico.getData().add(series);
                } else if (formula3.getText().contains("ln")) {
                    for (double x = -5; x <= 5; x += 0.1){
                        double y = Math.log(cons * x);
                        series.getData().add(new XYChart.Data<String, Double>(String.valueOf(x), y));
                    }

                    grafico.getData().add(series);
                } else if (formula3.getText().contains("^")) {
                    for (double x = -5; x <= 5; x += 0.1){
                        double y = Math.pow(Integer.parseInt(s3), x);
                        series.getData().add(new XYChart.Data<String, Double>(String.valueOf(x), y));
                    }

                    grafico.getData().add(series);
                }


            }
            if (aux == 3){
                if (formula4.getText().contains("sin")){
                    for (double x = -5; x <= 5; x += 0.1){
                        double y = Math.sin(cons * x);
                        series.getData().add(new XYChart.Data<String, Double>(String.valueOf(x), y));
                    }

                    grafico.getData().add(series);
                } else if (formula4.getText().contains("cos")) {
                    for (double x = -5; x <= 5; x += 0.1){
                        double y = Math.cos(cons * x);
                        series.getData().add(new XYChart.Data<String, Double>(String.valueOf(x), y));
                    }

                    grafico.getData().add(series);
                } else if (formula4.getText().contains("tan")) {
                    for (double x = -5; x <= 5; x += 0.1){
                        double y = Math.tan(cons * x);
                        series.getData().add(new XYChart.Data<String, Double>(String.valueOf(x), y));
                    }

                    grafico.getData().add(series);
                } else if (formula4.getText().contains("log")) {
                    for (double x = -5; x <= 5; x += 0.1){
                        double y = Math.log10(cons * x);
                        series.getData().add(new XYChart.Data<String, Double>(String.valueOf(x), y));
                    }

                    grafico.getData().add(series);
                } else if (formula4.getText().contains("ln")) {
                    for (double x = -5; x <= 5; x += 0.1){
                        double y = Math.log(cons * x);
                        series.getData().add(new XYChart.Data<String, Double>(String.valueOf(x), y));
                    }

                    grafico.getData().add(series);
                } else if (formula4.getText().contains("^")) {
                    for (double x = -5; x <= 5; x += 0.1){
                        double y = Math.pow(Integer.parseInt(s4), x);
                        series.getData().add(new XYChart.Data<String, Double>(String.valueOf(x), y));
                    }

                    grafico.getData().add(series);
                }


            }
            if (aux == 4){
                if (formula5.getText().contains("sin")){
                    for (double x = -5; x <= 5; x += 0.1){
                        double y = Math.sin(cons * x);
                        series.getData().add(new XYChart.Data<String, Double>(String.valueOf(x), y));
                    }

                    grafico.getData().add(series);
                } else if (formula5.getText().contains("cos")) {
                    for (double x = -5; x <= 5; x += 0.1){
                        double y = Math.cos(cons * x);
                        series.getData().add(new XYChart.Data<String, Double>(String.valueOf(x), y));
                    }

                    grafico.getData().add(series);
                } else if (formula5.getText().contains("tan")) {
                    for (double x = -5; x <= 5; x += 0.1){
                        double y = Math.tan(cons * x);
                        series.getData().add(new XYChart.Data<String, Double>(String.valueOf(x), y));
                    }

                    grafico.getData().add(series);
                } else if (formula5.getText().contains("log")) {
                    for (double x = -5; x <= 5; x += 0.1){
                        double y = Math.log10(cons * x);
                        series.getData().add(new XYChart.Data<String, Double>(String.valueOf(x), y));
                    }

                    grafico.getData().add(series);
                } else if (formula5.getText().contains("ln")) {
                    for (double x = -5; x <= 5; x += 0.1){
                        double y = Math.log(cons * x);
                        series.getData().add(new XYChart.Data<String, Double>(String.valueOf(x), y));
                    }

                    grafico.getData().add(series);
                } else if (formula5.getText().contains("^")) {
                    for (double x = -5; x <= 5; x += 0.1){
                        double y = Math.pow(Integer.parseInt(s5), x);
                        series.getData().add(new XYChart.Data<String, Double>(String.valueOf(x), y));
                    }

                    grafico.getData().add(series);
                }


            }
        }

        cons = 1;
    }

    @FXML
    private void handleDeleteButton(){
        String newtext;
        if (aux == 0){
            newtext = s1.substring(0, s1.length() - 1);
            s1 = newtext;
            formula1.setText(newtext);
        }
        if (aux == 1){
            newtext = s2.substring(0, s2.length() - 1);
            s2 = newtext;
            formula2.setText(newtext);
        }
        if (aux == 2){
            newtext = s3.substring(0, s3.length() - 1);
            s3 = newtext;
            formula3.setText(newtext);
        }
        if (aux == 3){
            newtext = s4.substring(0, s4.length() - 1);
            s4 = newtext;
            formula4.setText(newtext);
        }
        if (aux == 4){
            newtext = s5.substring(0, s5.length() - 1);
            s5 = newtext;
            formula5.setText(newtext);
        }
    }

    @FXML
    private void reset(){
        if (series == null) {
            formula1.setText("");
            formula2.setText("");
            formula3.setText("");
            formula4.setText("");
            formula5.setText("");
            aux = 0;
            cons = 1;
        }
        else {
            series.getData().clear();
            grafico.getData().clear();
            formula1.setText("");
            formula2.setText("");
            formula3.setText("");
            formula4.setText("");
            formula5.setText("");
            aux = 0;
            cons = 1;
        }
    }
}
