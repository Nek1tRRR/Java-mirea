package sample;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller 
{
    private int[][] space={{2,2,2,2},{2,2,2,2},{2,2,2,2},{2,2,2,2}};
    private int stat=1;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button b11;

    @FXML
    private Button b12;

    @FXML
    private Button b13;

    @FXML
    private Button b14;

    @FXML
    private Button b21;

    @FXML
    private Button b22;

    @FXML
    private Button b23;

    @FXML
    private Button b24;

    @FXML
    private Button b31;

    @FXML
    private Button b32;

    @FXML
    private Button b33;

    @FXML
    private Button b34;

    @FXML
    private Button b41;

    @FXML
    private Button b42;

    @FXML
    private Button b43;

    @FXML
    private Button b44;

    @FXML
    private Label status;

    @FXML
    private Label wpannel;

    @FXML
    void initialize() {
       b11.setOnAction(event -> {
           if (space[0][0]!=1 && space[0][0]!=0) {
           if (stat==1) {space[0][0]=1;stat=0;b11.setText("X");status.setText("0");} else if (stat==0) {space[0][0]=0;stat=1;b11.setText("0");status.setText("X");}
           checkwin(); }
       });
        b12.setOnAction(actionEvent -> {
            if (space[0][1]!=1 && space[0][1]!=0) {
            if (stat==1) {space[0][1]=1;stat=0;b12.setText("X");status.setText("0");} else if (stat==0) {space[0][1]=0;stat=1;b12.setText("0");status.setText("X");}
            checkwin();
            }
        });
        b13.setOnAction(actionEvent -> {
            if (space[0][2]!=1 && space[0][2]!=0) {
            if (stat==1) {space[0][2]=1;stat=0;b13.setText("X");status.setText("0");} else if (stat==0) {space[0][2]=0;stat=1;b13.setText("0");status.setText("X");}
            checkwin();
            }
        });
        b14.setOnAction(actionEvent -> {
            if (space[0][3]!=1 && space[0][3]!=0) {
            if (stat==1) {space[0][3]=1;stat=0;b14.setText("X");status.setText("0");} else if (stat==0) {space[0][3]=0;stat=1;b14.setText("0");status.setText("X");}
            checkwin();
            }
        });
        b21.setOnAction(actionEvent -> {
            if (space[1][0]!=1 && space[1][0]!=0) {
            if (stat==1) {space[1][0]=1;stat=0;b21.setText("X");status.setText("0");} else if (stat==0) {space[1][0]=0;stat=1;b21.setText("0");status.setText("X");}
            checkwin();
            }
        });
        b22.setOnAction(actionEvent -> {
            if (space[1][1]!=1 && space[1][1]!=0) {
            if (stat==1) {space[1][1]=1;stat=0;b22.setText("X");status.setText("0");} else if (stat==0) {space[1][1]=0;stat=1;b22.setText("0");status.setText("X");}
            checkwin();
            }
        });
        b23.setOnAction(actionEvent -> {
            if (space[1][2]!=1 && space[1][2]!=0) {
            if (stat==1) {space[1][2]=1;stat=0;b23.setText("X");status.setText("0");} else if (stat==0) {space[1][2]=0;stat=1;b23.setText("0");status.setText("X");}
            checkwin();
            }
        });
        b24.setOnAction(actionEvent -> {
            if (space[1][3]!=1 && space[1][3]!=0) {
            if (stat==1) {space[1][3]=1;stat=0;b24.setText("X");status.setText("0");} else if (stat==0) {space[1][3]=0;stat=1;b24.setText("0");status.setText("X");}
            checkwin();
            }
        });
        b31.setOnAction(actionEvent -> {
            if (space[2][0]!=1 && space[2][0]!=0) {
            if (stat==1) {space[2][0]=1;stat=0;b31.setText("X");status.setText("0");} else if (stat==0) {space[2][0]=0;stat=1;b31.setText("0");status.setText("X");}
            checkwin();
            }
        });
        b32.setOnAction(actionEvent -> {
            if (space[2][1]!=1 && space[2][1]!=0) {
            if (stat==1) {space[2][1]=1;stat=0;b32.setText("X");status.setText("0");} else if (stat==0) {space[2][1]=0;stat=1;b32.setText("0");status.setText("X");}
            checkwin();
            }
        });
        b33.setOnAction(actionEvent -> {
            if (space[2][2]!=1 && space[2][2]!=0) {
            if (stat==1) {space[2][2]=1;stat=0;b33.setText("X");status.setText("0");} else if (stat==0) {space[2][2]=0;stat=1;b33.setText("0");status.setText("X");}
            checkwin();
            }
        });
        b34.setOnAction(actionEvent -> {
            if (space[2][3]!=1 && space[2][3]!=0) {
            if (stat==1) {space[2][3]=1;stat=0;b34.setText("X");status.setText("0");} else if (stat==0) {space[2][3]=0;stat=1;b34.setText("0");status.setText("X");}
            checkwin();
            }
        });
        b41.setOnAction(actionEvent -> {
            if (space[3][0]!=1 && space[3][0]!=0) {
            if (stat==1) {space[3][0]=1;stat=0;b41.setText("X");status.setText("0");} else if (stat==0) {space[3][0]=0;stat=1;b41.setText("0");status.setText("X");}
            checkwin();
            }
        });
        b42.setOnAction(actionEvent -> {
            if (space[3][1]!=1 && space[3][1]!=0) {
            if (stat==1) {space[3][1]=1;stat=0;b42.setText("X");status.setText("0");} else if (stat==0) {space[3][1]=0;stat=1;b42.setText("0");status.setText("X");}
            checkwin();
            }
        });
        b43.setOnAction(actionEvent -> {
            if (space[3][2]!=1 && space[3][2]!=0) {
            if (stat==1) {space[3][2]=1;stat=0;b43.setText("X");status.setText("0");} else if (stat==0) {space[3][2]=0;stat=1;b43.setText("0");status.setText("X");}
            checkwin();
            }
        });
        b44.setOnAction(actionEvent -> {
            if (space[3][3]!=1 && space[3][3]!=0) {
            if (stat==1) {space[3][3]=1;stat=0;b44.setText("X");status.setText("0");} else if (stat==0) {space[3][3]=0;stat=1;b44.setText("0");status.setText("X");}
            checkwin();
            }
        });


    }
    public void checkwin() {
        int ctn=0;
        for (int l=0;l<2;l++)
            for (int i=0;i<4;i++) {
                ctn = 0;
                for (int j = 0; j < 4; j++) {
                    if (space[i][j] == l)
                        ctn++;
                    else ctn = 0;
                    if (ctn == 4) {wpannel.setText(l == 1 ? "X WON" : "0 WON");stat=2;}
                }
            }
        ctn=0;
        for (int l=0;l<2;l++)
            for (int i=0;i<4;i++) {
                ctn = 0;
                for (int j = 0; j < 4; j++) {
                    if (space[j][i] == l)
                        ctn++;
                    else ctn = 0;
                    if (ctn == 4) {wpannel.setText(l == 1 ? "X WON" : "0 WON");stat=2;}
                }
            }
        ctn=0;
        for (int l=0;l<2;l++) {
            ctn=0;
            for (int i = 0; i < 4; i++)
                if (space[i][i] == l)
                    ctn++;
            if (ctn == 4) {wpannel.setText(l==1?"X WON":"0 WON");stat=2;}
        }
        ctn=0;
        for (int l=0;l<2;l++) {
            ctn=0;
            for (int i = 0; i < 4; i++)
                if (space[i][3-i] == l)
                    ctn++;
            if (ctn == 4) {wpannel.setText(l==1?"X WON":"0 WON");stat=2;}
        }
        ctn=0;
        for (int i=0;i<4;i++)
            for (int j=0;j<4;j++)
                if (space[i][j]!=2)
                    ctn++;
        if (ctn==16) {wpannel.setText("DRAW");stat=2;}

    }

}
