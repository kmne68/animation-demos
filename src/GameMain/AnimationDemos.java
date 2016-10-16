/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GameMain;

import javax.swing.JFrame;

/**
 *
 * @author Keith
 */
public class AnimationDemos {

    /**
     * @param args the command line arguments
     */

    public static MainDisplay mainDisplay = new MainDisplay();
    public static int width = 600;
    public static int height = 400;
    
    public static void main(String[] args) {
        
        mainDisplay.setSize(width, height);
        mainDisplay.setResizable(true);
        mainDisplay.setVisible(true);
        mainDisplay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainDisplay.setTitle("Animations");
        mainDisplay.setLocationRelativeTo(null);
    }
}
