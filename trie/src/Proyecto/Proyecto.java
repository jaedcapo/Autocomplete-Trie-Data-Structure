/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.util.List;
import trie.Trie;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import static jdk.nashorn.internal.objects.NativeString.substring;

/**
 *
 * @author JAVIER EDUARDO CAMARILLO POLANCO 293038
 */


public class Proyecto extends JFrame implements KeyListener, ActionListener {
    
    JTextField keyText = new JTextField(80);
    JButton autoButton = new JButton();
    
    Proyecto(){
    
        keyText.addKeyListener(this);
        setSize(400,400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        autoButton.addActionListener(this);
        
        BorderLayout layout = new BorderLayout();
        setLayout(layout); 
        add(keyText, BorderLayout.SOUTH);  
        add(autoButton, BorderLayout.CENTER);
    
    
    }
    
    public static void main(String[] args){
    /*
        Trie t = new Trie();
        t.insert("nna");
        t.insert("name");
        t.insert("new york");
        t.insert("nickelodeon");
        t.insert("nickelback");
        t.insert("nibba");
        
        
        
        List<String> a = t.autocomplete("ni");
        */
        //for(int i=0; i < a.size();i++)
           // System.out.println(a.get(i));
        
        Proyecto pro = new Proyecto();
    
  
 
    
    
    }
    
   
    @Override
   public void keyPressed(KeyEvent e){
       
       Trie t = new Trie();
        t.insert("a priori");
        t.insert("aaron");
        t.insert("abaco");
        t.insert("abaceria");
        t.insert("abacero");
        t.insert("abaco");
        
        t.insert("abacorar");
        t.insert("abajo");
        t.insert("abalanzar");
        t.insert("abanderado");
        t.insert("abanderar");
        t.insert("abanderizar");
        t.insert("abandonado");
        t.insert("abandonar");
        t.insert("abanico");
        t.insert("abarajar");
        t.insert("abaratar");
        t.insert("abarcar");
        t.insert("abarrancamiento");
        t.insert("abarroteria");
        t.insert("abarrotero");
        t.insert("abarrotes");
        
        
        
        //List<String> a = t.autocomplete("ni");
        
        //for(int i=0; i < a.size();i++)
            //System.out.println(a.get(i));
       
       int id=e.getID();
       int code = e.getKeyCode();
       String keyString;
       String input = keyText.getText(); 
       
       if(code == KeyEvent.VK_BACK_SPACE){
           
           input=input.substring(0, input.length());
           //System.out.println("test " + input);
           keyString = input;
           keyText.setText(keyString);
 

       }
       
       else if (id == KeyEvent.KEY_PRESSED){
        
                char c = e.getKeyChar();
                keyString=input + c;
                
                //System.out.println(input);
                        
            keyText.setText(keyString);
            
            List<String> a=t.autocomplete(keyString);
            autoButton.setText(a.get(0));
                for(int i=0; i < a.size();i++)
                    System.out.println(a.get(i));
        
                        
        
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("test 2s");
        keyText.setText(autoButton.getText());
        
        
    }
    

   
    
    
}


