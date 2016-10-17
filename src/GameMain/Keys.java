/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GameMain;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;

/**
 *
 * @author Keith
 */
public class Keys extends JPanel{
    
    private Rectangle entity;
    private int entityX = 180;
    private int entityY = 180;    
    private int entityWidth = 20;
    private int entityHeight = 20;
    
    // Key directions
    public boolean right = false;
    public boolean left = false;
    public boolean up = false;
    public boolean down = false;
    
    public Keys(MainDisplay mainDisplay, Images image) {
        
        entity = new Rectangle(entityX, entityY, entityWidth, entityHeight);
        
        mainDisplay.addKeyListener(new KeyAdapter() {
            
            public void keyPressed(KeyEvent e) {
                
                if(e.getKeyCode() == KeyEvent.VK_D) {
                    right = true;
                }
                if(e.getKeyCode() == KeyEvent.VK_A) {
                    left = true;
                }
                if(e.getKeyCode() == KeyEvent.VK_W) {
                    up = true;
                }
                if(e.getKeyCode() == KeyEvent.VK_S) {
                    down = true;
                }
            }
                
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_D) {
                    right = false;                        
                }
                if(e.getKeyCode() == KeyEvent.VK_A) {
                    left = false;
                }
                if(e.getKeyCode() == KeyEvent.VK_W) {
                    up = false;
                }
                if(e.getKeyCode() == KeyEvent.VK_S) {
                    down = false;
                }
            }
        });
    }
    
    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        g.setColor(Color.BLUE);
        g.fillRect(entity.x, entity.y, entity.width, entity.height);
        
        if(right) {
            entity.x += 1;
        }
        if(left) {
            entity.x -= 1;
        }
        if(up) {
            entity.y -= 1;
        }
        if(down) {
            entity.y += 1;
        }
        repaint();
    }
    
}
