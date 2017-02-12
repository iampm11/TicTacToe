/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author parth
 */
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.util.*;
 
public class TicTacToe extends JFrame{

    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    ImageIcon x;
    ImageIcon y;
    ImageIcon white;
	ImageIcon reseticon;
    JLabel top;
	JLabel top1;
	JLabel top2;
    JButton reset;
	int temp;
	Map<String, JButton> buttonMap;
    void setDisplay(){
        
        b1=new JButton(white);
        b2=new JButton(white);
        b3=new JButton(white);
        b4=new JButton(white);
        b5=new JButton(white);
        b6=new JButton(white);
        b7=new JButton(white);
        b8=new JButton(white);
        b9=new JButton(white);
		reset=new JButton("Reset",reseticon);
		top=new JLabel("Welcome to Tic Tac Toe");
		top1=new JLabel("Player 1 is X and Player 2 is Y");
		top2=new JLabel("Player 1 Turn");
		reset.setBackground(Color.white);
		
    }
    void resetIcon(){
        b1.setIcon(white);
        b2.setIcon(white);
        b3.setIcon(white);
        b4.setIcon(white);
        b5.setIcon(white);
        b6.setIcon(white);
        b7.setIcon(white);
        b8.setIcon(white);
        b9.setIcon(white);
        b1.setEnabled(true);
		b2.setEnabled(true);
		b3.setEnabled(true);
		b4.setEnabled(true);
		b5.setEnabled(true);
		b6.setEnabled(true);
		b7.setEnabled(true);
		b8.setEnabled(true);
		b9.setEnabled(true);
		top2.setText("Player 1 Turn");
        temp=0;
    }
	
	
    
     void setBoundary(){
        b1.setBounds(10,150,100,100);
        b2.setBounds(110,150,100,100);
        b3.setBounds(210,150,100,100);
        b4.setBounds(10,250,100,100);
        b5.setBounds(110,250,100,100);
        b6.setBounds(210,250,100,100);
        b7.setBounds(10,350,100,100);   
        b8.setBounds(110,350,100,100);
        b9.setBounds(210,350,100,100);
		reset.setBounds(360,275,150,50);
		top.setBounds(250,35,150,10);
		top1.setBounds(235,48,200,10);
		top2.setBounds(75,140,150,10);
		add(top);
		add(top1);
		add(top2);
		add(reset);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        Dowork obj=new Dowork();
        b1.addActionListener(obj);
		b2.addActionListener(obj);
		b3.addActionListener(obj);
		b4.addActionListener(obj);
		b5.addActionListener(obj);
		b6.addActionListener(obj);
		b7.addActionListener(obj);
		b8.addActionListener(obj);
		b9.addActionListener(obj);
		reset.addActionListener(obj);
		
    }
    TicTacToe(){
		super("Tic Tac Toe");
        setLayout(null);
        setSize(600,600);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image img,newimg;
        x=new ImageIcon(getClass().getClassLoader().getResource("tictactoe/xicon.png"));
		img = x.getImage() ;  
		newimg = img.getScaledInstance( 100, 100,  java.awt.Image.SCALE_SMOOTH ) ;  
		x = new ImageIcon( newimg );
        y=new ImageIcon(getClass().getClassLoader().getResource("tictactoe/oicon.png"));
		img = y.getImage() ;  
		newimg = img.getScaledInstance( 100, 100,  java.awt.Image.SCALE_SMOOTH ) ;  
		y = new ImageIcon( newimg );
        white=new ImageIcon(getClass().getClassLoader().getResource("tictactoe/white.png"));
	reseticon=new ImageIcon(getClass().getClassLoader().getResource("tictactoe/reseticon.png"));
		img = reseticon.getImage() ;  
		newimg = img.getScaledInstance( 50, 50,  java.awt.Image.SCALE_SMOOTH ) ;  
		reseticon = new ImageIcon( newimg );
        this.setDisplay();
        this.setBoundary();
        setLocationRelativeTo(null);
        
    }
	
