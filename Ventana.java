package Proyecto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Ventana extends javax.swing.JFrame {
    DefaultTableModel modelo;
    double Me, MediaAritmetica, varianza,DesviacionSTD, vp,Modax =0, asimetria,Curtosis;
    int Qk;
    double Qp,Qp1, Qp2;
    int Rp1, Rp2;
    static ArrayList<String> datos = new ArrayList<>();
    static ArrayList<Double> datos1 = new ArrayList<Double>();//Aca Volvemos nuestra lista de strings en numericos
    static ArrayList<Double> datos2 = new ArrayList<Double>();
    static ArrayList<String> lista1 = new ArrayList<String>();
    static ArrayList<Integer> f = new ArrayList<Integer>();
    static ArrayList<String> c = new ArrayList<String>();
    static ArrayList<String> F = new ArrayList<String>();
    static ArrayList<Double> fr = new ArrayList<Double>(); //Frecuencias Relativas
    static ArrayList<Double> Fr = new ArrayList<Double>(); //Frecuencias Relativa Acumulada
    static ArrayList<Double> XifiAdd = new ArrayList<Double>(); //Multiplicacion agregada a la tabla
    static ArrayList<Double> absd = new ArrayList<Double>(); //Agregamos los valores absolutos de cada frecuencia de |d|
    static ArrayList<Double> fd = new ArrayList<Double>();//la multiplicacion de la frecuencia con la desviacion estandar
    static ArrayList<Double> delevado = new ArrayList<Double>();//para el calculo de la varianza
    static ArrayList<Double> d = new ArrayList<Double>();//Desviacion Media
    static ArrayList<Double> fdelevado = new ArrayList<Double>();//para el calculo de la varianza frecuencias por desviaciones elevadas al cuadrado
    static ArrayList<Integer> RangoSemiQ1 = new ArrayList<Integer>();
    static ArrayList<Integer> RangoSemiQ2 = new ArrayList<Integer>();
    static ArrayList<Integer> RangoP10 = new ArrayList<Integer>();
    static ArrayList<Integer> RangoP90 = new ArrayList<Integer>();
    static ArrayList<Double> Xifi = new ArrayList<Double>(); //Multiplicacion para la MA
    static ArrayList<Double> lista2 = new ArrayList<Double>(); //nos servira para pasar de objeto de lista a lista2
    static ArrayList<Double> Mediana = new ArrayList<Double>(); //NOs sirve para calculos de la mediana
    static ArrayList<Double> Moda = new ArrayList<Double>();
    static ArrayList<Double> listapmg = new ArrayList<Double>();//lista para potencias de media cuadratica
    static ArrayList<Integer> Qdatos = new ArrayList<Integer>();//lista para agregar los candidatos de cuartil
    static ArrayList<Integer> Qdatos1 = new ArrayList<Integer>();//lista para agregar los candidatos del percentil 1 rango
    static ArrayList<Integer> Qdatos2 = new ArrayList<Integer>();//lista para agregar los candidatos del Percentil 2 Rango
    
    
    private List lista = new ArrayList(); //datos no repetidos ordenados de menor a mayor
    
    public Ventana() {
        initComponents();
        this.setLocationRelativeTo(null);
        modelo = new DefaultTableModel();
        modelo.addColumn("X");
        modelo.addColumn("fi");
        modelo.addColumn("F");
        modelo.addColumn("fr");
        modelo.addColumn("Fr");
        modelo.addColumn("Xifi");
        modelo.addColumn("d");
        modelo.addColumn("|d|=Xi-MA");
        modelo.addColumn("f|d|");
        modelo.addColumn("d^2");
        modelo.addColumn("fd^2");
        
        this.table1.setModel(modelo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jTextField40 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jTextField49 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField50 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        btnH = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnMA = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        MA = new javax.swing.JLabel();
        ME = new javax.swing.JLabel();
        MO = new javax.swing.JLabel();
        Mc = new javax.swing.JLabel();
        TipoModa = new javax.swing.JLabel();
        txtMg = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField52 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField53 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabelCoeficienteVariacion = new javax.swing.JLabel();
        jLabelAsimetria = new javax.swing.JLabel();
        jLabelCurtosis = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jTextField51 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Desk-criptiva");
        setPreferredSize(new java.awt.Dimension(1020, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTextField40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField46.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField47.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField48.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField49.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/escobita.png"))); // NOI18N
        jButton2.setText("Limpiar Datos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingrese Sus Datos");

        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/chek.png"))); // NOI18N
        jButton1.setText("Enviar Datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/ESTA.png"))); // NOI18N

        btnH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/gra-p.png"))); // NOI18N
        btnH.setText("Graficar Histograma");
        btnH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/escobita.png"))); // NOI18N
        jButton5.setText("Limpiar Cuadro");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 0)));
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("0");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("N =");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tabla de Frecuencias y Calculos para el Analisis");

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(table1);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Media Aritmatica ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setText("Mediana");

        btnMA.setBackground(new java.awt.Color(153, 255, 255));
        btnMA.setText("Calcular Medidas de Tendencia Central");
        btnMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMAActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setText("Moda");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Media Geometrica");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Media Cuadratica");

        MA.setForeground(new java.awt.Color(204, 0, 51));
        MA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        ME.setForeground(new java.awt.Color(0, 51, 204));
        ME.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        MO.setForeground(new java.awt.Color(255, 204, 0));
        MO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Mc.setForeground(new java.awt.Color(0, 204, 204));

        TipoModa.setForeground(new java.awt.Color(255, 204, 0));

        txtMg.setForeground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(MA, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ME, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel8))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(MO, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(txtMg, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TipoModa, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(Mc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMA)
                .addGap(179, 179, 179))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(btnMA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Mc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMg, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TipoModa, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setText("Rango entre Percentiles");

        jLabel15.setText("De P");

        jTextField52.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jTextField52.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel16.setText("a P");

        jTextField53.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jTextField53.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField53.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton3.setText("Calcular Rango");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 0, 51));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 153, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Desviacion Media");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 204, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Varianza");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 255));
        jLabel20.setText("Desviacion Tipica");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Coeficiente de Variacion");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 102, 0));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Asimetria");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 102, 102));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Curtosis");

        jButton4.setText("Calcular");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel24.setForeground(new java.awt.Color(51, 153, 0));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel25.setForeground(new java.awt.Color(255, 204, 0));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel26.setForeground(new java.awt.Color(0, 0, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabelCoeficienteVariacion.setForeground(new java.awt.Color(204, 0, 0));
        jLabelCoeficienteVariacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabelAsimetria.setForeground(new java.awt.Color(255, 102, 0));
        jLabelAsimetria.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabelCurtosis.setForeground(new java.awt.Color(0, 102, 102));
        jLabelCurtosis.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(23, 23, 23))
                                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel22)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelCoeficienteVariacion, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jLabelAsimetria, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCurtosis, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel23)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(151, 151, 151))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelCurtosis, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(jLabelCoeficienteVariacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelAsimetria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setText("El ");

        ComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Cuartil", "Decil", "Percentil" }));
        ComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox1ActionPerformed(evt);
            }
        });

        jLabel11.setText("de Orden:");

        jTextField51.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField51.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setText("Es");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Proyecto/About.png"))); // NOI18N
        jButton6.setText("Creditos");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(240, 240, 240))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                .addGap(234, 234, 234)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(btnH))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(92, 92, 92)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel1)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton6)
                                        .addGap(38, 38, 38)
                                        .addComponent(jButton5)))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(96, 96, 96)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)
                                .addComponent(jLabel10)
                                .addComponent(jLabel12))
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(11, 11, 11)
                        .addComponent(btnH, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void ComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        Qdatos.clear();
        if (evt.getSource()==ComboBox1) {
            String seleccionado =(String)ComboBox1.getSelectedItem();
            if ("Seleccionar".equals(seleccionado)){//caundo no se selecciona nada
                jLabel13.setText("N/A");

            }
            if ("Cuartil".equals(seleccionado)){//calculo de los cuartiles

                if(f.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Sin Datos Para Calculo");
                }else{
                    try{
                        Qk = Integer.valueOf(jTextField51.getText());
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(null,"Solicitud Incorrecta \nDigite un Numero Valido");
                    }
                    if(Qk < 1 |  Qk > 3 ){
                        JOptionPane.showMessageDialog(null,"Error de Rango \nDigite 1, 2 o 3");
                        jLabel13.setText("N/A");

                    }else{
                        Qp = Double.valueOf(Qk*datos.size())/4;

                        for(int i=0; i<F.size(); i++){
                            if(Double.valueOf(F.get(i))>= Qp ){
                                Qdatos.add(F.indexOf(F.get(i)));
                            }
                        }
                        double Cuartil = Double.valueOf(lista1.get(Qdatos.get(0)));
                        jLabel13.setText(String.format("%.2f",Cuartil));
                        jTextArea1.append("\nEl Cuartil de Orden "+Qk+" es : "+Cuartil+"\n");
                    }
                }
            }
            if ("Decil".equals(seleccionado)){//calculo de los deciles
                if(f.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Sin Datos Para Calculo");
                }else{
                    try{
                        Qk = Integer.valueOf(jTextField51.getText());
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(null,"Solicitud Incorrecta \nDigite un Numero Valido");
                    }
                    if(Qk < 1 |  Qk > 9 ){
                        JOptionPane.showMessageDialog(null,"Error de Rango \nDigite del 1-9");
                        jLabel13.setText("N/A");

                    }else{
                        Qp = Double.valueOf(Qk*datos.size())/10;

                        for(int i=0; i<F.size(); i++){
                            if(Double.valueOf(F.get(i))>= Qp ){
                                Qdatos.add(F.indexOf(F.get(i)));
                            }
                        }
                        double Cuartil = Double.valueOf(lista1.get(Qdatos.get(0)));
                        jLabel13.setText(String.format("%.2f",Cuartil));
                        jTextArea1.append("\nEl Decil de Orden "+Qk+" es : "+Cuartil+"\n");
                    }
                }

            }
            if ("Percentil".equals(seleccionado)){//calculo de los Percentiles
                if(f.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Sin Datos Para Calculo");
                }else{
                    try{
                        Qk = Integer.valueOf(jTextField51.getText());
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(null,"Solicitud Incorrecta \nDigite un Numero Valido");
                    }
                    if(Qk < 1 |  Qk > 99 ){
                        JOptionPane.showMessageDialog(null,"Error de Rango \nDigite del 1-99");
                        jLabel13.setText("N/A");

                    }else{
                        Qp = Double.valueOf(Qk*datos.size())/100;

                        for(int i=0; i<F.size(); i++){
                            if(Double.valueOf(F.get(i))>= Qp ){
                                Qdatos.add(F.indexOf(F.get(i)));
                            }
                        }
                        double Cuartil = Double.valueOf(lista1.get(Qdatos.get(0)));
                        jLabel13.setText(String.format("%.2f",Cuartil));
                        jTextArea1.append("\nEl Percentil de Orden "+Qk+" es : "+Cuartil+"\n");
                    }
                }

            }
        }
    }                                         

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //En este fragmento de COdigo Desplegaremos el resto del calculo de datos que se nos solicita

        if(f.isEmpty()){
            JOptionPane.showMessageDialog(null,"Sin Datos para Calcular");
            jLabel24.setText(" 0 ");
            jLabel25.setText(" 0 ");
            jLabel26.setText(" 0 ");
            jLabelCoeficienteVariacion.setText(" 0 ");
            jLabelAsimetria.setText(" 0 ");
            jLabelCurtosis.setText(" 0 ");
        }else{
            //--------------------------------------------------------------------------------------------Para la Desviacion Media
            double Count4=0;
            for(int i=0; i<fd.size(); i++){
                Count4 = Count4+fd.get(i);
            }
            double dm = Count4/datos.size();
            jLabel24.setText("= "+String.format("%.2f",dm));
            jTextArea1.append("\nDesviacion Media : "+dm);
            //--------------------------------------------------------------------------------------------Fin Desviacion Media

            //-----------------------------------------------------------------------------------------------Para el calculo de la Varianza
            double Count8=0;
            for(int i=0; i<fdelevado.size(); i++){
                Count8 =Count8+ fdelevado.get(i);
            }
            varianza = Count8/datos.size();
            jLabel25.setText("= "+String.format("%.2f",varianza));
            jTextArea1.append("\nVarianza : "+varianza);
            //-----------------------------------------------------------------------------------------------Fin del Calculo de la Varianza

            //-----------------------------------------------------------------------------------Calculo de la Desviacion Estandar
            DesviacionSTD =Math.sqrt(varianza);
            jLabel26.setText("= "+String.format("%.2f",DesviacionSTD));
            jTextArea1.append("\nDesviacion Estandar o Tipica : "+DesviacionSTD);
            //---------------------------------------------------------Fin del bloque de codigo anterior

            //-------------------------------------------------------------Coeficiente de Variacion
            vp=(DesviacionSTD/MediaAritmetica);
            jLabelCoeficienteVariacion.setText("= "+String.format("%.2f",vp)+" ó "+String.format("%.2f",(vp*100))+"%");
            jTextArea1.append("\nCoeficiente de Variacion : "+vp);
            //------------------------------------------------------------Fin del Bloque anterior de Codigo

            //-----------------------------------------------------------------------Calculo de La Asimetria
            if(Modax==0){
                JOptionPane.showMessageDialog(null,"Para Calcular La Asimetria \nSe necesita el Valor de la Moda \nCalcule primero las Medidas\nde Tendencia Central");
                jLabelAsimetria.setText(" N/A ");

            }else{
                asimetria = (MediaAritmetica-Modax)/DesviacionSTD;
                jLabelAsimetria.setText("= "+String.format("%.2f",asimetria));
                if(asimetria==0 & Modax !=0){
                    jTextArea1.append("\n------------------------------------------------------------------------");
                    jTextArea1.append("\nLa Asimetria es : "+asimetria);
                    jTextArea1.append("\nLos datos son Simetricos.  ");
                    jTextArea1.append("\nSignifica Que tanto la distribucion de lado derecho,\nhe izquierdo son iguales con respecto a la Media   ");
                    jTextArea1.append("\nComparado con la Curva Normal,\nNos muestra que el comportamiento de la serie es igual.\n");
                    jTextArea1.append("------------------------------------------------------------------------\n");
                }
                if(asimetria>0 & Modax !=0){
                    jTextArea1.append("\n------------------------------------------------------------------------");
                    jTextArea1.append("\nLa Asimetria es : "+asimetria);
                    jTextArea1.append("\nLa Distribucion es  Asimetrica Positiva.  ");
                    jTextArea1.append("\nSignifica Que las frecuencias mas altas se,\nencuentran del lado izquierdo de la Media.");
                    jTextArea1.append("\nLa Amplitud Positiva Nos muestra,\nque tan Acumulada se encuetra al lado Izquierdo\n");
                    jTextArea1.append("------------------------------------------------------------------------\n");
                }
                if(asimetria<0 & Modax !=0){
                    jTextArea1.append("\n------------------------------------------------------------------------");
                    jTextArea1.append("\nLa Asimetria es : "+asimetria);
                    jTextArea1.append("\nLa Distribucion es  Asimetrica Negativa.");
                    jTextArea1.append("\nSignifica Que las frecuencias mas altas se,\nencuentran del lado derecho de la Media   ");
                    jTextArea1.append("\nLa Amplitud Negativa Nos muestra,\nque tan Acumulada se encuetra al lado derecho\n");
                    jTextArea1.append("------------------------------------------------------------------------\n");
                }

            }
            //---------------------------------------------------------------------Fin Bloque Anterior

            //-------------------------------------------------------------------Calculo de La Curtosis
            double RQp1 = Double.valueOf(1*datos.size())/4;
            for(int i=0; i<F.size(); i++){
                if(Double.valueOf(F.get(i))>= RQp1 ){
                    RangoSemiQ1.add(F.indexOf(F.get(i)));
                }
            }
            double Cuartil1 = Double.valueOf(lista1.get(RangoSemiQ1.get(0)));
            double RQp2 = Double.valueOf(3*datos.size())/4;
            for(int i=0; i<F.size(); i++){
                if(Double.valueOf(F.get(i))>= RQp2 ){
                    RangoSemiQ2.add(F.indexOf(F.get(i)));
                }
            }
            double Cuartil3 = Double.valueOf(lista1.get(RangoSemiQ2.get(0)));
            double RangoSemi = Cuartil3-Cuartil1;

            double Pp1 = Double.valueOf(10*datos.size())/100;
            for(int i=0; i<F.size(); i++){
                if(Double.valueOf(F.get(i))>= Pp1 ){
                    RangoP10.add(F.indexOf(F.get(i)));
                }
            }
            double Percentil10 = Double.valueOf(lista1.get(RangoP10.get(0)));
            double Pp2 = Double.valueOf(90*datos.size())/100;
            for(int i=0; i<F.size(); i++){
                if(Double.valueOf(F.get(i))>= Pp2 ){
                    RangoP90.add(F.indexOf(F.get(i)));
                }
            }
            double Percentil90 = Double.valueOf(lista1.get(RangoP90.get(0)));

            double RangoP1090 = Percentil90 - Percentil10;

            Curtosis = (0.5*RangoSemi)/RangoP1090;
            jLabelCurtosis.setText("= "+String.format("%.2f",Curtosis));

            if(Curtosis==0.263){
                jTextArea1.append("\n------------------------------------------------------------------------");
                jTextArea1.append("\nLa Curtosis es : "+Curtosis);
                jTextArea1.append("\nLa curtosis esta determinada por Cuartiles y percentiles");
                jTextArea1.append("\nEsta Observacion es Importante  pues nuestra ");
                jTextArea1.append("\ndistribuvion normal en estas medidas equivale: 0.236 \n");

                jTextArea1.append("\nPara esta Serie la Curva es MESOCURTICA.  ");
                jTextArea1.append("\nSignifica que en comparacion con la curva normal,\nambas son iguales   ");
                jTextArea1.append("\nes decir no presenta repunte,\no bajas en la curva.\n");
                jTextArea1.append("------------------------------------------------------------------------\n");
            }
            if(Curtosis>0.263){
                jTextArea1.append("\n------------------------------------------------------------------------");
                jTextArea1.append("\nLa Curtosis es : "+Curtosis);
                jTextArea1.append("\nLa curtosis esta determinada por Cuartiles y percentiles");
                jTextArea1.append("\nEsta Observacion es Importante  pues nuestra ");
                jTextArea1.append("\ndistribuvion normal en estas medidas equivale: 0.236 \n");

                jTextArea1.append("\nPara esta Serie la Curva es LEPTOCURTICA.  ");
                jTextArea1.append("\nSignifica que en comparacion con la curva normal,\nEsta Serie tiende A Repuntar   ");
                jTextArea1.append("\nes decir presenta repunte,\nhacia arriba, respecto a la Normal.\n");
                jTextArea1.append("------------------------------------------------------------------------\n");
            }
            if(Curtosis<0.263){
                jTextArea1.append("\n------------------------------------------------------------------------");
                jTextArea1.append("\nLa Curtosis es : "+Curtosis);
                jTextArea1.append("\nLa curtosis esta determinada por Cuartiles y percentiles");
                jTextArea1.append("\nEsta Observacion es Importante  pues nuestra ");
                jTextArea1.append("\ndistribuvion normal en estas medidas equivale: 0.236 \n");

                jTextArea1.append("\nPara esta Serie la Curva es PLATICURTICA.  ");
                jTextArea1.append("\nSignifica que en comparacion con la curva normal,\nLa Serie tiene un achatamiento   ");
                jTextArea1.append("\nes decir presenta un Aplanamiento,\ncon respecto a la Normal.\n");
                jTextArea1.append("------------------------------------------------------------------------\n");
            }

            //---------------------------------------------------------------Fin Bloque Anterior
        }
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // Calculo de Rango percentilico
        Qdatos1.clear();
        Qdatos2.clear();
        if(f.isEmpty()){
            JOptionPane.showMessageDialog(null,"Sin Datos Para Calcular");
        }else{
            try{
                Rp1 = Integer.valueOf(jTextField52.getText());
                Rp2 = Integer.valueOf(jTextField53.getText());
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null,"Solicitud Incorrecta \nDigite un Numero Valido");
            }
            if(Rp1<1 | Rp1>99 |Rp2<1 | Rp2>99){
                JOptionPane.showMessageDialog(null,"Uno de los valores esta Fuera de Rango, Revise");
            }else{
                if(Rp1>Rp2){
                    JOptionPane.showMessageDialog(null,"El Primer Percentil\nDebe ser Menor al segundo");
                }else{
                    Qp1 = Double.valueOf(Rp1*datos.size())/100;

                    for(int i=0; i<F.size(); i++){
                        if(Double.valueOf(F.get(i))>= Qp1 ){
                            Qdatos1.add(F.indexOf(F.get(i)));
                        }
                    }
                    double Percentil1 = Double.valueOf(lista1.get(Qdatos1.get(0)));

                    Qp2 = Double.valueOf(Rp2*datos.size())/100;
                    for(int i=0; i<F.size(); i++){
                        if(Double.valueOf(F.get(i))>= Qp2 ){
                            Qdatos2.add(F.indexOf(F.get(i)));
                        }
                    }
                    double Percentil2 = Double.valueOf(lista1.get(Qdatos2.get(0)));
                    double RangoPercentilico = Percentil2-Percentil1;
                    jLabel17.setText(" = "+String.format("%.2f",RangoPercentilico));
                    jTextArea1.append("\nRango Percentilico "+Rp2+" - "+Rp1+" es : "+RangoPercentilico+"\n");
                }
            }
        }
    }                                        

    //Evento cuando solicitamos calcular las medidas de tendencia central
    private void btnMAActionPerformed(java.awt.event.ActionEvent evt) {                                      
        //------------------------------------------------------------------------------------------------------MA
        Xifi.clear();//limpiamos la lista para poder agregar valores si que se repitan al actualizar los datos
        Mediana.clear();//limpiamos nuestro array
        Moda.clear();//tambien limpiamos los datos
        listapmg.clear();//limpiamos las potencias de la media geometrica

        if(f.isEmpty()){
            JOptionPane.showMessageDialog(null,"No Hay Datos Para Calcular");
            MA.setText("N/A");
            ME.setText("N/A");
            MO.setText("N/A");
            TipoModa.setText("N/A");
            txtMg.setText("N/A");
            Mc.setText("N/A");

        }else{
            for(int i=0; i<lista1.size(); i++){
                double j = Double.valueOf(lista1.get(i))*f.get(i);//este recorrifo realiza la multiplicacion de las frecuencias con X
                Xifi.add(j);                                        //Luego las agrega a una nueva lista llamada Xifi
            }

            double k = 0;
            for(int i=0; i<Xifi.size(); i++){ //este recorrido realiza la suma de sus elementos para generar la MA
                k=k+Xifi.get(i);
            }
            double l = k/datos.size();//obtenemos MA al dividir la sumatoria de Xifi entre el numero total de casos N
            MA.setText(String.format("%.2f", l));
            jTextArea1.append("\nLa Media Aritmetica es "+l);
            //------------------------------------------------------------------------------------------------------FinMA

            //----------------------------------------------------------------------------------------------------ME

            double a=0;
            for(int i=0; i<f.size(); i++){
                a=a+f.get(i);
            }
            double m = a%2;//operacion para saber si es Par o Inpar

            if(m==0){
                //cuando N es par
                Me=a/2;
                for(int i=0; i<F.size(); i++){//aca mediante un rrecorrido buscamos donde se encuentra la pocicion de la mediana
                    if(Integer.valueOf(F.get(i))>=Me){
                        Mediana.add(Double.valueOf(lista1.get(i)));
                    }
                }
                ME.setText(String.format("%.2f",Mediana.get(0)) );
                jTextArea1.append("\nN es Par, por tanto, La Mediana es "+Mediana.get(0));
            }else{
                //Cuando N es Inpar
                Me=(a+1)/2;
                for(int i=0; i<F.size(); i++){//aca mediante un rrecorrido buscamos donde se encuentra la pocicion de la mediana
                    if(Integer.valueOf(F.get(i))>=Me){
                        Mediana.add(Double.valueOf(lista1.get(i)));
                    }
                }
                ME.setText(String.format("%.2f",Mediana.get(0)) );
                jTextArea1.append("\nN es Impar, por tanto,La Mediana es "+Mediana.get(0));
            }
            //--------------------------------------------------------------------------------------------------FinME

            //------------------------------------------------------------------------------------------------------Mo
            //mostramos el Jlabel, cambiamos el valor a String y tomamos el indice del valor mas alto de las frecuencias para solicitarlo a la lista donde se ecuentra x
            MO.setText(String.valueOf(lista1.get(f.indexOf(Collections.max(f)))));
            jTextArea1.append("\nLa Moda es "+String.valueOf(lista1.get(f.indexOf(Collections.max(f)))));
            Modax = Double.valueOf(lista1.get(f.indexOf(Collections.max(f))));

            double moda = Collections.max(f);
            for(int i=0; i<f.size(); i++){
                if(moda == f.get(i)){
                    Moda.add(Double.valueOf(f.get(i)));//con este recorrido evaluamos si existen mas valores dentro de la frecuencia que se repitan
                }                                      //si es asi se agregan a la lista moda y nos servira para hacer la validacion que vemos abajo
            }
            if(Moda.size()>1){
                TipoModa.setText("Multimodal");
            }else{
                TipoModa.setText("Unimodal");
            }

            //------------------------------------------------------------------------------------------------------FinMo

            //----------------------------------------------------------------------------------------------------Media Geometrica
            for(int i=0; i<lista1.size(); i++){
                double  pp = Math.pow(Double.valueOf(lista1.get(i)),Double.valueOf(f.get(i)));
                listapmg.add(pp);
            }

            double mullistapmg = 1;
            for(int i=0; i<listapmg.size(); i++){
                double var1 = listapmg.get(i)*mullistapmg;//a la vaiable var1 le damos el valor de la multiplicacion de los  datos
                mullistapmg = var1;
            }
            double Mg = Math.pow(mullistapmg, 1/a);//ralizamos la raiza en forma de potencia
            txtMg.setText(String.format("%.2f",Mg));//convercion a 2 Cifras
            jTextArea1.append("\nLa Media Geometrica es "+Mg);

            //----------------------------------------------------------------------------------------------------Fin Media Geometrica

            //---------------------------------------------------------------------------------------------------Media Cuadratica
            double summc = 0;
            for(int i=0; i<lista1.size(); i++){
                double var2 = Math.pow(Double.valueOf(lista1.get(i)),2);
                double var21 = var2*f.get(i);
                summc = summc +var21;
            }
            double summc2 = summc/a;

            double MeC;
            //double Rc =(1/2);
            MeC = Math.pow(summc2 ,0.5);
            Mc.setText(String.format("%.2f",MeC));//convercion a 2 Cifras
            jTextArea1.append("\nLa Media Cuadratica es "+MeC);
            //--------------------------------------------------------------------------------------------------Fin Media Cuadratica
        }

    }                                     

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jTextArea1.setText("");

    }                                        

    private void btnHActionPerformed(java.awt.event.ActionEvent evt) {                                     
        if(f.isEmpty()){
            JOptionPane.showMessageDialog(null,"No Hay Datos Para Graficar");
        }else{
            Histograma H = new Histograma();
            H.setVisible(true);

        }
    }                                    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        RangoSemiQ1.clear();
        RangoSemiQ2.clear();
        RangoP10.clear();
        RangoP90.clear();
        MediaAritmetica=0;
        Modax=0;
        delevado.clear();
        datos.clear();
        datos1.clear();
        datos2.clear();
        lista1.clear();
        c.clear();
        f.clear();
        fr.clear();
        F.clear();
        Fr.clear();
        XifiAdd.clear();
        Xifi.clear();
        d.clear();
        absd.clear();
        fdelevado.clear();
        fd.clear();

        if(jTextField1.getText().equals("")){
        }else{
            datos.add(jTextField1.getText());
        }
        if(jTextField2.getText().equals("")){
        }else{
            datos.add(jTextField2.getText());
        }

        if(jTextField3.getText().equals("")){
        }else{
            datos.add(jTextField3.getText());
        }

        if(jTextField4.getText().equals("")){
        }else{
            datos.add(jTextField4.getText());
        }

        if(jTextField5.getText().equals("")){
        }else{
            datos.add(jTextField5.getText());
        }

        if(jTextField6.getText().equals("")){
        }else{
            datos.add(jTextField6.getText());
        }

        if(jTextField7.getText().equals("")){
        }else{
            datos.add(jTextField7.getText());
        }

        if(jTextField8.getText().equals("")){
        }else{
            datos.add(jTextField8.getText());
        }

        if(jTextField9.getText().equals("")){
        }else{
            datos.add(jTextField9.getText());
        }
        if(jTextField10.getText().equals("")){//aca llevamos los 10JtextsFielsd Xd
        }else{
            datos.add(jTextField10.getText());
        }
        if(jTextField11.getText().equals("")){
        }else{
            datos.add(jTextField11.getText());
        }

        if(jTextField12.getText().equals("")){
        }else{
            datos.add(jTextField12.getText());
        }

        if(jTextField13.getText().equals("")){
        }else{
            datos.add(jTextField13.getText());
        }

        if(jTextField14.getText().equals("")){
        }else{
            datos.add(jTextField14.getText());
        }

        if(jTextField15.getText().equals("")){
        }else{
            datos.add(jTextField15.getText());
        }

        if(jTextField16.getText().equals("")){
        }else{
            datos.add(jTextField16.getText());
        }

        if(jTextField17.getText().equals("")){
        }else{
            datos.add(jTextField17.getText());
        }

        if(jTextField18.getText().equals("")){
        }else{
            datos.add(jTextField18.getText());
        }

        if(jTextField19.getText().equals("")){
        }else{
            datos.add(jTextField19.getText());
        }

        if(jTextField20.getText().equals("")){
        }else{
            datos.add(jTextField20.getText());
        }//--------------------------------------------20TextsField
        if(jTextField21.getText().equals("")){
        }else{
            datos.add(jTextField21.getText());
        }

        if(jTextField22.getText().equals("")){
        }else{
            datos.add(jTextField22.getText());
        }

        if(jTextField23.getText().equals("")){
        }else{
            datos.add(jTextField23.getText());
        }

        if(jTextField24.getText().equals("")){
        }else{
            datos.add(jTextField24.getText());
        }

        if(jTextField25.getText().equals("")){
        }else{
            datos.add(jTextField25.getText());
        }

        if(jTextField26.getText().equals("")){
        }else{
            datos.add(jTextField26.getText());
        }

        if(jTextField27.getText().equals("")){
        }else{
            datos.add(jTextField27.getText());
        }

        if(jTextField28.getText().equals("")){
        }else{
            datos.add(jTextField28.getText());
        }

        if(jTextField29.getText().equals("")){
        }else{
            datos.add(jTextField29.getText());
        }

        if(jTextField30.getText().equals("")){
        }else{
            datos.add(jTextField30.getText());
        }//--------------------------------------------------30TextsFields
        if(jTextField31.getText().equals("")){
        }else{
            datos.add(jTextField31.getText());
        }

        if(jTextField32.getText().equals("")){
        }else{
            datos.add(jTextField32.getText());
        }

        if(jTextField33.getText().equals("")){
        }else{
            datos.add(jTextField33.getText());
        }

        if(jTextField34.getText().equals("")){
        }else{
            datos.add(jTextField34.getText());
        }

        if(jTextField35.getText().equals("")){
        }else{
            datos.add(jTextField35.getText());
        }

        if(jTextField36.getText().equals("")){
        }else{
            datos.add(jTextField36.getText());
        }

        if(jTextField37.getText().equals("")){
        }else{
            datos.add(jTextField37.getText());
        }

        if(jTextField38.getText().equals("")){
        }else{
            datos.add(jTextField38.getText());
        }

        if(jTextField39.getText().equals("")){
        }else{
            datos.add(jTextField39.getText());
        }

        if(jTextField40.getText().equals("")){
        }else{
            datos.add(jTextField40.getText());
        }//------------------------------------------------------40 TextsFields
        if(jTextField41.getText().equals("")){
        }else{
            datos.add(jTextField41.getText());
        }

        if(jTextField42.getText().equals("")){
        }else{
            datos.add(jTextField42.getText());
        }

        if(jTextField43.getText().equals("")){
        }else{
            datos.add(jTextField43.getText());
        }

        if(jTextField44.getText().equals("")){
        }else{
            datos.add(jTextField44.getText());
        }

        if(jTextField45.getText().equals("")){
        }else{
            datos.add(jTextField45.getText());
        }

        if(jTextField46.getText().equals("")){
        }else{
            datos.add(jTextField46.getText());
        }

        if(jTextField47.getText().equals("")){
        }else{
            datos.add(jTextField47.getText());
        }

        if(jTextField48.getText().equals("")){
        }else{
            datos.add(jTextField48.getText());
        }

        if(jTextField49.getText().equals("")){
        }else{
            datos.add(jTextField49.getText());
        }

        if(jTextField50.getText().equals("")){
        }else{
            datos.add(jTextField50.getText());
        }//------------------------------------------50TextsFields
        //--------------------------------------------Aca finaliza el tablero de JTextsFields XD

        //Aca le asignamos a un Titulo por medio de un JLabel el numero de datos ingresados

        //en este reccorido agregamos a una lista los valores de String a Double si el dato no es correcto agrega el elemento a un anueva lista
        for(int i=0; i<datos.size(); i++){
            try{
                datos1.add(Double.parseDouble(datos.get(i)));
            }catch(NumberFormatException ex){
                c.add(datos.get(i));
            }
        }

        //Aca validamos por medio de una lista que los valores este coreectos todos para determinar cuales son los valores que no se repiten
        if(c.isEmpty()){
            for(int i=0; i<datos1.size();i++){
                if(datos2.contains(datos1.get(i))){
                }else{
                    datos2.add(datos1.get(i));
                }
            }
            jLabel3.setText("");
            jLabel3.setText(String.valueOf(datos.size()));

            //--------------------------------------------------------------------convercion de lista a arreglo
            Double[] miarray = new Double[datos2.size()];
            miarray = datos2.toArray(miarray);
            for(Double s : miarray)

            Arrays.sort(miarray);// Aca Cambiamos de Orden el arreglo

            for(Double s : miarray)

            lista = Arrays.asList(miarray);
            //--------------------------------------------------------------------Finaliza la convercion de datos

            //-----------------------------Metemos a una nueva lista los valores
            for(int i=0; i < lista.size(); i++){
                lista1.add(String.valueOf(lista.get(i)));
            }
            //----------------------------------------------------

            //---------------------------------------------------------------------------------Empezamos a formar la tabla de frecuencias
            //con este conteo revisamos la frecuencia con la que aparece cada uno de los datos
            for(int i=0;i < lista.size() ;i++){
                f.add(Collections.frequency(datos1, lista.get(i)));
            }

            for(int i=0;i < lista.size() ;i++){
                double a = f.get(i);
                double b = datos.size();
                double c = a/b;
                fr.add(c);//aca hacemos las operaciones para las frecuencias relativas
            }

            //-----------------------aca guardamos en una nueva lista el valor de las frecuencias relativas
            int j=0;
            for(int i=0; i < f.size() ;i++){
                int k = f.get(i) + j ;
                F.add(String.valueOf(k));
                j=j+f.get(i);
            }//-------------------------------------Fin Bloque Anterior

            //-----------------------aca guardamos en una nueva lista el valor de las frecuencias relativas Acumuladas
            double l=0;
            for(int i=0; i<fr.size() ;i++){//codigo completamente funcional
                double k = fr.get(i) + l ;
                Fr.add(k);
                l=l+fr.get(i);
            }//-------------------------------------Fin Bloque Anterior

            //-------------------------------------------AddXifi
            for(int i=0; i<f.size() ;i++){//codigo completamente funcional
                double k = Double.valueOf(lista1.get(i))*f.get(i);
                XifiAdd.add(k);
            }
            //-------------------------------------------Fin Addxifi

            //---------------------------------------------------------Necesitamos la MA aca
            double Count1 =0;
            for(int i=0; i<XifiAdd.size() ;i++){//codigo completamente funcional
                Count1 = Count1+XifiAdd.get(i);
            }
            MediaAritmetica=Count1/datos.size();
            //*--------------------------------------------------------Fin busqueda MA

            //----------------------------------------------------------------------Desviacion
            double Count6;
            for(int i=0; i<lista1.size() ;i++){//codigo completamente funcional
                Count6 = Double.valueOf(lista1.get(i))-MediaAritmetica;
                d.add(Count6);
            }

            //----------------------------------------------------------------------Fin Bloque Anterior

            //-----------------------------------------------------------Para Agregar el Valor absoluto de |d|=|Xi-MA|
            double Count2;
            for(int i=0; i<lista1.size() ;i++){//codigo completamente funcional
                Count2 = Math.abs(Double.valueOf(lista1.get(i))-MediaAritmetica);
                absd.add(Count2);
            }
            //-----------------------------------------------------------Fin

            //--------------------------------------------------------------Para Agregar el siguiente paso de la DM
            for(int i=0; i<absd.size() ;i++){//codigo completamente funcional
                double k = absd.get(i)*f.get(i);
                fd.add(k);
            }
            //-----------------------------------------------------------------Fin Bloque anterior

            //--------------------------------------------------------------Agregamos datos a la tabla esta vez las desviaciones elevadas al cuadrado para que sean positivas
            double Count5=0;
            for(int i=0; i<lista1.size(); i++){
                Count5 =Math.pow( Double.valueOf(lista1.get(i))-MediaAritmetica, 2);
                delevado.add(Count5);

            }
            //--------------------------------------------------------------Fin Bloque anterior

            //--------------------------------------------------------------desviaciones elevadas al cuadrado multiplicado por las frecuencias
            double Count7;
            for(int i=0; i<delevado.size(); i++){
                Count7 = delevado.get(i)*f.get(i);
                fdelevado.add(Count7);
            }

            //----------------------------------------------------------------Fin del bloque de codigo anterior

            //aca antes de agregar los datos borramos los que ya  existen
            int fila=table1.getRowCount();
            for (int i=fila-1; i>=0;i--){
                modelo.removeRow(i);
            }

            //------------------------------------------aca incertamos los valores a la tabla de frecuncias
            for(int i=0;i < lista.size() ;i++){
                String []info = new String[11];
                info[0]= String.valueOf(lista.get(i));
                info[1]= String.valueOf(f.get(i));
                info[2]= String.valueOf(F.get(i));
                info[3]= String.valueOf(String.format("%.2f",fr.get(i)));
                info[4]= String.valueOf(String.format("%.2f",Fr.get(i)));
                info[5]= String.valueOf(String.format("%.2f",XifiAdd.get(i)));
                info[6]= String.valueOf(String.format("%.2f",d.get(i)));
                info[7]= String.valueOf(String.format("%.2f",absd.get(i)));
                info[8]= String.valueOf(String.format("%.2f",fd.get(i)));
                info[9]= String.valueOf(String.format("%.2f",delevado.get(i)));
                info[10]= String.valueOf(String.format("%.2f",fdelevado.get(i)));
                modelo.addRow(info);
            }

        }else{
            JOptionPane.showMessageDialog(null,"Uno O Mas Datos Son Incorrectos Revise!");
            jTextArea1.append("\n\n------------------------------------------------------------------------------");
            jTextArea1.append("\nError Encontrado ");
            jTextArea1.append("\n------------------------------------------------------------------------------------\n");
            datos1.clear();
            datos2.clear();
            c.clear();
        }

        //--------------------------------------------------imprimimos en pantalla para verificar lo que tenemos
        jTextArea1.append("---------------------------------------------------------------------------------------");
        jTextArea1.append("\nEn Total hay: "+datos.size()+" Datos.");
        jTextArea1.append("\nDatos Ingresados:  ");
        for (int i = 0; i < datos.size(); i++) {
            jTextArea1.append(datos.get(i)+"  ");
        }
        jTextArea1.append("\nDatos Convertidos:  ");
        for (int i = 0; i < datos1.size(); i++) {
            jTextArea1.append(datos1.get(i)+"  ");
        }
        jTextArea1.append("\nDatos No reptidos:  ");
        for (int i = 0; i < datos2.size(); i++) {
            jTextArea1.append(datos2.get(i)+"  ");
        }
        jTextArea1.append("\nDatos No reptidos Ordenados:  ");
        for (int i = 0; i < lista.size(); i++) {
            jTextArea1.append(lista.get(i)+"  ");
        }
        jTextArea1.append("\nFrecuencias:  ");
        for (int i = 0; i < f.size(); i++) {
            jTextArea1.append(f.get(i)+"  ");
        }
        jTextArea1.append("\n--------------------------------------------------------------------------------------");
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
        jTextField15.setText("");
        jTextField16.setText("");
        jTextField17.setText("");
        jTextField18.setText("");
        jTextField19.setText("");
        jTextField20.setText("");
        jTextField21.setText("");
        jTextField22.setText("");
        jTextField23.setText("");
        jTextField24.setText("");
        jTextField25.setText("");
        jTextField26.setText("");
        jTextField27.setText("");
        jTextField28.setText("");
        jTextField29.setText("");
        jTextField30.setText("");
        jTextField31.setText("");
        jTextField32.setText("");
        jTextField33.setText("");
        jTextField34.setText("");
        jTextField35.setText("");
        jTextField36.setText("");
        jTextField37.setText("");
        jTextField38.setText("");
        jTextField39.setText("");
        jTextField40.setText("");
        jTextField41.setText("");
        jTextField42.setText("");
        jTextField43.setText("");
        jTextField44.setText("");
        jTextField45.setText("");
        jTextField46.setText("");
        jTextField47.setText("");
        jTextField48.setText("");
        jTextField49.setText("");
        jTextField50.setText("");

        //aca  borramos los datos que ya  existen
        int fila=table1.getRowCount();
        for (int i=fila-1; i>=0;i--){
            modelo.removeRow(i);
        }
        datos.clear();
        datos1.clear();
        datos2.clear();
        f.clear();
        F.clear();
        c.clear();

        //Le decimos al usuario que no hay datos para operar
        jLabel3.setText("");
        jLabel3.setText(String.valueOf(datos.size()));

        jTextArea1.append("\n\n****************************************************************");
        jTextArea1.append("\nRegistros Limpiados ");
        jTextArea1.append("\n****************************************************************\n");
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Creditos  creditos = new Creditos();
        creditos.setVisible(true);
    }                                        
    
    
    
    
    
    
    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> ComboBox1;
    private javax.swing.JLabel MA;
    private javax.swing.JLabel ME;
    private javax.swing.JLabel MO;
    private javax.swing.JLabel Mc;
    private javax.swing.JLabel TipoModa;
    private javax.swing.JButton btnH;
    private javax.swing.JButton btnMA;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAsimetria;
    private javax.swing.JLabel jLabelCoeficienteVariacion;
    private javax.swing.JLabel jLabelCurtosis;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable table1;
    private javax.swing.JLabel txtMg;
    // End of variables declaration                   
}
