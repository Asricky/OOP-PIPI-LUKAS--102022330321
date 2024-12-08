import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    void handleLogin(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if ("lukas".equals(username) && "102022330321".equals(password)) {
            showAlert(Alert.AlertType.INFORMATION, "Login Success", "Welcome to the system!");

            try {
                
                FXMLLoader loader = new FXMLLoader(getClass().getResource("inventory.fxml"));
                AnchorPane root = loader.load();
                Scene inventoryScene = new Scene(root);

                
                Stage stage = (Stage) usernameField.getScene().getWindow();
                stage.setScene(inventoryScene);
                stage.setTitle("Zeppeli’s listening bar");
                stage.show();
            } catch (IOException e) {
                showAlert(Alert.AlertType.ERROR, "Error", "Failed to load inventory page.");
                e.printStackTrace();
            }

        } else {
            showAlert(Alert.AlertType.ERROR, "Login Failed", "Invalid username or password.");
        }
    }

    private void showAlert(Alert.AlertType alertType, String title, String content) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
