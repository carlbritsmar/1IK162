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
        Group car = new Group();
        Scene scene = new Scene(car,320, 240);
        primaryStage.show();
        primaryStage.setScene(scene);

        Rectangle carRoof = new Rectangle(60, 60, 100, 100);
        carRoof.setTranslateY(-50);
        carRoof.setFill(Color.RED);

        Rectangle carBody = new Rectangle(10, 60, 200, 50);
        carBody.setFill(Color.RED);


        Circle frontWheel = new Circle(50, 115, 25);
        frontWheel.setFill(Color.BLACK);
        Circle rearWheel = new Circle(160, 115, 25);
        rearWheel.setFill(Color.BLACK);

        //places the car in the middle
        car.setTranslateX(50);
        car.setTranslateY(60);

        //place children object in group
        car.getChildren().add(carRoof);
        car.getChildren().add(carBody);
        car.getChildren().add(frontWheel);
        car.getChildren().add(rearWheel);
    }
    public static void main(String[] args) {
        Application.launch(args);
    }

}
