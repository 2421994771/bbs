package bbs.util;
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * ��ı�ע
 * ���ݿ⹤����
 */
public class DbUtil {
	private String dbUrl="jdbc:mysql://localhost:3306/bbs";
	private String dbUserName="root";//�û���
	private String dbPasssword="1972886479";//����
	private String jdbcName="com.mysql.jdbc.Driver";
	//��ȡ���ݿ�����
	public Connection getCon()throws Exception{
		Class.forName(jdbcName);
		Connection con=DriverManager.getConnection(dbUrl,dbUserName,dbPasssword);
		return con;
	}
	//�ر����ݿ�����
	public void closeCon(Connection con)throws Exception{
		if(con!=null){
			con.close();
		}
	}
	public static void main(String[] args) {
		DbUtil dbutil = new DbUtil();
		try {
			dbutil.getCon();
			System.out.println("���ݿ����ӳɹ�");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("���ݿ�����ʧ��");
		}
	}
}
