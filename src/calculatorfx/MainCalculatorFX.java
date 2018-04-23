/**
 * This file contains a java implementation of a main class for a java FXML application. It is a part of a group project for the subject IVS of Brno University of Technology. 
 *
 * @file MainCalculatorFX.java
 * @author Rene Bolf & Radoslav Grencik
 * @brief Implementation of a main class for a java FXML application.
 * @package calculatorfx
 */
package calculatorfx;

import java.util.Locale;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * @class MainCalculatorFX
 * @brief Main class of the calculator launching the application
 */

public class MainCalculatorFX extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        Locale.setDefault(Locale.UK);
        Parent root = FXMLLoader.load(getClass().getResource("/GUI/CalcFX.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Style.css"); /**< Added custom css styling */
        stage.setTitle("DedSec Calculator"); /**< Added title */
        Image image = new Image("/icons/icon.png"); /**< Added custom icon */
        stage.getIcons().add(image);        
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        
        launch(args);
    }    
}

/*** END OF FILE MainCalculatorFX.java ***/
