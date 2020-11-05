import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Observable;

public class PieChart_monitor extends DataManager {
    public void showchart(Stage stage, ArrayList<Integer> data, ArrayList<String> data_names, String subject){
        Scene scene = new Scene(new Group());
        stage.setWidth(500);
        stage.setHeight(500);
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList();
        for (int i = 0; i < data.size(); i++){
            pieChartData.add(new PieChart.Data(data_names.get(i), data.get(i) ));
        }
        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle(subject);
        ((Group)scene.getRoot()).getChildren().add(chart);
        stage.setScene(scene);
        stage.show();

    };
}
