package inversiones;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.mysql.jdbc.Statement;

public class userlist {

	private JFrame userlistframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					userlist window = new userlist();
					window.userlistframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public userlist() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		userlistframe = new JFrame();
		userlistframe.setLocationRelativeTo(null);
		userlistframe.getContentPane().setBackground(Color.GRAY);
		userlistframe.setResizable(false);
		userlistframe.setBounds(100, 100, 1200, 800);
		userlistframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		userlistframe.getContentPane().setLayout(null);
		
		//*****************instancio los datos tomados de los arrayslist que devuelve cada metodo***************	
				ArrayList<String> correos2 =arraydecorreoclientes();
				ArrayList<String> nombres2 =arraynombresclientes();
				ArrayList<String> apellidos2 =arrayapellidossclientes();

				
		//***********************variables que pasamos por parametro a los jlabel correspondientes*******************
				
				String correoA="Null";
				String correoB="Null";
				String correoC="Null";
				String correoD="Null";
				String correoE="Null";
				String correoF="Null";
				String correoG="Null";
				String correoH="Null";
				String nombresA="Null";
				String nombresB="Null";
				String nombresC="Null";
				String nombresD="Null";
				String nombresE="Null";
				String nombresF="Null";
				String nombresG="Null";
				String nombresH="Null";
				String apellidosA="Null";
				String apellidosB="Null";
				String apellidosC="Null";
				String apellidosD="Null";
				String apellidosE="Null";
				String apellidosF="Null";
				String apellidosG="Null";
				String apellidosH="Null";
			
		//***************condicion para modificar las variables anteriores si existen datos************
				for (int i=0 ; i<correos2.size() ; i++) {
					if (i== 0) {
						correoA=correos2.get(0);
					}
					if (i== 1)  {
						correoB=correos2.get(1);
					}
					if (i== 2)  {
						correoC=correos2.get(2);
					}
					if (i== 3)  {
						correoD=correos2.get(3);
					}
					if (i== 4)  {
						correoE=correos2.get(4);
					}
					if (i== 5)  {
						correoF=correos2.get(5);
					}
					if (i== 6)  {
						correoG=correos2.get(6);
					}
					if (i== 7) {
						correoH=correos2.get(7);
					}
				}
				
				for (int i=0 ; i<nombres2.size() ; i++) {
					if (i== 0) {
						nombresA=nombres2.get(0);
					}
					if (i== 1)  {
						nombresB=nombres2.get(1);
					}
					if (i== 2)  {
						nombresC=nombres2.get(2);
					}
					if (i== 3)  {
						nombresD=nombres2.get(3);
					}
					if (i== 4)  {
						nombresE=nombres2.get(4);
					}
					if (i== 5)  {
						nombresF=nombres2.get(5);
					}
					if (i== 6)  {
						nombresG=nombres2.get(6);
					}
					if (i== 7) {
						nombresH=nombres2.get(7);
					}
				}
				
