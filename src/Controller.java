package calculatorfx;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller implements Initializable {

    @FXML
    private TextField display;

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
    private Button zero;

    @FXML
    private Button dot;

    @FXML
    private Button clear;

    @FXML
    private Button plus;

    @FXML
    private Button minus;

    @FXML
    private Button multiply;

    @FXML
    private Button divide;

    @FXML
    private Button fact;

    @FXML
    private Button power;

    @FXML
    private Button squareroot;

    @FXML
    private Button tobinary;

    @FXML
    private Button equal;

    double result = 0;
    double input1;
    double input2;
    int ps;
    int point = 0;

    Math math = new Math();

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

        } else if (event.getSource() == dot && point == 0) {

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

        } else if (event.getSource() == fact) {

            input1 = 0;//Double.parseDouble(display.getText());

            display.setText("");
            ps = 5;
            point = 0;

        } else if (event.getSource() == power) {

            input1 = Double.parseDouble(display.getText());

            display.setText("");
            ps = 6;
            point = 0;

        } else if (event.getSource() == squareroot) {

            input1 = 0;//Double.parseDouble(display.getText());

            display.setText("");
            ps = 7;
            point = 0;

        } else if (event.getSource() == tobinary) {

            input1 = 0;//Double.parseDouble(display.getText());

            display.setText("");
            ps = 8;
            point = 0;

        } else if (event.getSource() == equal && ps > 0) {

            input2 = Double.parseDouble(display.getText());

            DecimalFormat td = new DecimalFormat("0.########");
            DecimalFormat bintd = new DecimalFormat("#");

            switch (ps) {

                case 1:
                    result = math.Sum(input1, input2);
                    display.setText(String.valueOf(td.format(result)));
                    break;

                case 2:
                    result = math.Sub(input1, input2);
                    display.setText(String.valueOf(td.format(result)));
                    break;

                case 3:
                    result = math.Mult(input1, input2);
                    display.setText(String.valueOf(td.format(result)));
                    break;

                case 4:
                    if (input2 == 0) {
                        display.setText("ERROR");
                    } else {
                        result = math.Div(input1, input2);
                        display.setText(String.valueOf(td.format(result)));
                    }
                    break;

                case 5:
                    result = math.Fact((long) input2);
                    display.setText(String.valueOf(td.format(result)));
                    break;

                case 6:
                    result = math.Pow(input1, input2);
                    display.setText(String.valueOf(td.format(result)));
                    break;

                case 7:
                    result = math.Root(input2);
                    display.setText(String.valueOf(td.format(result)));
                    break;

                case 8:
                    result = math.toBinary((int) input2);
                    display.setText(String.valueOf(bintd.format(result)));
                    break;
            }

            ps = 0;

        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
