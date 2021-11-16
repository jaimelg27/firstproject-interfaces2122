package inversiones;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.security.SecureRandom;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class register {
	private JFrame registerframe;
	private JTextField dniTextField;
	private JTextField nameTextField;
	private JTextField surnameTextField;
	private JTextField dnitextField;
	private JTextField adressTextField;
	private JTextField pcTextField;
	private JTextField emailTextField;
	private JTextField telephoneTextField;
	private JPasswordField passwordField;
	private JTextField contryTextField;
	private JTextField cityTextField;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					register window = new register();
					window.registerframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		registerframe = new JFrame();
		registerframe.getContentPane().setBackground(Color.GRAY);
		registerframe.getContentPane().setForeground(Color.GRAY);
		registerframe.setLocationRelativeTo(null);
		registerframe.setResizable(false);
		registerframe.setBounds(100, 100,1200,800);
		registerframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		registerframe.getContentPane().setLayout(null);
		
		//Header
		JLabel logo_1 = new JLabel("");
		logo_1.setIcon(new ImageIcon(contact.class.getResource("/resources/smalllogo.png")));
		logo_1.setBounds(19, 20, 86, 55);
		registerframe.getContentPane().add(logo_1);
		
		JButton btnInicio = new JButton("Inicio");
		btnInicio.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				new index();
				inversiones.index.main(null);
				registerframe.dispose();
			}
		});
		btnInicio.setForeground(Color.GRAY);
		btnInicio.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnInicio.setBackground(Color.WHITE);
		btnInicio.setBounds(434, 24, 97, 29);
		registerframe.getContentPane().add(btnInicio);
		
		JLabel lblquienesSomos = new JLabel("\u00A1Registrate!");
		lblquienesSomos.setForeground(Color.WHITE);
		lblquienesSomos.setFont(new Font("Segoe UI Black", Font.BOLD, 40));
		lblquienesSomos.setBounds(433, 102, 243, 55);
		registerframe.getContentPane().add(lblquienesSomos);
		
		JButton btnquienesSomos = new JButton("\u00BFQuienes Somos?");
		btnquienesSomos.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				inversiones.team.main(null);
				registerframe.dispose();
			}
		});
		btnquienesSomos.setForeground(Color.GRAY);
		btnquienesSomos.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnquienesSomos.setBackground(Color.WHITE);
		btnquienesSomos.setBounds(544, 23, 202, 29);
		registerframe.getContentPane().add(btnquienesSomos);
		
		JButton btnContacto = new JButton("Contacto");
		btnContacto.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				new contact();
				inversiones.contact.main(null);
				registerframe.dispose();
			}
		});
		btnContacto.setForeground(Color.GRAY);
		btnContacto.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnContacto.setBackground(Color.WHITE);
		btnContacto.setBounds(756, 23, 129, 31);
		registerframe.getContentPane().add(btnContacto);
		
		JButton btnIniciarSesin = new JButton("Iniciar Sesi\u00F3n");
		btnIniciarSesin.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				new login();
				inversiones.login.main(null);
				registerframe.dispose();
			}
		});
		btnIniciarSesin.setForeground(Color.GRAY);
		btnIniciarSesin.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnIniciarSesin.setBackground(Color.WHITE);
		btnIniciarSesin.setBounds(895, 23, 168, 31);
		registerframe.getContentPane().add(btnIniciarSesin);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				registerframe.dispose();
			}
		});
		btnSalir.setForeground(Color.GRAY);
		btnSalir.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnSalir.setBackground(Color.WHITE);
		btnSalir.setBounds(1073, 23, 90, 31);
		registerframe.getContentPane().add(btnSalir);
		
		//Formulario registro
		JLabel Labelnombre = new JLabel("Nombre");
		Labelnombre.setForeground(Color.WHITE);
		Labelnombre.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		Labelnombre.setBounds(377, 183, 57, 21);
		registerframe.getContentPane().add(Labelnombre);
		
		nameTextField = new JTextField();
		nameTextField.setColumns(10);
		nameTextField.setBounds(449, 183, 352, 22);
		registerframe.getContentPane().add(nameTextField);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setForeground(Color.WHITE);
		lblApellidos.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblApellidos.setBounds(369, 216, 63, 21);
		registerframe.getContentPane().add(lblApellidos);
		
		surnameTextField = new JTextField();
		surnameTextField.setColumns(10);
		surnameTextField.setBounds(449, 216, 352, 22);
		registerframe.getContentPane().add(surnameTextField);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setForeground(Color.WHITE);
		lblDni.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblDni.setBounds(387, 250, 27, 21);
		registerframe.getContentPane().add(lblDni);
		
		dnitextField = new JTextField();
		dnitextField.setColumns(10);
		dnitextField.setBounds(450, 250, 352, 22);
		registerframe.getContentPane().add(dnitextField);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n");
		lblDireccin.setForeground(Color.WHITE);
		lblDireccin.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblDireccin.setBounds(367, 348, 65, 21);
		registerframe.getContentPane().add(lblDireccin);
		
		adressTextField = new JTextField();
		adressTextField.setColumns(10);
		adressTextField.setBounds(449, 349, 352, 22);
		registerframe.getContentPane().add(adressTextField);
		
		JLabel lblCodigoPostal = new JLabel("Codigo Postal");
		lblCodigoPostal.setForeground(Color.WHITE);
		lblCodigoPostal.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblCodigoPostal.setBounds(343, 415, 94, 21);
		registerframe.getContentPane().add(lblCodigoPostal);
		
		pcTextField = new JTextField();
		pcTextField.setColumns(10);
		pcTextField.setBounds(451, 417, 352, 22);
		registerframe.getContentPane().add(pcTextField);
		
		JLabel lblCorreoElectronico = new JLabel("Correo Electronico");
		lblCorreoElectronico.setForeground(Color.WHITE);
		lblCorreoElectronico.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblCorreoElectronico.setBounds(305, 281, 127, 21);
		registerframe.getContentPane().add(lblCorreoElectronico);
		
		emailTextField = new JTextField();
		emailTextField.setColumns(10);
		emailTextField.setBounds(450, 282, 352, 22);
		registerframe.getContentPane().add(emailTextField);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setForeground(Color.WHITE);
		lblTelefono.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblTelefono.setBounds(371, 313, 60, 21);
		registerframe.getContentPane().add(lblTelefono);
		
		telephoneTextField = new JTextField();
		telephoneTextField.setColumns(10);
		telephoneTextField.setBounds(451, 314, 352, 22);
		registerframe.getContentPane().add(telephoneTextField);
		
		JLabel lblPas = new JLabel("Pa\u00EDs");
		lblPas.setForeground(Color.WHITE);
		lblPas.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblPas.setBounds(405, 452, 29, 21);
		registerframe.getContentPane().add(lblPas);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto la ley de proteccion de datos, asi como la normativa de EscolapInversiones\r\n");
		chckbxNewCheckBox.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		chckbxNewCheckBox.setForeground(Color.WHITE);
		chckbxNewCheckBox.setBackground(Color.GRAY);
		chckbxNewCheckBox.setBounds(367, 520, 474, 23);
		registerframe.getContentPane().add(chckbxNewCheckBox);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblContrasea.setBounds(363, 484, 77, 21);
		registerframe.getContentPane().add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(452, 484, 352, 22);
		registerframe.getContentPane().add(passwordField);
		
		contryTextField = new JTextField();
		contryTextField.setColumns(10);
		contryTextField.setBounds(450, 450, 352, 22);
		registerframe.getContentPane().add(contryTextField);
		
		JLabel lblCiudad = new JLabel("Ciudad");
		lblCiudad.setForeground(Color.WHITE);
		lblCiudad.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblCiudad.setBounds(387, 383, 48, 21);
		registerframe.getContentPane().add(lblCiudad);
		
		cityTextField = new JTextField();
		cityTextField.setColumns(10);
		cityTextField.setBounds(449, 383, 352, 22);
		registerframe.getContentPane().add(cityTextField);
		
		
		JButton botonregistro = new JButton("Registrarse");
		botonregistro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					sendDBdata(nameTextField.getText(),surnameTextField.getText(),dniTextField.getText(), adressTextField.getText(), pcTextField.getText(),emailTextField.getText(),telephoneTextField.getText(), contryTextField.getText(), cityTextField.getText(), passwordField.getText());
				} catch (MessagingException e1) {
					e1.printStackTrace();
				}
			}
		});
		botonregistro.setFont(new Font("Segoe UI", Font.BOLD, 16));
		botonregistro.setForeground(Color.GRAY);
		botonregistro.setBackground(Color.WHITE);
		botonregistro.setBounds(530, 549, 171, 39);
		registerframe.getContentPane().add(botonregistro);
		
	}
	
	//Metodos para generar la contraseña y la clave telefonica
	public String generatePassword() {
		String chars="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		SecureRandom random=new SecureRandom();
		StringBuilder sb=new StringBuilder();
		for (int i=0; i<10; i++) {
			int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
		}
		return sb.toString();
	}
	public static String generateTelPassword() {
		String chars="0123456789";
		SecureRandom random=new SecureRandom();
		StringBuilder sb=new StringBuilder();
		for (int i=0; i<6; i++) {
			int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
		}
		return sb.toString();
	}
	
	//Metodo para meter el registro en la base de datos
	public static void sendDBdata (String name, String surname, String dni, String adress, String postalcode, String email, String telephone, String country, String city, String password) throws AddressException, MessagingException {
		dbconnection dbconex;
		//String password=generatePassword();
		String telpassword;
		try {
			telpassword = generateTelPassword();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			dbconex=new dbconnection();
			Statement stat = (Statement) dbconex.getConnection().createStatement();
			String insertSQL= "INSERT INTO CLIENTS VALUES ('"+dni+"','"+name+"','"+surname+"','"+telephone+"','"+email+"','"+adress+"','"+city+"','"+postalcode+"','"+country+"','"+password+"','"+telpassword+"')";
			stat.executeUpdate(insertSQL);
			//sendwelcomemail(email, password, telpassword, name);
			JOptionPane.showInternalMessageDialog(null , "Se ha registrado correctamente. Revise su correo electrónico");
			dbconex.closeconn();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//Metodo para enviar correo al usuario con los datos de acceso
	/*public void sendwelcomemail (String email, String password, String telpassword, String name) throws AddressException, MessagingException {
		Properties props= new Properties();
		//Configuracion de correo de salida
		props.setProperty("mail.smtp.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("mail.smtp.ssl.trust", "*");
        props.setProperty("mail.smtp.port","587");
        props.setProperty("mail.smtp.user", "Escolapinversiones@gmail.com");
        props.setProperty("mail.smtp.auth", "true");
        Session session= Session.getDefaultInstance(props);
        session.setDebug(true);
        String mensaje="Bienvenido "+name+" a EscolapInversiones:\n A continuacion le adjuntamos sus datos de acceso y la clave telefonica:\n - Contraseña de acceso: "+password+"\n - Clave telefonica"+telpassword+"\n Muchas gracias por confiar en EscolapInversiones,";
        MimeMessage message = new MimeMessage(session);
        message.setFrom(new InternetAddress("Escolapinversiones@gmail.com"));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
        message.addRecipient(Message.RecipientType.BCC, new InternetAddress("Escolapinversiones@gmail.com"));
        message.setSubject("Bienvenido a EscolapInversiones");
        message.setText(mensaje);
        javax.mail.Transport t= session.getTransport("smtp");
        //Usuario y contraseña correo
        t.connect("Escolapinversiones@gmail.com","Escolapios");
        t.sendMessage(message, message.getAllRecipients());
        t.close();
	}*/
}
