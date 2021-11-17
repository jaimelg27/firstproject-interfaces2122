package inversiones;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.security.SecureRandom;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class adminmodification {

	private JFrame adminmodframe;
	private JTextField textFieldDNI;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminmodification window = new adminmodification();
					window.adminmodframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public adminmodification() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		adminmodframe = new JFrame();
		adminmodframe.setLocationRelativeTo(null);
		adminmodframe.getContentPane().setBackground(Color.GRAY);
		adminmodframe.setResizable(false);
		adminmodframe.setBounds(100, 100, 1200, 800);
		adminmodframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adminmodframe.getContentPane().setLayout(null);
		
		JLabel logo_1 = new JLabel("");
		logo_1.setIcon(new ImageIcon(index.class.getResource("/resources/smalllogo.png")));
		logo_1.setBounds(10, 11, 90, 69);
		adminmodframe.getContentPane().add(logo_1);
		
		JButton btnInicio = new JButton("Inicio");
		btnInicio.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				new indexuser();
				indexuser.main(null);
				adminmodframe.dispose();
			}
		});
		btnInicio.setForeground(Color.GRAY);
		btnInicio.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnInicio.setBackground(Color.WHITE);
		btnInicio.setBounds(652, 24, 97, 29);
		adminmodframe.getContentPane().add(btnInicio);
		
		JButton btnCerrarSesin = new JButton("Cerrar Sesi\u00F3n");
		btnCerrarSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new index();
				inversiones.index.main(null);
				adminmodframe.dispose();
			}
			
		});
		btnCerrarSesin.setForeground(Color.GRAY);
		btnCerrarSesin.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnCerrarSesin.setBackground(Color.WHITE);
		btnCerrarSesin.setBounds(1006, 24, 168, 29);
		adminmodframe.getContentPane().add(btnCerrarSesin);
		
		JButton btnOperaciones = new JButton("Modificacion Usuarios");
		btnOperaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new adminmodification();
				adminmodification.main(null);
				adminmodframe.dispose();
			}
		});
		btnOperaciones.setForeground(Color.GRAY);
		btnOperaciones.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnOperaciones.setBackground(Color.WHITE);
		btnOperaciones.setBounds(759, 24, 237, 29);
		adminmodframe.getContentPane().add(btnOperaciones);
		
		JLabel lblPanelAdministracin = new JLabel("Modificacion Clientes");
		lblPanelAdministracin.setForeground(Color.WHITE);
		lblPanelAdministracin.setFont(new Font("Segoe UI Black", Font.BOLD, 40));
		lblPanelAdministracin.setBounds(376, 89, 441, 55);
		adminmodframe.getContentPane().add(lblPanelAdministracin);
		
		textFieldDNI = new JTextField();
		textFieldDNI.setColumns(10);
		textFieldDNI.setBounds(189, 155, 352, 26);
		adminmodframe.getContentPane().add(textFieldDNI);
		
		JButton btnModificarNom = new JButton("Modificar");
		btnModificarNom.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				updatename(textFieldDNI.getText(), textField_1.getText());
			}
		});
		btnModificarNom.setForeground(Color.GRAY);
		btnModificarNom.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		btnModificarNom.setBackground(Color.WHITE);
		btnModificarNom.setBounds(564, 198, 140, 29);
		adminmodframe.getContentPane().add(btnModificarNom);
		
		JLabel lblIntroduzcaDni = new JLabel("Introduzca DNI:");
		lblIntroduzcaDni.setForeground(Color.WHITE);
		lblIntroduzcaDni.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblIntroduzcaDni.setBounds(20, 155, 135, 21);
		adminmodframe.getContentPane().add(lblIntroduzcaDni);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(189, 201, 352, 26);
		adminmodframe.getContentPane().add(textField_1);
		
		JLabel lblModificarNombre = new JLabel("Modificar Nombre:");
		lblModificarNombre.setForeground(Color.WHITE);
		lblModificarNombre.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblModificarNombre.setBounds(20, 201, 135, 21);
		adminmodframe.getContentPane().add(lblModificarNombre);
		
		JButton btnModificarDir = new JButton("Modificar");
		btnModificarDir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				updateaddress(textFieldDNI.getText(), textField_4.getText());
			}
		});
		btnModificarDir.setForeground(Color.GRAY);
		btnModificarDir.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		btnModificarDir.setBackground(Color.WHITE);
		btnModificarDir.setBounds(569, 340, 143, 29);
		adminmodframe.getContentPane().add(btnModificarDir);
		
		JButton btnDarDeBaja = new JButton("Dar de baja de EscolapInversiones");
		btnDarDeBaja.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				removeaccount(textFieldDNI.getText());
			}
		});
		btnDarDeBaja.setForeground(Color.GRAY);
		btnDarDeBaja.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnDarDeBaja.setBackground(Color.WHITE);
		btnDarDeBaja.setBounds(140, 504, 384, 35);
		adminmodframe.getContentPane().add(btnDarDeBaja);
		
		JLabel lblModificarApellido = new JLabel("Modificar Apellido:");
		lblModificarApellido.setForeground(Color.WHITE);
		lblModificarApellido.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblModificarApellido.setBounds(21, 250, 135, 21);
		adminmodframe.getContentPane().add(lblModificarApellido);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(190, 245, 352, 26);
		adminmodframe.getContentPane().add(textField_2);
		
		JButton btnModificarApe = new JButton("Modificar");
		btnModificarApe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				updatesurname(textFieldDNI.getText(), textField_2.getText());
			}
		});
		btnModificarApe.setForeground(Color.GRAY);
		btnModificarApe.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		btnModificarApe.setBackground(Color.WHITE);
		btnModificarApe.setBounds(563, 244, 140, 29);
		adminmodframe.getContentPane().add(btnModificarApe);
		
		JLabel lblModificarCorreo = new JLabel("Modificar Correo:");
		lblModificarCorreo.setForeground(Color.WHITE);
		lblModificarCorreo.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblModificarCorreo.setBounds(19, 294, 135, 21);
		adminmodframe.getContentPane().add(lblModificarCorreo);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(188, 295, 352, 26);
		adminmodframe.getContentPane().add(textField_3);
		
		JButton btnModificarCor = new JButton("Modificar");
		btnModificarCor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				updateemail(textFieldDNI.getText(), textField_3.getText());
			}
		});
		btnModificarCor.setForeground(Color.GRAY);
		btnModificarCor.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		btnModificarCor.setBackground(Color.WHITE);
		btnModificarCor.setBounds(564, 290, 140, 29);
		adminmodframe.getContentPane().add(btnModificarCor);
		
		JLabel lblModificarDireccion = new JLabel("Modificar Direccion:");
		lblModificarDireccion.setForeground(Color.WHITE);
		lblModificarDireccion.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblModificarDireccion.setBounds(16, 343, 139, 21);
		adminmodframe.getContentPane().add(lblModificarDireccion);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(190, 340, 352, 26);
		adminmodframe.getContentPane().add(textField_4);
		
		JLabel lblModificarCiudad = new JLabel("Modificar Ciudad:");
		
		lblModificarCiudad.setForeground(Color.WHITE);
		lblModificarCiudad.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblModificarCiudad.setBounds(10, 387, 139, 21);
		adminmodframe.getContentPane().add(lblModificarCiudad);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(189, 387, 352, 26);
		adminmodframe.getContentPane().add(textField_5);
		
		JButton btnModificarCiudad = new JButton("Modificar");
		btnModificarCiudad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				updatecity(textFieldDNI.getText(), textField_5.getText());
			}
		});
		btnModificarCiudad.setForeground(Color.GRAY);
		btnModificarCiudad.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		btnModificarCiudad.setBackground(Color.WHITE);
		btnModificarCiudad.setBounds(566, 385, 143, 29);
		adminmodframe.getContentPane().add(btnModificarCiudad);
		
		JButton btnModificarNuevaCon = new JButton("Generar nueva contrase\u00F1a");
		btnModificarNuevaCon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				updatepassword(textFieldDNI.getText());
			}
		});
		btnModificarNuevaCon.setForeground(Color.GRAY);
		btnModificarNuevaCon.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		btnModificarNuevaCon.setBackground(Color.WHITE);
		btnModificarNuevaCon.setBounds(35, 441, 236, 29);
		adminmodframe.getContentPane().add(btnModificarNuevaCon);
		
		JButton btnModificarNuevaContTelf = new JButton("Generar nueva clave telefonica");
		btnModificarNuevaContTelf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				updatetelpassword(textFieldDNI.getText());
			}
		});
		btnModificarNuevaContTelf.setForeground(Color.GRAY);
		btnModificarNuevaContTelf.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		btnModificarNuevaContTelf.setBackground(Color.WHITE);
		btnModificarNuevaContTelf.setBounds(325, 442, 302, 29);
		adminmodframe.getContentPane().add(btnModificarNuevaContTelf);
	}
	public void removeaccount(String dni) {
		dbconnection dbconex=new dbconnection();
		try {
			Statement stat = dbconex.getConnection().createStatement();
			String querySQL="DELETE FROM clients WHERE id='"+dni+"';";
			stat.executeUpdate(querySQL);
			JOptionPane.showInternalMessageDialog(null , "La cuenta ha sido eliminada.");
			new indexadmin();
			inversiones.indexadmin.main(null);
			adminmodframe.dispose();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void updatename(String dni, String newname) {
		dbconnection dbconex=new dbconnection();
		try {
			Statement stat = dbconex.getConnection().createStatement();
			String querySQL="UPDATE clients SET name='"+newname+"' WHERE id='"+dni+"';";
			stat.executeUpdate(querySQL);
			JOptionPane.showInternalMessageDialog(null , "Nombre cambiado.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} 
	public void updatesurname(String dni, String newsurname) {
			dbconnection dbconex=new dbconnection();
			try {
				Statement stat = dbconex.getConnection().createStatement();
				String querySQL="UPDATE clients SET surname='"+newsurname+"' WHERE id='"+dni+"';";
				stat.executeUpdate(querySQL);
				JOptionPane.showInternalMessageDialog(null , "Nombre cambiado.");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} 
	public void updateemail(String dni, String newemail) {
			dbconnection dbconex=new dbconnection();
			try {
				Statement stat = dbconex.getConnection().createStatement();
				String querySQL="UPDATE clients SET email='"+newemail+"' WHERE id='"+dni+"';";
				stat.executeUpdate(querySQL);
				JOptionPane.showInternalMessageDialog(null , "Correo cambiado.");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} 
	public void updateaddress(String dni, String newaddress) {
		dbconnection dbconex=new dbconnection();
		try {
			Statement stat = dbconex.getConnection().createStatement();
			String querySQL="UPDATE clients SET address='"+newaddress+"' WHERE id='"+dni+"';";
			stat.executeUpdate(querySQL);
			JOptionPane.showInternalMessageDialog(null , "Direccion cambiada.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} 
	public void updatecity(String dni, String newcity) {
		dbconnection dbconex=new dbconnection();
		try {
			Statement stat = dbconex.getConnection().createStatement();
			String querySQL="UPDATE clients SET city='"+newcity+"' WHERE id='"+dni+"';";
			stat.executeUpdate(querySQL);
			JOptionPane.showInternalMessageDialog(null , "Direccion cambiada.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public String generatepassword() {
		String chars="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		SecureRandom random=new SecureRandom();
		StringBuilder sb=new StringBuilder();
		for (int i=0; i<10; i++) {
			int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
		}
		return sb.toString();
	}
	public String generateTelPassword() {
		String chars="0123456789";
		SecureRandom random=new SecureRandom();
		StringBuilder sb=new StringBuilder();
		for (int i=0; i<6; i++) {
			int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
		}
		return sb.toString();
	}
	public void updatepassword(String dni) {
		dbconnection dbconex=new dbconnection();
		try {
			String newpass=generatepassword();
			Statement stat = dbconex.getConnection().createStatement();
			String querySQL="UPDATE clients SET password='"+newpass+"' WHERE id='"+dni+"';";
			stat.executeUpdate(querySQL);
			JOptionPane.showInternalMessageDialog(null , "Contraseña cambiada.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void updatetelpassword(String dni) {
		dbconnection dbconex=new dbconnection();
		try {
			String newpass=generateTelPassword();
			Statement stat = dbconex.getConnection().createStatement();
			String querySQL="UPDATE clients SET telpassword='"+newpass+"' WHERE id='"+dni+"';";
			stat.executeUpdate(querySQL);
			JOptionPane.showInternalMessageDialog(null , "Contraseña telefonica cambiada.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
