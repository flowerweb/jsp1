import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;


public class test {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		final String URL="jdbc:mysql://localhost:3306/hrapp";
		final String USER="root";
		final String PASSWORD="";
		Connection conn=null;
		//1加载驱动程序
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	    }
		
		//2获得数据库连接
		try {
			conn= (Connection) DriverManager.getConnection(URL,USER,PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Statement stmt=(Statement) conn.createStatement();
		ResultSet rs=stmt.executeQuery("select * from first");
		while(rs.next()){
			System.out.println(rs.getString("id"));
		}

	}

}
