package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * <pre>
 * kr.co.swh.lecture.database.java
 * MariaDBSelect.java
 *
 * ���� :�����ͺ��̽� �˻� ����
 * </pre>
 * 
 * @since : 2017. 10. 26.
 * @author : tobby48
 * @version : v1.0
 */
public class MariaDBSelect {

	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://183.99.87.90:3306/DoGyun";

	static final String USERNAME = "root";
	static final String PASSWORD = "swhacademy!";

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try{
			Class.forName(JDBC_DRIVER);
			connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			System.out.println("MariaDB ����.");
			statement = connection.createStatement();

			
//			//	insert
//			boolean result = statement.execute("insert into employees(name,c2) values('����', v2);");
////			boolean result = statement.execute(String.format("insert into a(c1,c2) values(%d, %s);", v1, v2));
//			if(result) System.out.println("ResultSet �� �ִ�.");
//			else System.out.println("������Ʈ �� ���� �ְų� ���ϵǴ� ���� ���� ���");
					
			//	update
//			int result = statement.executeUpdate("update a set c1 = v1;");		//	result = �������͵� ���� ����
//			if(result > 0) System.out.println("����ó��");
//			else System.out.println("������ó��");
				
			//	select
			ResultSet rs = statement.executeQuery("SELECT * FROM employees;");
			
			while(rs.next()){
				int employee_id = rs.getInt("employee_id");
				String name = rs.getString("name");
				double hourly_pay = rs.getDouble("hourly_pay");
				long employee_contact = rs.getLong("employee_contact");
				System.out.println("employee_id : " + employee_id);
				System.out.println("name: " + name);
				System.out.println("hourly_pay: " + hourly_pay);
				System.out.println("employee_contact: " + employee_contact);
				System.out.println(rs.getInt(1));	// ù�� ° ��
			}
			rs.close();
		}catch(SQLException se1){
			se1.printStackTrace();
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			try{
				if(statement!=null) statement.close();
				if(connection!=null) connection.close();
			}catch(SQLException se2){
			}
		}
		System.out.println("MariaDB ��������.");
	}

}
