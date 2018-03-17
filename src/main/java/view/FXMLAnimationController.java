package view;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;

public class FXMLAnimationController implements Initializable {

    @FXML
    private JFXButton idClickMe;

    public void initialize(URL location, ResourceBundle resources) {

        TranslateTransition transition = new TranslateTransition();
        transition.setDuration(Duration.seconds(4));
        transition.setNode(idClickMe);

        transition.setToY(-150);
        transition.setAutoReverse(true);
        transition.setCycleCount(2);

        transition.play();
    }
}
