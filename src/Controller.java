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
    private TextField operation;

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
    private Button negate;

    @FXML
    private Button equal;

    double result = 0;
    double input1;
    double input2;
    int ps;
    int point = 0;
    int ispoint = 0;
    int canneg = 0;
    int emptydisplay = 1;
    String oldvalue;

    Math math = new Math();
    DecimalFormat td = new DecimalFormat("0.########");

    @FXML
    void Calculation(ActionEvent event) {

        if (event.getSource() == one) {

            display.appendText("1");
            emptydisplay = 0;

        } else if (event.getSource() == two) {

            display.appendText("2");
            emptydisplay = 0;

        } else if (event.getSource() == three) {

            display.appendText("3");
            emptydisplay = 0;

        } else if (event.getSource() == four) {

            display.appendText("4");
            emptydisplay = 0;

        } else if (event.getSource() == five) {

            display.appendText("5");
            emptydisplay = 0;

        } else if (event.getSource() == six) {

            display.appendText("6");
            emptydisplay = 0;

        } else if (event.getSource() == seven) {

            display.appendText("7");
            emptydisplay = 0;

        } else if (event.getSource() == eight) {

            display.appendText("8");
            emptydisplay = 0;

        } else if (event.getSource() == nine) {

            display.appendText("9");
            emptydisplay = 0;

        } else if (event.getSource() == zero) {

            display.appendText("0");
            emptydisplay = 0;

        } else if (event.getSource() == dot && point == 0) {

            if (emptydisplay == 1) {
                display.appendText("0.");
            } else {
                display.appendText(".");
            }

            point = 1;
            ispoint = 1;
            emptydisplay = 0;

        } else if (event.getSource() == clear) {

            display.setText("");
            operation.setText("");

            input1 = 0;
            input2 = 0;
            ps = 0;
            point = 0;
            ispoint = 0;
            canneg = 0;
            emptydisplay = 1;

        } else if (event.getSource() == plus && ps == 0 && emptydisplay == 0) {

            input1 = Double.parseDouble(display.getText());

            display.setText("");
            oldvalue = String.valueOf(td.format(input1))+" + ";
            operation.setText(oldvalue);
            //operation.setText("+");
            ps = 1;
            point = 0;
            emptydisplay = 1;

        } else if (event.getSource() == minus && ps == 0 && emptydisplay == 0) {

            input1 = Double.parseDouble(display.getText());

            display.setText("");
            oldvalue = String.valueOf(td.format(input1))+" - ";
            operation.setText(oldvalue);
            //operation.setText("-");
            ps = 2;
            point = 0;
            emptydisplay = 1;

        } else if (event.getSource() == multiply && ps == 0 && emptydisplay == 0) {

            input1 = Double.parseDouble(display.getText());

            display.setText("");
            oldvalue = String.valueOf(td.format(input1))+" x ";
            operation.setText(oldvalue);
            //operation.setText("x");
            ps = 3;
            point = 0;
            emptydisplay = 1;

        } else if (event.getSource() == divide && ps == 0 && emptydisplay == 0) {

            input1 = Double.parseDouble(display.getText());

            display.setText("");
            oldvalue = String.valueOf(td.format(input1))+" / ";
            operation.setText(oldvalue);
            //operation.setText("/");
            ps = 4;
            point = 0;
            emptydisplay = 1;

        } else if (event.getSource() == fact && ps == 0) {

            input1 = 0;//Double.parseDouble(display.getText());

            display.setText("");
            oldvalue = "!";
            operation.setText(oldvalue);
            //operation.setText("!");
            ps = 5;
            point = 1;
            canneg = 1;
            emptydisplay = 1;

        } else if (event.getSource() == power && ps == 0 && emptydisplay == 0) {

            input1 = Double.parseDouble(display.getText());

            display.setText("");
            oldvalue = String.valueOf(td.format(input1))+" ^ ";
            operation.setText(oldvalue);
            //operation.setText("pow");
            ps = 6;
            point = 1;
            canneg = 1;
            emptydisplay = 1;

        } else if (event.getSource() == squareroot && ps == 0) {

            input1 = 0;//Double.parseDouble(display.getText());

            display.setText("");
            oldvalue = "sqrt";
            operation.setText(oldvalue);
            //operation.setText("sqrt");
            ps = 7;
            point = 0;
            canneg = 1;
            emptydisplay = 1;

        } else if (event.getSource() == tobinary && ps == 0) {

            input1 = 0;//Double.parseDouble(display.getText());

            display.setText("");
            oldvalue = "bin";
            operation.setText(oldvalue);
            //operation.setText("bin");
            ps = 8;
            point = 1;
            canneg = 1;
            emptydisplay = 1;

        } else if (event.getSource() == negate && canneg == 0 && emptydisplay == 0) {

            double temp = Double.parseDouble(display.getText());
            if (temp != 0) {
                temp = temp * (-1);
            }
            display.setText(String.valueOf(td.format(temp)));

        } else if (event.getSource() == equal && ps > 0 && emptydisplay == 0) {

            input2 = Double.parseDouble(display.getText());
            if(input2 < 0 || ps == 8 || ps == 7) {
                operation.setText(oldvalue+"("+String.valueOf(td.format(input2))+") =");
            }
            else {
                operation.setText(oldvalue+String.valueOf(td.format(input2))+" =");
            }
            if(ps == 5) {
                operation.setText(String.valueOf(td.format(input2))+oldvalue+" =");
            }

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
                        if (result % 1 != 0) {
                            ispoint = 1;
                        }
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
                    if (result % 1 != 0) {
                        ispoint = 1;
                    }
                    display.setText(String.valueOf(td.format(result)));
                    break;

                case 8:
                    result = math.toBinary((int) input2);
                    display.setText(String.valueOf(td.format(result)));
                    break;
            }
            ps = 0;
            canneg = 0;

            if (ispoint == 1) {
                point = 1;
            } else {
                point = 0;
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
