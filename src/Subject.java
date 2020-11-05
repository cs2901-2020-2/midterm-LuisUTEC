import javafx.*;
import javafx.stage.Stage;

import java.util.ArrayList;


public class Subject {
    ArrayList<Integer> data;
    ArrayList<String> data_names;
    Stage stage = new Stage();
    String subject;

    public ArrayList<String> getData_names() {
        return data_names;
    }

    public void setData(ArrayList<Integer> data) {
        this.data = data;
    }

    public ArrayList<Integer> getData() {
        return data;
    }

    BarChart_monitor barChart_monitor = new BarChart_monitor();
    PieChart_monitor pieChart_monitor = new PieChart_monitor();
}
