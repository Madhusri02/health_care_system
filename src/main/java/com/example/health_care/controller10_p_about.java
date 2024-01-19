package com.example.health_care;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class controller10_p_about {

    @FXML
    private Button back6;

    @FXML
    void toadmin(ActionEvent event) {
        HelloApplication.stage_var.setScene(HelloApplication.dash_pat);
    }

}
