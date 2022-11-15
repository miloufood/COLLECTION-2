module com.example.collectionx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;



    opens com.example.collectionx to javafx.fxml;
    exports com.example.collectionx;
    exports com.example.collectionx.controller;
    opens  com.example.collectionx.controller to javafx.fxml;
}