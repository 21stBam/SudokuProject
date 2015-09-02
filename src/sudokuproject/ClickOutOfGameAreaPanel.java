/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokuproject;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

/**
 *
 * @author Brandon
 */
public class ClickOutOfGameAreaPanel extends JPanel {
    public boolean clicked = false;
    ClickOutOfGameAreaPanel() {
        addMouseListener(new MouseAdapter() { 
          public void mousePressed(MouseEvent me) { 
            clicked = true;
            System.out.println(clicked);
          } 
        }); 
    }
    
}
