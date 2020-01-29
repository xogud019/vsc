import java.util.ArrayList;
import javafx.appication.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class j99/*billboardImageTest2*/ extends Application{
    public static void main(String[] args){
        launch(args);
    }

    j98 req = new j98();
    RequestFromBillboardHot j = new RequestFromBillboardHot();
    
    @Override
    public void start(Stage primaryStage){
        String a = "https://www.billboard.com/charts/hot-100/";
        String rs = j.getTimeDate(a);
        System.out.println(rs+"------------------------Billboard Chart!!!");
        
        j.getAllHtml(a);
        String str = "<article class=\"chart-row";
        j.getBillboardData(str);
        ArrayList<Billboard> bills = j.getBillboard();
        req.getAllImagas(bills);

        VBox root = new VBox(10);
        int col =10;
        int row = bills.size()/col;
        
        for(int i=0; i<row; i++){
            HBox hbox = new HBox(10);
            hbox.setPadding(new Insets(5));
            hbox.setAlignment(Pos.CENTER);
            
            for(int j =0; i<col; j++){
                Billboard b = bills.get(i+col+j);
                ImageView imageView = new ImageView(req.loadImage(b.getImagesrc()));
                imageView.setFitWidth(50);
                imageView.setFitHeight(50);
                imageView.setOnMouseClicked(ee->{System.out.println(b.getImagesrc());});
                hbox.getChildren().add(imageView);
            }
            root.getChildren().add(hbox);
        }
        primaryStage.setScene(new Scene(root,60*col,70*row));
        primaryStage.setTitle("Billboard Image");
        primaryStage.show();
    }
    
}