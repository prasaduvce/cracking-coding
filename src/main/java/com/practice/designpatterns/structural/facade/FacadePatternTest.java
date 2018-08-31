package com.practice.designpatterns.structural.facade;

public class FacadePatternTest {
	public static void main(String[] args) {
		FacadeHelper.createReport(DbType.MYSQL, ReportType.HTML);
		FacadeHelper.createReport(DbType.MYSQL, ReportType.PDF);
		FacadeHelper.createReport(DbType.ORACLE, ReportType.HTML);
		FacadeHelper.createReport(DbType.ORACLE, ReportType.PDF);
	}
}
