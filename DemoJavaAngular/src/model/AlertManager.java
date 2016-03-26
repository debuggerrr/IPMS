package model;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import dao.Database;
import dao.AlertDao;
import dto.Alert;
import dto.Country;

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

	
	public ArrayList<Country> GetCountry() throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Country> feeds = null;
		try {
		Database database= new Database();
		Connection connection = database.Get_Connection();
		AlertDao project= new AlertDao();
		feeds=project.GetCountry(connection);
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		
	}
	
}
