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
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class money {

	private JFrame moneyframe;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					money window = new money();
					window.moneyframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public money() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		moneyframe = new JFrame();
		moneyframe.setLocationRelativeTo(null);
		moneyframe.getContentPane().setBackground(Color.GRAY);
		moneyframe.setResizable(false);
		moneyframe.setBounds(100, 100, 1200, 800);
		moneyframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		moneyframe.getContentPane().setLayout(null);
		
		JLabel logo_1 = new JLabel("");
		logo_1.setIcon(new ImageIcon(index.class.getResource("/resources/smalllogo.png")));
		logo_1.setBounds(10, 11, 90, 69);
		moneyframe.getContentPane().add(logo_1);
		
		JButton btnInicio = new JButton("Inicio");
		btnInicio.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				userindex newuserindex=new userindex();
				newuserindex.main(null);
				moneyframe.dispose();
			}
		});
		btnInicio.setForeground(Color.GRAY);
		btnInicio.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnInicio.setBackground(Color.WHITE);
		btnInicio.setBounds(289, 24, 97, 29);
		moneyframe.getContentPane().add(btnInicio);
		
		JButton btnMercados = new JButton("Depositar/Retirar Dinero");
		btnMercados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				money money=new money();
				money.main(null);
				moneyframe.dispose();
			}
		});
		btnMercados.setForeground(Color.GRAY);
		btnMercados.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnMercados.setBackground(Color.WHITE);
		btnMercados.setBounds(570, 24, 287, 29);
		moneyframe.getContentPane().add(btnMercados);
		
		JButton btnAjustes = new JButton("Ajustes");
		btnAjustes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usersettings settings=new usersettings();
				settings.main(null);
				moneyframe.dispose();
			}
		});
		btnAjustes.setForeground(Color.GRAY);
		btnAjustes.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnAjustes.setBackground(Color.WHITE);
		btnAjustes.setBounds(867, 24, 129, 29);
		moneyframe.getContentPane().add(btnAjustes);
		
		JButton btnCerrarSesin = new JButton("Cerrar Sesi\u00F3n");
		btnCerrarSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCerrarSesin.setForeground(Color.GRAY);
		btnCerrarSesin.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				index index=new index();
				index.main(null);
				moneyframe.dispose();
			}
		});
		btnCerrarSesin.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnCerrarSesin.setBackground(Color.WHITE);
		btnCerrarSesin.setBounds(1006, 24, 168, 29);
		moneyframe.getContentPane().add(btnCerrarSesin);
		
		JButton btnOperaciones = new JButton("Operaciones");
		btnOperaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trading ops=new trading();
				ops.main(null);
				moneyframe.dispose();
			}
		});
		btnOperaciones.setForeground(Color.GRAY);
		btnOperaciones.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnOperaciones.setBackground(Color.WHITE);
		btnOperaciones.setBounds(396, 24, 164, 29);
		moneyframe.getContentPane().add(btnOperaciones);
		
		JLabel lblDepositarretirarDinero = new JLabel("Depositar/Retirar Dinero");
		lblDepositarretirarDinero.setForeground(Color.WHITE);
		lblDepositarretirarDinero.setFont(new Font("Segoe UI Black", Font.BOLD, 40));
		lblDepositarretirarDinero.setBounds(363, 92, 509, 55);
		moneyframe.getContentPane().add(lblDepositarretirarDinero);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Depositar");
		rdbtnNewRadioButton.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		rdbtnNewRadioButton.setBackground(Color.GRAY);
		rdbtnNewRadioButton.setForeground(Color.WHITE);
		rdbtnNewRadioButton.setBounds(520, 158, 79, 27);
		moneyframe.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnRetirar = new JRadioButton("Retirar");
		rdbtnRetirar.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		rdbtnRetirar.setForeground(Color.WHITE);
		rdbtnRetirar.setBackground(Color.GRAY);
		rdbtnRetirar.setBounds(606, 158, 63, 27);
		moneyframe.getContentPane().add(rdbtnRetirar);
		
		JLabel lblPagarCon = new JLabel("Pagar con:");
		lblPagarCon.setForeground(Color.WHITE);
		lblPagarCon.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblPagarCon.setBounds(563, 192, 78, 21);
		moneyframe.getContentPane().add(lblPagarCon);
		
		JRadioButton rdbtnTarjetaBancaria = new JRadioButton("Tarjeta Bancaria");
		rdbtnTarjetaBancaria.setForeground(Color.WHITE);
		rdbtnTarjetaBancaria.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		rdbtnTarjetaBancaria.setBackground(Color.GRAY);
		rdbtnTarjetaBancaria.setBounds(524, 222, 117, 27);
		moneyframe.getContentPane().add(rdbtnTarjetaBancaria);
		
		JRadioButton rdbtnTransferencia = new JRadioButton("Transferencia");
		rdbtnTransferencia.setForeground(Color.WHITE);
		rdbtnTransferencia.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		rdbtnTransferencia.setBackground(Color.GRAY);
		rdbtnTransferencia.setBounds(524, 252, 101, 27);
		moneyframe.getContentPane().add(rdbtnTransferencia);
		
		JRadioButton rdbtnBizum = new JRadioButton("Bizum");
		rdbtnBizum.setForeground(Color.WHITE);
		rdbtnBizum.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		rdbtnBizum.setBackground(Color.GRAY);
		rdbtnBizum.setBounds(524, 282, 101, 27);
		moneyframe.getContentPane().add(rdbtnBizum);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setForeground(Color.WHITE);
		lblCantidad.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblCantidad.setBounds(563, 307, 78, 21);
		moneyframe.getContentPane().add(lblCantidad);
		
		textField = new JTextField();
		textField.setBackground(Color.GRAY);
		textField.setBounds(528, 339, 174, 20);
		moneyframe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setForeground(Color.GRAY);
		btnConfirmar.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btnConfirmar.setBackground(Color.WHITE);
		btnConfirmar.setBounds(563, 388, 109, 31);
		moneyframe.getContentPane().add(btnConfirmar);
	}
}
