package com.example.health_care;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class controller11_d_about {

    @FXML
    private Button back5;

    @FXML
    void todoc(ActionEvent event) {
        HelloApplication.stage_var.setScene(HelloApplication.dash_doc);
    }

}
