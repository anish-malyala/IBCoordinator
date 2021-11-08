/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ibcoordinator.event;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author AnishMalyala
 */
public class DialogButtonCancelActionListener implements ActionListener {

    private JDialog parentComponent;

    public DialogButtonCancelActionListener(JDialog parentComponent) {
        this.parentComponent = parentComponent;

    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        parentComponent.setVisible(false);
        parentComponent.dispose();
    }

}
