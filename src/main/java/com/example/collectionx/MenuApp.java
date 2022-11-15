package com.example.collectionx;

import com.example.collectionx.controller.*;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuApp extends Application {
    private Stage dialogStage;

    private BorderPane menuLayout;
    private Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }
    public Stage getPrimaryStage() {
        return primaryStage;
    }


    @Override
    public void start(Stage primaryStage) {
       /*
       this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Gestion Objet");
        showGestionArticle();
        */
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Menu General");
        try {
            FXMLLoader myFXMLloader = new FXMLLoader(MenuApp.class.getResource("MenuGeneral.fxml"));
            menuLayout = myFXMLloader.load();
            Scene scene = new Scene(menuLayout);
            primaryStage.setScene(scene);
            MenuController menuController = myFXMLloader.getController();
            menuController.setMainApp(this);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    public void showGestionArticle() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MenuApp.class.getResource("GestionObjet.fxml"));
            GridPane layout = loader.load();
            menuLayout.setCenter(layout);
            GestionObjetController controller = loader.getController();
            controller.setMenuApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    public void showGestionType(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MenuApp.class.getResource("GestionType.fxml"));
            GridPane layout = loader.load();
            menuLayout.setCenter(layout);
            GestionTypeController controller = loader.getController();
            controller.setMenuApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    @FXML
    public void showGestionCaracteristique(){
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MenuApp.class.getResource("GestionCaracteristique.fxml"));
            GridPane layout = loader.load();
            menuLayout.setCenter(layout);
            GestionCaracteristiqueController controller = loader.getController();
            controller.setMenuApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    /*
    public void ajouterModifierArticle(Produit articleSelected, String titre) {

        try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MenuApp.class.getResource("FormulaireObjet.fxml"));
            AnchorPane ajouterModifierOverview = (AnchorPane) loader.load();

            dialogStage = new Stage();
            dialogStage.setTitle(titre);

            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);

            Scene scene = new Scene(ajouterModifierOverview);

            dialogStage.setScene(scene);

            AjouterModifierProduitController ajouterModifierController = loader.getController();
            ajouterModifierController.setArticle(articleSelected);
            ajouterModifierController.setMenuApp(this);


           ajouterModifierController.setDialogStage(dialogStage);

            dialogStage.setScene(scene);
            dialogStage.showAndWait();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    */

    /*
    public void ajouterModifierCaracteristiqueType(Type typeselected){
        try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MenuApp.class.getResource("ListSelectionCaracteristique.fxml"));
            AnchorPane ajouterModifierOverview = (AnchorPane) loader.load();

            dialogStage = new Stage();
            //dialogStage.setTitle(titre);

            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);

            Scene scene = new Scene(ajouterModifierOverview);

            dialogStage.setScene(scene);

            ListSelectionCaracteristiqueController ajouterModifierController = loader.getController();
            ajouterModifierController.setType(typeselected);
            ajouterModifierController.setMenuApp(this);
            ajouterModifierController.loadComposant();



            ajouterModifierController.setDialogStage(dialogStage);


            dialogStage.setScene(scene);
            dialogStage.showAndWait();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    */

    /*
    public void ajouterModifierType(Type typeselected, String titre) {

        try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MenuApp.class.getResource("FormulaireType.fxml"));
            AnchorPane ajouterModifierOverview = (AnchorPane) loader.load();

            dialogStage = new Stage();
            dialogStage.setTitle(titre);

            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);

            Scene scene = new Scene(ajouterModifierOverview);

            dialogStage.setScene(scene);

            AjouterModifierTypeController ajouterModifierController = loader.getController();
            ajouterModifierController.setType(typeselected);
            ajouterModifierController.setMenuApp(this);
            ajouterModifierController.remplir();



            ajouterModifierController.setDialogStage(dialogStage);


            dialogStage.setScene(scene);
            dialogStage.showAndWait();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    */

    /*
    public void ajouterModifierCaracteristique(Caracteristique caracteristiqueselected, String titre) {

        try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MenuApp.class.getResource("FormulaireCaracteristique.fxml"));
            AnchorPane ajouterModifierOverview = (AnchorPane) loader.load();

            dialogStage = new Stage();
            dialogStage.setTitle(titre);

            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);

            Scene scene = new Scene(ajouterModifierOverview);

            dialogStage.setScene(scene);

            AjouterModifierCaracteristiqueController ajouterModifierController = loader.getController();
            ajouterModifierController.setCaracteristique(caracteristiqueselected);
            System.out.println(caracteristiqueselected);
            ajouterModifierController.setMenuApp(this);
            ajouterModifierController.remplir();



            ajouterModifierController.setDialogStage(dialogStage);

            dialogStage.setScene(scene);
            dialogStage.showAndWait();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    */

}

