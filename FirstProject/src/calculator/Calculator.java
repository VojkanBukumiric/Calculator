package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Calculator implements ActionListener {
	JFrame okvir = new JFrame();
	JPanel tabla = new JPanel();
	JTextArea prostor = new JTextArea(2,13);
	JButton dugme7 = new JButton();
	JButton dugme8 = new JButton();
	JButton dugme9 = new JButton();
	JButton dugmeplus = new JButton();
	JButton dugme4 = new JButton();
	JButton dugme5 = new JButton();
	JButton dugme6 = new JButton();
	JButton dugmeminus = new JButton();
	JButton dugme1 = new JButton();
	JButton dugme2 = new JButton();
	JButton dugme3 = new JButton();
	JButton dugmeputa = new JButton();
	JButton dugme0 = new JButton();
	JButton dugmetacka = new JButton();
	JButton dugmeponisti = new JButton();
	JButton dugmepodeljeno = new JButton();
	JButton dugmejednako= new JButton();
	
	double broj1, broj2, rezultat;
	int sabiranje = 0, oduzimanje = 0, mnozenje = 0, deljenje = 0;
	
	
	
	public Calculator() {
		okvir.setSize(400,420);
		okvir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okvir.setVisible(true);
		okvir.setTitle("Calculator");
		okvir.setResizable(false);
		
		okvir.add(tabla);
		tabla.setBackground(Color.WHITE);
		Border granica = BorderFactory.createLineBorder(Color.BLACK,2);
		tabla.setBorder(granica);
		
		tabla.add(prostor);
		prostor.setBackground(Color.BLACK);
		Border granica2 = BorderFactory.createLineBorder(Color.BLACK,2);
		prostor.setBorder(granica2);
		Font font = new Font("arial",Font.BOLD,33);
		prostor.setFont(font);
		prostor.setForeground(Color.WHITE);
		prostor.setPreferredSize(new Dimension(2,10));
		prostor.setLineWrap(true);
		
		 dugme7.setPreferredSize(new Dimension (90,50));
		 dugme7.setIcon(new ImageIcon("C:\\Users\\Cira\\Desktop\\taastatura\\7.jpg"));
		 dugme8.setPreferredSize(new Dimension (90,50));
		 dugme8.setIcon(new ImageIcon("C:\\Users\\Cira\\Desktop\\taastatura\\8.jpg"));
		 dugme9.setPreferredSize(new Dimension(90,50));
		 dugme9.setIcon(new ImageIcon("C:\\Users\\Cira\\Desktop\\taastatura\\9.jpg"));
		 dugmeplus.setPreferredSize(new Dimension(90,50));
		 dugmeplus.setIcon(new ImageIcon("C:\\Users\\Cira\\Desktop\\taastatura\\plus.jpg"));
		 dugme4.setPreferredSize(new Dimension(90,50));
		 dugme4.setIcon(new ImageIcon("C:\\Users\\Cira\\Desktop\\taastatura\\4.jpg"));
		 dugme5.setPreferredSize(new Dimension(90,50));
		 dugme5.setIcon(new ImageIcon("C:\\Users\\Cira\\Desktop\\taastatura\\5.jpg"));
		 dugme6.setPreferredSize(new Dimension(90,50));
		 dugme6.setIcon(new ImageIcon("C:\\Users\\Cira\\Desktop\\taastatura\\6.jpg"));
		 dugmeminus.setPreferredSize(new Dimension(90,50));
		 dugmeminus.setIcon(new ImageIcon("C:\\Users\\Cira\\Desktop\\taastatura\\minus.jpg"));
		 dugme1.setPreferredSize(new Dimension(90,50));
		 dugme1.setIcon(new ImageIcon("C:\\Users\\Cira\\Desktop\\taastatura\\1.jpg"));
		 dugme2.setPreferredSize(new Dimension(90,50));
		 dugme2.setIcon(new ImageIcon("C:\\Users\\Cira\\Desktop\\taastatura\\2.jpg"));
		 dugme3.setPreferredSize(new Dimension(90,50));
		 dugme3.setIcon(new ImageIcon("C:\\Users\\Cira\\Desktop\\taastatura\\3.jpg"));
		 dugmeputa.setPreferredSize(new Dimension(90,50));
		 dugmeputa.setIcon(new ImageIcon("C:\\Users\\Cira\\Desktop\\taastatura\\puta.jpg"));
		 dugme0.setPreferredSize(new Dimension(90,50));
		 dugme0.setIcon(new ImageIcon("C:\\Users\\Cira\\Desktop\\taastatura\\0.jpg"));
		 dugmetacka.setPreferredSize(new Dimension(90,50));
		 dugmetacka.setIcon(new ImageIcon("C:\\Users\\Cira\\Desktop\\taastatura\\tacka.jpg"));
		 dugmeponisti.setPreferredSize(new Dimension (90,50));
		 dugmeponisti.setIcon(new ImageIcon("C:\\Users\\Cira\\Desktop\\taastatura\\ponisti.jpg"));
		 dugmepodeljeno.setPreferredSize(new Dimension (90,50));
		 dugmepodeljeno.setIcon(new ImageIcon("C:\\Users\\Cira\\Desktop\\taastatura\\podeljeno.jpg"));
		 dugmejednako.setPreferredSize(new Dimension(370,60));
		 dugmejednako.setIcon(new ImageIcon("C:\\Users\\Cira\\Desktop\\taastatura\\jednako.jpg"));
		 
		
		tabla.add(dugme7);
	    tabla.add(dugme8);
	    tabla.add(dugme9);
	    tabla.add(dugmeplus);
	    tabla.add(dugme4);
	    tabla.add(dugme5);
	    tabla.add(dugme6);
	    tabla.add(dugmeminus);
	    tabla.add(dugme1);
	    tabla.add(dugme2);
	    tabla.add(dugme3);
	    tabla.add(dugmeputa);
	    tabla.add(dugme0);
	    tabla.add(dugmetacka);
	    tabla.add(dugmeponisti);
	    tabla.add(dugmepodeljeno);
	    tabla.add(dugmejednako);
	    
	    
	   dugme7.addActionListener(this);
	   dugme8.addActionListener(this);
	   dugme9.addActionListener(this);
	   dugmeplus.addActionListener(this);
	   dugme4.addActionListener(this);
	   dugme5.addActionListener(this);
	   dugme6.addActionListener(this);
	   dugmeminus.addActionListener(this);
	   dugme1.addActionListener(this);
	   dugme2.addActionListener(this);
	   dugme3.addActionListener(this);
	   dugmeputa.addActionListener(this);
	   dugme0.addActionListener(this);
	   dugmetacka.addActionListener(this);
	   dugmeponisti.addActionListener(this);
	   dugmepodeljeno.addActionListener(this);
	   dugmejednako.addActionListener(this);
	}



	
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if(source == dugmeponisti) {
			broj1 = 0.0;
			broj2 = 0.0;
			prostor.setText("");
		}
		
		if(source == dugme7) {
			prostor.append("7");
		}
		if(source == dugme8) {
			prostor.append("8");
		}
		if(source == dugme9) {
			prostor.append("9");
		}
		if(source == dugme4) {
			prostor.append("4");
		}
		if(source == dugme5) {
			prostor.append("5");
		}
		if(source == dugme6) {
			prostor.append("6");
		}
		if(source == dugme1) {
			prostor.append("1");
		}
		if(source == dugme2) {
			prostor.append("2");
		}
		if(source == dugme3) {
			prostor.append("3");
		}
		if(source == dugme0) {
			prostor.append("0");
		}
		if(source == dugmetacka) {
			prostor.append(".");
		}
		if(source == dugmeplus) {
			broj1 = citac_brojeva();
			prostor.setText("");
			sabiranje = 1;
			oduzimanje = 0;
			mnozenje = 0;
			deljenje = 0;
		}
		if(source == dugmeminus) {
			broj1 = citac_brojeva();
			prostor.setText("");
			sabiranje = 0;
			oduzimanje = 1;
			mnozenje = 0;
			deljenje = 0;	
		}
		if(source == dugmeputa) {
			broj1 = citac_brojeva();
			prostor.setText("");
			sabiranje = 0;
			oduzimanje = 0;
			mnozenje = 1;
			deljenje = 0;
		}
		if(source == dugmepodeljeno) {
			broj1 = citac_brojeva();
			prostor.setText("");
			sabiranje = 0;
			oduzimanje = 0;
			mnozenje = 0;
			deljenje = 1;
		}
        if(source == dugmejednako ) {
        	broj2 = citac_brojeva();
        	if(sabiranje > 0) {
        		rezultat = broj1 + broj2;
        		prostor.setText(Double.toString(rezultat));
        	}
        	if(oduzimanje > 0) {
        		rezultat = broj1 - broj2;
        		prostor.setText(Double.toString(rezultat));
        	}
        	if(mnozenje > 0) {
        		rezultat = broj1 * broj2;
        		prostor.setText(Double.toString(rezultat));
        	}
        	if(deljenje > 0) {
        		rezultat = broj1 / broj2;
        		prostor.setText(Double.toString(rezultat));
        	}
        }
	

		
		
	}
	public double citac_brojeva() {
		double br1;
		String i;
		i = prostor.getText();
		br1 = Double.valueOf(i);
		return br1;
		
	}

}
