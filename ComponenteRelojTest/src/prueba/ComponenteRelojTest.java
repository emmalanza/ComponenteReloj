package prueba;

import com.emma.Evento;
import com.emma.Reloj;
import com.emma.Tarea;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Date;


public class ComponenteRelojTest extends Application {

    public static void main(String [] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        VBox vBox = new VBox();
        Reloj reloj = new Reloj();

        Date d = new Date();

        reloj.start();
        reloj.setFont(new Font(25));
        reloj.setFormato24h(false);
        Tarea tarea = new Tarea(d,17,41,0, "Hola");
        reloj.registraTarea(tarea);
        reloj.registraTarea(new Tarea(d, 17,30,0, "Adiós"));
        reloj.borraTarea(tarea);
        reloj.addEvento(new Evento() {
           @Override
           public void ejecuta(Tarea tarea) {

               System.out.println(tarea.getDescripcion());

           }
       });






        vBox.getChildren().add(reloj);
        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.show();


    }
}
