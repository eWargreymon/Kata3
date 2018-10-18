package kata3;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame{
    
    public HistogramDisplay() {
        super("Histograma");
        setContentPane(createPanel());
        pack();
    }
    
    public void execute(){
        setVisible(true);
    }
    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        
        JFreeChart chart = ChartFactory.createBarChart("Histograma JFreeChart","Dominios emails","Nº emails",dataSet,PlotOrientation.VERTICAL, false, false, rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(15,"","ulpgc.es");
        dataSet.addValue(5,"","yahoo.es");
        dataSet.addValue(12,"","hotmail.com");
        dataSet.addValue(2,"","terra.es");
        dataSet.addValue(4,"","ull.es");
        return dataSet;
    }
}
