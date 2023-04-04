module com.example.demo3_lat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo3_lat to javafx.fxml;
    exports com.example.demo3_lat;
}