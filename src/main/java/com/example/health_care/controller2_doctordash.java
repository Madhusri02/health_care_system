package com.example.health_care;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class controller2_doctordash {

    @FXML
    private Button about2;

    @FXML
    private Button attendence;

    @FXML
    private Button back2;

    @FXML
    private Button logout2;

    @FXML
    private Button view_your_appoint;

    @FXML
    void toabout(ActionEvent event) {
        HelloApplication.stage_var.setScene(HelloApplication.d_about);

    }


    @FXML
    void tologin(ActionEvent event) {
        HelloApplication.stage_var.setScene(HelloApplication.Login);

    }

    @FXML
    void totitle(ActionEvent event) {
        HelloApplication.stage_var.setScene(HelloApplication.Login);

    }

    @FXML
    void view_appoint(ActionEvent event) {
        HelloApplication.stage_var.setScene(HelloApplication.view);
    }

}
