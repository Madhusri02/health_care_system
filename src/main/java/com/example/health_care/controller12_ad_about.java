package com.example.health_care;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class controller12_ad_about {

    @FXML
    private Button back4;

    @FXML
    void topatient(ActionEvent event) {
        HelloApplication.stage_var.setScene(HelloApplication.dash_ad);

    }

}
