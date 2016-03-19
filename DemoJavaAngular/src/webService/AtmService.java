package webService;

import java.sql.Connection;
import java.util.ArrayList;
import dao.AlertDao;
import dao.Database;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.core.Response;

import model.AlertManager;
import com.google.gson.Gson;
import dto.Alert;

@Path("/WebService")
public class AtmService {

	@GET
	@Path("/GetAlert")
	@Produces("application/json")
	public String feed() {
		String feeds = null;

		try {
			List<Object[]> alertData = null;

			AlertManager alertManager = new AlertManager();
			alertData = alertManager.GetAlert();
			Gson gson = new Gson();
			System.out.println(gson.toJson(alertData));
			feeds = gson.toJson(alertData);
		}

		catch (Exception e) {
			System.out.println("Exception Error"); 
		}
		return feeds;
	}

	
	@GET
	@Path("/insertCountry/{countryName}")

	public String insertCountry(@PathParam("countryName") String countryName) {

		String result = "Country Insertion Failed!!!!";
		try {

			Database database = new Database();
			Connection connection = database.Get_Connection();

			AlertDao n = new AlertDao();
			boolean b = n.insertCountry(connection, countryName);

			if (b == true) {
				result = "Country Added SuccessFully!!!!";

			} else {
				result = "Country Name Already Exists!!!";
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return result;

	}
	
	@GET
	@Path("/insertState/{stateName}/{countryId}")

	public String insertState(@PathParam("stateName") String stateName, @PathParam("countryId") int countryId) {

		String result = "State Insertion Failed!!!!";
		try {

			Database database = new Database();
			Connection connection = database.Get_Connection();

			AlertDao n = new AlertDao();
			boolean b = n.insertState(connection, stateName , countryId);

			if (b == true) {
				result = "State Added SuccessFully!!!!";

			} else {
				result = "State Name Already Exists!!!";
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return result;

	}
	
	@GET
	@Path("/insertDistrict/{districtName}/{stateId}")

	public String insertDistrict(@PathParam("districtName") String districtName, @PathParam("stateId") int stateId) {

		String result = "District Insertion Failed!!!!";
		try {

			Database database = new Database();
			Connection connection = database.Get_Connection();

			AlertDao n = new AlertDao();
			boolean b = n.insertDistrict(connection, districtName , stateId);

			if (b == true) {
				result = "District Added SuccessFully!!!!";

			} else {
				result = "District Name Already Exists!!!";
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return result;

	}
	
	@GET
	@Path("/insertCity/{cityName}/{districtId}")

	public String insertCity(@PathParam("cityName") String cityName, @PathParam("districtId") int districtId) {

		String result = "City Insertion Failed!!!!";
		try {

			Database database = new Database();
			Connection connection = database.Get_Connection();

			AlertDao n = new AlertDao();
			boolean b = n.insertCity(connection, cityName , districtId);

			if (b == true) {
				result = "City Added SuccessFully!!!!";

			} else {
				result = "City Name Already Exists!!!";
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return result;

	}
	
	
	@GET
	@Path("/insertSensor/{sensorName}/{minValue}/{maxValue}/{thresholdValue}/{status}")

	public String insertSensor(@PathParam("sensorName") String sensorName, @PathParam("minValue") String minValue,  @PathParam("maxValue") String maxValue,  @PathParam("thresholdValue") String thresholdValue,  @PathParam("status") String status) {

		String result = "Sensor Insertion Failed!!!!";
		try {

			Database database = new Database();
			Connection connection = database.Get_Connection();

			AlertDao n = new AlertDao();
			boolean b = n.insertSensor(connection, sensorName , minValue , maxValue , thresholdValue , status);

			if (b == true) {
				result = "Sensor Added SuccessFully!!!!";

			} else {
				result = "Sensor Name Already Exists!!!";
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return result;

	}
	
	@GET
	@Path("/insertBank/{bankName}/{bankStatus}")

	public String insertBank(@PathParam("bankName") String bankName, @PathParam("bankStatus") String bankStatus) {

		String result = "Bank Insertion Failed!!!!";
		try {

			Database database = new Database();
			Connection connection = database.Get_Connection();

			AlertDao n = new AlertDao();
			boolean b = n.insertBank(connection, bankName , bankStatus);

			if (b == true) {
				result = "Bank Added SuccessFully!!!!";

			} else {
				result = "Bank Name Already Exists!!!";
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		return result;

	}
	


}
