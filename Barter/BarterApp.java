package com.fx.barter;

import com.fx.barter.Entities.Account;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class BarterApp extends Application {
    private ArrayList<Account> accounts;
    @Override
    public void start(Stage stage) throws IOException {
        accounts = new ArrayList<>();
        accounts.add(new Account("KDrake80", "Darn1", "Kevin", "Drake"));
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("barter.fxml")));
        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Barter");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public ArrayList<Account> getAccounts() {
        return this.accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
}