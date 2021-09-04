package Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Locale;

public class LoginFormController {
    @FXML
    Label loginLabel, usernameLabel, passwordLabel, locationLabel;
    @FXML
    Button loginButton;

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

    public void onLoginButtonAction() {

    }
}
