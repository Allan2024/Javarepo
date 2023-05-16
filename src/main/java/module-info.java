module com.example.javatraining {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javatraining to javafx.fxml;
    exports com.example.javatraining;
}