				for (int i=0 ; i<apellidos2.size() ; i++) {
					if (i== 0) {
						apellidosA=apellidos2.get(0);
					}
					if (i== 1)  {
						apellidosB=apellidos2.get(1);
					}
					if (i== 2)  {
						apellidosC=apellidos2.get(2);
					}
					if (i== 3)  {
						apellidosD=apellidos2.get(3);
					}
					if (i== 4)  {
						apellidosE=apellidos2.get(4);
					}
					if (i== 5)  {
						apellidosF=apellidos2.get(5);
					}
					if (i== 6)  {
						apellidosG=apellidos2.get(6);
					}
					if (i== 7) {
						apellidosH=apellidos2.get(7);
					}
					
					
		JLabel logo_1 = new JLabel("");
		logo_1.setIcon(new ImageIcon(index.class.getResource("/resources/smalllogo.png")));
		logo_1.setBounds(10, 11, 90, 69);
		userlistframe.getContentPane().add(logo_1);
		
		JButton btnInicio = new JButton("Inicio");
		btnInicio.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				new indexuser();
				inversiones.indexuser.main(null);
				userlistframe.dispose();
			}
		});
		btnInicio.setForeground(Color.GRAY);
		btnInicio.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnInicio.setBackground(Color.WHITE);
		btnInicio.setBounds(454, 24, 97, 29);
		userlistframe.getContentPane().add(btnInicio);
		
		JButton btnMercados = new JButton("Informes");
		btnMercados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new money();
				inversiones.money.main(null);
				userlistframe.dispose();
			}
		});
		btnMercados.setForeground(Color.GRAY);
		btnMercados.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnMercados.setBackground(Color.WHITE);
		btnMercados.setBounds(728, 24, 129, 29);
		userlistframe.getContentPane().add(btnMercados);
		
		JButton btnAjustes = new JButton("Ajustes");
		btnAjustes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usersettings settings=new usersettings();
				usersettings.main(null);
				userlistframe.dispose();
			}
		});
		btnAjustes.setForeground(Color.GRAY);
		btnAjustes.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnAjustes.setBackground(Color.WHITE);
		btnAjustes.setBounds(867, 24, 129, 29);
		userlistframe.getContentPane().add(btnAjustes);
		
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
				userlistframe.dispose();
			}
		});
		btnCerrarSesin.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnCerrarSesin.setBackground(Color.WHITE);
		btnCerrarSesin.setBounds(1006, 24, 168, 29);
		userlistframe.getContentPane().add(btnCerrarSesin);
		
		JButton btnOperaciones = new JButton("Lista Usuarios");
		btnOperaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new trading();
				trading.main(null);
				userlistframe.dispose();
			}
		});
		btnOperaciones.setForeground(Color.GRAY);
		btnOperaciones.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnOperaciones.setBackground(Color.WHITE);
		btnOperaciones.setBounds(561, 24, 157, 29);
		userlistframe.getContentPane().add(btnOperaciones);
		
		JLabel lblPanelAdministracin = new JLabel("Lista Usuarios");
		lblPanelAdministracin.setForeground(Color.WHITE);
		lblPanelAdministracin.setFont(new Font("Segoe UI Black", Font.BOLD, 40));
		lblPanelAdministracin.setBounds(458, 93, 286, 55);
		userlistframe.getContentPane().add(lblPanelAdministracin);
		
		JLabel CorreoLabel = new JLabel("CORREO");
		CorreoLabel.setBounds(469, 61, 56, 16);
		userlistframe.getContentPane().add(CorreoLabel);
		
		JLabel UsuarioLabel = new JLabel("USUARIO");
		UsuarioLabel.setBounds(12, 61, 56, 16);
		userlistframe.getContentPane().add(UsuarioLabel);
		
		JLabel DineroLabel = new JLabel("APELLIDOS");
		DineroLabel.setBounds(240, 61, 56, 16);
		userlistframe.getContentPane().add(DineroLabel);
		
		JLabel SeleccionarLabel = new JLabel("SELECCIONAR");
		SeleccionarLabel.setBounds(732, 61, 95, 16);
		userlistframe.getContentPane().add(SeleccionarLabel);
		
		JLabel UsuarioLabel_1_0 = new JLabel(nombresA);
		UsuarioLabel_1_0.setBounds(12, 125, 114, 16);
		userlistframe.getContentPane().add(UsuarioLabel_1_0);
		
		
		JLabel UsuarioLabel_1_1 = new JLabel(nombresB);
		UsuarioLabel_1_1.setBounds(12, 175, 114, 16);
		userlistframe.getContentPane().add(UsuarioLabel_1_1);
		
		JLabel UsuarioLabel_1_2 = new JLabel(nombresC);
		UsuarioLabel_1_2.setBounds(12, 225, 114, 16);
		userlistframe.getContentPane().add(UsuarioLabel_1_2);
		
		JLabel UsuarioLabel_1_3 = new JLabel(nombresD);
		UsuarioLabel_1_3.setBounds(12, 275, 114, 16);
		userlistframe.getContentPane().add(UsuarioLabel_1_3);
		
		JLabel UsuarioLabel_1_4 = new JLabel(nombresE);
		UsuarioLabel_1_4.setBounds(12, 325, 114, 16);
		userlistframe.getContentPane().add(UsuarioLabel_1_4);
		
		JLabel UsuarioLabel_1_5 = new JLabel(nombresF);
		UsuarioLabel_1_5.setBounds(12, 375, 114, 16);
		userlistframe.getContentPane().add(UsuarioLabel_1_5);
		
		JLabel UsuarioLabel_1_6 = new JLabel(nombresG);
		UsuarioLabel_1_6.setBounds(12, 425, 114, 16);
		userlistframe.getContentPane().add(UsuarioLabel_1_6);
		
		JLabel UsuarioLabel_1_7 = new JLabel(nombresF);
		UsuarioLabel_1_7.setBounds(12, 475, 114, 16);
		userlistframe.getContentPane().add(UsuarioLabel_1_7);
		
		JLabel ApellidoLabel_1_0 = new JLabel(apellidosA);
		ApellidoLabel_1_0.setHorizontalAlignment(SwingConstants.CENTER);
		ApellidoLabel_1_0.setBounds(189, 125, 175, 16);
		userlistframe.getContentPane().add(ApellidoLabel_1_0);
		
		JLabel ApellidoLabel_1_1 = new JLabel(apellidosB);
		ApellidoLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		ApellidoLabel_1_1.setBounds(189, 175, 175, 16);
		userlistframe.getContentPane().add(ApellidoLabel_1_1);
		
		JLabel ApellidoLabel_1_2 = new JLabel(apellidosC);
		ApellidoLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		ApellidoLabel_1_2.setBounds(189, 225, 175, 16);
		userlistframe.getContentPane().add(ApellidoLabel_1_2);
		
		JLabel ApellidoLabel_1_3 = new JLabel(apellidosD);
		ApellidoLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		ApellidoLabel_1_3.setBounds(189, 275, 175, 16);
		userlistframe.getContentPane().add(ApellidoLabel_1_3);
		
		JLabel ApellidoLabel_1_4 = new JLabel(apellidosE);
		ApellidoLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		ApellidoLabel_1_4.setBounds(189, 325, 175, 16);
		userlistframe.getContentPane().add(ApellidoLabel_1_4);
		
		JLabel ApellidoLabel_1_5 = new JLabel(apellidosF);
		ApellidoLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		ApellidoLabel_1_5.setBounds(189, 375, 175, 16);
		userlistframe.getContentPane().add(ApellidoLabel_1_5);
		
		JLabel ApellidoLabel_1_6 = new JLabel(apellidosG);
		ApellidoLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		ApellidoLabel_1_6.setBounds(189, 425, 175, 16);
		userlistframe.getContentPane().add(ApellidoLabel_1_6);
		
		JLabel ApellidoLabel_1_7 = new JLabel(apellidosH);
		ApellidoLabel_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		ApellidoLabel_1_7.setBounds(189, 475, 175, 16);
		userlistframe.getContentPane().add(ApellidoLabel_1_7);
		
		JLabel CorreoLabel_1_0 = new JLabel(correoA);
		CorreoLabel_1_0.setHorizontalAlignment(SwingConstants.CENTER);
		CorreoLabel_1_0.setBounds(409, 125, 162, 16);
		userlistframe.getContentPane().add(CorreoLabel_1_0);
		
		JLabel CorreoLabel_1_1 = new JLabel(correoB);
		CorreoLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		CorreoLabel_1_1.setBounds(409, 175, 162, 16);
		userlistframe.getContentPane().add(CorreoLabel_1_1);
		
		JLabel CorreoLabel_1_2 = new JLabel(correoC);
		CorreoLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		CorreoLabel_1_2.setBounds(409, 225, 162, 16);
		userlistframe.getContentPane().add(CorreoLabel_1_2);
		
		JLabel CorreoLabel_1_3 = new JLabel(correoD);
		CorreoLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		CorreoLabel_1_3.setBounds(409, 275, 162, 16);
		userlistframe.getContentPane().add(CorreoLabel_1_3);
		
		JLabel CorreoLabel_1_4 = new JLabel(correoE);
		CorreoLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		CorreoLabel_1_4.setBounds(409, 325, 162, 16);
		userlistframe.getContentPane().add(CorreoLabel_1_4);
		
		JLabel CorreoLabel_1_5 = new JLabel(correoF);
		CorreoLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		CorreoLabel_1_5.setBounds(409, 375, 162, 16);
		userlistframe.getContentPane().add(CorreoLabel_1_5);
		
		JLabel CorreoLabel_1_6 = new JLabel(correoG);
		CorreoLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		CorreoLabel_1_6.setBounds(409, 425, 162, 16);
		userlistframe.getContentPane().add(CorreoLabel_1_6);
		
		JLabel CorreoLabel_1_7 = new JLabel(correoH);
		CorreoLabel_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		CorreoLabel_1_7.setBounds(409, 475, 162, 16);
		userlistframe.getContentPane().add(CorreoLabel_1_7);
		
		JButton btnNewButton_1_0 = new JButton("Selección");
		btnNewButton_1_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
