package inversiones;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;

import com.mysql.jdbc.Statement;

import Inversiones.Acciones;
import Inversiones.Acciones_negativas;
import Inversiones.Mete_menos_acciones;
import Inversiones.VariablesEstaticas;
import Inversiones.fluctuacion;

public class trading {

	private JFrame panel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					trading window = new trading();
					window.panel_1.setVisible(true);
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
		double fluctana = 2.00;
		double fluctaena = 2.00;
		double fluctfer = 2.00;
		double fluctiag = 2.00;
		double fluctmel = 2.00;
		double fluctrep = 2.00;
		double flucttef = 2.00;
		
		String f0= String.format("%.2f", fluctana);
		String f1= String.format("%.2f", fluctaena);
		String f2= String.format("%.2f", fluctfer);
		String f3= String.format("%.2f", fluctiag);
		String f4= String.format("%.2f", fluctmel);
		String f5= String.format("%.2f", fluctrep);
		String f6= String.format("%.2f", flucttef);
		
		panel_1 = new JFrame();
		panel_1.setLocationRelativeTo(null);
		panel_1.getContentPane().setBackground(Color.GRAY);
		panel_1.setResizable(false);
		panel_1.setBounds(100, 100, 1200, 800);
		panel_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel_1.getContentPane().setLayout(null);
		
		
		
		JLabel logo_1 = new JLabel("");
		logo_1.setIcon(new ImageIcon(index.class.getResource("/resources/smalllogo.png")));
		logo_1.setBounds(10, 11, 90, 69);
		panel_1.getContentPane().add(logo_1);
		
