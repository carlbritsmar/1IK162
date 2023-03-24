package labTwo;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;
public class Assignment5 extends Application{
    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Car");
        primaryStage.show();

        Group car = new Group();
        Scene scene = new Scene(car,320, 240);

        Rectangle mark = new Rectangle(0,500,800,100);
    }
    public static void main(String[] args) {
        Application.launch(args);
    }

}
