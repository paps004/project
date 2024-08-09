module com.example.javanuggets {
    requires javafx.controls;
    requires javafx.fxml;

    requires java.sql;
            
                            
    opens com.example.javanuggets to javafx.fxml;
    exports com.example.javanuggets;
}