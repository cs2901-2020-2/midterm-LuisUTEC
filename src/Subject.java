import javafx.*;
import javafx.stage.Stage;

import java.util.ArrayList;


public class Subject {
    ArrayList<Integer> data;
    ArrayList<String> data_names;
    Stage stage = new Stage();
    String subject;

    public void setData_names(ArrayList<String> data_names) {
        this.data_names = data_names;
    }

    public ArrayList<String> getData_names() {
        return data_names;
    }

    public void setData(ArrayList<Integer> data) {
        this.data = data;
    }

    public ArrayList<Integer> getData() {
        return data;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void update(){
        
    }

}
