package com.example.health_care.pack;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import org.bson.Document;

import java.io.StringReader;

public class users extends Document {
    StringProperty col_patient_id ;
    StringProperty col_date;
    StringProperty col_description;
    StringProperty col_time;

    public StringProperty col_patient_idProperty() {
        return col_patient_id;
    }

    public StringProperty col_dateProperty() {
        return col_date;
    }

    public StringProperty col_descriptionProperty() {
        return col_description;
    }

    public StringProperty col_timeProperty() {
        return col_time;
    }

     //getters and setters

    public String getCol_patient_id() {
        return col_patient_id.get();
    }

    public String getCol_date() {
        return col_date.get();
    }

    public String getCol_description() {
        return col_description.get();
    }

    public String getCol_time() {
        return col_time.get();
    }

    //setters

    public void setCol_patient_id(String newcol_patient_id) {

        this.col_patient_id.set(newcol_patient_id);
    }

    public void setCol_date(String newcol_date) {

        this.col_date.set(newcol_date);
    }

    public void setCol_description(String newcol_description) {

        this.col_description.set(newcol_description);
    }

    public void setCol_time(String newcol_time) {

        this.col_time.set(newcol_time);
    }

    public users(){
        col_patient_id=new SimpleStringProperty(this,"col_patient_id");
        col_date = new SimpleStringProperty(this,"col_date");
        col_description = new SimpleStringProperty(this,"col_description");
        col_time = new SimpleStringProperty(this,"col_time");
    }


    @Override
    public Object getOrDefault(Object key, Object defaultValue) {
        return super.getOrDefault(key, defaultValue);
    }
}
