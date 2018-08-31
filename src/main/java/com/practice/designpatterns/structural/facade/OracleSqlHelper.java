package com.practice.designpatterns.structural.facade;

import java.sql.Connection;

public class OracleSqlHelper {
	public Connection getDbConnection() {
		return null;
	}

	public void generatePdf(String tableName, Connection connection) {
		System.out.println("Generates ORACLE PDF report for table "+tableName+" and connection: "+connection);
	}

	public void generateExcel(String tableName, Connection connection) {
		System.out.println("Generates ORACLE EXCEL report for table "+tableName+" and connection: "+connection);
	}
}
