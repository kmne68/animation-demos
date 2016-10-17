/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GameMain;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Keith
 */
public class MainDisplay extends JFrame {
    
    public JPanel viewPort = (JPanel) getGlassPane();
    public Images image;
    public Keys key;
    
    public MainDisplay() {
        
        image = new Images();
        viewPort.setVisible(true);
        key = new Keys(this, image);
        
        viewPort.setLayout(new GridLayout(1, 1, 0, 0));
        this.setLayout(new GridLayout(1, 1, 0, 0));
        
        viewPort.add(key);
        this.add(image);
        
        
    }
}
