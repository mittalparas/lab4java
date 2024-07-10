module com.example.lab4java {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab4java to javafx.fxml;
    exports com.example.lab4java;
}