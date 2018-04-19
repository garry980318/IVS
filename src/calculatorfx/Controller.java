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
    DecimalFormat ed = new DecimalFormat("0.########E0");

    public int getDigits(double num) {

        if (num == 0) {
            return 1;
        }

        int poc = 0;

        if (num < 0) {
            num = num * (-1);
            poc++;
        }

        long integer = (long) num;

        if (num % 1 != 0) {
            poc++;
            if (integer == 0) {
                num = num + 1;
            }
            int i = 0;
            while (num % 1 != 0) {
                num = num * 10;
                i++;
                if (i == 8) {
                    break;
                }
            }
        }

        integer = (long) num;

        while (integer != 0) {
            integer = integer / 10;
            poc++;
        }

        return poc;

    }

    public void displayResult(double result) {

        if (getDigits(result) > 16) {
            display.setText(String.valueOf(ed.format(result)));
        } else {
            display.setText(String.valueOf(td.format(result)));
        }

    }

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
            oldvalue = String.valueOf(td.format(input1)) + "+";
            operation.setText(oldvalue);
            ps = 1;
            point = 0;
            emptydisplay = 1;

        } else if (event.getSource() == minus && ps == 0 && emptydisplay == 0) {

            input1 = Double.parseDouble(display.getText());

            display.setText("");
            oldvalue = String.valueOf(td.format(input1)) + "-";
            operation.setText(oldvalue);
            ps = 2;
            point = 0;
            emptydisplay = 1;

        } else if (event.getSource() == multiply && ps == 0 && emptydisplay == 0) {

            input1 = Double.parseDouble(display.getText());

            display.setText("");
            oldvalue = String.valueOf(td.format(input1)) + "x";
            operation.setText(oldvalue);
            ps = 3;
            point = 0;
            emptydisplay = 1;

        } else if (event.getSource() == divide && ps == 0 && emptydisplay == 0) {

            input1 = Double.parseDouble(display.getText());

            display.setText("");
            oldvalue = String.valueOf(td.format(input1)) + "/";
            operation.setText(oldvalue);
            ps = 4;
            point = 0;
            emptydisplay = 1;

        } else if (event.getSource() == fact && ps == 0) {

            input1 = 0;

            display.setText("");
            oldvalue = "!";
            operation.setText(oldvalue);
            ps = 5;
            point = 1;
            canneg = 1;
            emptydisplay = 1;

        } else if (event.getSource() == power && ps == 0 && emptydisplay == 0) {

            input1 = Double.parseDouble(display.getText());

            display.setText("");
            oldvalue = String.valueOf(td.format(input1)) + "^";
            operation.setText(oldvalue);
            ps = 6;
            point = 1;
            canneg = 1;
            emptydisplay = 1;

        } else if (event.getSource() == squareroot && ps == 0) {

            input1 = 0;

            display.setText("");
            oldvalue = "sqrt(";
            operation.setText(oldvalue);
            ps = 7;
            point = 0;
            canneg = 1;
            emptydisplay = 1;

        } else if (event.getSource() == tobinary && ps == 0) {

            input1 = 0;

            display.setText("");
            oldvalue = "bin(";
            operation.setText(oldvalue);
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

            if (input2 < 0) {
                operation.setText(oldvalue + "(" + String.valueOf(td.format(input2)) + ")=");
            } else if (ps == 7 || ps == 8) {
                operation.setText(oldvalue + String.valueOf(td.format(input2)) + ")=");
            } else if (ps == 5) {
                operation.setText(String.valueOf(td.format(input2)) + oldvalue + "=");
            } else {
                operation.setText(oldvalue + String.valueOf(td.format(input2)) + "=");
            }

            switch (ps) {

                case 1:
                    result = math.Sum(input1, input2);
                    displayResult(result);
                    break;

                case 2:
                    result = math.Sub(input1, input2);
                    displayResult(result);
                    break;

                case 3:
                    result = math.Mult(input1, input2);
                    displayResult(result);
                    break;

                case 4:
                    if (input2 == 0) {
                        display.setText("");
                        operation.setText("ERROR");
                        emptydisplay = 1;
                    } else {
                        result = math.Div(input1, input2);
                        if (result % 1 != 0) {
                            ispoint = 1;
                        }
                        displayResult(result);
                    }
                    break;

                case 5:
                    if (input2 > 20) {
                        display.setText("");
                        operation.setText("ERROR");
                        emptydisplay = 1;
                    } else {
                        result = math.Fact((long) input2);
                        displayResult(result);
                    }
                    break;

                case 6:
                    result = math.Pow(input1, input2);
                    displayResult(result);
                    break;

                case 7:
                    result = math.Root(input2);
                    if (result % 1 != 0) {
                        ispoint = 1;
                    }
                    displayResult(result);
                    break;

                case 8:
                    if (input2 > 262144) {
                        display.setText("");
                        operation.setText("ERROR");
                        emptydisplay = 1;
                    } else {
                        result = math.toBinary((long) input2);
                        display.setText(String.valueOf(td.format(result)));
                    }
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
