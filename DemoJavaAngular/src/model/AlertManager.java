package model;

import java.sql.Connection;

import java.util.List;

import dao.Database;
import dao.AlertDao;
import dto.Alert;

public class AlertManager {

	public List<Object[]> GetAlert(){

		List<Object[]> feeds = null;
		try {
			Database database = new Database();
			Connection connection = database.Get_Connection();
			AlertDao project = new AlertDao();
			feeds = project.GetAlert(connection);
		} catch (Exception e) {
			System.out.println(e);
		}
		return feeds;
	}
	
	

}
