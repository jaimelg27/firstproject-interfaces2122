package inversiones;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class index {
	
	private JFrame indexframe;
	
	//Lanzar la aplicacion
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					index window = new index();
					window.indexframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//Crear la aplicacion
	public index() {
		initialize();
	}
	
	//Contenido del JFrame
	private void initialize() {
		indexframe = new JFrame();
		indexframe.setLocationRelativeTo(null);
		indexframe.getContentPane().setBackground(Color.GRAY);
		indexframe.setResizable(false);
		indexframe.setBounds(100, 100, 1200, 800);
		indexframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		indexframe.getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("\u00A1Compra y vende acciones al instante!");
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Segoe UI Black", Font.BOLD, 40));
		lblTitulo.setBounds(204, 101, 775, 55);
		indexframe.getContentPane().add(lblTitulo);
		
		JButton btnInicio = new JButton("Inicio");
		btnInicio.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				new index();
				inversiones.index.main(null);
				indexframe.dispose();
			}
		});
		btnInicio.setForeground(Color.GRAY);
		btnInicio.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnInicio.setBackground(Color.WHITE);
		btnInicio.setBounds(421, 21, 97, 29);
		indexframe.getContentPane().add(btnInicio);
		
		JButton btnquienesSomos = new JButton("\u00BFQuienes Somos?");
		btnquienesSomos.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				new team();
				inversiones.team.main(null);
				indexframe.dispose();
			}
		});
		btnquienesSomos.setForeground(Color.GRAY);
		btnquienesSomos.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnquienesSomos.setBackground(Color.WHITE);
		btnquienesSomos.setBounds(531, 20, 202, 29);
		indexframe.getContentPane().add(btnquienesSomos);
		
		JButton btnContacto = new JButton("Contacto");
		btnContacto.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				new contact();
				inversiones.contact.main(null);
				indexframe.dispose();
			}
		});
		btnContacto.setForeground(Color.GRAY);
		btnContacto.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnContacto.setBackground(Color.WHITE);
		btnContacto.setBounds(743, 20, 129, 31);
		indexframe.getContentPane().add(btnContacto);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				indexframe.dispose();
			}
		});
		btnSalir.setForeground(Color.GRAY);
		btnSalir.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnSalir.setBackground(Color.WHITE);
		btnSalir.setBounds(1060, 20, 90, 31);
		indexframe.getContentPane().add(btnSalir);
		
		JLabel lblTitulo2 = new JLabel("\u00DAnete al mayor mercado de acciones del mundo");
		lblTitulo2.setForeground(Color.WHITE);
		lblTitulo2.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		lblTitulo2.setBounds(216, 154, 749, 42);
		indexframe.getContentPane().add(lblTitulo2);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 425, 1184, 336);
		indexframe.getContentPane().add(panel);
		
		JButton btnIniciarSesin = new JButton("Iniciar Sesi\u00F3n");
		btnIniciarSesin.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				new login();
				inversiones.login.main(null);
				indexframe.dispose();
			}
		});
		btnIniciarSesin.setForeground(Color.GRAY);
		btnIniciarSesin.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnIniciarSesin.setBackground(Color.WHITE);
		btnIniciarSesin.setBounds(882, 20, 168, 31);
		indexframe.getContentPane().add(btnIniciarSesin);
		
		JLabel logo_1 = new JLabel("");
		logo_1.setIcon(new ImageIcon(index.class.getResource("/resources/smalllogo.png")));
		logo_1.setBounds(10, 11, 90, 69);
		indexframe.getContentPane().add(logo_1);
		
		JLabel logo_1_1 = new JLabel("");
		logo_1_1.setIcon(new ImageIcon(index.class.getResource("/resources/smallindex1.jpg")));
		logo_1_1.setBounds(167, 215, 225, 150);
		indexframe.getContentPane().add(logo_1_1);
		
		JLabel logo_1_1_1 = new JLabel("");
		logo_1_1_1.setIcon(new ImageIcon(index.class.getResource("/resources/smallindex2.jpg")));
		logo_1_1_1.setBounds(469, 215, 225, 150);
		indexframe.getContentPane().add(logo_1_1_1);
		
		JLabel logo_1_1_1_1 = new JLabel("");
		logo_1_1_1_1.setIcon(new ImageIcon(index.class.getResource("/resources/smallindex3.jpg")));
		logo_1_1_1_1.setBounds(784, 216, 225, 150);
		indexframe.getContentPane().add(logo_1_1_1_1);
		

	}
}

