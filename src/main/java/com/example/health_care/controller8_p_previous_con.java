package com.example.health_care;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class controller8_p_previous_con {

    @FXML
    private Button back7;

    @FXML
    void topatient(ActionEvent event) {
        HelloApplication.stage_var.setScene(HelloApplication.dash_pat);

    }

}
