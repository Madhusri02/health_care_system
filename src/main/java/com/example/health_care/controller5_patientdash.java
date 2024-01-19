package com.example.health_care;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class controller5_patientdash {

    @FXML
    private Button about;

    @FXML
    private Button back1;

    @FXML
    private Button book;

    @FXML
    private Button logout1;

    @FXML
    private Button view;

    @FXML
    void toabout(ActionEvent event) {
        HelloApplication.stage_var.setScene(HelloApplication.p_about);

    }

    @FXML
    void tobook(ActionEvent event) {
        HelloApplication.stage_var.setScene(HelloApplication.book);
    }

    @FXML
    void tohistory(ActionEvent event) {
        HelloApplication.stage_var.setScene(HelloApplication.con_history);

    }

    @FXML
    void tologin(ActionEvent event) {
        HelloApplication.stage_var.setScene(HelloApplication.Login);

    }

    @FXML
    void tofeedback(ActionEvent event) {
HelloApplication.stage_var.setScene(HelloApplication.feedback);
    }

}
