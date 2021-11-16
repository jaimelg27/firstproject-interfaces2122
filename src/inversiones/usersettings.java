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
import javax.swing.JTextField;

public class usersettings {

	private JFrame usersettingsframe;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					usersettings window = new usersettings();
					window.usersettingsframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public usersettings() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		usersettingsframe = new JFrame();
		usersettingsframe.setLocationRelativeTo(null);
		usersettingsframe.getContentPane().setBackground(Color.GRAY);
		usersettingsframe.setResizable(false);
		usersettingsframe.setBounds(100, 100, 1200, 800);
		usersettingsframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		usersettingsframe.getContentPane().setLayout(null);
		
		JLabel logo_1 = new JLabel("");
		logo_1.setIcon(new ImageIcon(index.class.getResource("/resources/smalllogo.png")));
		logo_1.setBounds(10, 11, 90, 69);
		usersettingsframe.getContentPane().add(logo_1);
		
		JButton btnInicio = new JButton("Inicio");
		btnInicio.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				new indexuser();
				inversiones.indexuser.main(null);
				usersettingsframe.dispose();
			}
		});
		btnInicio.setForeground(Color.GRAY);
		btnInicio.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnInicio.setBackground(Color.WHITE);
		btnInicio.setBounds(291, 24, 97, 29);
		usersettingsframe.getContentPane().add(btnInicio);
		
		JButton btnMercados = new JButton("Depositar/Retirar Dinero");
		btnMercados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new money();
				inversiones.money.main(null);
				usersettingsframe.dispose();
			}
		});
		btnMercados.setForeground(Color.GRAY);
		btnMercados.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnMercados.setBackground(Color.WHITE);
		btnMercados.setBounds(570, 24, 287, 29);
		usersettingsframe.getContentPane().add(btnMercados);
		
		JButton btnAjustes = new JButton("Ajustes");
		btnAjustes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new usersettings();
				usersettings.main(null);
				usersettingsframe.dispose();
			}
		});
		btnAjustes.setForeground(Color.GRAY);
		btnAjustes.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnAjustes.setBackground(Color.WHITE);
		btnAjustes.setBounds(867, 24, 129, 29);
		usersettingsframe.getContentPane().add(btnAjustes);
		
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
				usersettingsframe.dispose();
			}
		});
		btnCerrarSesin.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnCerrarSesin.setBackground(Color.WHITE);
		btnCerrarSesin.setBounds(1006, 24, 168, 29);
		usersettingsframe.getContentPane().add(btnCerrarSesin);
		
		JButton btnOperaciones = new JButton("Operaciones");
		btnOperaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new trading();
				trading.main(null);
				usersettingsframe.dispose();
			}
		});
		btnOperaciones.setForeground(Color.GRAY);
		btnOperaciones.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnOperaciones.setBackground(Color.WHITE);
		btnOperaciones.setBounds(398, 24, 162, 29);
		usersettingsframe.getContentPane().add(btnOperaciones);
		
		JLabel lblAjustes = new JLabel("Ajustes");
		lblAjustes.setForeground(Color.WHITE);
		lblAjustes.setFont(new Font("Segoe UI Black", Font.BOLD, 40));
		lblAjustes.setBounds(478, 93, 151, 55);
		usersettingsframe.getContentPane().add(lblAjustes);
		
		JButton btnDarDeBaja = new JButton("Dar de baja de EscolapInversiones");
		btnDarDeBaja.setForeground(Color.GRAY);
		btnDarDeBaja.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnDarDeBaja.setBackground(Color.WHITE);
		btnDarDeBaja.setBounds(352, 393, 384, 35);
		usersettingsframe.getContentPane().add(btnDarDeBaja);
		
		JLabel lblModificarDomicilio = new JLabel("Modificar Domicilio");
		lblModificarDomicilio.setForeground(Color.WHITE);
		lblModificarDomicilio.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblModificarDomicilio.setBounds(10, 156, 135, 21);
		usersettingsframe.getContentPane().add(lblModificarDomicilio);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 188, 352, 26);
		usersettingsframe.getContentPane().add(textField);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setForeground(Color.GRAY);
		btnModificar.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		btnModificar.setBackground(Color.WHITE);
		btnModificar.setBounds(10, 225, 140, 29);
		usersettingsframe.getContentPane().add(btnModificar);
		
		JLabel lblModificarTelefono = new JLabel("Modificar Telefono");
		lblModificarTelefono.setForeground(Color.WHITE);
		lblModificarTelefono.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblModificarTelefono.setBounds(10, 276, 135, 21);
		usersettingsframe.getContentPane().add(lblModificarTelefono);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 308, 352, 26);
		usersettingsframe.getContentPane().add(textField_1);
		
		JButton btnModificar_1 = new JButton("Modificar");
		btnModificar_1.setForeground(Color.GRAY);
		btnModificar_1.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		btnModificar_1.setBackground(Color.WHITE);
		btnModificar_1.setBounds(10, 345, 143, 29);
		usersettingsframe.getContentPane().add(btnModificar_1);
	}
}
