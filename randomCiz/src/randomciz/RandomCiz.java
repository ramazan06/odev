
package randomciz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class RandomCiz extends JFrame {
    private JPanel painelGrafico;
    
    public RandomCiz(){
        painelGrafico=new JPanel();
        JButton daireEkle=new JButton("daire ekle");
        JButton kareEkle=new JButton("kare ekle");
        daireEkle.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int dx=50;
                int dy=50;
                int x=(int)(painelGrafico.getWidth()*Math.random());
                int y=(int)(painelGrafico.getHeight()*Math.random());
                
                Graphics gr=painelGrafico.getGraphics();
                gr.setColor(Color.RED);
                gr.drawOval(x, y, dx, dy);
                gr.dispose();
            }
        });
            
            
        kareEkle.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int dx=50;
                int dy=50;
                int x=(int)(painelGrafico.getWidth()*Math.random());
                int y=(int)(painelGrafico.getHeight()*Math.random());
                
                Graphics g=painelGrafico.getGraphics();
                g.setColor(Color.BLACK);
                g.drawRect(x, y, dx, dy);
                g.dispose();
            }
        });
        
        add(painelGrafico);
        add(kareEkle,BorderLayout.NORTH);
        add(daireEkle,BorderLayout.SOUTH);
    }

   
    public static void main(String[] args) {
        JFrame fApp=new RandomCiz();
        fApp.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fApp.setSize(600,500);
        fApp.setVisible(true);
    }
    
}
