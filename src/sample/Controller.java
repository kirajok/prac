package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Controller
{
    @FXML
    public GridPane MainPanel;
    @FXML
    public Button btn1Click;
    @FXML
    public TextArea imyapoleid;
    @FXML
    public Text imyatextid;
    @FXML
    public TextArea fampoleid;
    @FXML
    public Text famtextid;
    @FXML
    public Text otchtextid;
    @FXML
    public TextArea otchpoleid;
    @FXML
    public Text comtextid;
    @FXML
    public TextArea commpoleid;
    @FXML
    public CheckBox luxeid;
    @FXML
    public CheckBox luxe2id;
    @FXML
    public CheckBox poluluxe3id;
    @FXML
    public CheckBox poluluxe2id;
    @FXML
    public CheckBox poluluxe1id;
    @FXML
    public CheckBox obich1id;
    @FXML
    public CheckBox obich2id;
    @FXML
    public TextArea datasid;
    @FXML
    public TextArea datadoid;
    @FXML
    public Text dataprozhivsid;
    @FXML
    public Text dataprozhivdoid;
    @FXML
    public Text FIOtextid;
    @FXML
    public TextArea FIOpoleid;
    @FXML
    public Text commentfinalid;
    @FXML
    public TextArea commentfinalpoleid;
    @FXML
    public Text dprozhivaniatextid;
    @FXML
    public TextArea dprozhivaniaid;
    @FXML
    public Text nomertextid;
    @FXML
    public TextArea nomerpoleid;
    @FXML
    public TextArea lastdataid;

    @FXML public void actionclick (ActionEvent actionEvent)
    {
        FIOpoleid.setText(fampoleid.getText()+ " " + imyapoleid.getText() + " " + otchpoleid.getText());
        commentfinalpoleid.setText(commpoleid.getText());
        dprozhivaniaid.setText("С" + " " + datasid.getText() + " " + "До" + " " + datadoid.getText());
        if(luxeid.isSelected()) nomerpoleid.setText("Люкс 1 человек");
        if(luxe2id.isSelected()) nomerpoleid.setText("Люкс 2 человека");
        if(poluluxe1id.isSelected()) nomerpoleid.setText("Полулюкс 1 человек");
        if(poluluxe2id.isSelected()) nomerpoleid.setText("Полулюкс 2 человека");
        if(poluluxe3id.isSelected()) nomerpoleid.setText("Полулюкс 3 человека");
        if(obich1id.isSelected()) nomerpoleid.setText("Обычный 1 человек");
        if(obich2id.isSelected()) nomerpoleid.setText("Обычный 1 человек");
        String filePath = "C:/Users/V/IdeaProjects/pracfinal/src/sample/post.txt";
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write("ФИО:" + " " + FIOpoleid.getText() + System.lineSeparator() + "Комментарий:" + " " + commentfinalpoleid.getText() + System.lineSeparator() + "Даты проживания:" + " " + dprozhivaniaid.getText() + System.lineSeparator() + "Выбранный номер:" + " " + nomerpoleid.getText() + System.lineSeparator() + "======================================="+ System.lineSeparator()) ;
            bufferWriter.close();
        }
        catch (IOException e)
        {
            System.out.println("ooops...");
        }

    }

}
