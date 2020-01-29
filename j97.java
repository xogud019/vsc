import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TalbeView;
import javafx.scene.web.WebView;

public class j97 /*BillboardfxController*/{
    @FXML
    private TableVeiw<Billboard> billboardTable;
    
    @FXML
    private TableColumn<Billboard,String> song;

    @FXML
    private TableColumn<Billboard,String> artist;
    
    @FXML
    private TableColumn<Billboard,Integer> lastWeek;
    
    @FXML
    private TableColumn<Billboard,Integer> rank;
    
    @FXML
    private TableColumn<Billboard,String> imagesrc;
    
    @FXML
    private WebView billwebview;

    @FXML
    private Button btnAf;

    @FXML
    private Button btnBf;

    @FXML
    private Label lbbill;

    @FXML
    void onClickBtnBf(ActionEvent event){}

    @FXML
    void onClickBtnAf(ActionEvent event){}

}