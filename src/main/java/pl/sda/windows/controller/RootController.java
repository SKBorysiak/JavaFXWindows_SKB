package pl.sda.windows.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import pl.sda.windows.App;

import java.awt.*;

public class RootController {
    @FXML
    private Button button1;

    @FXML
    private Button button2;

    private App app;

    public void setApp(App app) {
        this.app = app;
    }

    public void openWindow2(ActionEvent actionEvent) {

        this.app.loadTwoView();

    }

    public void openWindow1(ActionEvent actionEvent) {
        this.app.loadOneView();

    }
}

