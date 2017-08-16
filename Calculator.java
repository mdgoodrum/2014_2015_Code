import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/**
 * This class constructs and displays a Calculator.
 * @author Michael Goodrum, Chris Waites
 * @version 1.1
 * @since 7-22-16
 */
public class Calculator extends Application {
    /**
     * Main method to run the application from the command line.
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    /**
     * Creates the stage for the GUI
     * @param primaryStage [Stage]
     */
    public void start(Stage primaryStage) {
        //Create, format, and show the primaryStage.
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);

        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text sceneTitle = new Text("Simple Calculator");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(sceneTitle, 0, 0);

        TextField userTextField = new TextField();
        grid.add(userTextField, 0, 1);


        Text actionTarget = new Text();
        grid.add(actionTarget, 0, 2);

        Button btn = new Button();
        btn.setText("Calculate!");
        grid.add(btn, 1, 1);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    double result = calcExpression(userTextField.getText());
                    actionTarget.setText(Double.toString(result));
                } catch (Exception exception) {
                    actionTarget.setFill(Color.RED);
                    actionTarget.setText("Illegal or complex input.");
                }
            }
        });

        btn.disableProperty().bind(userTextField.textProperty().isEmpty());

        Scene scene = new Scene(grid, 350, 300);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Simple Calculator");
        primaryStage.show();
    }
    /**
     * Does the calculating
     * @param  expression [User input]
     * @return            [result or error]
     * @throws Exception  [Incase input is inconsistent]
     */
    private double calcExpression(String expression) throws Exception {
        // We only need to check indices above zero since
        // no well-formed expressions have an operator at the
        // 0th index.
        // If there are multiple instances of an operator, we leave
        // Double.parseDouble() to throw the Exception.
        char operator = ' ';
        if (expression.indexOf('+') > 0) {
            operator = '+';
        } else if (expression.indexOf('-') > 0) {
            operator = '-';
        } else if (expression.indexOf('*') > 0) {
            operator = '*';
        } else if (expression.indexOf('/') > 0) {
            operator = '/';
        } else {
            throw new Exception("Calculated expression was invalid.");
        }
        // At this point, expression surely
        // has at least one occurence of either +, -, *, or /.
        String numOneString = expression.substring(
                                0, expression.indexOf(operator)).trim();
        double numOneParsed = Double.parseDouble(numOneString);
        String numTwoString = expression.substring(
                                expression.indexOf(operator) + 1).trim();
        double numTwoParsed = Double.parseDouble(numTwoString);
        // At this point, we surely have two well-defined
        // double values and only a single occurence of either +, -, *, /.
        // Otherwise, Double.parseDouble() would have thrown an Exception.
        if (operator == '+') {
            return numOneParsed + numTwoParsed;
        } else if (operator == '-') {
            return numOneParsed - numTwoParsed;
        } else if (operator == '*') {
            return numOneParsed * numTwoParsed;
        } else if (operator == '/') {
            return numOneParsed / numTwoParsed;
        } else {
            throw new Exception("Calculated expression was invalid.");
        }
    }
}
