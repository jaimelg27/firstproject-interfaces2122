package inversiones;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
				new indexuser();
				inversiones.indexuser.main(null);
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
				new money();
				inversiones.money.main(null);
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
				new usersettings();
				usersettings.main(null);
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
				new index();
				inversiones.index.main(null);
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
				new trading();
				trading.main(null);
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
		
		JRadioButton rdbtnDepositar = new JRadioButton("Depositar");
		rdbtnDepositar.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		rdbtnDepositar.setBackground(Color.GRAY);
		rdbtnDepositar.setForeground(Color.WHITE);
		rdbtnDepositar.setBounds(520, 158, 79, 27);
		moneyframe.getContentPane().add(rdbtnDepositar);
		
		JRadioButton rdbtnRetirar = new JRadioButton("Retirar");
		rdbtnRetirar.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 13));
		rdbtnRetirar.setForeground(Color.WHITE);
		rdbtnRetirar.setBackground(Color.GRAY);
		rdbtnRetirar.setBounds(606, 158, 63, 27);
		moneyframe.getContentPane().add(rdbtnRetirar);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rdbtnRetirar);
		bg.add(rdbtnDepositar);
		
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
		
		ButtonGroup bg2=new ButtonGroup();
		bg2.add(rdbtnTarjetaBancaria);
		bg2.add(rdbtnTransferencia);
		bg2.add(rdbtnBizum);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setForeground(Color.WHITE);
		lblCantidad.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblCantidad.setBounds(563, 307, 78, 21);
		moneyframe.getContentPane().add(lblCantidad);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(528, 339, 174, 20);
		moneyframe.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (rdbtnDepositar.isSelected()) {
					if (Double.parseDouble(textField.getText())<0) {
						JOptionPane.showInternalMessageDialog(null , "No puede introducir dinero negativo.");
					} else {
						addMoney(Double.parseDouble(textField.getText()));
						if(rdbtnTarjetaBancaria.isSelected()) {
							
						} else if (rdbtnTransferencia.isSelected()) {
							
						} else if (rdbtnBizum.isSelected()) {
							
						}
					}
				} else if (rdbtnRetirar.isSelected()) {
					if (Double.parseDouble(textField.getText())<0) {
						JOptionPane.showInternalMessageDialog(null , "No puede sacar dinero negativo.");
					} else {
						removeMoney(Double.parseDouble(textField.getText()));
						if(rdbtnTarjetaBancaria.isSelected()) {
							
						} else if (rdbtnTransferencia.isSelected()) {
							
						} else if (rdbtnBizum.isSelected()) {
							
						}
					}

				}
			}
		});
		btnConfirmar.setForeground(Color.GRAY);
		btnConfirmar.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btnConfirmar.setBackground(Color.WHITE);
		btnConfirmar.setBounds(555, 388, 117, 31);
		moneyframe.getContentPane().add(btnConfirmar);
	}
	public void addMoney(double value) {
		dbconnection dbconex=new dbconnection();
		try {
			Statement stat = dbconex.getConnection().createStatement();
			String querySQL="UPDATE accounts SET value=value+'"+value+"' WHERE id_client='"+staticparametersclient.dni+"';";
			stat.executeUpdate(querySQL);
			JOptionPane.showInternalMessageDialog(null , "Dinero Ingresado");
			dbconex.closeconn();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void removeMoney(double value) {
		dbconnection dbconex=new dbconnection();
		try {
			Statement stat = dbconex.getConnection().createStatement();
			String querySQL="SELECT value FROM accounts WHERE id_client= '"+staticparametersclient.dni+"';";
			ResultSet rs=stat.executeQuery(querySQL);
			while (rs.next()) {
				if((rs.getInt("value"))-value>=0) {
					String querySQL2="UPDATE accounts SET value=value-'"+value+"' WHERE id_client='"+staticparametersclient.dni+"';";
					stat.executeUpdate(querySQL2);
					JOptionPane.showInternalMessageDialog(null , "Ha sacado dinero");
					dbconex.closeconn();
				} else {
					JOptionPane.showInternalMessageDialog(null , "No es posible retirar esa cantidad, se quedaria en numeros rojos.");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void addmovement(int opcion, double value) {
		dbconnection dbconex=new dbconnection();
		switch(opcion) {
		case 1:
			Statement stat = dbconex.getConnection().createStatement();
			break;
		case 2:
			Statement stat = dbconex.getConnection().createStatement();
			break;
		case 3:
			Statement stat = dbconex.getConnection().createStatement();
			break;
		case 4:
			Statement stat = dbconex.getConnection().createStatement();
			break;
		case 5:
			Statement stat = dbconex.getConnection().createStatement();
			break;
		case 6:
			Statement stat = dbconex.getConnection().createStatement();
			break;
		}
	}
	
}
