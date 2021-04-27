
package lab5_notas;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataItem;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


public class Notas extends javax.swing.JFrame {

   DefaultTableModel TablaA = new DefaultTableModel();
   
    DefaultTableModel TablaB = new DefaultTableModel();
    
     ArrayList Not= new ArrayList<>();
     
     
     
    public Notas() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CrearT = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CantN = new javax.swing.JTextField();
        CantE = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        TomaNomb = new javax.swing.JTextField();
        PoneGrafico = new javax.swing.JLabel();
        TituloG = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CrearT.setText("Crear tabla ");
        CrearT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearTActionPerformed(evt);
            }
        });
        getContentPane().add(CrearT, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, -1, -1));

        jLabel1.setText("Cantidad de estudiantes: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setText("Cantidad de notas por estudiante:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));
        getContentPane().add(CantN, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 70, 20));
        getContentPane().add(CantE, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 70, 20));

        jButton2.setText("Calcular finales");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jButton3.setText("Mostrar historico");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));
        getContentPane().add(TomaNomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 120, -1));

        PoneGrafico.setText("jLabel3");
        getContentPane().add(PoneGrafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 320, 320));
        getContentPane().add(TituloG, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 270, 30));

        jTable1.setModel(TablaA);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 390, 120));

        jTable2.setModel(TablaB);
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 380, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearTActionPerformed
        
      int Cantidad_notas= Integer.parseInt(CantN.getText());
      
        TablaA.setColumnCount(Cantidad_notas+1);
        
        TablaA.setRowCount(Integer.parseInt(CantE.getText()));
    }//GEN-LAST:event_CrearTActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        TablaB.setRowCount(TablaA.getRowCount());
        
        TablaB.setColumnCount(3);
        
        for(int i=0; i<TablaB.getRowCount();i++){
            
              TablaB.setValueAt(TablaA.getValueAt(i, 0), i, 0);
            }
            
        Promedio();
        
        Resultado();
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         TituloG.setText("Historico de "+TomaNomb.getText());
        CreaGrafica();
        MuestaGrafica();
        TomaNomb.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

   
    public void Promedio(){
           
        float nota;
        
        float sumatoria=0;
        
        float promedio=0;
       
       
        for(int i=0; i<TablaA.getRowCount();i++){
            
            for(int j=1;j<TablaA.getColumnCount();j++){
    
                nota=  Float.parseFloat((String) TablaA.getValueAt(i,j));
                
                sumatoria=sumatoria+nota;
        
            }
            
            promedio=sumatoria/(TablaA.getColumnCount()-1);
            
            TablaB.setValueAt(promedio, i, 1);
            
            sumatoria=0;
            
            promedio=0;
        }
        
    }
    
    
    
    
    
    
    public void Resultado(){
        
        float nota;
        
        for(int i=0; i<TablaB.getRowCount();i++){
            
            nota=(float) TablaB.getValueAt(i, 1);
            
            if(nota<3){
                TablaB.setValueAt("Reprobó", i, 2);
            }
            else{
                TablaB.setValueAt("Aprobó", i, 2);
            }
           
        }
        
    }
       
  
    
    public void CreaGrafica(){
        
     
        
        XYSeries Grafico_notas = new XYSeries("XYGraph");
        
         String nombre=TomaNomb.getText();
        
        nombre.toLowerCase();
        
        for(int i=0;i<TablaB.getRowCount();i++){
            
            if(nombre.equals(TablaB.getValueAt(i, 0))){
                for(int j=1; j<TablaA.getColumnCount();j++){
            float nota= Float.parseFloat((String) TablaA.getValueAt(0, j));
          
            Grafico_notas.add(i-1,nota);
        }
            }
            
        }
       
        
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(Grafico_notas);
        
        JFreeChart chart = ChartFactory.createXYLineChart(
            "TITULO", // Título
            "Numero Nota", // etiqueta para el eje x
            "valor de nota", // etiqueta para el eje y
            dataset, // Dataset
            PlotOrientation.VERTICAL, // Orientación
            true, // Mostrar leyenda
            true, // Usar tooltips
            false // Configurar para generar URLs
            );
        
      /*  String salidaImagen= "chart.jpg";
        boolean existe=new File (salidaImagen).exists();//verifica si existe
    
    
        //si existe lo borra
        if(existe){
            File archivo=new File(salidaImagen);
            archivo.delete();
        }*/
        
        try {
            ChartUtilities.saveChartAsJPEG( new File("D:\\Lulo\\OneDrive\\Escritorio\\Programación\\Lab5_Notas\\Lab5_Notas\\src\\lab5_notas\\Grafica\\cuadrito.jpg"),
            chart, 320, 320);
            } catch (IOException e) {
            System.err.println("Error al crear el archivo.");
            }
        
       
        
    }
    
    
    public void MuestaGrafica(){
        
         ImageIcon Cuadro = new ImageIcon();
        Cuadro=new ImageIcon(getClass().getResource("/lab5_notas/Grafica/cuadrito.jpg"));
        PoneGrafico.setIcon(Cuadro);
        
    }
  
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CantE;
    private javax.swing.JTextField CantN;
    private javax.swing.JButton CrearT;
    private javax.swing.JLabel PoneGrafico;
    private javax.swing.JLabel TituloG;
    private javax.swing.JTextField TomaNomb;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
