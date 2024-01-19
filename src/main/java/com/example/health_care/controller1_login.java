package com.example.health_care;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import org.bson.Document;

public class controller1_login {

    @FXML
    private Button PATIENT;

    @FXML
    private Button admin;

    @FXML
    private Button doctor;

    @FXML
    private TextField login_id;

    @FXML
    private TextField name;

    @FXML
    private Button sign_up;

    @FXML
    int toadmin_dash(ActionEvent event) {
        String log = login_id.getText();
        String na = name.getText();
        try(MongoClient client = new MongoClient("localhost" , 27017)) {
            MongoDatabase db = client.getDatabase("hospital_managment");
            MongoCollection<Document> col = db.getCollection("admin_details");
            MongoCursor<Document> cursor = col.find().iterator();
            Document dc = new Document();
            dc.put("ID",log);
            dc.put("name" , na);
            while (cursor.hasNext()){
                Document sample = cursor.next();
                String lg_id = sample.getString("ID");
                System.out.println("log_id available : "+lg_id);
                System.out.println("ip id : "+log);
                if (log.equals(lg_id)){
                    HelloApplication.stage_var.setScene(HelloApplication.dash_ad);
                    return 0;
                }
            }
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("INVALID LOGIN !");
            alert.setHeaderText("USE CORRECT USERNAME ID!");

            alert.showAndWait();
            System.out.println("Not available");
        }
        return 0;
    }

    @FXML
    int todoc_dash(ActionEvent event) {
        String log = login_id.getText();
        String na = name.getText();
        try(MongoClient client = new MongoClient("localhost" , 27017)) {
            MongoDatabase db = client.getDatabase("hospital_managment");
            MongoCollection<Document> col = db.getCollection("doctor_details");
            MongoCursor<Document> cursor = col.find().iterator();
            Document dc = new Document();
            dc.put("ID",log);
            dc.put("name" , na);
            while (cursor.hasNext()){
                Document sample = cursor.next();
                String lg_id = sample.getString("ID");
                System.out.println("log_id available : "+lg_id);
                System.out.println("ip id : "+log);
                if (log.equals(lg_id)){
                    HelloApplication.stage_var.setScene(HelloApplication.dash_doc);
                    return 0;
                }
            }
            System.out.println("Not available");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("INVALID LOGIN !");
            alert.setHeaderText("USE CORRECT USERNAME ID!");
            alert.setContentText("THANKS FOR YOUR COMING.. VISIT AGAIN");
            alert.showAndWait();
            return 0;
        }
    }

    @FXML
    int topatient_dash(ActionEvent event) {String log = login_id.getText();
        String na = name.getText();
        try(MongoClient client = new MongoClient("localhost" , 27017)) {
            MongoDatabase db = client.getDatabase("hospital_managment");
            MongoCollection<Document> col = db.getCollection("patient_details");
            MongoCursor<Document> cursor = col.find().iterator();
            Document dc = new Document();
            dc.put("ID",log);
            dc.put("name" , na);
            while (cursor.hasNext()){
                Document sample = cursor.next();
                String lg_id = sample.getString("ID");
                System.out.println("log_id available : "+lg_id);
                System.out.println("ip id : "+log);
                if (log.equals(lg_id)){
                    HelloApplication.stage_var.setScene(HelloApplication.dash_pat);
                    return 0;
                }
            }
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("INVALID LOGIN !");
            alert.setHeaderText("USE CORRECT USERNAME ID!");
            alert.setContentText("THANKS FOR YOUR COMING.. VISIT AGAIN");
            alert.showAndWait();
            return 0;
        }
    }

    @FXML
    void tosignup(ActionEvent event) {

        HelloApplication.stage_var.setScene(HelloApplication.sign);
    }

}
