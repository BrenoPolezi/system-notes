package com.mycompany.system.notes.java;

import java.io.DataInput;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public abstract class ScreenForm extends JFrame {
   
   //Produto
   protected JLabel lblProduto;
   protected JTextField txtProduto;
   //Codigo
   protected JLabel lblCodigo;
   protected JTextField txtCodigo;
   //DataIni
   protected JLabel lblDataIni;
   protected JTextField txtDataini;
   //DataFim
   protected JLabel lblDataFim;
   protected JTextField txtDataFim;
   //Resultado  
   protected JLabel lblResultado;
   protected JTextField txtResultado;
   
   public ScreenForm() {
      this.ini();
   }
   
   private void ini() {
      this.setTitle("MORAIS DISTRIBUIDORA");
      this.setSize(640, 480);
   }


}
