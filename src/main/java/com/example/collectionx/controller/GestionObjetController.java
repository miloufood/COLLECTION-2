package com.example.collectionx.controller;

//import com.example.collection.DAO.InteractionBDD;


import com.example.collectionx.MenuApp;
import com.example.collectionx.dao.DAOfactory;
import com.example.collectionx.metier.Produit;
import com.example.collectionx.metier.Type;
import com.example.collectionx.service.ServiceProduit;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;

public class GestionObjetController {


    @FXML
    private GridPane detailsShow;

    ////label valeur ////
    @FXML
    private Label labelRepId;

    @FXML
    private Label labelRepDescription;

    @FXML
    private Label labelRepType;

    @FXML
    private Label labelRepCar1;

    @FXML
    private Label labelRepCar2;

    @FXML
    private Label labelRepCar3;

    @FXML
    private Label labelRepCar4;

    @FXML
    private Label labelRepCar5;

    @FXML
    private Label labelRepCar6;

    @FXML
    private Label labelRepCar7;

    @FXML
    private Label labelRepCar8;

    @FXML
    private Label labelRepCar9;

    @FXML
    private Label labelRepCar10;

    /// label nom ////
    @FXML
    private Label labelId;

    @FXML
    private Label labelDescription;

    @FXML
    private Label labelType;

    @FXML
    private Label labelCar1;

    @FXML
    private Label labelCar2;

    @FXML
    private Label labelCar3;

    @FXML
    private Label labelCar4;

    @FXML
    private Label labelCar5;

    @FXML
    private Label labelCar6;

    @FXML
    private Label labelCar7;

    @FXML
    private Label labelCar8;

    @FXML
    private Label labelCar9;

    @FXML
    private Label labelCar10;

    //// table /////

    @FXML
    private TableView<Produit> articleTable;

    @FXML
    private TableColumn<Produit, String> typeColumn;

    @FXML
    private TableColumn<Produit, String> descriptionColumn;

    @FXML
    private TableColumn<Produit, Integer> idColumn;


    @FXML
    private ServiceProduit serviceProduit;

    private MenuApp menuApp;

    public void setMenuApp(MenuApp menuApp) {
        this.menuApp = menuApp;
    }

    public void detailDisable(boolean bool) {
        detailsShow.setVisible(bool);
    }

    @FXML
    private void initialize() {

        ///affichage dans la table///
        ArrayList<Produit> listeProduits2 = new ArrayList<>();
        listeProduits2 = DAOfactory.getProduitDAO().getAll();


        articleTable.setItems(FXCollections.observableArrayList(listeProduits2));

        idColumn.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
        descriptionColumn.setCellValueFactory(cellData -> cellData.getValue().descriptionProperty());
        typeColumn.setCellValueFactory(cellData -> cellData.getValue().getType().libelleProperty());

        ///affichage du details///
        articleTable.getSelectionModel().selectedItemProperty()
                .addListener((observableValue, oldValue, newValue) -> afficherDetails(newValue));

//        detailDisable(false);


    }


    private void afficherDetails(Produit produit) {
        clear();

        labelRepId.setText(String.valueOf(produit.getId_produit()));
        labelRepDescription.setText(produit.getDescription());
        labelRepType.setText(produit.getType().getLibelle());
        labelCar1.setText(produit.getListproduitCaracteristiques().get(0).toString());
        labelRepCar1.setText(produit.getListproduitCaracteristiques().get(1).toString());
        labelCar2.setText(produit.getListproduitCaracteristiques().get(2).toString());
        labelRepCar2.setText(produit.getListproduitCaracteristiques().get(3).toString());
        labelCar3.setText(produit.getListproduitCaracteristiques().get(4).toString());
        labelRepCar3.setText(produit.getListproduitCaracteristiques().get(5).toString());
        labelCar4.setText(produit.getListproduitCaracteristiques().get(6).toString());
        labelRepCar4.setText(produit.getListproduitCaracteristiques().get(7).toString());
        labelCar5.setText(produit.getListproduitCaracteristiques().get(8).toString());
        labelRepCar5.setText(produit.getListproduitCaracteristiques().get(9).toString());
        labelCar6.setText(produit.getListproduitCaracteristiques().get(10).toString());
        labelRepCar6.setText(produit.getListproduitCaracteristiques().get(11).toString());
        if (produit.getListproduitCaracteristiques().size() > 13) {
            labelCar7.setText(produit.getListproduitCaracteristiques().get(12).toString());
            labelRepCar7.setText(produit.getListproduitCaracteristiques().get(13).toString());
        }
        if (produit.getListproduitCaracteristiques().size() > 15) {
            labelCar8.setText(produit.getListproduitCaracteristiques().get(14).toString());
            labelRepCar8.setText(produit.getListproduitCaracteristiques().get(15).toString());
        }
        if (produit.getListproduitCaracteristiques().size() > 17) {
            labelCar9.setText(produit.getListproduitCaracteristiques().get(16).toString());
            labelRepCar9.setText(produit.getListproduitCaracteristiques().get(17).toString());
        }
        if (produit.getListproduitCaracteristiques().size() > 19) {
            labelCar10.setText(produit.getListproduitCaracteristiques().get(18).toString());
            labelRepCar10.setText(produit.getListproduitCaracteristiques().get(19).toString());
        }
        detailDisable(true);


    }

    public void clear(){

        labelCar1.setText("");
        labelRepCar1.setText("");
        labelCar2.setText("");
        labelRepCar2.setText("");
        labelCar3.setText("");
        labelRepCar3.setText("");
        labelCar4.setText("");
        labelRepCar4.setText("");
        labelCar5.setText("");
        labelRepCar5.setText("");
        labelCar6.setText("");
        labelRepCar6.setText("");
        labelCar7.setText("");
        labelRepCar7.setText("");
        labelCar8.setText("");
        labelRepCar8.setText("");
        labelCar9.setText("");
        labelRepCar9.setText("");
        labelCar10.setText("");
        labelRepCar10.setText("");

    }


}