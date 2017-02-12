/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;

/**
 *
 * @author parth
 */

public class Main extends JFrame implements ActionListener{
    JButton p1,p2;
    
   void addComp(){
       JLabel l1=new JLabel("Welcome to TicTacToe");
       JLabel l2=new JLabel("Select Number of Players");
       l1.setBounds(180, 50, 200, 50);
       l2.setBounds(170, 100, 200, 50);
        p1=new JButton("1 Player");
        p2=new JButton("2 Player");
        p1.setBounds(170, 150, 150, 50);
        p2.setBounds(170, 210, 150, 50);
        p1.addActionListener(this);
        p2.addActionListener(this);
        add(p1);add(p2);add(l1);add(l2);
    }
    Main(){
        setSize(500,500);
        setLocationRelativeTo(null);
        setLayout(null);
        addComp();
        setVisible(true);
    }

 

     public static void main(String[] args) {
        // TODO code application logic here
        new Main();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==p1)
        {
            
        }
        else if(e.getSource()==p2)
        {
            new TicTacToe().setVisible(true);
            this.setVisible(false);
            
        }
    }
}
