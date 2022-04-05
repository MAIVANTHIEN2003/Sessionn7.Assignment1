package Session7.Assignment;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static ObservableList<Product> productList = FXCollections.observableArrayList();

    public static Stage rootStage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        rootStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("list.fxml"));
        primaryStage.setTitle("T2108M");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        productList.add(new Product("bánh","tấn",12,13));
        productList.add(new Product("kẹo","kg",12,13));
        productList.add(new Product("xúc xích","tạ",12,13));
        launch(args);
    }
}
