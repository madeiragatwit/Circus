import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import java.io.File;

/**
 * Write a description of JavaFX class Menu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Menu extends Application
{
    private Label createLabel = new Label("");
    private Label deleteLabel = new Label("");
    private Label sortLetterL = new Label("");
    private Label sortIDL = new Label("");
    @Override
    public void start(Stage stage) throws Exception
    {
        //FOR MENU --------------------------------------------------
        //Button Constructors
        Button createC = new Button("Create Category");
        createC.setStyle("-fx-background-color: YELLOW;");
        
        Button deleteC = new Button("Delete Category");
        deleteC.setStyle("-fx-background-color: YELLOW;");
        
        Button sortLetter = new Button("Sort List Alphabetically");
        sortLetter.setStyle("-fx-background-color: YELLOW;");
        
        Button sortID = new Button("Sort List by ID");
        sortID.setStyle("-fx-background-color: YELLOW");
        
        Button quit = new Button("Quit");
        quit.setStyle("-fx-background-color: YELLOW;");

        //Setting Button Actions
        createC.setOnAction(this::handleCreate);
        deleteC.setOnAction(this::handleDelete);
        sortLetter.setOnAction(this::handleSortL);
        sortID.setOnAction(this::handleSortID);
        quit.setOnAction(this::handleQuit);

        // Create a new grid pane
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setMinSize(600, 300);
        pane.setVgap(10);
        pane.setHgap(10);

        //Pane editor
        pane.add(createLabel, 1, 6);
        pane.add(createC, 0, 6);
        pane.add(deleteLabel, 1, 7);
        pane.add(deleteC, 0, 7);
        pane.add(sortLetterL, 1, 0);
        pane.add(sortLetter, 0, 0);
        pane.add(sortIDL, 1, 1);
        pane.add(sortID, 0, 1);
        pane.add(quit, 0, 8);

        // Scene creator
        Scene scene = new Scene(pane, 500,700);
        stage.setTitle("Circus");
        stage.setScene(scene);

        // Show stage
        stage.show();
        //FOR MENU --------------------------------------------------
    }

    public void handleCreate(ActionEvent event){
        createLabel.setText("Category created!");
    }

    public void handleDelete(ActionEvent event){
        deleteLabel.setText("Category deleted!");
    }

    public void handleSortL(ActionEvent event){
        sortLetterL.setText("List sorted alphabetically!");
    }
    
    public void handleSortID(ActionEvent event){
        sortIDL.setText("List sorted by ID!");
    }

    public void handleQuit(ActionEvent event){
        System.exit(0);
    }
}
