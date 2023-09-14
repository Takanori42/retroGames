package br.com.mvbos.lgj;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela extends JFrame{
     JPanel tela;
    public Janela(){

        tela = new JPanel(){
            @Override
            public void paintComponent(Graphics g){
               g.setColor(Color.BLUE);
               g.drawLine(0,240,640,240);
               g.drawRect(10,25,20,20);
               g.drawOval(30,20,40,30);
            }
        };
        super.getContentPane().add(tela);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640,480);
        setVisible(true);
    }
    public static void main(String[] args){
        new Janela();
    }
}