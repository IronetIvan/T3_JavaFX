package sample;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    Button btnNormal;
    @FXML
    JFXButton btnMaterial;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        aciones();
    }

    private void aciones() {
       /* btnNormal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {*/
               /* btnNormal.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        System.out.println("boton pulsado");
                    }

        });*/
              /* btnMaterial.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
                   @Override
                   public void handle(MouseEvent event) {
                       System.out.println("se fue");
                   }
               });
                btnNormal.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        System.out.println("Raton encima");
                    }
                });
                btnNormal.addEventFilter(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        System.out.println("boton pulsado");
                    }
                });*/
              btnNormal.addEventHandler(ActionEvent.ACTION, new ManejadorBootnes());
              btnMaterial.addEventHandler(ActionEvent.ACTION, new ManejadorBootnes());

    }
    class ManejadorBootnes implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
    if(event.getSource() == btnNormal){
        System.out.println("Boton normal");
    }else if(event.getSource() == btnMaterial){
        System.out.println("Boton Material");
    }
        }
    }
}
