package com.example.health_care;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import com.example.health_care.pack.users;
import org.bson.Document;

import static javafx.scene.Cursor.cursor;

public class controller13_ad_viewapp {

    @FXML
    private Button back9;

    @FXML
    private TableView<users> show;

    @FXML
    private TableColumn<users ,String> col_date;

    @FXML
    private TableColumn<users ,String> col_description;

    @FXML
    private TableColumn<users ,String> col_patient_id;

    @FXML
    private TableColumn<users ,String> col_time;

    @FXML
    private Button reload_btn;


    @FXML
    void on_reload(ActionEvent event) {

        try(MongoClient client = new MongoClient("localhost" , 27017)) {
            MongoDatabase db = client.getDatabase("hospital_managment");
            MongoCollection<Document> col = db.getCollection("check_availability");
            MongoCursor<Document> cursor = col.find().iterator();
            ObservableList<users> list = FXCollections.observableArrayList();
            while(cursor.hasNext()){
                users h = new users();
                Document sample = cursor.next();
                h.setCol_patient_id(sample.getString("ID"));
//                h.setCol_patient_id(String.valueOf(cursor("ID")));
                h.setCol_date(sample.getString("Date"));
                h.setCol_description(sample.getString("Description"));
                h.setCol_time(sample.getString("Time"));
                list.add(h);
            }
            show.setItems(list);
            col_patient_id.setCellValueFactory(f -> f.getValue().col_patient_idProperty());
            col_date.setCellValueFactory(f ->f.getValue().col_dateProperty());
            col_description.setCellValueFactory(f ->f.getValue().col_descriptionProperty());
            col_time.setCellValueFactory(f -> f.getValue().col_timeProperty());

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    void todoc(ActionEvent event) {

        HelloApplication.stage_var.setScene(HelloApplication.dash_ad);
    }

}
