package inversiones;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class indexadmin {

	private JFrame adminindexframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					indexadmin window = new indexadmin();
					window.adminindexframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public indexadmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		adminindexframe = new JFrame();
		adminindexframe.setLocationRelativeTo(null);
		adminindexframe.getContentPane().setBackground(Color.GRAY);
		adminindexframe.setResizable(false);
		adminindexframe.setBounds(100, 100, 1200, 800);
		adminindexframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adminindexframe.getContentPane().setLayout(null);
		
		JLabel logo_1 = new JLabel("");
		logo_1.setIcon(new ImageIcon(index.class.getResource("/resources/smalllogo.png")));
		logo_1.setBounds(10, 11, 90, 69);
		adminindexframe.getContentPane().add(logo_1);
		
		JButton btnInicio = new JButton("Inicio");
		btnInicio.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				new indexuser();
				indexuser.main(null);
				adminindexframe.dispose();
			}
		});
		btnInicio.setForeground(Color.GRAY);
		btnInicio.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnInicio.setBackground(Color.WHITE);
		btnInicio.setBounds(575, 24, 97, 29);
		adminindexframe.getContentPane().add(btnInicio);
		
		JButton btnMercados = new JButton("Informes");
		btnMercados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new money();
				inversiones.money.main(null);
				adminindexframe.dispose();
			}
		});
		btnMercados.setForeground(Color.GRAY);
		btnMercados.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnMercados.setBackground(Color.WHITE);
		btnMercados.setBounds(867, 24, 129, 29);
		adminindexframe.getContentPane().add(btnMercados);
		
		JButton btnCerrarSesin = new JButton("Cerrar Sesi\u00F3n");
		btnCerrarSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCerrarSesin.setForeground(Color.GRAY);
		btnCerrarSesin.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				new index();
				inversiones.index.main(null);
				adminindexframe.dispose();
			}
		});
		btnCerrarSesin.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnCerrarSesin.setBackground(Color.WHITE);
		btnCerrarSesin.setBounds(1006, 24, 168, 29);
		adminindexframe.getContentPane().add(btnCerrarSesin);
		
		JButton btnOperaciones = new JButton("Lista Usuarios");
		btnOperaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new userlist();
				userlist.main(null);
				adminindexframe.dispose();
			}
		});
		btnOperaciones.setForeground(Color.GRAY);
		btnOperaciones.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnOperaciones.setBackground(Color.WHITE);
		btnOperaciones.setBounds(682, 24, 175, 29);
		adminindexframe.getContentPane().add(btnOperaciones);
		
		JLabel lblPanelAdministracin = new JLabel("Panel Administraci\u00F3n");
		lblPanelAdministracin.setForeground(Color.WHITE);
		lblPanelAdministracin.setFont(new Font("Segoe UI Black", Font.BOLD, 40));
		lblPanelAdministracin.setBounds(392, 93, 438, 55);
		adminindexframe.getContentPane().add(lblPanelAdministracin);
	}
}
