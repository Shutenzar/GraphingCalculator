package test;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class View extends JFrame implements ActionListener, ChangeListener, MouseListener {
	
	// background and frame
	public JPanel background;
	public JFrame frame;
	public Screen screen;
	
	public JButton up;
	public JButton down;
	public JButton right;
	public JButton left;
	
	public JButton zoomin;
	public JButton zoomout;
	
	public View(){
		//invoke the super constructor
		super();
		
		setLayout(null);  //We are not going to use a layout manager
		
		//Create the button
		zoomin = new JButton("Zoom in");
		zoomin.setBounds(105,120,90,35);   //(x,y,width,height)
		zoomin.addActionListener(this);
		zoomin.setActionCommand("zoomin");  //Differentiates between other buttons 
		
		zoomout = new JButton("Zoom out");
		zoomout.setBounds(105,155,90,35);   //(x,y,width,height)
		zoomout.addActionListener(this);
		zoomout.setActionCommand("zoomout");  //Differentiates between other buttons 
		
		up = new JButton("Up");
		up.setBounds(115,50,70,70);   //(x,y,width,height)
		up.addActionListener(this);
		up.setActionCommand("up");  //Differentiates between other buttons 
		
		down = new JButton("Down");
		down.setBounds(115,190,70,70);   //(x,y,width,height)
		down.addActionListener(this);
		down.setActionCommand("down");  //Differentiates between other buttons 
		
		right = new JButton("Right");
		right.setBounds(195,120,70,70);   //(x,y,width,height)
		right.addActionListener(this);
		right.setActionCommand("right");  //Differentiates between other buttons 
		
		left = new JButton("Left");
		left.setBounds(35,120,70,70);   //(x,y,width,height)
		left.addActionListener(this);
		left.setActionCommand("left");  //Differentiates between other buttons 
		
		init();
		
	}
	
	private void init(){
		
		//create the frame
		frame = new JFrame("GDC");
		frame.setSize(300, 680);
		frame.setLayout(null);
		
		
		//set some default settings
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(false);
		
		
		//add components
		addComponents();
		update();
	}

	public void update() {
		frame.validate();
		frame.repaint();
		
	}
	
	// add all the components including the dice, buttons, and chart + labels
	private void addComponents() {
				
		screen = new Screen(4,4,286,286);
		frame.add(zoomin);
		frame.add(zoomout);
		frame.add(up);
		frame.add(down);
		frame.add(right);
		frame.add(left);
		frame.add(screen);

	
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
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
	public void stateChanged(ChangeEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
