package com.mycompany.system.notes.java;

import javax.swing.SwingUtilities;

public class App {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Screen estoque = new Screen();
            estoque.setVisible(true);
        });
    }


}
