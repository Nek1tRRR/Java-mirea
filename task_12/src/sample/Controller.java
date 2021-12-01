package sample;
import java.lang.Integer;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller 
{
    private int res=0,val2=0,prev=0,k=0;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button but1;

    @FXML
    private Button but2;

    @FXML
    private Button but3;

    @FXML
    private Button but4;

    @FXML
    private Button but5;

    @FXML
    private TextField input;

    @FXML
    private TextField output;

    @FXML
    void initialize() {
       but1.setOnAction(event -> 
       {
           if (k!=0) {k=0;calc();}
           k++;
           if (prev == 0) res = Integer.parseInt(input.getText());
           else val2 = Integer.parseInt(input.getText());
           input.setText("");
           prev = 1;

        });
        but2.setOnAction(event -> 
        {
            if (k!=0) {k=0;calc();}
            k++;
            if (prev == 0) res = Integer.parseInt(input.getText());
            else val2 = Integer.parseInt(input.getText());
            input.setText("");
            prev = 2;

        });
        but3.setOnAction(event -> 
        {
            if (k!=0) {k=0;calc();}
            k++;
            if (prev == 0) res = Integer.parseInt(input.getText());
            else val2 = Integer.parseInt(input.getText());
            input.setText("");
            prev = 3;

        });
        but4.setOnAction(event -> 
        {
            if (k!=0) {k=0;calc();}
            k++;
            if (prev == 0) res = Integer.parseInt(input.getText());
            else val2 = Integer.parseInt(input.getText());
            input.setText("");
            prev = 4;
        });
        but5.setOnAction(event -> 
        {
            calc();
            output.setText(Integer.toString(res));
            prev=0;
            input.setText("");
        });
    }
    public void calc() {
            switch(prev) {
                case 1:{res+=Integer.parseInt(input.getText());;break;}
                case 2:{res-=Integer.parseInt(input.getText());;break;}
                case 3:{res*=Integer.parseInt(input.getText());;break;}
                case 4:{res/=Integer.parseInt(input.getText());;break;}
            }
    }
}
