package prueba;

import com.emma.Reloj;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Label;

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

        vBox.getChildren().add(reloj);
        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.show();


    }
}
