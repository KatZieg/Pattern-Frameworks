package raumschiffrennen;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MainApp extends Application {

    private Stage primaryStage;
    private Pane rootLayout;
    
    @FXML Rectangle blueSpaceShuttle;
	public void moveBlueSpaceShuttle() {
		blueSpaceShuttle.setX(blueSpaceShuttle.getX()+4);
	}
    

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Raumschiffrennen");
        
        blueSpaceShuttle.setOnMouseEntered(e -> moveBlueSpaceShuttle()) ;
        
        initRootLayout();
    }

    /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
    	
    	 
         
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("RootLayout.fxml"));
            rootLayout = (Pane) loader.load();          
            
//            RaumschiffrennenController controller = new RaumschiffrennenController();

        	
       
            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}