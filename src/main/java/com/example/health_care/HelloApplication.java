package com.example.health_care;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static Stage stage_var;
    public static Scene Login;

    public static Scene dash_ad;

    public static Scene dash_doc;
    public static Scene dash_pat;

    public static Scene sign;

    public static Scene view;

    public static Scene book;

    public static  Scene con_history;
    public static Scene p_about;
    public static Scene d_about;
    public static Scene ad_about;
    public static Scene ad_viewapp;
    public static Scene feedback;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader1 = new FXMLLoader(HelloApplication.class.getResource("LOGIN.fxml"));
        FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("admin_dashboard.fxml"));
        FXMLLoader fxmlLoader3 = new FXMLLoader(HelloApplication.class.getResource("doctor_dashboard.fxml"));
        FXMLLoader fxmlLoader4 = new FXMLLoader(HelloApplication.class.getResource("patient_dashboard.fxml"));
        FXMLLoader fxmlLoader5 = new FXMLLoader(HelloApplication.class.getResource("signup.fxml"));
        FXMLLoader fxmlLoader6 = new FXMLLoader(HelloApplication.class.getResource("view_appoinments.fxml"));
        FXMLLoader fxmlLoader7 = new FXMLLoader(HelloApplication.class.getResource("fx8_bookappoinments.fxml"));
        FXMLLoader fxmlLoader8 = new FXMLLoader(HelloApplication.class.getResource("fx9_p_previous_con.fxml"));
        FXMLLoader fxmlLoader9 = new FXMLLoader(HelloApplication.class.getResource("fx10_p_about.fxml"));
        FXMLLoader fxmlLoader10 = new FXMLLoader(HelloApplication.class.getResource("fx11_d_about.fxml"));
        FXMLLoader fxmlLoader11 = new FXMLLoader(HelloApplication.class.getResource("fx12_ad_about.fxml"));
        FXMLLoader fxmlLoader12 = new FXMLLoader(HelloApplication.class.getResource("fx13_ad_viewapp.fxml"));
        FXMLLoader fxmlLoader13 = new FXMLLoader(HelloApplication.class.getResource("feedback.fxml"));

        Scene login1 =new Scene(fxmlLoader1.load());
        Scene dash1 = new Scene(fxmlLoader2.load());
        Scene dash2 = new Scene(fxmlLoader3.load());
        Scene dash3 = new Scene(fxmlLoader4.load());
        Scene signup = new Scene(fxmlLoader5.load());
        Scene app = new Scene(fxmlLoader6.load());
        Scene bookapp = new Scene(fxmlLoader7.load());
        Scene pcon = new Scene(fxmlLoader8.load());
        Scene a1 = new Scene(fxmlLoader9.load());
        Scene a2 = new Scene(fxmlLoader10.load());
        Scene a3 = new Scene(fxmlLoader11.load());
        Scene app2 = new Scene (fxmlLoader12.load());
        Scene feed = new Scene(fxmlLoader13.load());

        stage_var=stage;
        Login=login1;
        dash_ad = dash1 ;
        dash_doc = dash2;
        dash_pat = dash3;
        sign = signup;
        view = app;
        book = bookapp;
        con_history = pcon;
        p_about = a1;
        d_about = a2;
        ad_about = a3;
        ad_viewapp = app2;
        feedback = feed;


        stage.setTitle("Primary health center monitoring and management system");
        stage.setScene(Login);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}