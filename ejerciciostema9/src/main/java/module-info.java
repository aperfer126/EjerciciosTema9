module com.apf {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;

    opens com.apf to javafx.fxml;
    exports com.apf;
}
