package shrralis.fxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
    @FXML
    private TextField nameTF;
    @FXML
    private TextField surnameTF;
    @FXML
    private TextField patronymicTF;
    @FXML
    private TextField heightTF;
    @FXML
    private TextField weightTF;
    @FXML
    private TextField nicknameTF;
    @FXML
    private TextField bDateTF;
    @FXML
    private TextField phoneTF;

    @FXML
    private CheckBox marriedCB;

    @FXML
    private RadioButton maleRB;
    @FXML
    private RadioButton femaleRB;

    @FXML
    private Button convertButton;
    @FXML
    private Button clearButton;
    @FXML
    private Button aboutButton;
    @FXML
    private ToggleButton editToggleButton;

    @FXML
    private TextArea resultTextArea;

    @FXML
    void onClick(ActionEvent event) {
        ButtonBase pressedButton = (ButtonBase) event.getSource();

        if (pressedButton == convertButton) {
            convertInfo();
        } else if (pressedButton == clearButton) {
            clearForm();
        } else if (pressedButton == aboutButton) {
            showAlert("About", "My developer is awesome",
                    "Developer: Yaroslav Zhyravov a.k.a. Shrralis\n" +
                            "Telegram: @Shrralis\n" +
                            "Twitter: @Shrralis\n" +
                            "Instagram: @rrsynth\n" +
                            "Facebook: Yaroslav Zhyravov\n" +
                            "E-Mail: shrralis@gmail.com\n\n" +
                            "All rights reserved © by Yaroslav Zhyravov 2017");
        } else if (pressedButton == editToggleButton) {
            resultTextArea.setEditable(editToggleButton.isSelected());
            editToggleButton.setText("Edit result " + (editToggleButton.isSelected() ? "OFF" : "ON"));
        }
    }

    private void showAlert(String title, String header, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void convertInfo() {
        String result = "";

        if (!nameTF.getText().equals("")) {
            result += "\n" +
                    "Name: " + nameTF.getText();
        }

        if (!surnameTF.getText().equals("")) {
            result += "\n" +
                    "Surname: " + nameTF.getText();
        }

        if (!patronymicTF.getText().equals("")) {
            result += "\n" +
                    "Patronymic: " + nameTF.getText();
        }

        if (!heightTF.getText().equals("")) {
            result += "\n" +
                    "Height: " + nameTF.getText();
        }

        if (!weightTF.getText().equals("")) {
            result += "\n" +
                    "Weight: " + nameTF.getText();
        }

        if (!nicknameTF.getText().equals("")) {
            result += "\n" +
                    "Nickname: " + nameTF.getText();
        }

        if (!bDateTF.getText().equals("")) {
            result += "\n" +
                    "Birth date: " + nameTF.getText();
        }

        if (!phoneTF.getText().equals("")) {
            result += "\n" +
                    "Phone: " + nameTF.getText();
        }

        if (maleRB.isSelected()) {
            result += "\n" +
                    "Gender: Male";
        } else if (femaleRB.isSelected()) {
            result += "\n" +
                    "Gender: Female";
        }

        result += "\n" +
                "Married: " + (marriedCB.isSelected() ? "YES" : "NO");

        resultTextArea.setText(result.trim());
    }

    private void clearForm() {
        nameTF.setText(null);
        surnameTF.setText(null);
        patronymicTF.setText(null);
        heightTF.setText(null);
        weightTF.setText(null);
        nicknameTF.setText(null);
        bDateTF.setText(null);
        phoneTF.setText(null);
        maleRB.setSelected(false);
        femaleRB.setSelected(false);
        marriedCB.setSelected(false);
        resultTextArea.setText(null);
    }
}
