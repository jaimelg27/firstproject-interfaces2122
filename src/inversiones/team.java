package inversiones;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;


public class team {
	
	private JFrame teamframe;
	
	//Lanzar la aplicacion
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						team window = new team();
						window.teamframe.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
		
		//Crear la aplicacion
		public team() {
			initialize();
		}
		
		//Contenido del JFrame
		private void initialize() {
			teamframe = new JFrame();
			teamframe.setBackground(Color.GRAY);
			teamframe.setLocationRelativeTo(null);
			teamframe.getContentPane().setBackground(Color.GRAY);
			teamframe.setResizable(false);
			teamframe.setBounds(100, 100,1200,800);
			teamframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			teamframe.getContentPane().setLayout(null);
			
			JLabel lblquienesSomos = new JLabel("\u00BFQuienes Somos?");
			lblquienesSomos.setForeground(Color.WHITE);
			lblquienesSomos.setFont(new Font("Segoe UI Black", Font.BOLD, 40));
			lblquienesSomos.setBounds(403, 108, 346, 55);
			teamframe.getContentPane().add(lblquienesSomos);
			
			JLabel logo_1 = new JLabel("");
			logo_1.setIcon(new ImageIcon(team.class.getResource("/resources/smalllogo.png")));
			logo_1.setBounds(20, 18, 90, 62);
			teamframe.getContentPane().add(logo_1);
			
			JButton btnInicio = new JButton("Inicio");
			btnInicio.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					index index=new index();
					index.main(null);
					teamframe.dispose();
				}
			});
			btnInicio.setForeground(Color.GRAY);
			btnInicio.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
			btnInicio.setBackground(Color.WHITE);
			btnInicio.setBounds(439, 29, 97, 29);
			teamframe.getContentPane().add(btnInicio);
			
			JButton btnSalir = new JButton("Salir");
			btnSalir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					teamframe.dispose();
				}
			});
			btnSalir.setForeground(Color.GRAY);
			btnSalir.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
			btnSalir.setBackground(Color.WHITE);
			btnSalir.setBounds(1078, 28, 90, 31);
			teamframe.getContentPane().add(btnSalir);
			
			JButton btnquienesSomos = new JButton("\u00BFQuienes Somos?");
			btnquienesSomos.addActionListener(new ActionListener( ) {
				public void actionPerformed(ActionEvent e) {
					team team=new team();
					team.main(null);
					teamframe.dispose();
				}
			});
			btnquienesSomos.setForeground(Color.GRAY);
			btnquienesSomos.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
			btnquienesSomos.setBackground(Color.WHITE);
			btnquienesSomos.setBounds(549, 28, 202, 29);
			teamframe.getContentPane().add(btnquienesSomos);
			
			JButton btnContacto = new JButton("Contacto");
			btnContacto.addActionListener(new ActionListener( ) {
				public void actionPerformed(ActionEvent e) {
					contact contact=new contact();
					contact.main(null);
					teamframe.dispose();
				}
			});
			btnContacto.setForeground(Color.GRAY);
			btnContacto.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
			btnContacto.setBackground(Color.WHITE);
			btnContacto.setBounds(761, 28, 129, 31);
			teamframe.getContentPane().add(btnContacto);
			
			JButton btnIniciarSesin = new JButton("Iniciar Sesi\u00F3n");
			btnIniciarSesin.addActionListener(new ActionListener( ) {
				public void actionPerformed(ActionEvent e) {
					login login=new login();
					login.main(null);
					teamframe.dispose();
				}
			});
			btnIniciarSesin.setForeground(Color.GRAY);
			btnIniciarSesin.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
			btnIniciarSesin.setBackground(Color.WHITE);
			btnIniciarSesin.setBounds(900, 28, 168, 31);
			teamframe.getContentPane().add(btnIniciarSesin);
			
			JLabel logo_1_1 = new JLabel("");
			logo_1_1.setIcon(new ImageIcon(team.class.getResource("/resources/smallpersonicon.png")));
			logo_1_1.setBounds(94, 188, 150, 150);
			teamframe.getContentPane().add(logo_1_1);
			
			JLabel logo_1_1_1 = new JLabel("");
			logo_1_1_1.setIcon(new ImageIcon(team.class.getResource("/resources/smallpersonicon.png")));
			logo_1_1_1.setBounds(487, 184, 150, 150);
			teamframe.getContentPane().add(logo_1_1_1);
			
			JLabel logo_1_1_1_1 = new JLabel("");
			logo_1_1_1_1.setIcon(new ImageIcon(team.class.getResource("/resources/smallpersonicon.png")));
			logo_1_1_1_1.setBounds(900, 181, 150, 150);
			teamframe.getContentPane().add(logo_1_1_1_1);
			
			JLabel lblJaimeLpez = new JLabel("Jaime L\u00F3pez");
			lblJaimeLpez.setForeground(Color.WHITE);
			lblJaimeLpez.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
			lblJaimeLpez.setBounds(69, 342, 192, 42);
			teamframe.getContentPane().add(lblJaimeLpez);
			
			JLabel lblRicardoCastaeda = new JLabel("Ricardo Casta\u00F1eda");
			lblRicardoCastaeda.setForeground(Color.WHITE);
			lblRicardoCastaeda.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
			lblRicardoCastaeda.setBounds(423, 342, 289, 42);
			teamframe.getContentPane().add(lblRicardoCastaeda);
			
			JLabel lblPersona = new JLabel("Persona3");
			lblPersona.setForeground(Color.WHITE);
			lblPersona.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
			lblPersona.setBounds(902, 339, 145, 42);
			teamframe.getContentPane().add(lblPersona);
			
			JLabel lblPuesto = new JLabel("Puesto");
			lblPuesto.setForeground(Color.WHITE);
			lblPuesto.setFont(new Font("Segoe UI", Font.BOLD, 20));
			lblPuesto.setBounds(135, 390, 64, 27);
			teamframe.getContentPane().add(lblPuesto);
			
			JLabel lblPuesto_1 = new JLabel("Puesto");
			lblPuesto_1.setForeground(Color.WHITE);
			lblPuesto_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
			lblPuesto_1.setBounds(535, 390, 64, 27);
			teamframe.getContentPane().add(lblPuesto_1);
			
			JLabel lblPuesto_1_1 = new JLabel("Puesto");
			lblPuesto_1_1.setForeground(Color.WHITE);
			lblPuesto_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
			lblPuesto_1_1.setBounds(945, 383, 64, 27);
			teamframe.getContentPane().add(lblPuesto_1_1);
		}
	}
