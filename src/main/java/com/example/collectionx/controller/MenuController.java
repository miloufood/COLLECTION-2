package com.example.collectionx.controller;

import com.example.collectionx.MenuApp;
import javafx.fxml.FXML;

public class MenuController {

    @FXML
    private MenuApp menuApp;

    public void setMainApp(MenuApp menuApp) {this.menuApp = menuApp;}

    @FXML
    private void ouvrirGestionObjet(){
        menuApp.showGestionArticle();
    }

    @FXML
    private void ouvrirGestionType(){
        menuApp.showGestionType();
    }

    @FXML
    private void ouvrirGestionCaracteristique(){
        menuApp.showGestionCaracteristique();
    }




}
