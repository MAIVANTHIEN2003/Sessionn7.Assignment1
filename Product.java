package Session7.Assignment;


import com.sun.deploy.util.FXLoader;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import Session7.Demo;

public final class Product {
    public String Name;
    public String Donvi;
    public Integer Gia;
    public Integer SoLuong;
    public Button edit;
    public Button delete;


    public Product(String Name, String Donvi, Integer Gia, Integer SoLuong) {
        this.Name = Name;
        this.Donvi = Donvi;
        this.Gia = Gia;
        this.SoLuong = SoLuong;
        this.edit = new Button("Edit");
        this.edit.setOnAction(event->{
            try {
//                FXLoader loader = new FXLoader().getClass().getResource("form.fxml");
//                Parent root = loader.load();
                Parent root = FXMLLoader.load(getClass().getResource("Demo.fxml"));
                Main.rootStage.setScene(new Scene(root,800,600));
            }catch(Exception e){

            }
        });
        this.delete = new Button("Delete");
        this.delete.setOnAction(event->{
            Main.productList.remove(this);
        });
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDonvi() {
        return Donvi;
    }

    public void setDonvi(String donvi) {
        Donvi = donvi;
    }

    public Integer getGia() {
        return Gia;
    }

    public void setGia(Integer gia) {
        Gia = gia;
    }

    public Integer getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(Integer soLuong) {
        SoLuong = soLuong;
    }

    public Button getEdit() {
        return edit;
    }

    public void setEdit(Button edit) {
        this.edit = edit;
    }

    public Button getDelete() {
        return delete;
    }

    public void setDelete(Button delete) {
        this.delete = delete;
    }

    public String toString(){
        String s = "\n-------------";
        s+= "\n"+getName();
        s+= "\n"+getDonvi();
        s+= "\n"+getGia();
        s+= "\n"+getSoLuong();
        return s;
    }
}
