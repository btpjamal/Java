module org.example.estruturasdedados {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens org.example.estruturasdedados to javafx.fxml;
    exports org.example.estruturasdedados;
}