package webService;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.joda.time.LocalDate;

import model.AlertManager;
import com.google.gson.Gson;
import dto.Alert;
import dto.Atm_Info;
import dto.City;
import dto.Country;
import dto.District;
import dto.Users;

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
	@Path("/GetDistrict")
	@Produces("application/json")
	public String feedDistrict()
	{
	String feeds = null;
	try
	{
	ArrayList<District> feedData = null;
	AlertManager projectManager= new AlertManager();
	feedData = projectManager.GetDistrict();
	Gson gson = new Gson();
	System.out.println(gson.toJson(feedData));
	feeds = gson.toJson(feedData);
	}

	catch (Exception e)
	{
	System.out.println("Exception Error"); //Console 
	}
	return feeds;
	}

	@GET
	@Path("/GetCityInfo")
	@Produces("application/json")
	public String feedCityInfo()
	{
	String feeds = null;
	try
	{
	ArrayList<City> feedData = null;
	AlertManager projectManager= new AlertManager();
	feedData = projectManager.GetCityInfo();
	Gson gson = new Gson();
	System.out.println(gson.toJson(feedData));
	feeds = gson.toJson(feedData);
	}

	catch (Exception e)
	{
	System.out.println("Exception Error"); //Console 
	}
	return feeds;
	}
	@GET
	@Path("/GetCountry")
	@Produces("application/json")
	public String feedCountry()
	{
	String feeds = null;
	try
	{
	ArrayList<Country> feedData = null;
	AlertManager projectManager= new AlertManager();
	feedData = projectManager.GetCountry();
	Gson gson = new Gson();
	System.out.println(gson.toJson(feedData));
	feeds = gson.toJson(feedData);
	}

	catch (Exception e)
	{
	System.out.println("Exception Error"); //Console 
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
			boolean b = n.insertState(connection, stateName, countryId);

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
			boolean b = n.insertDistrict(connection, districtName, stateId);

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
			boolean b = n.insertCity(connection, cityName, districtId);

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

	public String insertSensor(@PathParam("sensorName") String sensorName, @PathParam("minValue") String minValue,
			@PathParam("maxValue") String maxValue, @PathParam("thresholdValue") String thresholdValue,
			@PathParam("status") String status) {

		String result = "Sensor Insertion Failed!!!!";
		try {

			Database database = new Database();
			Connection connection = database.Get_Connection();

			AlertDao n = new AlertDao();
			boolean b = n.insertSensor(connection, sensorName, minValue, maxValue, thresholdValue, status);

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
			boolean b = n.insertBank(connection, bankName, bankStatus);

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

	/*
	 * @POST
	 * 
	 * @Path("/insertAtm/" + "{atmId}/" + "{atmName}/" + "{bankId}/" +
	 * "{areaName}/" + "{cityId}/" + "{pincode}/" + "{latitude}/" +
	 * "{longitude}/" + "{contactPerson1}/" + "{contactPerson2}/" +
	 * "{contactPerson3}/" + "{contactEmail1}/" + "{contactEmail2}/" +
	 * "{contactEmail3}/" + "{contactNo1}/" + "{contactNo2}/" + "{contactNo3}/"
	 * + "{contactDetails1}/" + "{contactDetails2}/" + "{contactDetails3}/" +
	 * "{brandName}/" + "{installationDate}/" + "{ipAddress}/" + "{online}/" +
	 * "{status}")
	 * 
	 * public String insertAtm(@PathParam("atmId") String atmId,
	 * 
	 * @PathParam("atmName") String atmName ,
	 * 
	 * @PathParam("bankId") int bankId ,
	 * 
	 * @PathParam("areaName") String areaName ,
	 * 
	 * @PathParam("cityId") int cityId ,
	 * 
	 * @PathParam("pincode") String pincode ,
	 * 
	 * @PathParam("latitude") Double latitude ,
	 * 
	 * @PathParam("longitude") Double longitude ,
	 * 
	 * @PathParam("contactPerson1") String contactPerson1 ,
	 * 
	 * @PathParam("contactPerson2") String contactPerson2 ,
	 * 
	 * @PathParam("contactPerson3") String contactPerson3 ,
	 * 
	 * @PathParam("contactEmail1") String contactEmail1 ,
	 * 
	 * @PathParam("contactEmail2") String contactEmail2 ,
	 * 
	 * @PathParam("contactEmail3") String contactEmail3 ,
	 * 
	 * @PathParam("contactNo1") String contactNo1 ,
	 * 
	 * @PathParam("contactNo2") String contactNo2 ,
	 * 
	 * @PathParam("contactNo3") String contactNo3 ,
	 * 
	 * @PathParam("contactDetails1") String contactDetails1 ,
	 * 
	 * @PathParam("contactDetails2") String contactDetails2 ,
	 * 
	 * @PathParam("contactDetails3") String contactDetails3 ,
	 * 
	 * @PathParam("brandName") String brandName ,
	 * 
	 * @PathParam("installationDate") LocalDate installationDate ,
	 * 
	 * @PathParam("ipAddress") String ipAddress ,
	 * 
	 * @PathParam("online") String online ,
	 * 
	 * @PathParam("status") String status) {
	 * 
	 * String result = "Atm Insertion Failed!!!!"; try {
	 * 
	 * Database database = new Database(); Connection connection =
	 * database.Get_Connection();
	 * 
	 * AlertDao n = new AlertDao(); boolean b = n.insertAtm(connection, atmId,
	 * atmName, bankId, areaName, cityId, pincode, latitude, longitude,
	 * contactPerson1, contactPerson2, contactPerson3, contactEmail1,
	 * contactEmail2, contactEmail3, contactNo1, contactNo2, contactNo3,
	 * contactDetails1, contactDetails2, contactDetails3, brandName,
	 * installationDate, ipAddress, online, status);
	 * 
	 * 
	 * 
	 * if (b == true) { result = "Atm Added SuccessFully!!!!";
	 * 
	 * } else { result = "Atm Name Already Exists!!!"; }
	 * 
	 * } catch (Exception e) { System.out.println(e); }
	 * 
	 * return result;
	 * 
	 * }
	 */

	

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/addAtm")
	public Response addAtm(Atm_Info atm) {

		String result = "Atm Insertion Failed!!!!";

		System.out.println("Inside Try!!");

		String atmId = atm.getATM_ID();

		System.out.println(atmId);

		String atmName = atm.getATM_NAME();

		System.out.println(atmName);

		int bankId = atm.getBANK_ID();

		System.out.println(bankId);

		String areaName = atm.getAREA_NAME();

		System.out.println(areaName);

		int cityId = atm.getCITY_ID();

		System.out.println(cityId);

		String pincode = atm.getPINCODE();

		System.out.println(pincode);

		Double latitude = atm.getLATITUDE();

		System.out.println(latitude);

		Double longitude = atm.getLONGITUDE();

		System.out.println(longitude);

		String contactPerson1 = atm.getCONTACT_PERSON1();

		System.out.println(contactPerson1);

		String contactPerson2 = atm.getCONTACT_PERSON2();

		System.out.println(contactPerson2);

		String contactPerson3 = atm.getCONTACT_PERSON3();

		System.out.println(contactPerson3);

		String contactEmail1 = atm.getCONTACT_EMAIL1();

		System.out.println(contactEmail1);

		String contactEmail2 = atm.getCONTACT_EMAIL2();

		System.out.println(contactEmail2);

		String contactEmail3 = atm.getCONTACT_EMAIL3();

		System.out.println(contactEmail3);

		String contactNo1 = atm.getCONTACT_NO1();
		System.out.println(contactNo1);

		String contactNo2 = atm.getCONTACT_NO2();
		System.out.println(contactNo2);

		String contactNo3 = atm.getCONTACT_NO3();
		System.out.println(contactNo3);

		String contactDetails1 = atm.getCONTACT_DETAILS1();
		System.out.println(contactDetails1);

		String contactDetails2 = atm.getCONTACT_DETAILS2();
		System.out.println(contactDetails2);

		String contactDetails3 = atm.getCONTACT_DETAILS3();
		System.out.println(contactDetails3);

		String brandName = atm.getBRAND_NAME();
		System.out.println(brandName);

		String d = atm.getINSTALLATION_DATE();

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

		String ipAddress = atm.getIP_ADDRESS();
		System.out.println(ipAddress);
		
		String online = atm.getONLINE();
		System.out.println(online);
		
		String status = atm.getSTATUS();
		System.out.println(status);

		try {

			
			  Date date = formatter.parse(d); 
			  String installationDate = formatter.format(date);
			  System.out.println(formatter.format(date));
			  

			Database database = new Database();
			Connection connection = database.Get_Connection();

			AlertDao n = new AlertDao();
			boolean b = n.insertAtm(connection, atmId, atmName, bankId, areaName, cityId, pincode, latitude, longitude,
					contactPerson1, contactPerson2, contactPerson3, contactEmail1, contactEmail2, contactEmail3,
					contactNo1, contactNo2, contactNo3, contactDetails1, contactDetails2, contactDetails3, brandName,
					installationDate, ipAddress, online, status);
			
			System.out.println("After calling add atm service method!!");

			if (b == true) {
				result = "Atm Added SuccessFully!!!!";

			} else {
				result = "Atm Name Already Exists!!!";
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(result);

		
		return Response.status(200).entity("ATM Added into the Database!!").build();
		/*URL : http://localhost:8080/DemoJavaAngular/REST/WebService/addAtm
		 {
    "aTM_ID" : "1111",
    "aTM_NAME": "Nupur",
    "aREA_NAME": "Nagpur",
    "bANK_ID": "3",
    "cITY_ID": "1",
    "pINCODE": "440018",
    "lATITUDE": "12.0",
    "lONGITUDE": "23.0",
    "cONTACT_PERSON1": "Aman",
    "cONTACT_PERSON2": "Aman",
    "cONTACT_PERSON3": "Aman",
    "cONTACT_EMAIL1": "RAMU@GMAIL.COM",
    "cONTACT_EMAIL2": "SHAMU@GMAIL.COM",
    "cONTACT_EMAIL3": "KALU@GMAIL.COM",
    "cONTACT_NO1": "9876543219",
    "cONTACT_NO2": "9876543219",
    "cONTACT_NO3": "9876543219",
    "cONTACT_DETAILS1": "GUARD",
    "cONTACT_DETAILS2": "GUARD",
    "cONTACT_DETAILS3": "GUARD",
    "bRAND_NAME": "ABCD",
    "iNSTALLATION_DATE": "2016-03-20",
    "iP_ADDRESS": "192.168.78.9",
    "oNLINE": "1",
    "sTATUS": "ACTIVATED"

    }*/
		

	}
	
	
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/addUser")
	public Response addUser(Users user) {

		String result = "USER Insertion Failed!!!!";

		System.out.println("Inside Try!!");
		
		String firstName = user.getFIRST_NAME();
		System.out.println(firstName);
		
		String lastName = user.getLAST_NAME();
		System.out.println(lastName);
		
		String email = user.getEMAIL();
		System.out.println(email);
		
		String password = user.getPASSWORD();
		System.out.println(password);
		
		String phoneNo = user.getPHONE_NUMBER();
		System.out.println(phoneNo);
		
		int roleId = user.getROLE_ID();
		System.out.println(roleId);
		
		//String lastLogin = user.getLAST_LOGIN();
		//System.out.println(lastLogin);
		
		String token = user.getTOKEN();
		System.out.println(token);
		
		String userStatus = user.getUSER_STATUS();
		System.out.println(userStatus);
		
		
		try {

			Database database = new Database();
			Connection connection = database.Get_Connection();

			AlertDao n = new AlertDao();
			boolean b = n.addUser(connection, firstName, lastName, email, password, phoneNo, roleId, token, userStatus);
					
			System.out.println("After calling add User service method!!");

			if (b == true) {
				result = "Atm Added SuccessFully!!!!";

			} else {
				result = "Atm Name Already Exists!!!";
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(result);

		
		return Response.status(200).entity("USER Added into the Database!!").build();
		/*
		 URL : http://localhost:8080/DemoJavaAngular/REST/WebService/addUser
		 {
    "fIRST_NAME" : "Nupur",
    "lAST_NAME": "Agrahari",
    "eMAIL": "nupur.agrahari13@gmail.com",
    "pASSWORD": "nupur",
    "pHONE_NUMBER": "8087638410",
    "rOLE_ID": "1",
    "tOKEN": "1",
    "uSER_STATUS": "ACTIVATED"
    
    }*/
		

	}
	
	
	
	
	

}
