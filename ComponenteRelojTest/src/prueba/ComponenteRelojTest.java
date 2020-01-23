package prueba;

import com.emma.Evento;
import com.emma.Reloj;
import com.emma.Tarea;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class ComponenteRelojTest extends Application {

    public static void main(String [] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        VBox vBox = new VBox();
        Reloj reloj = new Reloj();

        reloj.start();
        reloj.setFont(new Font(25));
        reloj.setFormato24h(false);
        reloj.addEvento(new Evento() {
           @Override
           public void ejecuta(Tarea tarea) {

           }
       });

        vBox.getChildren().add(reloj);
        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.show();


    }
}
