module com.example.javafxcontroller {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.javafxcontroller to javafx.fxml;
    exports com.example.javafxcontroller;
}