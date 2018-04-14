package controller;

//import java.net.URL;
//import java.util.ResourceBundle;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
//import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField display;

    @FXML
    private Button zero;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button plus;

    @FXML
    private Button minus;

    @FXML
    private Button multiply;

    @FXML
    private Button divide;

    @FXML
    private Button bin;

    @FXML
    private Button sqrt;

    @FXML
    private Button pow;

    @FXML
    private Button factorial;

    @FXML
    private Button equals;

    @FXML
    private Button comma;

    @FXML
    private Button clear;

    double result = 0;
    double input1;
    double input2;
    int ps;
    int point = 0;

    @FXML
    void Calculation(ActionEvent event) {

        if (event.getSource() == one) {

            display.appendText("1");

        } else if (event.getSource() == two) {

            display.appendText("2");

        } else if (event.getSource() == three) {

            display.appendText("3");

        } else if (event.getSource() == four) {

            display.appendText("4");

        } else if (event.getSource() == five) {

            display.appendText("5");

        } else if (event.getSource() == six) {

            display.appendText("6");

        } else if (event.getSource() == seven) {

            display.appendText("7");

        } else if (event.getSource() == eight) {

            display.appendText("8");

        } else if (event.getSource() == nine) {

            display.appendText("9");

        } else if (event.getSource() == zero) {

            display.appendText("0");

        } else if (event.getSource() == comma && point == 0) {

            display.appendText(".");

            point = 1;

        } else if (event.getSource() == clear) {

            display.setText("");

            input1 = 0;
            input2 = 0;
            ps = 0;
            point = 0;

        } else if (event.getSource() == plus) {

            input1 = Double.parseDouble(display.getText());

            display.setText("");
            ps = 1;
            point = 0;

        } else if (event.getSource() == minus) {

            input1 = Double.parseDouble(display.getText());

            display.setText("");
            ps = 2;
            point = 0;

        } else if (event.getSource() == multiply) {

            input1 = Double.parseDouble(display.getText());

            display.setText("");
            ps = 3;
            point = 0;

        } else if (event.getSource() == divide) {

            input1 = Double.parseDouble(display.getText());

            display.setText("");
            ps = 4;
            point = 0;

        } else if (event.getSource() == equals && ps > 0) {

            input2 = Double.parseDouble(display.getText());

            DecimalFormat td = new DecimalFormat("#.00");

            switch (ps) {

                case 1:
                    result = input1 + input2;
                    display.setText(String.valueOf(td.format(result)));
                    break;

                case 2:
                    result = input1 - input2;
                    display.setText(String.valueOf(td.format(result)));
                    break;

                case 3:
                    result = input1 * input2;
                    display.setText(String.valueOf(td.format(result)));
                    break;

                case 4:
                    result = input1 / input2;
                    display.setText(String.valueOf(td.format(result)));
                    break;

            }

            ps = 0;

        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
