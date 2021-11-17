package inversiones;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import com.mysql.jdbc.Statement;

public class fluctuationstrades extends Thread {
	JLabel valordeaccion;
	String accion;
	public fluctuationstrades ( JLabel valordeaccion, String accion) {
		
		this.valordeaccion=valordeaccion;
		this.accion=accion;
	}
	
		@Override
		public void run() {
			while(true) {
				try {
					double fluctuacion = (4*Math.random())-2.00;
					double pasta = Double.parseDouble(getValueTrade(accion));
					double pastatotal = pasta+(pasta*(fluctuacion/100));
					valordeaccion.setText(String.format("%.2f", pastatotal));
					MeterDineroBBDD(pastatotal, accion);
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
	}
	
		public static String getValueTrade(String idacc) {
			String result=" ";
			dbconnection dbconex=new dbconnection();
	        try{
	        	Statement stat = (Statement) dbconex.getConnection().createStatement();
	            String instruccionSQL="SELECT value FROM markets where id = "+idacc;
	            ResultSet miResultset=stat.executeQuery(instruccionSQL);
	            while(miResultset.next()){
	              result = miResultset.getString("value"); 
	            }
	            dbconex.closeconn();
	            } catch(Exception e){
	                e.printStackTrace();
	            }
	        return result;
		}
		
		public static void MeterDineroBBDD(double totalvalue, String idacc) {
			dbconnection dbconex=new dbconnection();
			try {
				Statement stat = (Statement) dbconex.getConnection().createStatement();
	            String instruccionSQL="UPDATE markets SET value="+totalvalue+"WHERE id="+idacc;
	            stat.executeUpdate(instruccionSQL);
	            dbconex.closeconn();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
}
