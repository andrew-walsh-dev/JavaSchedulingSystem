package Controllers;

import Models.User;
import Models.UserDao;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Locale;

/**
 * @author Andrew Walsh
 */
public class LoginFormController {
    @FXML
    Label loginLabel, usernameLabel, passwordLabel, locationLabel;
    @FXML
    Button loginButton;

    /**
     * function to run when login form is loaded
     */
    public void initialize() {
        Locale currentLocale = Locale.getDefault();
        if (currentLocale.getLanguage().equals("fr")) {
            locationLabel.setText("Emplacement: " + currentLocale.getDisplayCountry());
            loginLabel.setText("Connexion");
            usernameLabel.setText("Nom d'utilisateur");
            passwordLabel.setText("le mot de passe");
            loginButton.setText("Connexion");
        }
        else {
            locationLabel.setText("Location: " + currentLocale.getDisplayCountry());
        }
    }

    /**
     * function to run when login button is clicked
     */
    public void onLoginButtonAction() throws SQLException, IOException {
        UserDao dao = new UserDao();
        User user = dao.getUserByUsername(usernameLabel.getText());

        //successful login
        if (passwordLabel.getText().equals(user.getPassword())) {
            Stage stage = (Stage) loginButton.getScene().getWindow();
            Parent parent = FXMLLoader.load(getClass().getResource("../FXML/main.fxml"));
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.show();
        }
        //failed login
        else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Login Error");
            alert.setContentText("Invalid login attempt.");

            alert.showAndWait();
        }
    }
}
