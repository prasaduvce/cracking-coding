package com.practice.designpatterns.structural.facade;

import java.sql.Connection;

public class FacadeHelper {

	private static OracleSqlHelper oracleSqlHelper = new OracleSqlHelper();

	private static MySqlHelper mySqlHelper = new MySqlHelper();

	public static void createReport(DbType dbType, ReportType reportType) {
		switch (dbType) {
			case ORACLE:
				Connection dbConnection = oracleSqlHelper.getDbConnection();
				switch(reportType) {
					case PDF:
						oracleSqlHelper.generatePdf("PdfTable", dbConnection);
						break;
					case HTML:
						oracleSqlHelper.generateExcel("ExcelTable", dbConnection);
						break;
				}
				break;
			case MYSQL:
				Connection mySqlConnection = mySqlHelper.getDbConnection();
				switch(reportType) {
					case PDF:
						mySqlHelper.generatePdf("PdfTable", mySqlConnection);
						break;
					case HTML:
						mySqlHelper.generateExcel("ExcelTable", mySqlConnection);
						break;
				}
				break;
		}
	}
}
