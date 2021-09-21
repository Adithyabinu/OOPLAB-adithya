 import java.awt.*;
 import java.applet.*;
 import java.awt.event.*;

public class House extends Applet implements ActionListener
 {
Button bt1,bt2;
Label btcolor;
String str;
public void init()
        {
			
            Button bt1 = new Button("Red");    
            Button bt2= new Button("Blue");
             
            add(bt1);                  
            add(bt2);
			
            bt1.addActionListener(this); 
            bt2.addActionListener(this);
			
			
        }
        public void actionPerformed(ActionEvent ae)
        {
			
            str = ae.getActionCommand();
            repaint();      
        }
	 public void paint(Graphics g)
	 {
		 int a[]={150,300,225};   
		 int b[]={150,150,25};
		 
		 
		 
		 g.setColor(Color.magenta);
		 g.fillRect(150,150,150,200);
		 		 
		 if(str.equals("Red"))
		 {
		 g.setColor(Color.red);
		 g.fillRect(190,220,70,130);
		 }
		 
		  if(str.equals("Blue"))
		 {
		 g.setColor(Color.blue);
		 g.fillRect(190,220,70,130);
		 }
		 
		  	 
		 g.setColor(Color.cyan);
		 g.fillRect(300,150,250,200);
		 
		  g.setColor(Color.black);
		 g.fillRect(390,210,80,80);
		 
		 g.setColor(Color.blue);
		 g.drawLine(430,210,430,290);
		 
		 g.setColor(Color.blue);
		 g.drawLine(470,250,390,250);
		 
		 g.setColor(Color.black);
		 g.drawLine(460,26,226,26);
		 
		 g.setColor(Color.black);
		 g.drawLine(460,25,550,150);
		 
		 g.setColor(Color.black);
		 g.fillPolygon(a,b,3);
		 
		 
	 }
 }