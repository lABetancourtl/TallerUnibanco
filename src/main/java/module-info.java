module com.example.tallerunibanco_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.tallerunibanco_1 to javafx.fxml;
    exports co.edu.uniquindio.tallerunibanco_1;
    exports co.edu.uniquindio.tallerunibanco_1.controllers;
    opens co.edu.uniquindio.tallerunibanco_1.controllers to javafx.fxml;
}