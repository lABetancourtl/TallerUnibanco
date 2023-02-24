package co.edu.uniquindio.tallerunibanco_1.controllers;

import co.edu.uniquindio.tallerunibanco_1.modelo.Cliente;
import co.edu.uniquindio.tallerunibanco_1.utils.TextFormatterUtil;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.List;
import java.util.Optional;

import static co.edu.uniquindio.tallerunibanco_1.controllers.AppController.INSTANCE;

public class HelloController {



    @FXML
    private TableColumn<Cliente, String> columDireccion;

    @FXML
    private TextField txApellidos;

    @FXML
    private TableColumn<Cliente, String> columApellidos;


    @FXML
    private TextField txNDocumento;


    @FXML
    private TextField txNombres;

    @FXML
    private TableColumn<Cliente, String> columEmail;

    @FXML
    private TextField txEmail;

    @FXML
    private TableColumn<Cliente, String> columNombres;


    @FXML
    private TableView<Cliente> tableClientes;

    @FXML
    private Button btBuscar;

    @FXML
    private TextField txDireccion;

    @FXML
    private TableColumn<Cliente, String> columNDocumento;


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
                .addListener((observable, oldValue, newValue) -> mostrarInfomacion(newValue));
        txNombres.setTextFormatter(new TextFormatter<>(TextFormatterUtil::upperCaseFormat));
        txApellidos.setTextFormatter(new TextFormatter<>(TextFormatterUtil::upperCaseFormat));
        txNDocumento.setTextFormatter(new TextFormatter<>(TextFormatterUtil::integerFormat));
        txDireccion.setTextFormatter(new TextFormatter<>(TextFormatterUtil::upperCaseFormat));
        txEmail.setTextFormatter(new TextFormatter<>(TextFormatterUtil::upperCaseFormat));
    }

    public void guardarClienteAction(ActionEvent event) {
        try {
            Cliente cliente = Cliente.of(txNombres.getText(), txApellidos.getText(),txNDocumento.getText(), txDireccion.getText(),
                    txEmail.getText());
            INSTANCE.getBanco().adicionarPersona(cliente);
            llenarTabla(INSTANCE.getBanco().buscar(null,null,null,null,null));
            limpiarCampos();
            mostrarInformacion("La persona fue aceptada en el Banco");
        } catch (Exception e) {
            mostrarMensaje(e.getMessage());
        }
    }
    public void cancelarSeleccionAction() {
        limpiarCampos();
        tableClientes.getSelectionModel().clearSelection();
    }

    public void eliminarClienteAction() {
        if (mostrarMensajeConfirmacion("¿Esta seguro de eliminar el cliente") == true){
            try {
                INSTANCE.getBanco().removerPersona(txNDocumento.getText());
                llenarTabla(INSTANCE.getBanco().buscar(null,null,null,null,null));
                limpiarCampos();
                mostrarInformacion("La persona fue retirada del banco");
            } catch (Exception e) {
                mostrarMensaje(e.getMessage());
            }
        } else {
            mostrarMensaje("Debe seleccionar un cliente");
        }

    }

    private boolean mostrarMensajeConfirmacion(String mensaje) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setTitle("Confirmacion");
        alert.setContentText(mensaje);
        Optional<ButtonType> action = alert.showAndWait();

        if (action.get() == ButtonType.OK) {
            return  true;
        } else {
            return false;
        }

    }

    @FXML
    void actualizarClienteAction(ActionEvent event) {



    }
    public void buscarClienteAction() {
        llenarTabla(
                INSTANCE.getBanco().buscar(txNombres.getText(), txApellidos.getText(), txNDocumento.getText(), txDireccion.getText(),txEmail.getText())
        );

    }
    private void mostrarInfomacion(Cliente cliente) {
        if (cliente != null) {
            txNombres.setText(cliente.getNombre());
            txApellidos.setText(cliente.getApellido());
            txNDocumento.setText(cliente.getCedula());
            txDireccion.setText(cliente.getDireccion());
            txEmail.setText(cliente.getEmail());
        }
    }

    private void limpiarCampos() {
        txApellidos.setText("");
        txNombres.setText("");
        txEmail.setText("");
        txDireccion.setText("");
        txNDocumento.setText("");
    }

    private void llenarTabla(List<Cliente> listaClientes) {
        tableClientes.setItems(FXCollections.observableArrayList(listaClientes));
        tableClientes.refresh();
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
    }


