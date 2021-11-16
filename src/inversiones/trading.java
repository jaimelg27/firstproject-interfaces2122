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

public class trading {

	private JFrame tradingframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					trading window = new trading();
					window.tradingframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public trading() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		tradingframe = new JFrame();
		tradingframe.setLocationRelativeTo(null);
		tradingframe.getContentPane().setBackground(Color.GRAY);
		tradingframe.setResizable(false);
		tradingframe.setBounds(100, 100, 1200, 800);
		tradingframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tradingframe.getContentPane().setLayout(null);
		
		JLabel logo_1 = new JLabel("");
		logo_1.setIcon(new ImageIcon(index.class.getResource("/resources/smalllogo.png")));
		logo_1.setBounds(10, 11, 90, 69);
		tradingframe.getContentPane().add(logo_1);
		
		JButton btnInicio = new JButton("Inicio");
		btnInicio.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				new indexuser();
				inversiones.indexuser.main(null);
				tradingframe.dispose();
			}
		});
		btnInicio.setForeground(Color.GRAY);
		btnInicio.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnInicio.setBackground(Color.WHITE);
		btnInicio.setBounds(287, 24, 97, 29);
		tradingframe.getContentPane().add(btnInicio);
		
		JButton btnMercados = new JButton("Depositar/Retirar Dinero");
		btnMercados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new money();
				inversiones.money.main(null);
				tradingframe.dispose();
			}
		});
		btnMercados.setForeground(Color.GRAY);
		btnMercados.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnMercados.setBackground(Color.WHITE);
		btnMercados.setBounds(570, 24, 287, 29);
		tradingframe.getContentPane().add(btnMercados);
		
		JButton btnAjustes = new JButton("Ajustes");
		btnAjustes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new usersettings();
				usersettings.main(null);
				tradingframe.dispose();
			}
		});
		btnAjustes.setForeground(Color.GRAY);
		btnAjustes.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnAjustes.setBackground(Color.WHITE);
		btnAjustes.setBounds(867, 24, 129, 29);
		tradingframe.getContentPane().add(btnAjustes);
		
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
				tradingframe.dispose();
			}
		});
		btnCerrarSesin.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnCerrarSesin.setBackground(Color.WHITE);
		btnCerrarSesin.setBounds(1006, 24, 168, 29);
		tradingframe.getContentPane().add(btnCerrarSesin);
		
		JButton btnOperaciones = new JButton("Operaciones");
		btnOperaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new trading();
				trading.main(null);
				tradingframe.dispose();
			}
		});
		btnOperaciones.setForeground(Color.GRAY);
		btnOperaciones.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnOperaciones.setBackground(Color.WHITE);
		btnOperaciones.setBounds(394, 24, 166, 29);
		tradingframe.getContentPane().add(btnOperaciones);
	}
}
