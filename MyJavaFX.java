import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application
{
 //@Override//
 public void start( Stage primaryStage )
 {
  Scene scene = new Scene(new Button(" OK ") , 500 , 500);
  primaryStage.setTitle(" MyJavaFX ");
  primaryStage.setScene( scene );
  primaryStage.show();

/*
  Stage stage = new Stage();
  stage.setTitle(" Second Stage ");
  stage.setScene(new Scene(new Button(" New Stage "), 500 , 500));
  stage.setResizable( false );
  stage.show();
*/

 }
}

/*
public static void main(String[] args)
{
 Application.launch(args);
}
*/