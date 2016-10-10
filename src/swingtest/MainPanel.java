/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingtest;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MainPanel extends JPanel{
    MainPanel(){
        JButton blueButton = new JButton("Blue");
        blueButton.setBackground(Color.blue);
        add(blueButton);
        
        JButton redButton = new JButton("Red");
        redButton.setBackground(Color.red);
        add(redButton);
        
        JButton greenButton = new JButton("Green");
        greenButton.setBackground(Color.green);
        add(greenButton);
        
        JButton nos5299_NoelSterling = new JButton("Noel Sterling Jr");//Noel this buttons labe should be your name, not "Plain Button"
        add(nos5299_NoelSterling);
        nos5299_NoelSterling.setBackground(Color.blue);
        
        JButton garrettButton = new JButton("Garrett");
        garrettButton.setBackground(Color.ORANGE);
        add(garrettButton);
        
        JButton kevinButton = new JButton("Kevin");
        kevinButton.setBackground(Color.cyan);
        add(kevinButton);
//Kevin your button goes here. The setBackground color part is optional
    }
}
