package com.amrita.jpl.cys21060.endsem;

import com.amrita.jpl.cys21060.endsem.FileManagementSystemUI;

import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FileManagementSystemUI().setVisible(true);
            }
        });
    }
}

