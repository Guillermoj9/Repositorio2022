module org.jaroso.javafx_archetype_fxml {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.jaroso.javafx_archetype_fxml to javafx.fxml;
    exports org.jaroso.javafx_archetype_fxml;
}