		JButton btnInicio = new JButton("Inicio");
		btnInicio.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				new indexuser();
				inversiones.indexuser.main(null);
				panel_1.dispose();
			}
		});
		btnInicio.setForeground(Color.GRAY);
		btnInicio.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnInicio.setBackground(Color.WHITE);
		btnInicio.setBounds(287, 24, 97, 29);
		panel_1.getContentPane().add(btnInicio);
		
		JButton btnMercados = new JButton("Depositar/Retirar Dinero");
		btnMercados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new money();
				inversiones.money.main(null);
				panel_1.dispose();
			}
		});
		btnMercados.setForeground(Color.GRAY);
		btnMercados.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnMercados.setBackground(Color.WHITE);
		btnMercados.setBounds(570, 24, 287, 29);
		panel_1.getContentPane().add(btnMercados);
		
		JButton btnAjustes = new JButton("Ajustes");
		btnAjustes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new usersettings();
				usersettings.main(null);
				panel_1.dispose();
			}
		});
		btnAjustes.setForeground(Color.GRAY);
		btnAjustes.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnAjustes.setBackground(Color.WHITE);
		btnAjustes.setBounds(867, 24, 129, 29);
		panel_1.getContentPane().add(btnAjustes);
		
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
				panel_1.dispose();
			}
		});
		btnCerrarSesin.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnCerrarSesin.setBackground(Color.WHITE);
		btnCerrarSesin.setBounds(1006, 24, 168, 29);
		panel_1.getContentPane().add(btnCerrarSesin);
		
		JButton btnOperaciones = new JButton("Operaciones");
		btnOperaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new trading();
				trading.main(null);
				panel_1.dispose();
			}
		});
		btnOperaciones.setForeground(Color.GRAY);
		btnOperaciones.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnOperaciones.setBackground(Color.WHITE);
		btnOperaciones.setBounds(394, 24, 166, 29);
		panel_1.getContentPane().add(btnOperaciones);
		
		JLabel SeleccionarLabel = new JLabel("A COMPRAR");
		SeleccionarLabel.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		SeleccionarLabel.setBounds(830, 106, 83, 21);
		panel_1.getContentPane().add(SeleccionarLabel);		
		
		
		JLabel fluctuacion1Label = new JLabel(""+f0);
		fluctuacion1Label.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fluctuacion1Label.setBounds(592, 151, 27, 21);
		panel_1.getContentPane().add(fluctuacion1Label);
		
		JLabel fluctuacion2Label = new JLabel(""+f1);
		fluctuacion2Label.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fluctuacion2Label.setBounds(592, 201, 27, 21);
		panel_1.getContentPane().add(fluctuacion2Label);
		
		JLabel fluctuacion3Label = new JLabel(""+f2);
		fluctuacion3Label.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fluctuacion3Label.setBounds(592, 251, 27, 21);
		panel_1.getContentPane().add(fluctuacion3Label);
		
		JLabel fluctuacion4Label = new JLabel(""+f3);
		fluctuacion4Label.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fluctuacion4Label.setBounds(592, 301, 27, 21);
		panel_1.getContentPane().add(fluctuacion4Label);
		
		JLabel fluctuacion5Label = new JLabel(""+f4);
		fluctuacion5Label.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fluctuacion5Label.setBounds(592, 351, 27, 21);
		panel_1.getContentPane().add(fluctuacion5Label);
		
		JLabel fluctuacion6Label = new JLabel(""+f5);
		fluctuacion6Label.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fluctuacion6Label.setBounds(592, 401, 27, 21);
		panel_1.getContentPane().add(fluctuacion6Label);
		
		JLabel fluctuacion7Label = new JLabel(""+f6);
		fluctuacion7Label.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fluctuacion7Label.setBounds(592, 451, 27, 21);
		panel_1.getContentPane().add(fluctuacion7Label);
		
		JSpinner spinner_1_0 = new JSpinner();
		spinner_1_0.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		spinner_1_0.setBounds(794, 150, 56, 22);
		panel_1.getContentPane().add(spinner_1_0);
		
		JSpinner spinner_1_1 = new JSpinner();
		spinner_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		spinner_1_1.setBounds(794, 197, 56, 22);
		panel_1.getContentPane().add(spinner_1_1);
		
		JSpinner spinner_1_2 = new JSpinner();
		spinner_1_2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		spinner_1_2.setBounds(794, 250, 56, 22);
		panel_1.getContentPane().add(spinner_1_2);
		
		JSpinner spinner_1_3 = new JSpinner();
		spinner_1_3.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		spinner_1_3.setBounds(794, 300, 56, 22);
		panel_1.getContentPane().add(spinner_1_3);
		
		JSpinner spinner_1_4 = new JSpinner();
		spinner_1_4.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		spinner_1_4.setBounds(794, 350, 56, 22);
		panel_1.getContentPane().add(spinner_1_4);
		
		JSpinner spinner_1_5 = new JSpinner();
		spinner_1_5.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		spinner_1_5.setBounds(794, 400, 56, 22);
		panel_1.getContentPane().add(spinner_1_5);
		
		JSpinner spinner_1_6 = new JSpinner();
		spinner_1_6.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		spinner_1_6.setBounds(794, 450, 56, 22);
		panel_1.getContentPane().add(spinner_1_6);
		
		JLabel lblFluctuacion = new JLabel("FLUCTUACION");
		lblFluctuacion.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblFluctuacion.setBounds(563, 106, 96, 21);
		panel_1.getContentPane().add(lblFluctuacion);
		
		JLabel lblMercado = new JLabel("MERCADO");
		lblMercado.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblMercado.setBounds(272, 107, 71, 21);
		panel_1.getContentPane().add(lblMercado);
		
		JLabel lblAnaAcciona = new JLabel("ANA - ACCIONA");
		lblAnaAcciona.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblAnaAcciona.setBounds(260, 145, 109, 21);
		panel_1.getContentPane().add(lblAnaAcciona);
		
		JLabel lblAenaAena = new JLabel("AENA - AENA");
		lblAenaAena.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblAenaAena.setBounds(261, 196, 92, 21);
		panel_1.getContentPane().add(lblAenaAena);
		
		JLabel lblFerFerrovial = new JLabel("FER - FERROVIAL");
		lblFerFerrovial.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblFerFerrovial.setBounds(256, 246, 112, 21);
		panel_1.getContentPane().add(lblFerFerrovial);
		
		JLabel lblIagIag = new JLabel("IAG - IAG");
		lblIagIag.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblIagIag.setBounds(273, 301, 62, 21);
		panel_1.getContentPane().add(lblIagIag);
		
		JLabel lblMelMeli = new JLabel("MEL - Meli\u00E1");
		lblMelMeli.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblMelMeli.setBounds(271, 347, 79, 21);
		panel_1.getContentPane().add(lblMelMeli);
		
		JLabel lblRepRepsol = new JLabel("REP - Repsol");
		lblRepRepsol.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblRepRepsol.setBounds(270, 395, 84, 21);
		panel_1.getContentPane().add(lblRepRepsol);
		
		JLabel lblTefTelefonica = new JLabel("TEF - Telefonica");
		lblTefTelefonica.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblTefTelefonica.setBounds(262, 447, 106, 21);
		panel_1.getContentPane().add(lblTefTelefonica);
		
		JButton btnNewButton_1_0 = new JButton("Comprar");
		btnNewButton_1_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if ((Integer.parseInt(spinner_1_1.getValue().toString()))<0) {
					JOptionPane.showInternalMessageDialog(null , "No puedes comprar acciones negativas.");
				}
				else if (((Integer.parseInt(spinner_1_1.getValue().toString()))*(Double.parseDouble(DineroLabel_1_1.getText().replace(",", "."))))>VariablesEstaticas.Dinero)                                 {
					JOptionPane.showInternalMessageDialog(null , "No tienes suficiente dinero para comprar las acciones.");
				}else {
			CompraAccion (VariablesEstaticas.Dinero, DineroLabel_1_1.getText().replace(",", "."), Integer.parseInt(spinner_1_1.getValue().toString()));
					
			int accionesrestantes = VariablesEstaticas.NACS
					+ Integer.parseInt(spinner_1_1.getValue().toString());
			VariablesEstaticas.NACS = accionesrestantes;

			try {
				Connection miConexion = DriverManager
						.getConnection("jdbc:mysql://localhost:3306/EscolapInversiones", "root", "");
				Statement miStatement = (Statement) miConexion.createStatement();
				String instruccionSQL = "UPDATE cliente SET numero_acs='" + accionesrestantes
						+ "' WHERE correo='" + VariablesEstaticas.Correo + "';";
				miStatement.executeUpdate(instruccionSQL);
			} catch (SQLException f) {
				f.printStackTrace();
			}
			String dineroactualizado = String.valueOf(VariablesEstaticas.Dinero);
			Dinero1.setText(dineroactualizado);
			
			try {
				registroscompra(VariablesEstaticas.NombreEstatico, VariablesEstaticas.ApellidoEstatico,Integer.parseInt(spinner_1_1.getValue().toString()), DineroLabel_1_1.getText(),"ACS");
			} catch (NumberFormatException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
				}
			}
		});
		JButton btnNewButton_1_0 = new JButton("Comprar");
		btnNewButton_1_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
