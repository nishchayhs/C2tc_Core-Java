package com.cg.client;

import java.sql.Connection;
import java.sql.SQLException;

import com.cg.crudoperation.Crudoperation;
import com.cg.util.DBUtil;

public class Client {

	public static void main(String[] args) throws SQLException {
	Connection connection = DBUtil.getConnection();
	if(connection != null) {
		System.out.println("JDBC : connection is established");
	}
	Crudoperation.retriveByidStudent();	
	}

}
