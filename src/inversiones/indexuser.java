package inversiones;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class indexuser {

	private JFrame userindexframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					indexuser window = new indexuser();
					window.userindexframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public indexuser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		userindexframe = new JFrame();
		userindexframe.setLocationRelativeTo(null);
		userindexframe.getContentPane().setBackground(Color.GRAY);
		userindexframe.setResizable(false);
		userindexframe.setBounds(100, 100, 1200, 800);
		userindexframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		userindexframe.getContentPane().setLayout(null);
		
		JLabel logo_1 = new JLabel("");
		logo_1.setIcon(new ImageIcon(index.class.getResource("/resources/smalllogo.png")));
		logo_1.setBounds(10, 11, 90, 69);
		userindexframe.getContentPane().add(logo_1);
		
		JButton btnInicio = new JButton("Inicio");
		btnInicio.addActionListener(new ActionListener( ) {
			public void actionPerformed(ActionEvent e) {
				indexuser newuserindex=new indexuser();
				newuserindex.main(null);
				userindexframe.dispose();
			}
		});
		btnInicio.setForeground(Color.GRAY);
		btnInicio.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnInicio.setBackground(Color.WHITE);
		btnInicio.setBounds(293, 24, 97, 29);
		userindexframe.getContentPane().add(btnInicio);
		
		JButton btnMercados = new JButton("Depositar/Retirar Dinero");
		btnMercados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				money money=new money();
				money.main(null);
				userindexframe.dispose();
			}
		});
		btnMercados.setForeground(Color.GRAY);
		btnMercados.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnMercados.setBackground(Color.WHITE);
		btnMercados.setBounds(570, 24, 287, 29);
		userindexframe.getContentPane().add(btnMercados);
		
		JButton btnAjustes = new JButton("Ajustes");
		btnAjustes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usersettings settings=new usersettings();
				settings.main(null);
				userindexframe.dispose();
			}
		});
		btnAjustes.setForeground(Color.GRAY);
		btnAjustes.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnAjustes.setBackground(Color.WHITE);
		btnAjustes.setBounds(867, 24, 129, 29);
		userindexframe.getContentPane().add(btnAjustes);
		
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
				userindexframe.dispose();
			}
		});
		btnCerrarSesin.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnCerrarSesin.setBackground(Color.WHITE);
		btnCerrarSesin.setBounds(1006, 24, 168, 29);
		userindexframe.getContentPane().add(btnCerrarSesin);
		
		JButton btnOperaciones = new JButton("Operaciones");
		btnOperaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trading ops=new trading();
				ops.main(null);
				userindexframe.dispose();
			}
		});
		btnOperaciones.setForeground(Color.GRAY);
		btnOperaciones.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnOperaciones.setBackground(Color.WHITE);
		btnOperaciones.setBounds(400, 24, 160, 29);
		userindexframe.getContentPane().add(btnOperaciones);
		
		JLabel lblBienvenidoAEscolapinversiones = new JLabel("Bienvenido a EscolapInversiones");
		lblBienvenidoAEscolapinversiones.setForeground(Color.WHITE);
		lblBienvenidoAEscolapinversiones.setFont(new Font("Segoe UI Black", Font.BOLD, 40));
		lblBienvenidoAEscolapinversiones.setBounds(400, 103, 666, 55);
		userindexframe.getContentPane().add(lblBienvenidoAEscolapinversiones);
		
		JLabel lblElMayorMercado = new JLabel("El mayor mercado de acciones del mundo");
		lblElMayorMercado.setForeground(Color.WHITE);
		lblElMayorMercado.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		lblElMayorMercado.setBounds(410, 158, 647, 42);
		userindexframe.getContentPane().add(lblElMayorMercado);
	}
}
