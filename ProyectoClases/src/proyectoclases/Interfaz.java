/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cinth
 */
public class Interfaz extends javax.swing.JFrame {
   ArrayList<Object> formato = new ArrayList<>();
   ArrayList<DiasTipos> tipos = new ArrayList<>();
   ArrayList<Descripcion> des = new ArrayList<>();
   Fecha f;

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Calendario");
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        BtnGuardar = new javax.swing.JButton();
        BtnPDF = new javax.swing.JButton();
        BtnIcal = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        ComboTipo = new javax.swing.JComboBox<>();
        ChooseFecha = new com.toedter.calendar.JDateChooser();
        ComboDescripcion = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        LabelTipoDia = new javax.swing.JLabel();
        LabelDescripcion = new javax.swing.JLabel();
        LabelFecha = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 30)); // NOI18N
        jLabel1.setText("Administrador de calendario");

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Fecha", "Descripcion", "Lugar"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        BtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/423081_1.png"))); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pdf.png"))); // NOI18N
        BtnPDF.setText("ExportarPDF");
        BtnPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPDFActionPerformed(evt);
            }
        });

        BtnIcal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ical.png"))); // NOI18N
        BtnIcal.setText("Exportar ical");
        BtnIcal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIcalActionPerformed(evt);
            }
        });

        ComboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Festivo", "Vacaciones", "No habil", "Inicio de Cursos"}));

        ComboDescripcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin asistencia", "Plataforma", "LANIA", "Auditorio" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ChooseFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ChooseFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LabelTipoDia.setText("Tipo de dia: ");

        LabelDescripcion.setText("Lugar");

        LabelFecha.setText("Fecha:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelFecha)
                    .addComponent(LabelDescripcion)
                    .addComponent(LabelTipoDia))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelTipoDia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelDescripcion)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BtnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnPDF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnIcal)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardar)
                    .addComponent(BtnPDF)
                    .addComponent(BtnIcal))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        try {
            Date d = ChooseFecha.getDate();
            DiasTipos dt = new DiasTipos(ComboTipo.getSelectedItem().toString());
            tipos.add(dt);
            Descripcion ds = new Descripcion(ComboDescripcion.getSelectedItem().toString());
            des.add(ds);
            f = new Fecha(d);
            formato.add(f);
            String titulos[] = {"Fecha", "Descripcion", "Lugar" };
            DefaultTableModel m = new DefaultTableModel(null, titulos);
            m.setRowCount(formato.size());//Aumenta una nueva fila a la tabla;
            Tabla.setModel(m);
            for (int i = 0; i < formato.size(); i++) {
                Fecha forma = (Fecha) formato.get(i);
                Tabla.setValueAt(forma.getFecha(), i, 0);
                DiasTipos forma2 = (DiasTipos) tipos.get(i);
                Tabla.setValueAt(forma2.getTipo(),i, 1);
                Descripcion forma3 = (Descripcion) des.get(i);
                Tabla.setValueAt(forma3.getDescripcion(), i, 2);
            }
        } catch (Exception e) {
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane, "Elija una fecha", "ERROR", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPDFActionPerformed
        try {
            MessageFormat footer = new MessageFormat(" Calendario ");
            Tabla.print(JTable.PrintMode.NORMAL, footer, footer);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Error de impresion", e.getMessage());
        }
    }//GEN-LAST:event_BtnPDFActionPerformed

    private void BtnIcalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIcalActionPerformed
    String dia = Integer.toString(ChooseFecha.getCalendar().get(Calendar.DAY_OF_MONTH));
        String mes = Integer.toString(ChooseFecha.getCalendar().get(Calendar.MONTH) + 1);
        String year = Integer.toString(ChooseFecha.getCalendar().get(Calendar.YEAR));
        String fecha = (year + mes + dia);
        Descripcion ds = new Descripcion(ComboDescripcion.getSelectedItem().toString());
        des.add(ds);
        DiasTipos dt = new DiasTipos(ComboTipo.getSelectedItem().toString());
        tipos.add(dt);
            for (int i = 0; i < formato.size(); i++) {
        StringBuilder builder = new StringBuilder();
        builder.append(".ics");
        File file = new File("miarchivo"+i+".ics");
        if (!file.exists()) {
            try {
                file.createNewFile();
                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("BEGIN:VCALENDAR\n" +
                        "VERSION:1.0\n" +
                        "BEGIN:VEVENT\n" +
                        "DTSTART:"+fecha+"T090000\n" +
                        "DTEND:"+fecha+"T100000\n" +
                        "LOCATION:"+tipos.get(i)+"\n" +
                        "DESCRIPTION:"+ des.get(i) +
                        "PRIORITY: 3\n" +
                        "END:VEVENT\n" +
                        "END:VCALENDAR");
                bw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
        }
    }//GEN-LAST:event_BtnIcalActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnIcal;
    private javax.swing.JButton BtnPDF;
    private com.toedter.calendar.JDateChooser ChooseFecha;
    private javax.swing.JComboBox<String> ComboDescripcion;
    private javax.swing.JComboBox<String> ComboTipo;
    private javax.swing.JLabel LabelDescripcion;
    private javax.swing.JLabel LabelFecha;
    private javax.swing.JLabel LabelTipoDia;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
