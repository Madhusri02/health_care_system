package com.example.health_care;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import org.bson.Document;

public class controller3_signup {

    @FXML
    private Button SIGNUP;

    @FXML
    private Button back;

    @FXML
    private TextField doctor_id;

    @FXML
    private TextField gender;

    @FXML
    private TextField name;

    @FXML
    private TextField ph_no;
    @FXML
    private TextField age;

    @FXML
    private CheckBox enter_admin;

    @FXML
    private CheckBox enter_doctor;

    @FXML
    private CheckBox enter_patient;



    @FXML
    void tologin(ActionEvent event) {
        String ip_na = name.getText();
        String ip_gen = gender.getText();
        String id = doctor_id.getText();
        String phone_num = ph_no.getText();
        String ip_age = age.getText();
        CheckBox ad1 = enter_admin;
        boolean check1 = ad1.selectedProperty().get();
        CheckBox ad2 = enter_doctor;
        boolean check2 = ad2.selectedProperty().get();
        try(MongoClient client = new MongoClient("localhost" , 27017)) {
            MongoDatabase db = client.getDatabase("hospital_managment");
            Document dc = new Document();
            dc.put("Name", ip_na);
            dc.put("Age" ,ip_age);
            dc.put("Gender" ,ip_gen);
            dc.put("Phone Number",phone_num);
            dc.put("ID",id);
            MongoCollection<Document> col;
            if (check1==true){
                col = db.getCollection("admin_details");

            }
            else if (check2==true){
                 col = db.getCollection("doctor_details");

            }
            else {
                col = db.getCollection("patient_details");
            }
            MongoCursor<Document> cursor = col.find().iterator();


            while(cursor.hasNext()){
                Document sample = cursor.next();
                String lg_id = sample.getString("ID");
                System.out.println(lg_id);
                if (lg_id.equals(id)){
                    System.out.println("Cannot be done");
                }
                else{
                    dc.put("doctor id", id);
                }
            }
            col.insertOne(dc);
            client.close();
            System.out.println(id);
            HelloApplication.stage_var.setScene(HelloApplication.Login);
        }
    }

}