package co.edu.uniquindio.tallerunibanco_1.controllers;

import co.edu.uniquindio.tallerunibanco_1.HelloApplication;
import co.edu.uniquindio.tallerunibanco_1.modelo.Cliente;
import co.edu.uniquindio.tallerunibanco_1.utils.TextFormatterUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import static co.edu.uniquindio.tallerunibanco_1.controllers.AppController.INSTANCE;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Cliente, String> columDireccion;

    @FXML
    private TextField txApellidos;

    @FXML
    private TableColumn<Cliente, String> columApellidos;

    @FXML
    private TableColumn<Cliente, String> columNCuenta;

    @FXML
    private TableColumn<Cliente, String> columTipoCuenta;

    @FXML
    private TextField txNDocumento;

    @FXML
    private TableColumn<Cliente, String> columTipoDocumento;

    @FXML
    private TextField txNombres;

    @FXML
    private Button btActualizar;

    @FXML
    private Button btCancelar;
    @FXML
    private Button btGuardar;

    @FXML
    private TableColumn<Cliente, String> columEmail;

    @FXML
    private TextField txEmail;

    @FXML
    private TableColumn<Cliente, String> columNombres;

    @FXML
    private ComboBox<?> cbTipoDocumento;

    @FXML
    private TableView<Cliente> tableClientes;

    @FXML
    private Button btNuevo;

    @FXML
    private TextField txDireccion;

    @FXML
    private TableColumn<Cliente, String> columNDocumento;

    @FXML
    private TextField txNCuenta;

    @FXML
    private Button btEliminar;


    @FXML
    void initialize() {
        llenarTabla(INSTANCE.getBanco().buscar(null,null,null,null,null));
        columNombres.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        columApellidos.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        columNDocumento.setCellValueFactory(new PropertyValueFactory<>("cedula"));
        columDireccion.setCellValueFactory(new PropertyValueFactory<>("direccion"));
        columEmail.setCellValueFactory(new PropertyValueFactory<>("email"));

        tableClientes.getSelectionModel().selectedItemProperty()
                .addListener((observable, oldValue, newValue) -> llenarCampos(newValue));
        txNombres.setTextFormatter(new TextFormatter<>(TextFormatterUtil::upperCaseFormat));
        txApellidos.setTextFormatter(new TextFormatter<>(TextFormatterUtil::upperCaseFormat));
        txNDocumento.setTextFormatter(new TextFormatter<>(TextFormatterUtil::integerFormat));
        txDireccion.setTextFormatter(new TextFormatter<>(TextFormatterUtil::upperCaseFormat));
        txEmail.setTextFormatter(new TextFormatter<>(TextFormatterUtil::upperCaseFormat));
    }

    private void mostrarMensaje(String mensaje) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Error");
            alert.setContentText(mensaje);
            alert.showAndWait();
        }

    private void mostrarInformacion(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Información");
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    private void limpiarCampos() {
        txApellidos.setText("");
        txNombres.setText("");
        txEmail.setText("");
        txDireccion.setText("");
        txNDocumento.setText("");
    }

    private void llenarCampos(Cliente ListaClientes) {
        if (ListaClientes != null) {
            txNombres.setText(ListaClientes.getNombre());
            txApellidos.setText(ListaClientes.getApellido());
            txNDocumento.setText(ListaClientes.getCedula());
            txDireccion.setText(ListaClientes.getDireccion());
            txEmail.setText(ListaClientes.getEmail());
        }
    }

    private void llenarTabla(List<Cliente> ListaClientes) {
        tableClientes.setItems(FXCollections.observableArrayList(ListaClientes));
        tableClientes.refresh();
    }
    @FXML
    void nuevoClienteAction(ActionEvent event) {

    }

    @FXML
    void guardarClienteAction(ActionEvent event) {
        try {
            Cliente cliente = Cliente.of(txNDocumento.getText(), txNombres.getText(), txApellidos.getText(), txDireccion.getText(),
                    txEmail.getText());
            INSTANCE.getBanco().adicionarPersona(cliente);
            llenarTabla(INSTANCE.getBanco().buscar(null,null,null,null,null));
            limpiarCampos();
            mostrarInformacion("La persona fue aceptada en el Banco");
        } catch (Exception e) {
            mostrarMensaje(e.getMessage());
        }
    }
    @FXML
    void cancelarSeleccionAction(ActionEvent event) {
        limpiarCampos();
        tableClientes.getSelectionModel().clearSelection();
    }
    @FXML
    void actualizarClienteAction(ActionEvent event) {

    }

    @FXML
    void eliminarClienteAction(ActionEvent event) {
        try {
            INSTANCE.getBanco().removerPersona(txNDocumento.getText());
            llenarTabla(INSTANCE.getBanco().buscar(null,null,null,null,null));
            limpiarCampos();
            mostrarInformacion("La persona fue retirada del banco");
        } catch (Exception e) {
            mostrarMensaje(e.getMessage());
        }
    }
    }


