package co.edu.uniquindio.tallerunibanco_1.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> columDireccion;

    @FXML
    private TextField txApellidos;

    @FXML
    private TableColumn<?, ?> columApellidos;

    @FXML
    private TableColumn<?, ?> columNCuenta;

    @FXML
    private TableColumn<?, ?> columTipoCuenta;

    @FXML
    private TextField txNDocumento;

    @FXML
    private TableColumn<?, ?> columTipoDocumento;

    @FXML
    private TextField txNombres;

    @FXML
    private Button btActualizar;

    @FXML
    private Button btGuardar;

    @FXML
    private TableColumn<?, ?> columEmail;

    @FXML
    private TextField txEmail;

    @FXML
    private TableColumn<?, ?> columNombres;

    @FXML
    private ComboBox<?> cbTipoDocumento;

    @FXML
    private TableView<?> tableClientes;

    @FXML
    private Button btNuevo;

    @FXML
    private TextField txDireccion;

    @FXML
    private TableColumn<?, ?> columNDocumento;

    @FXML
    private TextField txNCuenta;

    @FXML
    private Button btEliminar;

    @FXML
    void nuevoClienteAction(ActionEvent event) {

    }

    @FXML
    void guardarClienteAction(ActionEvent event) {

    }

    @FXML
    void actualizarClienteAction(ActionEvent event) {

    }

    @FXML
    void eliminarClienteAction(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }
}
