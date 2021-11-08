/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibcoordinator.event;

import ibcoordinator.util.Util;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author AnishMalyala
 */
public class DialogButtonOkActionListener implements ActionListener {

    private JFrame parentWindow;
    private JFrame newWindow;

    public DialogButtonOkActionListener(JFrame newWindow, JFrame parentWindow) {
        this.parentWindow = parentWindow;
        this.newWindow = newWindow;
    }


    @Override
    public void actionPerformed(ActionEvent arg0) {
        Util.showWindow(newWindow, parentWindow);
    }

}
