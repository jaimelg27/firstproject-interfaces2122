package inversiones;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPasswordField;

public class login {

	private JFrame loginframe;
	private JTextField dniTextField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.loginframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		loginframe = new JFrame();
		loginframe.getContentPane().setBackground(Color.GRAY);
		loginframe.getContentPane().setForeground(Color.GRAY);
		loginframe.setLocationRelativeTo(null);
		loginframe.setResizable(false);
		loginframe.setBounds(100, 100,1200,800);
		loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginframe.getContentPane().setLayout(null);
		
		//Header
		JLabel logo_1 = new JLabel("");
		logo_1.setIcon(new ImageIcon(contact.class.getResource("/resources/smalllogo.png")));
		logo_1.setBounds(19, 20, 86, 55);
		loginframe.getContentPane().add(logo_1);
		
		JButton btnInicio = new JButton("Inicio");
		btnInicio.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				new index();
				inversiones.index.main(null);
				loginframe.dispose();
			}
		});
		btnInicio.setForeground(Color.GRAY);
		btnInicio.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnInicio.setBackground(Color.WHITE);
		btnInicio.setBounds(431, 25, 97, 29);
		loginframe.getContentPane().add(btnInicio);
		
		JLabel lblquienesSomos = new JLabel("Iniciar Sesi\u00F3n");
		lblquienesSomos.setForeground(Color.WHITE);
		lblquienesSomos.setFont(new Font("Segoe UI Black", Font.BOLD, 40));
		lblquienesSomos.setBounds(433, 102, 273, 55);
		loginframe.getContentPane().add(lblquienesSomos);
		
		JButton btnquienesSomos = new JButton("\u00BFQuienes Somos?");
		btnquienesSomos.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				new team();
				inversiones.team.main(null);
				loginframe.dispose();
			}
		});
		btnquienesSomos.setForeground(Color.GRAY);
		btnquienesSomos.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnquienesSomos.setBackground(Color.WHITE);
		btnquienesSomos.setBounds(541, 24, 202, 29);
		loginframe.getContentPane().add(btnquienesSomos);
		
		JButton btnContacto = new JButton("Contacto");
		btnContacto.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				new contact();
				inversiones.contact.main(null);
				loginframe.dispose();
			}
		});
		btnContacto.setForeground(Color.GRAY);
		btnContacto.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnContacto.setBackground(Color.WHITE);
		btnContacto.setBounds(753, 24, 129, 31);
		loginframe.getContentPane().add(btnContacto);
		
		JButton btnIniciarSesin = new JButton("Iniciar Sesi\u00F3n");
		btnIniciarSesin.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				new login();
				inversiones.login.main(null);
				loginframe.dispose();
			}
		});
		btnIniciarSesin.setForeground(Color.GRAY);
		btnIniciarSesin.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnIniciarSesin.setBackground(Color.WHITE);
		btnIniciarSesin.setBounds(892, 24, 168, 31);
		loginframe.getContentPane().add(btnIniciarSesin);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginframe.dispose();
			}
		});
		btnSalir.setForeground(Color.GRAY);
		btnSalir.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnSalir.setBackground(Color.WHITE);
		btnSalir.setBounds(1070, 24, 90, 31);
		loginframe.getContentPane().add(btnSalir);
		
		//Formulario registro
		JLabel Labelemail = new JLabel("DNI");
		Labelemail.setForeground(Color.WHITE);
		Labelemail.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		Labelemail.setBounds(412, 184, 27, 21);
		loginframe.getContentPane().add(Labelemail);
		
		dniTextField = new JTextField();
		dniTextField.setColumns(10);
		dniTextField.setBounds(449, 183, 352, 26);
		loginframe.getContentPane().add(dniTextField);
		
		JLabel labelPassword = new JLabel("Contrase\u00F1a");
		labelPassword.setForeground(Color.WHITE);
		labelPassword.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		labelPassword.setBounds(360, 217, 77, 21);
		loginframe.getContentPane().add(labelPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(450, 217, 352, 26);
		loginframe.getContentPane().add(passwordField);
		
		JLabel lblnoDisponesDe = new JLabel("\u00BFNo dispones de una cuenta con nosotros?");
		lblnoDisponesDe.setForeground(Color.WHITE);
		lblnoDisponesDe.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblnoDisponesDe.setBounds(370, 251, 292, 21);
		loginframe.getContentPane().add(lblnoDisponesDe);
		
		JLabel lblCreate = new JLabel("Crea una aqu\u00ED");
		lblCreate.setForeground(Color.WHITE);
		lblCreate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			new register();
			inversiones.register.main(null);
			loginframe.dispose();
			}
		});
		lblCreate.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblCreate.setBounds(668, 251, 95, 21);
		loginframe.getContentPane().add(lblCreate);
		
		JLabel lblAdmin = new JLabel("Iniciar sesi\u00F3n administrador");
		lblAdmin.setForeground(Color.WHITE);
		lblAdmin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			new loginadmin();
			loginadmin.main(null);
			loginframe.dispose();
			}
		});
		lblAdmin.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblAdmin.setBounds(488, 283, 188, 21);
		loginframe.getContentPane().add(lblAdmin);
		
		JButton botonlogin = new JButton("Iniciar Sesi\u00F3n");
		botonlogin.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
				if(isCorrect(dniTextField.getText(), passwordField.getText())==true) {
					new indexuser();
					staticparametersclient.dni=dniTextField.getText();
					inversiones.indexuser.main(null);
					loginframe.dispose();
				} else {
					JOptionPane.showInternalMessageDialog(null , "Usuario y/o contraseña incorrecta.");
				}
			}
		});
		botonlogin.setFont(new Font("Segoe UI", Font.BOLD, 16));
		botonlogin.setForeground(Color.GRAY);
		botonlogin.setBackground(Color.WHITE);
		botonlogin.setBounds(491, 322, 171, 39);
		loginframe.getContentPane().add(botonlogin);
		

		
	}
	//Metodo para consultar en bd si las creedenciales son correctas
	public boolean isCorrect(String dni, String password) {
		dbconnection dbconex=new dbconnection();
		try {
			Statement stat = dbconex.getConnection().createStatement();
			String querySQL="SELECT id,password FROM clients WHERE id= '"+dni+"';";
			ResultSet rs=stat.executeQuery(querySQL);
			while(rs.next()){
        		if((rs.getString("password").equals(password))) {
        			return true;
        		}
			}
			dbconex.closeconn();
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
