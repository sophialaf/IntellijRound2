module com.example.intellijround2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.intellijround2 to javafx.fxml;
    exports com.example.intellijround2;
}