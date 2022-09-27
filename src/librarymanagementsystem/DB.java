/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagementsystem;

/**
 *
 * @author shrinithi
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library?zeroDateTimeBehavior=CONVERT_TO_NULL","shrinithi","SHRINITHI_ER03");
		}catch(Exception e){System.out.println(e);}
		return con;
	}

}