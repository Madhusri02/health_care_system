package com.example.health_care;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.bson.Document;

public class controller7_p_book_appoinments {

    @FXML
    private Button back7;

    @FXML
    private TextField date;

    @FXML
    private TextArea description;

    @FXML
    private TextField id;

    @FXML
    private TextField time_slot;

    @FXML
    void check_availability(ActionEvent event) {
        String dat = date.getText();
        String des = description.getText();
        String log_id = id.getText();
        String time= time_slot.getText();
        try(MongoClient client = new MongoClient("localhost" , 27017)) {
            MongoDatabase db = client.getDatabase("hospital_managment");
            MongoCollection<Document> col = db.getCollection("check_availability");
            Document dc = new Document();
            dc.put("ID",log_id);
            dc.put("Date" , dat);
            dc.put("Description",des);
            dc.put("Time",time);
            col.insertOne(dc);
            client.close();
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Appoinment Success !");
                alert.setHeaderText("GOT APPOINMENT !");
                alert.setContentText("THANKS FOR YOUR COMING.. VISIT AGAIN");

                alert.showAndWait();
        }

    }

    @FXML
    void topatient(ActionEvent event) {
        HelloApplication.stage_var.setScene(HelloApplication.dash_pat);
    }

}
