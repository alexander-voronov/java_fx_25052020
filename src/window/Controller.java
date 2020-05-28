package window;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import javax.swing.*;
import java.awt.event.ActionListener;

import static javafx.scene.input.KeyCode.ENTER;

public class Controller {
    @FXML
    public TextArea textArea;
    @FXML
    public TextField textField;
    @FXML
    public Button send;

    public void pushTheButton() {
        textArea.appendText(textField.getText());
        textField.clear();
    }

        public void onEnter(ActionEvent actionEvent) {
        textArea.appendText(textField.getText());
        textField.clear();
    }
}
