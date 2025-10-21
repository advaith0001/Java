package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField firstNumber;

    @FXML
    private TextField secondNumber;

    @FXML
    private ChoiceBox<String> operatorChoice;

    @FXML
    private TextField resultField;

    // Initialize choice box values when UI loads
    @FXML
    public void initialize() {
        operatorChoice.getItems().addAll("+", "-", "*", "/");
    }

    @FXML
    protected void onCalculate() {
        try {
            double num1 = Double.parseDouble(firstNumber.getText());
            double num2 = Double.parseDouble(secondNumber.getText());
            String operator = operatorChoice.getValue();

            double result = 0;

            switch (operator) {
                case "+" -> result = num1 + num2;
                case "-" -> result = num1 - num2;
                case "*" -> result = num1 * num2;
                case "/" -> {
                    if (num2 != 0) result = num1 / num2;
                    else {
                        resultField.setText("Error: Divide by 0");
                        return;
                    }
                }
                default -> {
                    resultField.setText("Select operator");
                    return;
                }
            }

            // Show full expression like "5 + 3 = 8"
            resultField.setText(num1 + " " + operator + " " + num2 + " = " + result);

        } catch (NumberFormatException e) {
            resultField.setText("Invalid input");
        }
    }
}
