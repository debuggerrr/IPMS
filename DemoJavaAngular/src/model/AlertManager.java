package model;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import dao.Database;
import dao.AlertDao;
import dto.Alert;
import dto.Bank_Info;
import dto.City;
import dto.Country;
import dto.District;
import dto.Sensor;
import dto.State;

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
	public ArrayList<District> GetDistrict()throws Exception {
		ArrayList<District> feeds = null;
		try {
		Database database= new Database();
		Connection connection = database.Get_Connection();
		AlertDao project= new AlertDao();
		feeds=project.GetDistrict(connection);
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}
	
	public ArrayList<City> GetCityInfo()throws Exception {
		ArrayList<City> feeds = null;
		try {
		Database database= new Database();
		Connection connection = database.Get_Connection();
		AlertDao project= new AlertDao();
		feeds=project.GetCityInfo(connection);
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}
	
	public ArrayList<Bank_Info> GetBankInfo()throws Exception {
		ArrayList<Bank_Info> feeds = null;
		try {
		Database database= new Database();
		Connection connection = database.Get_Connection();
		AlertDao project= new AlertDao();
		feeds=project.GetBankInfo(connection);
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}

	public ArrayList<Sensor> GetSensorInfo()throws Exception {
		ArrayList<Sensor> feeds = null;
		try {
		Database database= new Database();
		Connection connection = database.Get_Connection();
		AlertDao project= new AlertDao();
		feeds=project.GetSensorInfo(connection);
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}

	public ArrayList<State> GetStateInfo()throws Exception {
		ArrayList<State> feeds = null;
		try {
		Database database= new Database();
		Connection connection = database.Get_Connection();
		AlertDao project= new AlertDao();
		feeds=project.GetStateInfo(connection);
		}
		catch (Exception e) {
		throw e;
		}
		return feeds;
		}

}