//*******************si esta a null, avisa de que no puedes seleccionarlo**************			
				if (CorreoLabel_1_0.getText().equals("Null")) {
					JOptionPane.showInternalMessageDialog(null , "El cliente no existe");
				}else {
//*****************si no lo esta, llamamos al metodo que nos trae los datos************
				 DatosCliente2(CorreoLabel_1_0.getText());
//*****************y con una ventana avisamos de que ya tenemos los datos guardados**********
				 adminmodification modifica= new adminmodification();
					adminmodification.main(null);
					userlistframe.dispose();
				}
			}
		});
		btnNewButton_1_0.setBounds(925, 152, 95, 21);
		userlistframe.getContentPane().add(btnNewButton_1_0);
		
		JButton btnNewButton_1_1 = new JButton("Selección");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (CorreoLabel_1_1.getText().equals("Null")) {
					JOptionPane.showInternalMessageDialog(null , "El cliente no existe");
				}else {
				DatosCliente2(CorreoLabel_1_1.getText());
				adminmodification modifica= new adminmodification();
					adminmodification.main(null);
					userlistframe.dispose();
				}
			}
		});
		btnNewButton_1_1.setBounds(925, 202, 95, 21);
		userlistframe.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Selección");
		btnNewButton_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (CorreoLabel_1_2.getText().equals("Null")) {
					JOptionPane.showInternalMessageDialog(null , "El cliente no existe");
				}else {
				
				 DatosCliente2(CorreoLabel_1_2.getText());
				 	adminmodification modifica= new adminmodification();
					adminmodification.main(null);
					userlistframe.dispose();
				}
			}
		});
		btnNewButton_1_2.setBounds(925, 245, 95, 21);
		userlistframe.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Selección");
		btnNewButton_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (CorreoLabel_1_3.getText().equals("Null")) {
					JOptionPane.showInternalMessageDialog(null , "El cliente no existe");
				}else {
				
			DatosCliente2(CorreoLabel_1_3.getText());
					adminmodification modifica= new adminmodification();
					adminmodification.main(null);
					userlistframe.dispose();
				}
			}
		});
		btnNewButton_1_3.setBounds(925, 295, 95, 21);
		userlistframe.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("Selección");
		btnNewButton_1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (CorreoLabel_1_4.getText().equals("Null")) {
					JOptionPane.showInternalMessageDialog(null , "El cliente no existe");
				}else {
			DatosCliente2(CorreoLabel_1_4.getText());
					adminmodification modifica= new adminmodification();
					adminmodification.main(null);
					userlistframe.dispose();
				}
			}
		});
		btnNewButton_1_4.setBounds(925, 336, 95, 21);
		userlistframe.getContentPane().add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("Selección");
		btnNewButton_1_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (CorreoLabel_1_5.getText().equals("Null")) {
					JOptionPane.showInternalMessageDialog(null , "El cliente no existe");
				}else {
				DatosCliente2(CorreoLabel_1_5.getText());
					adminmodification modifica= new adminmodification();
					adminmodification.main(null);
					userlistframe.dispose();
				}
			}
		});
		btnNewButton_1_5.setBounds(925, 386, 95, 21);
		userlistframe.getContentPane().add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("Selección");
		btnNewButton_1_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (CorreoLabel_1_6.getText().equals("Null")) {
					JOptionPane.showInternalMessageDialog(null , "El cliente no existe");
				}else {
			DatosCliente2(CorreoLabel_1_6.getText());
					adminmodification modifica= new adminmodification();
					adminmodification.main(null);
					userlistframe.dispose();
					}
			}
		});
		btnNewButton_1_6.setBounds(925, 425, 95, 21);
		userlistframe.getContentPane().add(btnNewButton_1_6);
		
		JButton btnNewButton_1_7 = new JButton("Selección");
		btnNewButton_1_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (CorreoLabel_1_7.getText().equals("Null")) {
					JOptionPane.showInternalMessageDialog(null , "El cliente no existe");
				}else {
			DatosCliente2(CorreoLabel_1_7.getText());
					adminmodification modifica= new adminmodification();
					adminmodification.main(null);
					userlistframe.dispose();
				}
			}
		});
		btnNewButton_1_7.setBounds(925, 475, 95, 21);
		userlistframe.getContentPane().add(btnNewButton_1_7);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setForeground(Color.WHITE);
		btnEliminar.setBackground(Color.RED);
		btnEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (CorreoLabel_1_0.getText().equals("Null")){
					JOptionPane.showInternalMessageDialog(null , "El cliente no existe");
				}else {
					EliminaCliente(CorreoLabel_1_0.getText());
					JOptionPane.showInternalMessageDialog(null , "Cliente eliminado");
					CorreoLabel_1_0.setText("Null");
					ApellidoLabel_1_0.setText("Null");
					UsuarioLabel_1_0.setText("Null");
				}	
			}
		});
		btnEliminar.setBounds(1057, 152, 85, 21);
		userlistframe.getContentPane().add(btnEliminar);
		
		JButton btnEliminar_1 = new JButton("Eliminar");
		btnEliminar_1.setForeground(Color.WHITE);
		btnEliminar_1.setBackground(Color.RED);
		btnEliminar_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (CorreoLabel_1_1.getText().equals("Null")){
					JOptionPane.showInternalMessageDialog(null , "El cliente no existe");
				}else {
					//sentencia para eliminar
					EliminaCliente(CorreoLabel_1_1.getText());
					JOptionPane.showInternalMessageDialog(null , "Cliente eliminado");
					CorreoLabel_1_1.setText("Null");
					ApellidoLabel_1_1.setText("Null");
					UsuarioLabel_1_1.setText("Null");
				}
			}
		});
		btnEliminar_1.setBounds(1057, 202, 85, 21);
		userlistframe.getContentPane().add(btnEliminar_1);
		
		JButton btnEliminar_8 = new JButton("Eliminar");
		btnEliminar_8.setForeground(Color.WHITE);
		btnEliminar_8.setBackground(Color.RED);
		btnEliminar_8.setBounds(1057, 245, 85, 21);
		userlistframe.getContentPane().add(btnEliminar_8);
		
		JButton btnEliminar_1_1 = new JButton("Eliminar");
		btnEliminar_1_1.setForeground(Color.WHITE);
		btnEliminar_1_1.setBackground(Color.RED);
		btnEliminar_1_1.setBounds(1057, 295, 85, 21);
		userlistframe.getContentPane().add(btnEliminar_1_1);
		
		JButton btnEliminar_9 = new JButton("Eliminar");
		btnEliminar_9.setForeground(Color.WHITE);
		btnEliminar_9.setBackground(Color.RED);
		btnEliminar_9.setBounds(1057, 336, 85, 21);
		userlistframe.getContentPane().add(btnEliminar_9);
		
		JButton btnEliminar_1_2 = new JButton("Eliminar");
		btnEliminar_1_2.setForeground(Color.WHITE);
		btnEliminar_1_2.setBackground(Color.RED);
		btnEliminar_1_2.setBounds(1057, 386, 85, 21);
		userlistframe.getContentPane().add(btnEliminar_1_2);
		
		JButton btnEliminar_10 = new JButton("Eliminar");
		btnEliminar_10.setForeground(Color.WHITE);
		btnEliminar_10.setBackground(Color.RED);
		btnEliminar_10.setBounds(1057, 425, 85, 21);
		userlistframe.getContentPane().add(btnEliminar_10);
		
		JButton btnEliminar_1_3 = new JButton("Eliminar");
		btnEliminar_1_3.setForeground(Color.WHITE);
		btnEliminar_1_3.setBackground(Color.RED);
		btnEliminar_1_3.setBounds(1057, 475, 85, 21);
		userlistframe.getContentPane().add(btnEliminar_1_3);
		
		JButton btnEliminar_2 = new JButton("Eliminar");
		btnEliminar_2.setForeground(Color.WHITE);
		btnEliminar_2.setBackground(Color.RED);
		btnEliminar_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (CorreoLabel_1_2.getText().equals("Null")){
					JOptionPane.showInternalMessageDialog(null , "El cliente no existe");
				}else {
					//sentencia para eliminar
					EliminaCliente(CorreoLabel_1_2.getText());
					JOptionPane.showInternalMessageDialog(null , "Cliente eliminado");
					CorreoLabel_1_2.setText("Null");
					ApellidoLabel_1_2.setText("Null");
					UsuarioLabel_1_2.setText("Null");
				}
			}
		});
		btnEliminar_2.setBounds(789, 225, 85, 21);
		userlistframe.add(btnEliminar_2);
		
		JButton btnEliminar_3 = new JButton("Eliminar");
		btnEliminar_3.setForeground(Color.WHITE);
		btnEliminar_3.setBackground(Color.RED);
		btnEliminar_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (CorreoLabel_1_3.getText().equals("Null")){
					JOptionPane.showInternalMessageDialog(null , "El cliente no existe");
				}else {
					//sentencia para eliminar
					EliminaCliente(CorreoLabel_1_3.getText());
					JOptionPane.showInternalMessageDialog(null , "Cliente eliminado");
					CorreoLabel_1_3.setText("Null");
					ApellidoLabel_1_3.setText("Null");
					UsuarioLabel_1_3.setText("Null");
				}
			}
		});
		btnEliminar_3.setBounds(789, 273, 85, 21);
		userlistframe.add(btnEliminar_3);
		
		JButton btnEliminar_4 = new JButton("Eliminar");
		btnEliminar_4.setForeground(Color.WHITE);
		btnEliminar_4.setBackground(Color.RED);
		btnEliminar_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (CorreoLabel_1_4.getText().equals("Null")){
					JOptionPane.showInternalMessageDialog(null , "El cliente no existe");
				}else {
					//sentencia para eliminar
					EliminaCliente(CorreoLabel_1_4.getText());
					JOptionPane.showInternalMessageDialog(null , "Cliente eliminado");
					CorreoLabel_1_4.setText("Null");
					ApellidoLabel_1_4.setText("Null");
					UsuarioLabel_1_4.setText("Null");
				}
			}
		});
		btnEliminar_4.setBounds(789, 323, 85, 21);
		userlistframe.add(btnEliminar_4);
		
		JButton btnEliminar_5 = new JButton("Eliminar");
		btnEliminar_5.setForeground(Color.WHITE);
		btnEliminar_5.setBackground(Color.RED);
		btnEliminar_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (CorreoLabel_1_5.getText().equals("Null")){
					JOptionPane.showInternalMessageDialog(null , "El cliente no existe");
				}else {
					//sentencia para eliminar
					EliminaCliente(CorreoLabel_1_5.getText());
					JOptionPane.showInternalMessageDialog(null , "Cliente eliminado");;
					CorreoLabel_1_5.setText("Null");
					ApellidoLabel_1_5.setText("Null");
					UsuarioLabel_1_5.setText("Null");
				}
			}
		});
		btnEliminar_5.setBounds(789, 373, 85, 21);
		userlistframe.add(btnEliminar_5);
		
		JButton btnEliminar_6 = new JButton("Eliminar");
		btnEliminar_6.setForeground(Color.WHITE);
		btnEliminar_6.setBackground(Color.RED);
		btnEliminar_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (CorreoLabel_1_6.getText().equals("Null")){
					JOptionPane.showInternalMessageDialog(null , "El cliente no existe");
				}else {
					//sentencia para eliminar
					EliminaCliente(CorreoLabel_1_6.getText());
					JOptionPane.showInternalMessageDialog(null , "Cliente eliminado");
					CorreoLabel_1_6.setText("Null");
					ApellidoLabel_1_6.setText("Null");
					UsuarioLabel_1_6.setText("Null");
				}
			}
		});
		btnEliminar_6.setBounds(789, 423, 85, 21);
		userlistframe.add(btnEliminar_6);
		
		JButton btnEliminar_7 = new JButton("Eliminar");
		btnEliminar_7.setForeground(Color.WHITE);
		btnEliminar_7.setBackground(Color.RED);
		btnEliminar_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (CorreoLabel_1_7.getText().equals("Null")){
					JOptionPane.showInternalMessageDialog(null , "El cliente no existe");
				}else {
					//sentencia para eliminar
					EliminaCliente(CorreoLabel_1_7.getText());
					JOptionPane.showInternalMessageDialog(null , "Cliente eliminado");
					CorreoLabel_1_7.setText("Null");
					ApellidoLabel_1_7.setText("Null");
					UsuarioLabel_1_7.setText("Null");
				}
			}
		});
		btnEliminar_7.setBounds(789, 473, 85, 21);
		userlistframe.add(btnEliminar_7);
		
		JLabel UsuariosLabel = new JLabel("Usuarios");
		UsuariosLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		UsuariosLabel.setBounds(212, 28, 106, 37);
		userlistframe.getContentPane().add(UsuariosLabel);
		
		
		JLabel TituloAdmin = new JLabel("Administrador:");
		TituloAdmin.setFont(new Font("Tahoma", Font.BOLD, 16));
		TituloAdmin.setBounds(474, 21, 140, 32);
		userlistframe.getContentPane().add(TituloAdmin);
		
		JPanel panel = new JPanel();
		panel.setBounds(201, 85, 883, 576);
		panel.setLayout(new GridLayout(8,4));
				}
	}
	//**************devuelve en una lista los correos********************
	public static ArrayList<String> arraydecorreoclientes() {
		ArrayList<String> correos = new ArrayList<String>();
		try{
			
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/EscolapInversiones","root","");
			Statement miStatement=(Statement) miConexion.createStatement();
			String instruccionSQL="SELECT correo FROM cliente;";
			ResultSet miResultset=miStatement.executeQuery(instruccionSQL);
			while(miResultset.next()){
				correos.add(miResultset.getString("correo"));
			}
			miConexion.close();
			
			} catch(Exception e){
				System.out.println("Error de conexión con la BD al crear el objeto.");
			}
		return correos;
	}
	//**************devuelve en una lista los nombres********************
	public static ArrayList<String> arraynombresclientes() {
		ArrayList<String> nombres = new ArrayList<String>();
		try{
			
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/EscolapInversiones","root","");
			Statement miStatement=(Statement) miConexion.createStatement();
			String instruccionSQL="SELECT nombre FROM cliente;";
			ResultSet miResultset=miStatement.executeQuery(instruccionSQL);
			while(miResultset.next()){
				nombres.add(miResultset.getString("nombre"));
			}
			miConexion.close();
			
			} catch(Exception e){
				System.out.println("Error de conexión con la BD al crear el objeto.");
			}
		return nombres;
	}
	//**************devuelve en una lista los apellidos********************
	public static ArrayList<String> arrayapellidossclientes() {
		ArrayList<String> apellidos = new ArrayList<String>();
		try{
			
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/EscolapInversiones","root","");
			Statement miStatement=(Statement) miConexion.createStatement();
			String instruccionSQL="SELECT apellidos FROM cliente;";
			ResultSet miResultset=miStatement.executeQuery(instruccionSQL);
			while(miResultset.next()){
				apellidos.add(miResultset.getString("apellidos"));
			}
			miConexion.close();
			
			} catch(Exception e){
				System.out.println("Error de conexión con la BD al crear el objeto.");
			}
		return apellidos;
	}
//**********metodo para eliminar un cliente**********************
		public static void EliminaCliente(String Correo) {
			Connection miConexion;
			try {
				miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/EscolapInversiones","root","");
				Statement miStatement=(Statement) miConexion.createStatement();
				String instruccionSQL="DELETE FROM cliente where correo = '"+Correo+"';";
				miStatement.executeUpdate(instruccionSQL);
				miConexion.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
}
}
	}
}
