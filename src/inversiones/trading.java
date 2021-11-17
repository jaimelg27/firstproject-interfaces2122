package inversiones;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import com.mysql.jdbc.Statement;

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
		
		JLabel SeleccionarLabel = new JLabel("A COMPRAR/VENDER");
		SeleccionarLabel.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		SeleccionarLabel.setBounds(867, 106, 145, 21);
		panel_1.getContentPane().add(SeleccionarLabel);		
		
		
		JLabel fluctuacion1Label = new JLabel(valueacc());
		fluctuacion1Label.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fluctuacion1Label.setBounds(468, 149, 92, 21);
		panel_1.getContentPane().add(fluctuacion1Label);
		
		JLabel fluctuacion2Label = new JLabel(valueacc());
		fluctuacion2Label.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fluctuacion2Label.setBounds(468, 199, 92, 21);
		panel_1.getContentPane().add(fluctuacion2Label);
		
		JLabel fluctuacion3Label = new JLabel(valueacc());
		fluctuacion3Label.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fluctuacion3Label.setBounds(468, 249, 92, 21);
		panel_1.getContentPane().add(fluctuacion3Label);
		
		JLabel fluctuacion4Label = new JLabel(valueacc());
		fluctuacion4Label.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fluctuacion4Label.setBounds(468, 300, 92, 21);
		panel_1.getContentPane().add(fluctuacion4Label);
		
		JLabel fluctuacion5Label = new JLabel(valueacc());
		fluctuacion5Label.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fluctuacion5Label.setBounds(470, 349, 90, 21);
		panel_1.getContentPane().add(fluctuacion5Label);
		
		JLabel fluctuacion6Label = new JLabel(valueacc());
		fluctuacion6Label.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fluctuacion6Label.setBounds(471, 400, 89, 21);
		panel_1.getContentPane().add(fluctuacion6Label);
		
		JLabel fluctuacion7Label = new JLabel(valueacc());
		fluctuacion7Label.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fluctuacion7Label.setBounds(473, 450, 87, 21);
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
		lblFluctuacion.setBounds(468, 105, 96, 21);
		panel_1.getContentPane().add(lblFluctuacion);
		
		JLabel lblMercado = new JLabel("MERCADO");
		lblMercado.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblMercado.setBounds(156, 106, 71, 21);
		panel_1.getContentPane().add(lblMercado);
		
		JLabel lblAnaAcciona = new JLabel("ANA - ACCIONA");
		lblAnaAcciona.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblAnaAcciona.setBounds(144, 144, 109, 21);
		panel_1.getContentPane().add(lblAnaAcciona);
		
		JLabel lblAenaAena = new JLabel("AENA - AENA");
		lblAenaAena.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblAenaAena.setBounds(145, 195, 92, 21);
		panel_1.getContentPane().add(lblAenaAena);
		
		JLabel lblFerFerrovial = new JLabel("FER - FERROVIAL");
		lblFerFerrovial.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblFerFerrovial.setBounds(140, 245, 112, 21);
		panel_1.getContentPane().add(lblFerFerrovial);
		
		JLabel lblIagIag = new JLabel("IAG - IAG");
		lblIagIag.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblIagIag.setBounds(157, 300, 62, 21);
		panel_1.getContentPane().add(lblIagIag);
		
		JLabel lblMelMeli = new JLabel("MEL - Meli\u00E1");
		lblMelMeli.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblMelMeli.setBounds(155, 346, 79, 21);
		panel_1.getContentPane().add(lblMelMeli);
		
		JLabel lblRepRepsol = new JLabel("REP - Repsol");
		lblRepRepsol.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblRepRepsol.setBounds(154, 394, 84, 21);
		panel_1.getContentPane().add(lblRepRepsol);
		
		JLabel lblTefTelefonica = new JLabel("TEF - Telefonica");
		lblTefTelefonica.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblTefTelefonica.setBounds(146, 446, 106, 21);
		panel_1.getContentPane().add(lblTefTelefonica);
		
		
		
		JLabel lblAccionesActuales = new JLabel("ACCIONES ACTUALES");
		lblAccionesActuales.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblAccionesActuales.setBounds(618, 105, 144, 21);
		panel_1.getContentPane().add(lblAccionesActuales);
		
		JLabel fluctuacion1Label_1 = new JLabel(getActionDB(1));
		fluctuacion1Label_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fluctuacion1Label_1.setBounds(642, 149, 85, 21);
		panel_1.getContentPane().add(fluctuacion1Label_1);
		
		JLabel fluctuacion1Label_1_1 = new JLabel(getActionDB(2));
		fluctuacion1Label_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fluctuacion1Label_1_1.setBounds(641, 196, 86, 21);
		panel_1.getContentPane().add(fluctuacion1Label_1_1);
		
		JLabel fluctuacion1Label_1_1_1 = new JLabel(getActionDB(3));
		fluctuacion1Label_1_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fluctuacion1Label_1_1_1.setBounds(642, 252, 85, 21);
		panel_1.getContentPane().add(fluctuacion1Label_1_1_1);
		
		JLabel fluctuacion1Label_1_1_1_1 = new JLabel(getActionDB(4));
		fluctuacion1Label_1_1_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fluctuacion1Label_1_1_1_1.setBounds(640, 301, 87, 21);
		panel_1.getContentPane().add(fluctuacion1Label_1_1_1_1);
		
		JLabel fluctuacion1Label_1_1_1_2 = new JLabel(getActionDB(5));
		fluctuacion1Label_1_1_1_2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fluctuacion1Label_1_1_1_2.setBounds(641, 350, 86, 21);
		panel_1.getContentPane().add(fluctuacion1Label_1_1_1_2);
		
		JLabel fluctuacion1Label_1_1_1_2_1 = new JLabel(getActionDB(6));
		fluctuacion1Label_1_1_1_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fluctuacion1Label_1_1_1_2_1.setBounds(642, 400, 85, 21);
		panel_1.getContentPane().add(fluctuacion1Label_1_1_1_2_1);
		
		JLabel fluctuacion1Label_1_1_1_2_1_1 = new JLabel(getActionDB(7));
		fluctuacion1Label_1_1_1_2_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		fluctuacion1Label_1_1_1_2_1_1.setBounds(641, 448, 86, 21);
		panel_1.getContentPane().add(fluctuacion1Label_1_1_1_2_1_1);
		
		JLabel lblPrecioAccion = new JLabel("PRECIO ACCION");
		lblPrecioAccion.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblPrecioAccion.setBounds(324, 106, 107, 21);
		panel_1.getContentPane().add(lblPrecioAccion);
		
		JLabel precio1Label_1 = new JLabel(costacc());
		precio1Label_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		precio1Label_1.setBounds(337, 149, 77, 21);
		panel_1.getContentPane().add(precio1Label_1);
		
		JLabel precio2Label_1 = new JLabel(costacc());
		precio2Label_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		precio2Label_1.setBounds(337, 197, 77, 21);
		panel_1.getContentPane().add(precio2Label_1);
		
		JLabel precio3Label_1 = new JLabel(costacc());
		precio3Label_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		precio3Label_1.setBounds(337, 247, 77, 21);
		panel_1.getContentPane().add(precio3Label_1);
		
		JLabel precio4Label_1 = new JLabel(costacc());
		precio4Label_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		precio4Label_1.setBounds(337, 298, 77, 21);
		panel_1.getContentPane().add(precio4Label_1);
		
		JLabel precio5Label_1 = new JLabel(costacc());
		precio5Label_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		precio5Label_1.setBounds(337, 347, 77, 21);
		panel_1.getContentPane().add(precio5Label_1);
		
		JLabel precio6Label_1 = new JLabel(costacc());
		precio6Label_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		precio6Label_1.setBounds(335, 398, 79, 21);
		panel_1.getContentPane().add(precio6Label_1);
		
		JLabel precio7Label_1 = new JLabel(costacc());
		precio7Label_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		precio7Label_1.setBounds(337, 448, 77, 21);
		panel_1.getContentPane().add(precio7Label_1);

		
		JPanel panel = new JPanel();
		panel.setBounds(201, 85, 883, 576);
		panel.setLayout(new GridLayout(8,4));

		JButton btnNewButton_1_01 = new JButton("Comprar");
		btnNewButton_1_01.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					buy(1, (Integer)spinner_1_0.getValue(), Double.parseDouble(precio1Label_1.getText().replace(",",".")));
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_01.setBounds(867, 148, 85, 21);
		panel_1.getContentPane().add(btnNewButton_1_01);
		
		JButton btnNewButton_1_1 = new JButton("Comprar");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					buy(2, (Integer)spinner_1_1.getValue(), Double.parseDouble(precio2Label_1.getText().replace(",",".")));
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_1.setBounds(868, 198, 85, 21);
		panel_1.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Comprar");
		btnNewButton_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					buy(3, (Integer)spinner_1_2.getValue(), Double.parseDouble(precio3Label_1.getText().replace(",",".")));
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_2.setBounds(868, 253, 85, 21);
		panel_1.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("Comprar");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					buy(4, (Integer)spinner_1_3.getValue(), Double.parseDouble(precio4Label_1.getText().replace(",",".")));
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_3.setBounds(867, 303, 85, 21);
		panel_1.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("Comprar");
		btnNewButton_1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					buy(5, (Integer)spinner_1_4.getValue(), Double.parseDouble(precio5Label_1.getText().replace(",",".")));
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_4.setBounds(867, 351, 85, 21);
		panel_1.getContentPane().add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("Comprar");
		btnNewButton_1_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					buy(6, (Integer)spinner_1_5.getValue(), Double.parseDouble(precio6Label_1.getText().replace(",",".")));
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_5.setBounds(868, 401, 85, 21);
		panel_1.getContentPane().add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("Comprar");
		btnNewButton_1_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					buy(7, (Integer)spinner_1_6.getValue(), Double.parseDouble(precio7Label_1.getText().replace(",",".")));
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_6.setBounds(867, 451, 85, 21);
		panel_1.getContentPane().add(btnNewButton_1_6);
		
		JButton btnNewButton_1_01_1 = new JButton("Vender");
		btnNewButton_1_01_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					sell(1, (Integer)spinner_1_0.getValue(), Double.parseDouble(precio1Label_1.getText().replace(",",".")));
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_01_1.setBounds(962, 147, 85, 21);
		panel_1.getContentPane().add(btnNewButton_1_01_1);
		
		JButton btnNewButton_1_01_1_1 = new JButton("Vender");
		btnNewButton_1_01_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					sell(2, (Integer)spinner_1_1.getValue(), Double.parseDouble(precio2Label_1.getText().replace(",",".")));
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_01_1_1.setBounds(962, 197, 85, 21);
		panel_1.getContentPane().add(btnNewButton_1_01_1_1);
		JButton btnNewButton_1_01_1_1_1 = new JButton("Vender");
		btnNewButton_1_01_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					sell(3, (Integer)spinner_1_2.getValue(), Double.parseDouble(precio3Label_1.getText().replace(",",".")));
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_01_1_1_1.setBounds(962, 253, 85, 21);
		panel_1.getContentPane().add(btnNewButton_1_01_1_1_1);
		
		JButton btnNewButton_1_01_1_1_1_1 = new JButton("Vender");
		btnNewButton_1_01_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					sell(4, (Integer)spinner_1_3.getValue(), Double.parseDouble(precio4Label_1.getText().replace(",",".")));
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_01_1_1_1_1.setBounds(962, 303, 85, 21);
		panel_1.getContentPane().add(btnNewButton_1_01_1_1_1_1);
		
		JButton btnNewButton_1_01_1_1_1_1_1 = new JButton("Vender");
		btnNewButton_1_01_1_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					sell(5, (Integer)spinner_1_4.getValue(), Double.parseDouble(precio5Label_1.getText().replace(",",".")));
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_01_1_1_1_1_1.setBounds(964, 350, 85, 21);
		panel_1.getContentPane().add(btnNewButton_1_01_1_1_1_1_1);
		
		JButton btnNewButton_1_01_1_1_1_1_1_1 = new JButton("Vender");
		btnNewButton_1_01_1_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					sell(6, (Integer)spinner_1_5.getValue(), Double.parseDouble(precio6Label_1.getText().replace(",",".")));
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_01_1_1_1_1_1_1.setBounds(963, 400, 85, 21);
		panel_1.getContentPane().add(btnNewButton_1_01_1_1_1_1_1_1);
		
		JButton btnNewButton_1_01_1_1_1_1_1_2 = new JButton("Vender");
		btnNewButton_1_01_1_1_1_1_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					sell(7, (Integer)spinner_1_6.getValue(), Double.parseDouble(precio7Label_1.getText().replace(",",".")));
				} catch (NumberFormatException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_01_1_1_1_1_1_2.setBounds(966, 450, 85, 21);
		panel_1.getContentPane().add(btnNewButton_1_01_1_1_1_1_1_2);
		
	}
	public String valueacc() {
		double dvalue;
		dvalue=6*Math.random();
		String value = (String) String.format("%.2f", dvalue);
		return value;
	}
	public String costacc() {
		double dcost;
		dcost=60*Math.random();
		String cost = (String) String.format("%.2f", dcost);
		return cost;
	}
	public String getActionDB(int acc) {
		String result=" ";
		dbconnection dbconex=new dbconnection();
		try {
			String dni=staticparametersclient.dni;
			Statement stat = (Statement) dbconex.getConnection().createStatement();
			String querySQL="SELECT accana, accaena, accfer, acciag, accmel, accrep, acctef FROM clients WHERE id= '"+dni+"';";
			ResultSet rs=stat.executeQuery(querySQL);
			while(rs.next()){
        		if (acc==1) {
        			result=rs.getString("accana");
        		} else if (acc==2) {
        			result=rs.getString("accaena");
        		} else if (acc==3) {
        			result=rs.getString("accfer");
        		} else if (acc==4) {
        			result=rs.getString("acciag");
        		} else if (acc==5) {
        			result=rs.getString("accmel");
        		}else if (acc==6) {
        			result=rs.getString("accrep");
        		} else {
        			result=rs.getString("acctef");
        		}
			}
			dbconex.closeconn();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	public void buy(int idacc, int num, double value) throws SQLException {
		double money=Double.parseDouble(getMoney());
		if(((num*value)>money)||(num<=0)) {
			JOptionPane.showInternalMessageDialog(null , "No valido");
		} else {
			dbconnection dbconex=new dbconnection();
			if(idacc==1) {
				Statement stat = (Statement) dbconex.getConnection().createStatement();
				String querySQL="UPDATE clients SET accana=accana+'"+num+"' WHERE id='"+staticparametersclient.dni+"';";
				stat.executeUpdate(querySQL);
				String querySQL2="INSERT INTO MOVEMENTS(id_account, id_market, value, concept) VALUES('"+staticparametersclient.account+"','ana','"+value*num+"', 'Compra acciones')";
				stat.executeUpdate(querySQL2);
			} else if (idacc==2) {
				Statement stat = (Statement) dbconex.getConnection().createStatement();
				String querySQL="UPDATE clients SET accaena=accaena+'"+num+"' WHERE id='"+staticparametersclient.dni+"';";
				stat.executeUpdate(querySQL);
				String querySQL2="INSERT INTO MOVEMENTS(id_account, id_market, value, concept) VALUES('"+staticparametersclient.account+"','aena','"+value*num+"', 'Compra acciones')";
				stat.executeUpdate(querySQL2);
			} else if (idacc==3) {
				Statement stat = (Statement) dbconex.getConnection().createStatement();
				String querySQL="UPDATE clients SET accfer=accfer+'"+num+"' WHERE id='"+staticparametersclient.dni+"';";
				stat.executeUpdate(querySQL);
				String querySQL2="INSERT INTO MOVEMENTS(id_account, id_market, value, concept) VALUES('"+staticparametersclient.account+"','fer','"+value*num+"', 'Compra acciones')";
				stat.executeUpdate(querySQL2);
			} else if (idacc==4) {
				Statement stat = (Statement) dbconex.getConnection().createStatement();
				String querySQL="UPDATE clients SET acciag=acciag+'"+num+"' WHERE id='"+staticparametersclient.dni+"';";
				stat.executeUpdate(querySQL);
				String querySQL2="INSERT INTO MOVEMENTS(id_account, id_market, value, concept) VALUES('"+staticparametersclient.account+"','iag','"+value*num+"', 'Compra acciones')";
				stat.executeUpdate(querySQL2);
			} else if (idacc==5) {
				Statement stat = (Statement) dbconex.getConnection().createStatement();
				String querySQL="UPDATE clients SET accmel=accmel+'"+num+"' WHERE id='"+staticparametersclient.dni+"';";
				stat.executeUpdate(querySQL);
				String querySQL2="INSERT INTO MOVEMENTS(id_account, id_market, value, concept) VALUES('"+staticparametersclient.account+"','mel','"+value*num+"', 'Compra acciones')";
				stat.executeUpdate(querySQL2);
			} else if (idacc==6) {
				Statement stat = (Statement) dbconex.getConnection().createStatement();
				String querySQL="UPDATE clients SET accrep=accrep+'"+num+"' WHERE id='"+staticparametersclient.dni+"';";
				stat.executeUpdate(querySQL);
				String querySQL2="INSERT INTO MOVEMENTS(id_account, id_market, value, concept) VALUES('"+staticparametersclient.account+"','rep','"+value*num+"', 'Compra acciones')";
				stat.executeUpdate(querySQL2);
			} else {
				Statement stat = (Statement) dbconex.getConnection().createStatement();
				String querySQL="UPDATE clients SET acctef=acctef+'"+num+"' WHERE id='"+staticparametersclient.dni+"';";
				stat.executeUpdate(querySQL);
				String querySQL2="INSERT INTO MOVEMENTS(id_account, id_market, value, concept) VALUES('"+staticparametersclient.account+"','tef','"+value*num+"', 'Compra acciones')";
				stat.executeUpdate(querySQL2);
			}
			Statement stat = (Statement) dbconex.getConnection().createStatement();
			String querySQL="UPDATE accounts SET value=value-'"+(num*value)+"' WHERE id_client='"+staticparametersclient.dni+"';";
			stat.executeUpdate(querySQL);
			dbconex.closeconn();
			
		}
	}
	public void sell(int idacc, int num, double value) throws SQLException {
		if(num<=0) {
			JOptionPane.showInternalMessageDialog(null , "No valido");
		} else {
			dbconnection dbconex=new dbconnection();
			if(idacc==1) {
				Statement stat = (Statement) dbconex.getConnection().createStatement();
				String querySQL="UPDATE clients SET accana=accana-'"+num+"' WHERE id='"+staticparametersclient.dni+"';";
				stat.executeUpdate(querySQL);
				String querySQL2="INSERT INTO MOVEMENTS(id_account, id_market, value, concept) VALUES('"+staticparametersclient.account+"','ana','"+value*num+"', 'Venta acciones')";
				stat.executeUpdate(querySQL2);
			} else if (idacc==2) {
				Statement stat = (Statement) dbconex.getConnection().createStatement();
				String querySQL="UPDATE clients SET accaena=accaena-'"+num+"' WHERE id='"+staticparametersclient.dni+"';";
				stat.executeUpdate(querySQL);
				String querySQL2="INSERT INTO MOVEMENTS(id_account, id_market, value, concept) VALUES('"+staticparametersclient.account+"','aena','"+value*num+"', 'Venta acciones')";
				stat.executeUpdate(querySQL2);
			} else if (idacc==3) {
				Statement stat = (Statement) dbconex.getConnection().createStatement();
				String querySQL="UPDATE clients SET accfer=accfer-'"+num+"' WHERE id='"+staticparametersclient.dni+"';";
				stat.executeUpdate(querySQL);
				String querySQL2="INSERT INTO MOVEMENTS(id_account, id_market, value, concept) VALUES('"+staticparametersclient.account+"','fer','"+value*num+"', 'Venta acciones')";
				stat.executeUpdate(querySQL2);
			} else if (idacc==4) {
				Statement stat = (Statement) dbconex.getConnection().createStatement();
				String querySQL="UPDATE clients SET acciag=acciag-'"+num+"' WHERE id='"+staticparametersclient.dni+"';";
				stat.executeUpdate(querySQL);
				String querySQL2="INSERT INTO MOVEMENTS(id_account, id_market, value, concept) VALUES('"+staticparametersclient.account+"','iag','"+value*num+"', 'Venta acciones')";
				stat.executeUpdate(querySQL2);
			} else if (idacc==5) {
				Statement stat = (Statement) dbconex.getConnection().createStatement();
				String querySQL="UPDATE clients SET accmel=accmel-'"+num+"' WHERE id='"+staticparametersclient.dni+"';";
				stat.executeUpdate(querySQL);
				String querySQL2="INSERT INTO MOVEMENTS(id_account, id_market, value, concept) VALUES('"+staticparametersclient.account+"','mel','"+value*num+"', 'Venta acciones')";
				stat.executeUpdate(querySQL2);
			} else if (idacc==6) {
				Statement stat = (Statement) dbconex.getConnection().createStatement();
				String querySQL="UPDATE clients SET accrep=accrep-'"+num+"' WHERE id='"+staticparametersclient.dni+"';";
				stat.executeUpdate(querySQL);
				String querySQL2="INSERT INTO MOVEMENTS(id_account, id_market, value, concept) VALUES('"+staticparametersclient.account+"','rep','"+value*num+"', 'Venta acciones')";
				stat.executeUpdate(querySQL2);
			} else {
				Statement stat = (Statement) dbconex.getConnection().createStatement();
				String querySQL="UPDATE clients SET acctef=acctef-'"+num+"' WHERE id='"+staticparametersclient.dni+"';";
				stat.executeUpdate(querySQL);
				String querySQL2="INSERT INTO MOVEMENTS(id_account, id_market, value, concept) VALUES('"+staticparametersclient.account+"','tfn','"+value*num+"', 'Venta acciones')";
				stat.executeUpdate(querySQL2);
			}
			Statement stat = (Statement) dbconex.getConnection().createStatement();
			String querySQL="UPDATE accounts SET value=value+'"+(num*value)+"' WHERE id_client='"+staticparametersclient.dni+"';";
			stat.executeUpdate(querySQL);
			dbconex.closeconn();
			
			}
		}
	
	public String getMoney() {
		String value= " ";
		dbconnection dbconex=new dbconnection();
		try {
			Statement stat = (Statement) dbconex.getConnection().createStatement();
			String querySQL="SELECT value FROM accounts WHERE id_client= '"+staticparametersclient.dni+"';";
			ResultSet rs=stat.executeQuery(querySQL);
			while (rs.next()) {
				value=rs.getString("value");
			}
			dbconex.closeconn();	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return value;
	}
}

