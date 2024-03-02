module com.example.javafxnotes {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.javafxnotes to javafx.fxml;
    exports com.example.javafxnotes;
}