package cafepackage.cafe94_group2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * This is Customer screen Controller
 * @author Yingfan Zhang
 * @version 1
 */
public class CustomerScreenController {
    @FXML
    private Button makeBooking;
    @FXML
    private Button viewMenu;


    /**
     * To show the booking screen.
     * Takes user to new screen.
     * @param event Button click
     * @throws IOException Throws if input fails
     */
    public void bookingOnAction(ActionEvent event) throws IOException {
        Stage bookingScreen = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("CustomerBookingScreen.fxml"));
        bookingScreen.setTitle("Booking Interface");
        bookingScreen.setScene(new Scene(root, 730, 530));
        bookingScreen.setX(600);
        bookingScreen.setY(250);
        bookingScreen.initModality(Modality.APPLICATION_MODAL);
        bookingScreen.show();

    }

    /**
     * To show the menu screen.
     * Takes user to new screen.
     * @param event Button click
     * @throws IOException Throws if input fails
     */
    public void menuOnAction(ActionEvent event) throws IOException {
        Stage menuScreen = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("MenuScreen.fxml"));
        menuScreen.setTitle("Menu Interface");
        menuScreen.setScene(new Scene(root, 730, 530));
        menuScreen.setX(600);
        menuScreen.setY(250);
        menuScreen.initModality(Modality.APPLICATION_MODAL);
        menuScreen.show();

    }
}
