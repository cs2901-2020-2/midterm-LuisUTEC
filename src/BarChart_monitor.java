import java.util.ArrayList;

import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import javafx.scene.chart.BarChart;

public class BarChart_monitor {
    public void showchart(Stage stage, ArrayList<Integer> data, ArrayList<String> data_names, String subject){
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc = new BarChart<String,Number>(xAxis,yAxis);
        bc.setTitle(subject);

        XYChart.Series serie = new XYChart.Series();
        for (int i = 0; i < data.size(); i++){
            serie.getData().add(new XYChart.Data(data_names.get(i),data.get(i)));
        };

        Scene scene = new Scene(bc,800,600);
        bc.getData().addAll(serie);
        stage.setScene(scene);
        stage.show();
    };
}
