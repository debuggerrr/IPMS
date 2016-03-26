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

	
	public ArrayList<Country> CountryMethod() throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Country> countryList = null;
		try {
		Database database= new Database();
		Connection connection = database.Get_Connection();
		AlertDao project= new AlertDao();
		countryList=project.GetCountry(connection);
		}
		catch (Exception e) {
		throw e;
		}
		return countryList;
		
	}
	public ArrayList<District> DistrictMethod()throws Exception {
		ArrayList<District> districtList = null;
		try {
		Database database= new Database();
		Connection connection = database.Get_Connection();
		AlertDao project= new AlertDao();
		districtList=project.GetDistrict(connection);
		}
		catch (Exception e) {
		throw e;
		}
		return districtList;
		}
	
	public ArrayList<City> CityMethod()throws Exception {
		ArrayList<City> cityList = null;
		try {
		Database database= new Database();
		Connection connection = database.Get_Connection();
		AlertDao project= new AlertDao();
		cityList=project.GetCityInfo(connection);
		}
		catch (Exception e) {
		throw e;
		}
		return cityList;
		}
	
	public ArrayList<Bank_Info> BankInfoMethod()throws Exception {
		ArrayList<Bank_Info> bankList = null;
		try {
		Database database= new Database();
		Connection connection = database.Get_Connection();
		AlertDao project= new AlertDao();
		bankList=project.GetBankInfo(connection);
		}
		catch (Exception e) {
		throw e;
		}
		return bankList;
		}

	public ArrayList<Sensor> SensorMethod()throws Exception {
		ArrayList<Sensor> sensorManagerData = null;
		try {
		Database database= new Database();
		Connection connection = database.Get_Connection();
		AlertDao project= new AlertDao();
		sensorManagerData=project.GetSensorInfo(connection);
		}
		catch (Exception e) {
		throw e;
		}
		return sensorManagerData;
		}

	public ArrayList<State> StateMethod()throws Exception {
		ArrayList<State> stateManagerData = null;
		try {
		Database database= new Database();
		Connection connection = database.Get_Connection();
		AlertDao project= new AlertDao();
		stateManagerData=project.GetStateInfo(connection);
		}
		catch (Exception e) {
		throw e;
		}
		return stateManagerData;
		}

}
