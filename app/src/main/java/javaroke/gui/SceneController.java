package javaroke.gui;


import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController {

  private Stage stage;
  private Scene scene;
  private Parent root;

  public void switchToScene1(ActionEvent event) throws IOException {
    root = FXMLLoader.load(getClass().getResource("/home.fxml"));
    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }

  public void switchToScene2(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/search.fxml"));
    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    // Apply the CSS stylesheet
    scene.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());
    stage.setScene(scene);
    stage.show();
  }

  public void switchToScene3(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("/play.fxml"));
    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    // Apply the CSS stylesheet
    scene.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());
    stage.setScene(scene);
    stage.show();
  }
}
