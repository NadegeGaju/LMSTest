package org.example.lms_project.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import org.example.lms_project.DAO.BookDAO;
import org.example.lms_project.Model.Book;

public class AddBookController implements Initializable {

    @FXML
    private TextField nameId;
    @FXML
    private TextField quantityId;
    @FXML
    private TextField authorId;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void addButon(ActionEvent event) {

        String name = nameId.getText();
        String quantity = quantityId.getText();
        String author = authorId.getText();

        if (name.isEmpty() || quantity.isEmpty() || author.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("Please enter full info");
            alert.showAndWait();

        } else {
            Book book = new Book(name, Integer.valueOf(quantityId.getText()), "", author);
            BookDAO bookContainer = new BookDAO();

            bookContainer.insertBook(book);

        }
    }

    @FXML
    private void cancelButton(ActionEvent event) {
        nameId.setText(null);
        quantityId.setText(null);
        authorId.setText(null);
    }

}

