module com.example.health_care {
    requires javafx.controls;
    requires javafx.fxml;
    requires mongo.java.driver;


    opens com.example.health_care to javafx.fxml;
    exports com.example.health_care;
}