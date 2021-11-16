package inversiones;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Properties;
import javax.swing.JTextArea;
import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class contact implements ActionListener{
	private JFrame contactframe;
	private JTextField nameTextField;
	private JTextField emailTextField;
	private JTextField subjectTextField;

	//Lanzar la aplicacion
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					contact window = new contact();
					window.contactframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//Crear la aplicacion
	public contact() {
		initialize();
	}

	//Contenido del JFrame
	private void initialize() {
		contactframe = new JFrame();
		contactframe.setLocationRelativeTo(null);
		contactframe.getContentPane().setBackground(Color.GRAY);
		contactframe.setResizable(false);
		contactframe.setBounds(100, 100,1200,800);
		contactframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contactframe.getContentPane().setLayout(null);
		
		//Header
		JLabel logo_1 = new JLabel("");
		logo_1.setIcon(new ImageIcon(contact.class.getResource("/resources/smalllogo.png")));
		logo_1.setBounds(19, 20, 86, 55);
		contactframe.getContentPane().add(logo_1);
		
		JButton btnInicio = new JButton("Inicio");
		btnInicio.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				new index();
				inversiones.index.main(null);
				contactframe.dispose();
			}
		});
		btnInicio.setForeground(Color.GRAY);
		btnInicio.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnInicio.setBackground(Color.WHITE);
		btnInicio.setBounds(437, 22, 97, 29);
		contactframe.getContentPane().add(btnInicio);
		
		JLabel lblquienesSomos = new JLabel("\u00A1Contactanos!");
		lblquienesSomos.setForeground(Color.WHITE);
		lblquienesSomos.setFont(new Font("Segoe UI Black", Font.BOLD, 40));
		lblquienesSomos.setBounds(416, 103, 285, 55);
		contactframe.getContentPane().add(lblquienesSomos);
		
		JButton btnquienesSomos = new JButton("\u00BFQuienes Somos?");
		btnquienesSomos.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				new team();
				inversiones.team.main(null);
				contactframe.dispose();
			}
		});
		btnquienesSomos.setForeground(Color.GRAY);
		btnquienesSomos.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnquienesSomos.setBackground(Color.WHITE);
		btnquienesSomos.setBounds(547, 21, 202, 29);
		contactframe.getContentPane().add(btnquienesSomos);
		
		JButton btnContacto = new JButton("Contacto");
		btnContacto.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				new contact();
				inversiones.contact.main(null);
				contactframe.dispose();
			}
		});
		btnContacto.setForeground(Color.GRAY);
		btnContacto.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnContacto.setBackground(Color.WHITE);
		btnContacto.setBounds(759, 21, 129, 31);
		contactframe.getContentPane().add(btnContacto);
		
		JButton btnIniciarSesin = new JButton("Iniciar Sesi\u00F3n");
		btnIniciarSesin.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				new login();
				inversiones.login.main(null);
				contactframe.dispose();
			}
		});
		btnIniciarSesin.setForeground(Color.GRAY);
		btnIniciarSesin.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnIniciarSesin.setBackground(Color.WHITE);
		btnIniciarSesin.setBounds(898, 21, 168, 31);
		contactframe.getContentPane().add(btnIniciarSesin);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contactframe.dispose();
			}
		});
		btnSalir.setForeground(Color.GRAY);
		btnSalir.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnSalir.setBackground(Color.WHITE);
		btnSalir.setBounds(1076, 21, 90, 31);
		contactframe.getContentPane().add(btnSalir);
		
		//Formulario
		JLabel lblNombre = new JLabel("Nombre y Apellidos");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblNombre.setBounds(35, 190, 136, 21);
		contactframe.getContentPane().add(lblNombre);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(35, 218, 448, 22);
		contactframe.getContentPane().add(nameTextField);
		nameTextField.setColumns(10);
		
		JLabel lblCorreoElectrnico = new JLabel("Correo Electr\u00F3nico");
		lblCorreoElectrnico.setForeground(Color.WHITE);
		lblCorreoElectrnico.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblCorreoElectrnico.setBounds(35, 251, 127, 21);
		contactframe.getContentPane().add(lblCorreoElectrnico);
		
		emailTextField = new JTextField();
		emailTextField.setBounds(35, 280, 448, 22);
		contactframe.getContentPane().add(emailTextField);
		emailTextField.setColumns(10);
		
		JLabel lblAsunto = new JLabel("Asunto");
		lblAsunto.setForeground(Color.WHITE);
		lblAsunto.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblAsunto.setBounds(37, 312, 48, 21);
		contactframe.getContentPane().add(lblAsunto);
		
		subjectTextField = new JTextField();
		subjectTextField.setColumns(10);
		subjectTextField.setBounds(36, 339, 447, 22);
		contactframe.getContentPane().add(subjectTextField);
		
		JLabel lblMensaje = new JLabel("Mensaje");
		lblMensaje.setForeground(Color.WHITE);
		lblMensaje.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblMensaje.setBounds(39, 371, 57, 21);
		contactframe.getContentPane().add(lblMensaje);
		
		JTextArea messageTextArea = new JTextArea();
		messageTextArea.setBounds(35, 396, 448, 78);
		contactframe.getContentPane().add(messageTextArea);
		
		JLabel logo_1_1 = new JLabel("");
		logo_1_1.setBounds(614, 190, 450, 300);
		contactframe.getContentPane().add(logo_1_1);
		logo_1_1.setIcon(new ImageIcon(contact.class.getResource("/resources/smallcontact.jpg")));
		
		JButton btnNewButton_enviar = new JButton("Enviar");
		btnNewButton_enviar.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		btnNewButton_enviar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String mensaje ="Nombre:"+nameTextField.getText()+"\n"+"Correo: "+emailTextField.getText()+"\n"+"Asunto: "+subjectTextField.getText()+"\n"+"Mensaje: "+messageTextArea.getText();
				try {
					sendMail(mensaje, emailTextField.getText());
				} catch (AddressException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (MessagingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_enviar.setBackground(Color.WHITE);
		btnNewButton_enviar.setForeground(Color.GRAY);
		btnNewButton_enviar.setBounds(200, 491, 96, 36);
		contactframe.getContentPane().add(btnNewButton_enviar);
	}
	
	public void sendMail(String texto1, String email) throws AddressException, MessagingException {
		Properties props = new Properties();

        props.setProperty("mail.smtp.host", "smtp.gmail.com");
        props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("mail.smtp.ssl.trust", "*");
        props.setProperty("mail.smtp.port","587");
        props.setProperty("mail.smtp.user", "escolapinversiones27@gmail.com");
        props.setProperty("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        session.setDebug(true);

        MimeMessage message = new MimeMessage(session);

        message.setFrom(new InternetAddress("escolapinversiones27@gmail.com"));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress("escolapinversiones27@gmail.com"));
        message.addRecipient(Message.RecipientType.BCC, new InternetAddress(email));
        message.setSubject("Incidencias");
        message.setText(texto1);

        javax.mail.Transport t = session.getTransport("smtp");

        t.connect("escolapinversiones27@gmail.com","Escolap2021");
        t.sendMessage(message,message.getAllRecipients());
        t.close();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
