package com.ss.studysystem.controller;

import com.ss.studysystem.UI.components.modal_builder;
import com.ss.studysystem.UI.layouts.chat_where_is_this;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Parent;

public class login_error_message {

    @FXML
    private Button close;

    @FXML
    private Button ok;

    @FXML
    private Text error_message;

    @FXML
    void initialize(){
        ok.setOnAction(this::openLoginErrorMessage);
        close.setOnAction(this::close);
    }

    @FXML
    void openLoginErrorMessage(ActionEvent event){
       close(event);
    }

    @FXML
    void close(ActionEvent event){
        Stage stage = (Stage) close.getScene().getWindow();
        stage.close();
    }

    public void setErrorMessage(String message){
       Platform.runLater(()-> error_message.setText(message));
    }
}
