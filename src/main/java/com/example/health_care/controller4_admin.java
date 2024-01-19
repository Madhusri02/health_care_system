package com.example.health_care;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class controller4_admin {

    @FXML
    private Button about3;

    @FXML
    private Button attendence;

    @FXML
    private Button back4;

    @FXML
    private Button issue;

    @FXML
    private Button logout3;

    @FXML
    void toabout(ActionEvent event) {
        HelloApplication.stage_var.setScene(HelloApplication.ad_about);

    }

    @FXML
    void toissue(ActionEvent event) {

    }

    @FXML
    void tologin(ActionEvent event) {
        HelloApplication.stage_var.setScene(HelloApplication.Login);

    }
    @FXML
    void toappoinments(ActionEvent event) {
        HelloApplication.stage_var.setScene(HelloApplication.ad_viewapp);
    }
    @FXML
    void totitle(ActionEvent event) {
        HelloApplication.stage_var.setScene(HelloApplication.Login);

    }

}
