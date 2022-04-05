package Session7.Assignment;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class DemoController {
    public Text result;
    public Text errMsg;
    public TextField Name;
    public TextField Donvi;
    public TextField Gia;
    public TextField SoLuong;

    public Product product;

    public void setData(Product product){
        this.product = product;
    }
    public void submit(){
//        String s = "\n------------------";
//        s+= "\n"+fullName.getText();
//        s+= "\n"+email.getText();
//        s+= "\n"+age.getText();
//
        try{
            Product p = new Product(Name.getText(),
                    Donvi.getText(),Integer.parseInt(Gia.getText()),Integer.parseInt(SoLuong.getText()));
            result.setText(result.getText()+p.toString());
            Main.productList.add(p);

//            renderList();

            Parent root = FXMLLoader.load(getClass().getResource("list.fxml"));
            Main.rootStage.setScene(new Scene(root,800,600));
            errMsg.setVisible(false);
        }catch (Exception e){
            errMsg.setText(e.getMessage());
            errMsg.setVisible(true);
        }

    }

    private void renderList(){
        String txt = "Infomation\n";
        for (Product p: Main.productList){
            txt+= p.toString();
        }
        result.setText(txt);

        Name.setText("");
        Donvi.setText("");
        Gia.setText("");
        SoLuong.setText("");
    }
}
