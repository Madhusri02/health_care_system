package com.example.health_care;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.bson.Document;

public class controller14_feedback {

    @FXML
    private Button feedbtn;

    @FXML
    private TextArea ip_feedback;

    @FXML
    private TextField name;

    @FXML
    void gotoback(ActionEvent event) {
        HelloApplication.stage_var.setScene(HelloApplication.dash_pat);

    }
    @FXML
    void upload(ActionEvent event) {
        String na = name.getText();
        String fed = ip_feedback.getText();
        try(MongoClient client = new MongoClient("localhost" , 27017)) {
            MongoDatabase db = client.getDatabase("hospital_managment");
            MongoCollection<Document> col = db.getCollection("Feedback");
            Document dc = new Document();
            dc.put("Name" , na);
            dc.put("feed_back" , fed);
            col.insertOne(dc);
        }

    }

}