	 void check()
	{   
	    temp++;
		System.out.println(temp);
		Icon i1=b1.getIcon();
		Icon i2=b2.getIcon();
		Icon i3=b3.getIcon();
		Icon i4=b4.getIcon();
		Icon i5=b5.getIcon();
		Icon i6=b6.getIcon();
		Icon i7=b7.getIcon();
		Icon i8=b8.getIcon();
		Icon i9=b9.getIcon();
		
		if((i1==x&&i2==x&&i3==x)||(i1==x&&i4==x&&i7==x)||(i4==x&&i5==x&&i6==x)||(i2==x&&i5==x&&i8==x)||(i7==x&&i8==x&&i9==x)||(i3==x&&i6==x&&i9==x)||(i1==x&&i5==x&&i9==x)||(i3==x&&i5==x&&i7==x))
		{
			JOptionPane.showMessageDialog(null,"Player 1 wins");
			b1.setEnabled(false);
			b2.setEnabled(false);
			b3.setEnabled(false);
			b4.setEnabled(false);
			b5.setEnabled(false);
			b6.setEnabled(false);
			b7.setEnabled(false);
			b8.setEnabled(false);
			b9.setEnabled(false);
		}
		else if((i1==y&&i2==y&&i3==y)||(i1==y&&i4==y&&i7==y)||(i4==y&&i5==y&&i6==y)||(i2==y&&i5==y&&i8==y)||(i7==y&&i8==y&&i9==y)||(i3==y&&i6==y&&i9==y)||(i1==y&&i5==y&&i9==y)||(i3==y&&i5==y&&i7==y))
		{
			JOptionPane.showMessageDialog(null,"Player 2 wins");
			b1.setEnabled(false);
			b2.setEnabled(false);
			b3.setEnabled(false);
			b4.setEnabled(false);
			b5.setEnabled(false);
			b6.setEnabled(false);
			b7.setEnabled(false);
			b8.setEnabled(false);
			b9.setEnabled(false);
			}
		else if(temp==9)
		{
			JOptionPane.showMessageDialog(null,"Draw");
			b1.setEnabled(false);
			b2.setEnabled(false);
			b3.setEnabled(false);
			b4.setEnabled(false);
			b5.setEnabled(false);
			b6.setEnabled(false);
			b7.setEnabled(false);
			b8.setEnabled(false);
			b9.setEnabled(false);
		}
		
	}
	
     class Dowork implements ActionListener{
         
         @Override
         public void actionPerformed(ActionEvent e){
         	if(e.getSource()==reset)
			 resetIcon();
 		 
         if(top2.getText()=="Player 1 Turn")
		 { 
			 if(e.getSource()==b1)
			 {
				 b1.setIcon(x);
				 b1.setEnabled(false);
			 }
			 if(e.getSource()==b2)
			 {
				 b2.setIcon(x);
				 b2.setEnabled(false);
			 }
			 if(e.getSource()==b3)
			 {
				 b3.setIcon(x);
				 b3.setEnabled(false);
			 }
			 if(e.getSource()==b4)
			 {
				 b4.setIcon(x);
				 b4.setEnabled(false);
			 }
			 if(e.getSource()==b5)
			 {
				 b5.setIcon(x);
				 b5.setEnabled(false);
			 }
			 if(e.getSource()==b6)
			 {
				 b6.setIcon(x);
				 b6.setEnabled(false);
			 }
			 if(e.getSource()==b7)
			 {
				 b7.setIcon(x);
				 b7.setEnabled(false);
			 }
			 if(e.getSource()==b8)
			 {
				 b8.setIcon(x);
				 b8.setEnabled(false);
			 }
			 if(e.getSource()==b9)
			 {
				 b9.setIcon(x);
				 b9.setEnabled(false);
			 }
			 check();
			 top2.setText("Player 2 Turn");
			 
         }
		else
		{ 
			 if(e.getSource()==b1)
			 {
				 b1.setIcon(y);
				 b1.setEnabled(false);
			 }
			 if(e.getSource()==b2)
			 {
				 b2.setIcon(y);
				 b2.setEnabled(false);
			 }
			 if(e.getSource()==b3)
			 {
				 b3.setIcon(y);
				 b3.setEnabled(false);
			 }
			 if(e.getSource()==b4)
			 {
				 b4.setIcon(y);
				 b4.setEnabled(false);
			 }
			 if(e.getSource()==b5)
			 {
				 b5.setIcon(y);
				 b5.setEnabled(false);
			 }
			 if(e.getSource()==b6)
			 {
				 b6.setIcon(y);
				 b6.setEnabled(false);
			 }
			 if(e.getSource()==b7)
			 {
				 b7.setIcon(y);
				 b7.setEnabled(false);
			 }
			 if(e.getSource()==b8)
			 {
				 b8.setIcon(y);
				 b8.setEnabled(false);
			 }
			 if(e.getSource()==b9)
			 {
				 b9.setIcon(y);
				 b9.setEnabled(false);
			 }
			 check();
			 top2.setText("Player 1 Turn");
			 
         }			
		
		 if(e.getSource()==reset)
			 resetIcon();
     }
	 }
   
}

