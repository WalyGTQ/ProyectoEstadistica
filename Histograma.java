package Proyecto;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.xy.IntervalXYDataset;

public class Histograma extends javax.swing.JFrame {
    static ArrayList<String> datos = new ArrayList<String>();
    static double miarray[];
    
    public Histograma() {
        
        Ventana data = new Ventana();
        datos.clear();//limpiamos el array list para que no se duplique los datos cada ves que se llama a la ventana
        for(int i=0; i<data.datos1.size(); i++){
        datos.add(String.valueOf(data.datos1.get(i)));//aca obtenemos los valores del arreglo de la clase Ventana  y lo guardamos en una lista local es decir en esta clase
         }
        
        HistogramDataset dataset = new HistogramDataset();
        initComponents();
        JPanel chartPanel = crearPanel();
        //chartPanel.setPreferredSize(new java.awt.Dimension(500, 475));
        chartPanel.setBounds(700, 100, 500, 475);
        setContentPane(chartPanel);
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(319, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                    
    
    private static IntervalXYDataset crearDataset() {
        
    Ventana data = new Ventana();
    double miarray[] = new double[datos.size()];
    for(int i=0; i<datos.size(); i++){
        miarray[i]= Double.valueOf(datos.get(i));   
    }
    
    
    HistogramDataset dataset = new HistogramDataset();
    //vecto almacena los ingresos quincenales de 45 personas
    double vector[] = {1, 3, 4, 5, 6, 1, 2, 3, 1,
    2, 5, 5, 6, 1, 2, 3, 2, 4,
    5, 1,1,2,3,4,5,1,2,3,4,5,2,2,4,4,6,6,8,8,2,2};
    //En el ejercicio nos piden construir una distribución de frecuencias de 8 intervalos
    //Por eso ponemos 8 en el tercer parámetro del addSeries
    dataset.addSeries("Frecuencias de los Datos", miarray, data.f.size());
    return dataset;
    }


    private static JFreeChart crearChart(IntervalXYDataset dataset) {
        Ventana data = new Ventana();
        JFreeChart chart = ChartFactory.createHistogram("Histograma Intervalo "+data.f.size(),null,null,dataset,PlotOrientation.VERTICAL,true,true,false);
        
        XYPlot plot = (XYPlot) chart.getPlot();
        XYBarRenderer renderer = (XYBarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(true);
        renderer.setBaseSeriesVisible(true);
        return chart;
    }
    
    public static JPanel crearPanel() {
    JFreeChart chart = crearChart(crearDataset());
    return new ChartPanel(chart);
    }

    
    public ArrayList<String> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<String> datos) {
        this.datos = datos;
    }
                    
    private javax.swing.JPanel jPanel1;                
}
