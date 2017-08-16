import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.beans.binding.Bindings;
/**
 * This class constructs and displays a Login screen.
 * @author Chris Waites
 * @version 1.0
 */
public class Login extends Application {
    /**
     * Main method to run the application from the command line.
     * @param args Command lind arguments.
     */
    public static void main(String[] args) {
        launch(args);
    }
    /**
     * Entry point for the application.
     * @param primaryStage The window to be formatted.
     */
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);

        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text sceneTitle = new Text("Welcome");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(sceneTitle, 0, 0);

        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);

        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);

        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);

        Text actionTarget = new Text();
        grid.add(actionTarget, 1, 6);

        Button btn = new Button();
        btn.setText("Sign in");
        grid.add(btn, 1, 4);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                if (userTextField.getText().equals("cwaites3")
                        && pwBox.getText().equals("ilove1331")) {
                    actionTarget.setFill(Color.GREEN);
                    actionTarget.setText("Welcome!");
                } else {
                    actionTarget.setFill(Color.RED);
                    actionTarget.setText("Invalid Login.");
                }
            }
        });

        btn.disableProperty().bind(
            Bindings.or(userTextField.textProperty().isEmpty(),
            pwBox.textProperty().isEmpty()));

        Scene scene = new Scene(grid, 300, 275);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Login Screen");
        primaryStage.show();
    }
}
