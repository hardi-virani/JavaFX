module CollegeSubletApp {
    requires javafx.controls;
    requires javafx.fxml;

    opens controller to javafx.fxml;
    opens view to javafx.fxml;

    exports main;
}
