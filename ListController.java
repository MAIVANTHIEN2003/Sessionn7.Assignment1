package Session7.Assignment;


import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class ListController implements Initializable {
    public TableView<Product> tbView;
    public TableColumn<Product,String> cName;
    public TableColumn<Product,String> cDonvi;
    public TableColumn<Product,Integer> cGia;
    public TableColumn<Product,Integer> cSoLuong;
    public TableColumn<Product, Button> cEdit;
    public TableColumn<Product, Button> cDelete;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cName.setCellValueFactory(new PropertyValueFactory<Product,String>("Name"));
        cDonvi.setCellValueFactory(new PropertyValueFactory<Product,String>("Donvi"));
        cGia.setCellValueFactory(new PropertyValueFactory<Product,Integer>("Gia"));
        cSoLuong.setCellValueFactory(new PropertyValueFactory<Product,Integer>("SoLuong"));
        cEdit.setCellValueFactory(new PropertyValueFactory<Product,Button>("edit"));
        cDelete.setCellValueFactory(new PropertyValueFactory<Product,Button>("Delete"));
        tbView.setItems(Main.productList);

    }
    public void formScreen() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Demo.fxml"));
        Main.rootStage.setScene(new Scene(root,800,600));
    }
}