/*
 * metodo con el que primero confirmo si tengo suficiente dinero para la compra de acciones, si es asi, compro las
 * acciones seleccionadas en el spinner, hago su calculo, y actualizo, tanto en la bbdd como  en el propio jlabel				
 */
				
				if ((Integer.parseInt(spinner_1_0.getValue().toString()))<0) {
					JOptionPane.showInternalMessageDialog(null , "No puedes comprar acciones negativas.");
				}
				else if (((Integer.parseInt(spinner_1_0.getValue().toString()))*(Double.parseDouble(DineroLabel_1_0.getText().replace(",", "."))))>VariablesEstaticas.Dinero)                                 {
					JOptionPane.showInternalMessageDialog(null , "No tienes suficiente dinero para comprar las acciones.");
				}else {
//***********cuando obtengo el dinero, viene con una coma y hay que remplazarla con un punto************
			CompraAccion (VariablesEstaticas.Dinero, DineroLabel_1_0.getText().replace(",", "."), Integer.parseInt(spinner_1_0.getValue().toString()));
					
			int accionesrestantes = VariablesEstaticas.NAcciona
					+ Integer.parseInt(spinner_1_0.getValue().toString());
			VariablesEstaticas.NAcciona = accionesrestantes;

			try {
				Connection miConexion = DriverManager
						.getConnection("jdbc:mysql://localhost:3306/EscolapInversiones", "root", "");
				Statement miStatement = (Statement) miConexion.createStatement();
				String instruccionSQL = "UPDATE cliente SET numero_acciona='" + accionesrestantes
						+ "' WHERE correo='" + VariablesEstaticas.Correo + "';";
				miStatement.executeUpdate(instruccionSQL);
			} catch (SQLException f) {
				f.printStackTrace();
			}
			String dineroactualizado = String.valueOf(VariablesEstaticas.Dinero);
			Dinero1.setText(dineroactualizado);
			
			try {
				registroscompra(VariablesEstaticas.NombreEstatico, VariablesEstaticas.ApellidoEstatico,Integer.parseInt(spinner_1_0.getValue().toString()), DineroLabel_1_0.getText(),"Acciona");
			} catch (NumberFormatException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
				}
			}
		});
		btnNewButton_1_0.setBounds(867, 148, 85, 21);
		panel_1.getContentPane().add(btnNewButton_1_0);
		
		JButton btnNewButton_1_1 = new JButton("Comprar");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//evento boton1
				if ((Integer.parseInt(spinner_1_1.getValue().toString()))<0) {
					JOptionPane.showInternalMessageDialog(null , "No puedes comprar acciones negativas.");
				}
				else if (((Integer.parseInt(spinner_1_1.getValue().toString()))*(Double.parseDouble(DineroLabel_1_1.getText().replace(",", "."))))>VariablesEstaticas.Dinero)                                 {
					JOptionPane.showInternalMessageDialog(null , "No tienes suficiente dinero para comprar las acciones.");
				}else {
			CompraAccion (VariablesEstaticas.Dinero, DineroLabel_1_1.getText().replace(",", "."), Integer.parseInt(spinner_1_1.getValue().toString()));
					
			int accionesrestantes = VariablesEstaticas.NACS
					+ Integer.parseInt(spinner_1_1.getValue().toString());
			VariablesEstaticas.NACS = accionesrestantes;

			try {
				Connection miConexion = DriverManager
						.getConnection("jdbc:mysql://localhost:3306/EscolapInversiones", "root", "");
				Statement miStatement = (Statement) miConexion.createStatement();
				String instruccionSQL = "UPDATE cliente SET numero_acs='" + accionesrestantes
						+ "' WHERE correo='" + VariablesEstaticas.Correo + "';";
				miStatement.executeUpdate(instruccionSQL);
			} catch (SQLException f) {
				f.printStackTrace();
			}
			String dineroactualizado = String.valueOf(VariablesEstaticas.Dinero);
			Dinero1.setText(dineroactualizado);
			
			try {
				registroscompra(VariablesEstaticas.NombreEstatico, VariablesEstaticas.ApellidoEstatico,Integer.parseInt(spinner_1_1.getValue().toString()), DineroLabel_1_1.getText(),"ACS");
			} catch (NumberFormatException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
				}
			}
		});
		btnNewButton_1_1.setBounds(868, 198, 85, 21);
		panel_1.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Comprar");
		btnNewButton_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//evento boton2
				if ((Integer.parseInt(spinner_1_2.getValue().toString()))<0) {
					JOptionPane.showInternalMessageDialog(null , "No puedes comprar acciones negativas.");
				}
				else if (((Integer.parseInt(spinner_1_2.getValue().toString()))*(Double.parseDouble(DineroLabel_1_2.getText().replace(",", "."))))>VariablesEstaticas.Dinero)                                 {
					JOptionPane.showInternalMessageDialog(null , "No tienes suficiente dinero para comprar las acciones.");
				}else {
			CompraAccion (VariablesEstaticas.Dinero, DineroLabel_1_2.getText().replace(",", "."), Integer.parseInt(spinner_1_2.getValue().toString()));
					
			int accionesrestantes = VariablesEstaticas.NAena
					+ Integer.parseInt(spinner_1_2.getValue().toString());
			VariablesEstaticas.NAena = accionesrestantes;

			try {
				Connection miConexion = DriverManager
						.getConnection("jdbc:mysql://localhost:3306/EscolapInversiones", "root", "");
				Statement miStatement = (Statement) miConexion.createStatement();
				String instruccionSQL = "UPDATE cliente SET numero_aena='" + accionesrestantes
						+ "' WHERE correo='" + VariablesEstaticas.Correo + "';";
				miStatement.executeUpdate(instruccionSQL);
			} catch (SQLException f) {
				f.printStackTrace();
			}
			String dineroactualizado = String.valueOf(VariablesEstaticas.Dinero);
			Dinero1.setText(dineroactualizado);
			
			try {
				registroscompra(VariablesEstaticas.NombreEstatico, VariablesEstaticas.ApellidoEstatico,Integer.parseInt(spinner_1_2.getValue().toString()), DineroLabel_1_2.getText(),"Aena");
			} catch (NumberFormatException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
				}
			}
		});
		btnNewButton_1_2.setBounds(868, 253, 85, 21);
		panel_1.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Comprar");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//evento boton3
				if ((Integer.parseInt(spinner_1_3.getValue().toString()))<0) {
					JOptionPane.showInternalMessageDialog(null , "No puedes comprar acciones negativas.");
				}
				else if (((Integer.parseInt(spinner_1_3.getValue().toString()))*(Double.parseDouble(DineroLabel_1_3.getText().replace(",", "."))))>VariablesEstaticas.Dinero)                                 {
					JOptionPane.showInternalMessageDialog(null , "No tienes suficiente dinero para comprar las acciones.");
				}else {
			CompraAccion (VariablesEstaticas.Dinero, DineroLabel_1_3.getText().replace(",", "."), Integer.parseInt(spinner_1_3.getValue().toString()));
					
			int accionesrestantes = VariablesEstaticas.NBBVA
					+ Integer.parseInt(spinner_1_3.getValue().toString());
			VariablesEstaticas.NBBVA = accionesrestantes;

			try {
				Connection miConexion = DriverManager
						.getConnection("jdbc:mysql://localhost:3306/EscolapInversiones", "root", "");
				Statement miStatement = (Statement) miConexion.createStatement();
				String instruccionSQL = "UPDATE cliente SET numero_bbva='" + accionesrestantes
						+ "' WHERE correo='" + VariablesEstaticas.Correo + "';";
				miStatement.executeUpdate(instruccionSQL);
			} catch (SQLException f) {
				f.printStackTrace();
			}
			String dineroactualizado = String.valueOf(VariablesEstaticas.Dinero);
			Dinero1.setText(dineroactualizado);
			
			try {
				registroscompra(VariablesEstaticas.NombreEstatico, VariablesEstaticas.ApellidoEstatico,Integer.parseInt(spinner_1_3.getValue().toString()), DineroLabel_1_3.getText(),"BBVA");
			} catch (NumberFormatException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
				}
			}
		});
		btnNewButton_1_3.setBounds(867, 303, 85, 21);
		panel_1.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("Comprar");
		btnNewButton_1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//evento boton4
				if ((Integer.parseInt(spinner_1_4.getValue().toString()))<0) {
					JOptionPane.showInternalMessageDialog(null , "No puedes comprar acciones negativas.");
				}
				else if (((Integer.parseInt(spinner_1_4.getValue().toString()))*(Double.parseDouble(DineroLabel_1_4.getText().replace(",", "."))))>VariablesEstaticas.Dinero)                                 {
					JOptionPane.showInternalMessageDialog(null , "No tienes suficiente dinero para comprar las acciones.");
				}else {
			CompraAccion (VariablesEstaticas.Dinero, DineroLabel_1_4.getText().replace(",", "."), Integer.parseInt(spinner_1_4.getValue().toString()));
					
			int accionesrestantes = VariablesEstaticas.NBSCH
					+ Integer.parseInt(spinner_1_4.getValue().toString());
			VariablesEstaticas.NBSCH = accionesrestantes;

			try {
				Connection miConexion = DriverManager
						.getConnection("jdbc:mysql://localhost:3306/EscolapInversiones", "root", "");
				Statement miStatement = (Statement) miConexion.createStatement();
				String instruccionSQL = "UPDATE cliente SET numero_bsch='" + accionesrestantes
						+ "' WHERE correo='" + VariablesEstaticas.Correo + "';";
				miStatement.executeUpdate(instruccionSQL);
			} catch (SQLException f) {
				f.printStackTrace();
			}
			String dineroactualizado = String.valueOf(VariablesEstaticas.Dinero);
			Dinero1.setText(dineroactualizado);
			
			try {
				registroscompra(VariablesEstaticas.NombreEstatico, VariablesEstaticas.ApellidoEstatico,Integer.parseInt(spinner_1_4.getValue().toString()), DineroLabel_1_4.getText(),"BSCH");
			} catch (NumberFormatException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
				}
			}
		});
		btnNewButton_1_4.setBounds(867, 351, 85, 21);
		panel_1.getContentPane().add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("Comprar");
		btnNewButton_1_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//evento boton5
				if ((Integer.parseInt(spinner_1_5.getValue().toString()))<0) {
					JOptionPane.showInternalMessageDialog(null , "No puedes comprar acciones negativas.");
				}
				else if (((Integer.parseInt(spinner_1_5.getValue().toString()))*(Double.parseDouble(DineroLabel_1_5.getText().replace(",", "."))))>VariablesEstaticas.Dinero)                                 {
					JOptionPane.showInternalMessageDialog(null , "No tienes suficiente dinero para comprar las acciones.");
				}else {
			CompraAccion (VariablesEstaticas.Dinero, DineroLabel_1_5.getText().replace(",", "."), Integer.parseInt(spinner_1_5.getValue().toString()));
					
			int accionesrestantes = VariablesEstaticas.NInditex
					+ Integer.parseInt(spinner_1_5.getValue().toString());
			VariablesEstaticas.NInditex = accionesrestantes;

			try {
				Connection miConexion = DriverManager
						.getConnection("jdbc:mysql://localhost:3306/EscolapInversiones", "root", "");
				Statement miStatement = (Statement) miConexion.createStatement();
				String instruccionSQL = "UPDATE cliente SET numero_inditex='" + accionesrestantes
						+ "' WHERE correo='" + VariablesEstaticas.Correo + "';";
				miStatement.executeUpdate(instruccionSQL);
			} catch (SQLException f) {
				f.printStackTrace();
			}
			String dineroactualizado = String.valueOf(VariablesEstaticas.Dinero);
			Dinero1.setText(dineroactualizado);
			
			try {
				registroscompra(VariablesEstaticas.NombreEstatico, VariablesEstaticas.ApellidoEstatico,Integer.parseInt(spinner_1_5.getValue().toString()), DineroLabel_1_5.getText(),"Inditex");
			} catch (NumberFormatException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
				}
			}
		});
		btnNewButton_1_5.setBounds(868, 401, 85, 21);
		panel_1.getContentPane().add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("Comprar");
		btnNewButton_1_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//evento boton 6
				if ((Integer.parseInt(spinner_1_6.getValue().toString()))<0) {
					JOptionPane.showInternalMessageDialog(null , "No puedes comprar acciones negativas.");
				}
				else if (((Integer.parseInt(spinner_1_6.getValue().toString()))*(Double.parseDouble(DineroLabel_1_6.getText().replace(",", "."))))>VariablesEstaticas.Dinero)                                 {
					JOptionPane.showInternalMessageDialog(null , "No tienes suficiente dinero para comprar las acciones.");
				}else {
			CompraAccion (VariablesEstaticas.Dinero, DineroLabel_1_6.getText().replace(",", "."), Integer.parseInt(spinner_1_6.getValue().toString()));
					
			int accionesrestantes = VariablesEstaticas.NNaturgy
					+ Integer.parseInt(spinner_1_6.getValue().toString());
			VariablesEstaticas.NNaturgy = accionesrestantes;

			try {
				Connection miConexion = DriverManager
						.getConnection("jdbc:mysql://localhost:3306/EscolapInversiones", "root", "");
				Statement miStatement = (Statement) miConexion.createStatement();
				String instruccionSQL = "UPDATE cliente SET numero_naturgy='" + accionesrestantes
						+ "' WHERE correo='" + VariablesEstaticas.Correo + "';";
				miStatement.executeUpdate(instruccionSQL);
			} catch (SQLException f) {
				f.printStackTrace();
			}
			String dineroactualizado = String.valueOf(VariablesEstaticas.Dinero);
			Dinero1.setText(dineroactualizado);
			
			try {
				registroscompra(VariablesEstaticas.NombreEstatico, VariablesEstaticas.ApellidoEstatico,Integer.parseInt(spinner_1_6.getValue().toString()), DineroLabel_1_6.getText(),"Naturgy");
			} catch (NumberFormatException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
				}
			}
		});
		btnNewButton_1_6.setBounds(867, 451, 85, 21);
		panel_1.getContentPane().add(btnNewButton_1_6);
		
		JLabel lblPrecio = new JLabel("PRECIO");
		lblPrecio.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblPrecio.setBounds(451, 109, 49, 21);
		panel_1.getContentPane().add(lblPrecio);
		
		JLabel UsuariosLabel = new JLabel("Usuarios");
		UsuariosLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		UsuariosLabel.setBounds(212, 28, 106, 37);
		frame.getContentPane().add(UsuariosLabel);

		
		JPanel panel = new JPanel();
		panel.setBounds(201, 85, 883, 576);
		panel.setLayout(new GridLayout(8,4));
		
		
		fluctuacion valor0= new fluctuacion(fluctuacion0, CorreoLabel_1_0, DineroLabel_1_0, "'ACCIONA'");
		fluctuacion valor1= new fluctuacion(fluctuacion1, CorreoLabel_1_1, DineroLabel_1_1,"'ACS'");
		fluctuacion valor2= new fluctuacion(fluctuacion2, CorreoLabel_1_2, DineroLabel_1_2,"'AENA'");
		fluctuacion valor3= new fluctuacion(fluctuacion3, CorreoLabel_1_3, DineroLabel_1_3,"'BBVA'");
		fluctuacion valor4= new fluctuacion(fluctuacion4, CorreoLabel_1_4, DineroLabel_1_4,"'BSCH'");
		fluctuacion valor5= new fluctuacion(fluctuacion5, CorreoLabel_1_5, DineroLabel_1_5,"'INDITEX'");
		fluctuacion valor6= new fluctuacion(fluctuacion6, CorreoLabel_1_6, DineroLabel_1_6,"'NATURGY'");
		
		JLabel Titulo_dinero_cuenta = new JLabel("EFECTIVO EN CUENTA:");
		Titulo_dinero_cuenta.setFont(new Font("Tahoma", Font.BOLD, 20));
		Titulo_dinero_cuenta.setBounds(426, 23, 232, 24);
		frame.getContentPane().add(Titulo_dinero_cuenta);

		valor0.start();
		valor1.start();
		valor2.start();
		valor3.start();
		valor4.start();
		valor5.start();
		valor6.start();

		
	}
	}

