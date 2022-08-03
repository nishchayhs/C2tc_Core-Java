package com.cg.crudoperation;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cg.util.DBUtil;

public class Crudoperation {
//inserting operation
	public static void createstudent() throws SQLException {
	Connection connection = DBUtil.getConnection();
	Statement st = connection.createStatement();
	String sqlinsert = "INSERT INTO student(id,name,marks1,marks2)" + "values(2,'nishchay',82,90)";
	int execute = st.executeUpdate(sqlinsert);
	if(execute == 1)
	{
		System.out.println("entry is added");
	
}}
	//Updating Operation
		public static void updateStudent() throws SQLException {
			Connection connection = DBUtil.getConnection();
			Statement st = connection.createStatement();
			String sqlupdate = "UPDATE student SET marks2=85,name='navneeth' Where id=1";
			int execute = st.executeUpdate(sqlupdate);
			if(execute==1) {
				System.out.println("Update is done");
			}
			
		}
		//Deleting Operation
		public static void deleteStudent() throws SQLException {
			Connection connection = DBUtil.getConnection();
			Statement st = connection.createStatement();
			String sqldelete = "DELETE FROM student Where id=1";
			int execute = st.executeUpdate(sqldelete);
			if(execute== 1) {
				System.out.println("Delete is Success");
			}
		}
		//RetrieveID Operation
		public static void retriveByidStudent() throws SQLException {
			Connection connection = DBUtil.getConnection();
			Statement st = connection.createStatement();
			String sqlretrieve = "SELECT * from student Where id = 2";
			ResultSet rs = st.executeQuery(sqlretrieve);
			if(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int marks2 = rs.getInt(3);
				System.out.println(id +" " + name + " " + marks2);
			}
			else {
				System.out.println("Student is not of this class");
			}
			
		}
	
	
	}
