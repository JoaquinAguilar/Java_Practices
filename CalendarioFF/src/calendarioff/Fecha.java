/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendarioff;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cinth
 */
public class Fecha{
    private JLabel etiqueta, horaL, lugarL, actividadL;
    private JTextField mes, fecha, horaT, lugarT;
    private JButton anterior, siguiente, ir, recordatorio, guardar, cancelar;
    private DefaultTableModel tabla;
    private JTable table;
    private JFrame marco;
    private JTextArea actividadT;

    String dias[] = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
    String di[] = {"Lun", "Mar", "Mie", "Jue", "Vie", "Sab", "Dom"};
    String meses[] = {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};
    String meses2[] = {"Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Set", "Oct", "Nov", "Dic"};
    String datoSeleccionado = "";

    int months[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // Cantidad maxima de los dias de cada mes
    int anoActual = 0;
    int mesActual = 0;
    int diaActual = 0;
    int anoTemporal = 0;
    int mesTemporal = 0;
    int columnaSeleccionada = 0;
    int filaSeleccionada = 0;
    int cantidadArchivos = 1;
    int buffer = 2048;
    

}
