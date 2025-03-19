module com.apf {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.apf to javafx.fxml;
    exports com.apf;
}
