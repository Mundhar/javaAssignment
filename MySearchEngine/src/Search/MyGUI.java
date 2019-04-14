/* 
 * AlMundhar AlSalmi 
 * D16125575
 * MyGUI Class
 * 
 */

package Search;

import java.awt.Color; 
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class MyGUI extends JFrame implements ActionListener, MouseListener  
{
   
   
   
	 

	//constructor
	MyGUI()
	{
	   
		//creating the GUI
		JFrame f=new JFrame("MySearchEngine");
	   
		//creating a button
		JButton b=new JButton("Search");    
		b.setBounds(100,100,140, 40);    
	   
		//creating a label
		JLabel l1 = new JLabel();		
		l1.setText("Enter word :");
		l1.setBounds(10, 10, 100, 100);
	   	   
	   
		//creating a text field
		JTextField tf= new JTextField();
		tf.setBounds(110, 50, 130, 30);
	   
	   
		//adding them to the frame
		f.add(l1);
		f.add(tf);
		f.add(b);    
		f.setSize(300,300);    
		f.setLayout(null);    
		f.setVisible(true);    
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		
	   
	            
	   
		}
	
	
	
	
	
		public MyGUI(String title, String inputWord) {
		// TODO Auto-generated constructor stub
		}
	
	
		
		
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
		
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
		
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
		
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	
	
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		
		}
	
	

}