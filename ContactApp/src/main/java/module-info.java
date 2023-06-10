module com.example.contactApp {

    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.xml;
    
    opens com.example.contactApp to javafx.fxml;
    exports com.example.contactApp;
}