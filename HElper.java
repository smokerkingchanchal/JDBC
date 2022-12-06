package com.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Helper {
 static {
	 try {
	 	Class.forName("com.mysql.cj.jdbc.Driver");//registering my sql driver
 }
	 catch(Exception e) {
		 e.printStackTrace();
	 }
	 }
 public static Connection con()throws SQLException{
	 return DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Chanchal@2002");
	 
 }

public static void main(String...args) throws SQLException {
	MenuDrivenEg mde=new MenuDrivenEg();
	mde.saveMenudriven();
	mde.fetchMenudriven();
	mde.updateMenudriven();
	mde.deleteMenudriven();
}}
