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

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

import model.AlertManager;
import com.google.gson.Gson;
import dto.Alert;
import dto.Atm_Info;
import dto.Atm_Sensor_Relation;
import dto.Bank_Info;
import dto.City;
import dto.Country;
import dto.District;
import dto.Sensor;
import dto.State;
import dto.Tickets;
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
	@Path("/GetBankInfo")
	@Produces("application/json")
	public String feedBankInfo() {
		String bankData = null;
		try {
			ArrayList<Bank_Info> bankList = null;
			AlertManager projectManager = new AlertManager();
			bankList = projectManager.BankInfoMethod();
			Gson gson = new Gson();
			System.out.println(gson.toJson(bankList));
			bankData = gson.toJson(bankList);
		}

		catch (Exception e) {
			System.out.println("Exception Error"); // Console
		}
		return bankData;
	}

	@GET
	@Path("/GetSensorInfo")
	@Produces("application/json")
	public String feedSensorInfo() {
		String sensorService = null;
		try {
			ArrayList<Sensor> sensorList = null;
			AlertManager projectManager = new AlertManager();
			sensorList = projectManager.SensorMethod();
			Gson gson = new Gson();
			System.out.println(gson.toJson(sensorList));
			sensorService = gson.toJson(sensorList);
		}

		catch (Exception e) {
			System.out.println("Exception Error"); // Console
		}
		return sensorService;
	}

	@GET
	@Path("/GetStateInfo")
	@Produces("application/json")
	public String state() {
		String stateService = null;
		try {
			ArrayList<State> statedata = null;
			AlertManager projectManager = new AlertManager();
			statedata = projectManager.StateMethod();
			Gson gson = new Gson();
			System.out.println(gson.toJson(statedata));
			stateService = gson.toJson(statedata);
		}

		catch (Exception e) {
			System.out.println("Exception Error"); // Console
		}
		return stateService;
	}

	@GET
	@Path("/GetDistrict")
	@Produces("application/json")
	public String District() {
		String districtData = null;
		try {
			ArrayList<District> districtList = null;
			AlertManager projectManager = new AlertManager();
			districtList = projectManager.DistrictMethod();
			Gson gson = new Gson();
			System.out.println(gson.toJson(districtList));
			districtData = gson.toJson(districtList);
		}

		catch (Exception e) {
			System.out.println("Exception Error"); // Console
		}
		return districtData;
	}

	@GET
	@Path("/GetCityInfo")
	@Produces("application/json")
	public String City() {
		String cityData = null;
		try {
			ArrayList<City> cityList = null;
			AlertManager projectManager = new AlertManager();
			cityList = projectManager.CityMethod();
			Gson gson = new Gson();
			System.out.println(gson.toJson(cityList));
			cityData = gson.toJson(cityList);
		}

		catch (Exception e) {
			System.out.println("Exception Error"); // Console
		}
		return cityData;
	}

	@GET
	@Path("/GetCountry")
	@Produces("application/json")
	public String feedCountry() {
		String countryData = null;
		try {
			ArrayList<Country> countryList = null;
			AlertManager projectManager = new AlertManager();
			countryList = projectManager.CountryMethod();
			Gson gson = new Gson();
			System.out.println(gson.toJson(countryList));
			countryData = gson.toJson(countryList);
		} catch (Exception e) {
			System.out.println("Exception Error"); // Console
		}
		return countryData;
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
	@Produces({ MediaType.APPLICATION_JSON })
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
		/*
		 * URL : http://localhost:8080/DemoJavaAngular/REST/WebService/addAtm {
		 * "aTM_ID" : "1111", "aTM_NAME": "Nupur", "aREA_NAME": "Nagpur",
		 * "bANK_ID": "3", "cITY_ID": "1", "pINCODE": "440018", "lATITUDE":
		 * "12.0", "lONGITUDE": "23.0", "cONTACT_PERSON1": "Aman",
		 * "cONTACT_PERSON2": "Aman", "cONTACT_PERSON3": "Aman",
		 * "cONTACT_EMAIL1": "RAMU@GMAIL.COM", "cONTACT_EMAIL2":
		 * "SHAMU@GMAIL.COM", "cONTACT_EMAIL3": "KALU@GMAIL.COM", "cONTACT_NO1":
		 * "9876543219", "cONTACT_NO2": "9876543219", "cONTACT_NO3":
		 * "9876543219", "cONTACT_DETAILS1": "GUARD", "cONTACT_DETAILS2":
		 * "GUARD", "cONTACT_DETAILS3": "GUARD", "bRAND_NAME": "ABCD",
		 * "iNSTALLATION_DATE": "2016-03-20", "iP_ADDRESS": "192.168.78.9",
		 * "oNLINE": "1", "sTATUS": "ACTIVATED"
		 * 
		 * }
		 */

	}

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
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

		// String lastLogin = user.getLAST_LOGIN();
		// System.out.println(lastLogin);

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
		 * URL : http://localhost:8080/DemoJavaAngular/REST/WebService/addUser {
		 * "fIRST_NAME" : "Nupur", "lAST_NAME": "Agrahari", "eMAIL":
		 * "nupur.agrahari13@gmail.com", "pASSWORD": "nupur", "pHONE_NUMBER":
		 * "8087638410", "rOLE_ID": "1", "tOKEN": "1", "uSER_STATUS":
		 * "ACTIVATED"
		 * 
		 * }
		 */

	}

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/addAlert")
	public Response addAlert(Alert alert) {

		String result = "Alert Insertion Failed!!!!";
		String alertName = alert.getALERT_NAME();
		String alertType = alert.getALERT_TYPE();
		String imeiNo = alert.getIMEI_NO();
		String atmId = alert.getATM_ID();
		String ticketNumber = alert.getTICKET_NUMBER();
		String ticketStatus = alert.getTICKET_STATUS();
		String attendedBy = alert.getALERT_ATTENDED_BY();
		try {

			Database database = new Database();
			Connection connection = database.Get_Connection();

			AlertDao n = new AlertDao();
			boolean b = n.addAlert(connection, alertName, alertType, imeiNo, atmId, ticketNumber, ticketStatus,
					attendedBy);

			if (b == true) {
				result = "Alert Added SuccessFully!!!!";

			} else {
				result = "Alert Insert Failed !!!";
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(result);

		return Response.status(200).entity(result).build();
		/*
		 * { "aLERT_NAME" : "VIBRATION ALERT", "aLERT_TYPE" : "CRITICAL",
		 * "iMEI_NO" : "202", "aTM_ID" : "1102", "tICKET_NUMBER" : "12898",
		 * "tICKET_STATUS" : "ACTIVE", "aLERT_ATTENDED_BY" : "SIDDHESH" }
		 */
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/updateCountry/{country_id}")
	public Response updateCountry(Country country, @PathParam("country_id") int country_Id) {
		String country_Name = country.getCOUNTRY_NAME();
		String result = "Employee Insertion Failed!!!!";
		try {

			Database database = new Database();
			Connection connection = database.Get_Connection();

			AlertDao n = new AlertDao();
			boolean b = n.updateCountry(connection, country_Id, country_Name);

			if (b == true) {
				result = "Country Updated SuccessFully!!!!";

			} else {
				result = "Country Update Failed !";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return Response.status(200).entity(result).build();
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/updateState/{state_id}")
	public Response updateCountry(State state, @PathParam("state_id") int state_Id) {
		String state_Name = state.getSTATE_NAME();
		int country_Id = state.getCOUNTRY_ID();

		String result = "State Updation Failed!!!!";
		try {

			Database database = new Database();
			Connection connection = database.Get_Connection();

			AlertDao n = new AlertDao();
			boolean b = n.updateState(connection, state_Id, state_Name, country_Id);

			if (b == true) {
				result = "State Records Updated SuccessFully!!!!";

			} else {
				result = "State Records Update Failed !";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return Response.status(200).entity(result).build();
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/updateCity/{city_id}")
	public Response updateCity(City city, @PathParam("city_id") int city_Id) {
		String city_Name = city.getCITY_NAME();
		int district_Id = city.getDISTRICT_ID();

		String result = "City Updation Failed!!!!";
		try {

			Database database = new Database();
			Connection connection = database.Get_Connection();

			AlertDao n = new AlertDao();
			boolean b = n.updateCity(connection, city_Id, city_Name, district_Id);

			if (b == true) {
				result = "City Records Updated SuccessFully!!!!";

			} else {
				result = "City Records Update Failed !";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return Response.status(200).entity(result).build();
		/*
		 * { "cITY_NAME" : "RAJASHTHAN", "dISTRICT_ID" : "2" }
		 */
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/updateDistrict/{district_id}")
	public Response updateDistrict(District district, @PathParam("district_id") int district_Id) {
		String district_Name = district.getDISTRICT_NAME();
		int state_Id = district.getSTATE_ID();

		String result = "District Updation Failed!!!!";
		try {

			Database database = new Database();
			Connection connection = database.Get_Connection();

			AlertDao n = new AlertDao();
			boolean b = n.updateDistrict(connection, district_Id, district_Name, state_Id);

			if (b == true) {
				result = "District Records Updated SuccessFully!!!!";

			} else {
				result = "District Records Update Failed !";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return Response.status(200).entity(result).build();
	}

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/addAtmSensorRelation")
	public Response addAtmSensorRelation(Atm_Sensor_Relation atm) {

		String result = "ATM SENSOR RELATION Insertion Failed!!!!";

		System.out.println("Inside Try!!");

		String atmId = atm.getATM_ID();
		System.out.println(atmId);

		int sensorId = atm.getSENSOR_ID();
		System.out.println(sensorId);

		String sensorImei = atm.getSENSOR_IMEI();
		System.out.println(sensorImei);

		String sensorStatus = atm.getSENSOR_STATUS();
		System.out.println(sensorStatus);

		try {

			Database database = new Database();
			Connection connection = database.Get_Connection();

			AlertDao n = new AlertDao();
			boolean b = n.insertAtmSensorRelation(connection, atmId, sensorId, sensorImei, sensorStatus);

			if (b == true) {
				result = "Atm Relation Added SuccessFully!!!!";

			} else {
				result = "Atm Relation Already Exists!!!";
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(result);

		return Response.status(200).entity(result).build();

	}

	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	@Path("/addTicket")
	public Response addTicket(Tickets ticket) {

		String result = "TICKET Insertion Failed!!!!";

		System.out.println("Inside Try!!");

		int alertId = ticket.getALERT_ID();
		System.out.println(alertId);

		int ticket_id = ticket.getTICKET_ID();
		System.out.println(ticket_id);

		String ticketTo = ticket.getTICKET_TO();
		System.out.println(ticketTo);

		String ticketSubject = ticket.getTICKET_SUBJECT();
		System.out.println(ticketSubject);

		String ticketDescription = ticket.getTICKET_DESCRIPTION();
		System.out.println(ticketDescription);

		String ticketStatus = ticket.getTICKET_STATUS();
		System.out.println(ticketStatus);

		String ticketPriority = ticket.getTICKET_PRIORITY();
		System.out.println(ticketPriority);

		try {

			Database database = new Database();
			Connection connection = database.Get_Connection();

			AlertDao n = new AlertDao();
			boolean b = n.addTicket(connection, alertId, ticketTo, ticketSubject, ticketDescription, ticketStatus,
					ticketPriority);

			if (b == true) {
				result = "Ticket Added SuccessFully!!!!";

			} else {
				result = "Ticket Already Exists!!!";
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(result);

		return Response.status(200).entity(result).build();

	}

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/updateSensor/{sensor_id}")
	public Response updateDistrict(Sensor sensor, @PathParam("sensor_id") int sensor_id) {

		String sensor_Name = sensor.getSENSOR_NAME();
		String max_Value = sensor.getMAX_VALUE();
		String min_Value = sensor.getMIN_VALUE();
		String thres_Value = sensor.getTHRESHOLD_VALUE();
		String status = sensor.getSTATUS();

		String result = "Sensor Updation Failed!!!!";

		try {

			Database database = new Database();
			Connection connection = database.Get_Connection();

			AlertDao n = new AlertDao();
			boolean b = n.updateSensorInfo(connection, sensor_id, sensor_Name, min_Value, max_Value, thres_Value,
					status);

			if (b == true) {
				result = "Sensor Records Updated SuccessFully!!!!";

			} else {
				result = "Sensor Records Update Failed !";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return Response.status(200).entity(result).build();
		/*
		 * { "sENSOR_NAME" : "SIDDHESH", "mIN_VALUE" : "100", "mAX_VALUE" :
		 * "200", "tHRESHOLD_VALUE" : "1000", "sTATUS" : "DEACTIVATED" }
		 */

	}

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/updateBankInfo/{bank_id}")
	public Response updateBankInfo(Bank_Info bank, @PathParam("bank_id") int bank_id) {

		String bank_Name = bank.getBANK_NAME();
		String bankStatus = bank.getSTATUS();

		String result = "Bank Updation Failed!!!!";

		try {

			Database database = new Database();
			Connection connection = database.Get_Connection();

			AlertDao n = new AlertDao();
			boolean b = n.updateBankInfo(connection, bank_id, bank_Name, bankStatus);

			if (b == true) {
				result = "Bank Records Updated SuccessFully!!!!";

			} else {
				result = "Bank Records Update Failed !";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return Response.status(200).entity(result).build();
		/*
		 * { "bANK_NAME" : "SIDDHESH", "sTATUS" : "DEACTIVATED" }
		 */

	}

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/updateUserInfo/{user_id}")
	public Response updateUserInfo(Users user, @PathParam("user_id") int userId) {

		String firstName = user.getFIRST_NAME();
		String lastName = user.getLAST_NAME();
		int roleId = user.getROLE_ID();
		String userStatus = user.getUSER_STATUS();
		String userPhone = user.getPHONE_NUMBER();

		String result = "User Updation Failed!!!!";

		try {

			Database database = new Database();
			Connection connection = database.Get_Connection();

			AlertDao n = new AlertDao();
			boolean b = n.updateUsersInfo(connection, userId, firstName, lastName, roleId, userStatus, userPhone);

			if (b == true) {
				result = "User Records Updated SuccessFully!!!!";

			} else {
				result = "User Records Update Failed !";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return Response.status(200).entity(result).build();
		/*
		 * { "fIRST_NAME" : "SIDDHESH", "lAST_NAME" : "KALGAONKAR",
		 * "pHONE_NUMBER" : "8655390740", "rOLE_ID" : "2", "uSER_STATUS" :
		 * "DEACTIVATED" }
		 */

	}

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/updateAtmInfo/{atm_id}")
	public Response updateAtmInfo(Atm_Info atm, @PathParam("atm_id") int atmId) {

		String atmName = atm.getATM_NAME();
		int bankId = atm.getBANK_ID();
		String areaName = atm.getAREA_NAME();
		int cityId = atm.getCITY_ID();
		String pincode = atm.getPINCODE();
		Double latitude = atm.getLATITUDE();
		Double longitude = atm.getLONGITUDE();
		String contactPerson1 = atm.getCONTACT_PERSON1();
		String contactPerson2 = atm.getCONTACT_PERSON2();
		String contactPerson3 = atm.getCONTACT_PERSON3();
		String contactEmail1 = atm.getCONTACT_EMAIL1();
		String contactEmail2 = atm.getCONTACT_EMAIL2();
		String contactEmail3 = atm.getCONTACT_EMAIL3();
		String contactNo1 = atm.getCONTACT_NO1();
		String contactNo2 = atm.getCONTACT_NO2();
		String contactNo3 = atm.getCONTACT_NO3();
		String contactDetails1 = atm.getCONTACT_DETAILS1();
		String contactDetails2 = atm.getCONTACT_DETAILS2();
		String contactDetails3 = atm.getCONTACT_DETAILS3();
		String brandName = atm.getBRAND_NAME();
		String installDate = atm.getINSTALLATION_DATE();
		String ipAddress = atm.getIP_ADDRESS();
		String online = atm.getONLINE();
		String status = atm.getSTATUS();
		DateTime dateTime = new DateTime();

		String modified = new String(dateTime.toString());

		System.out.println(modified);

		String customFormat = "yyyy-MM-dd HH:mm:ss";

		DateTimeFormatter dtf = ISODateTimeFormat.dateTime();
		LocalDateTime parsedDate = dtf.parseLocalDateTime(modified);

		String modifiedDate = parsedDate.toString(DateTimeFormat.forPattern(customFormat));
		String result = "Atm Updation Failed!!!!";

		try {

			Database database = new Database();
			Connection connection = database.Get_Connection();

			AlertDao n = new AlertDao();
			boolean b = n.updateAtmInfo(connection, atmId, atmName, bankId, areaName, cityId, pincode, latitude,
					longitude, contactPerson1, contactPerson2, contactPerson3, contactEmail1, contactEmail2,
					contactEmail3, contactNo1, contactNo2, contactNo3, contactDetails1, contactDetails2,
					contactDetails3, brandName, installDate, ipAddress, online, status, modifiedDate);

			if (b == true) {
				result = "Atm Records Updated SuccessFully!!!!";

			} else {
				result = "Atm Records Update Failed !";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return Response.status(200).entity(result).build();
		/*
		 * { "aTM_NAME": "SIDDHESH", "aREA_NAME": "BHIWANDI", "bANK_ID": "3",
		 * "cITY_ID": "1", "pINCODE": "440018", "lATITUDE": "12.0", "lONGITUDE":
		 * "23.0", "cONTACT_PERSON1": "Aman", "cONTACT_PERSON2": "Aman",
		 * "cONTACT_PERSON3": "Aman", "cONTACT_EMAIL1": "RAMU@GMAIL.COM",
		 * "cONTACT_EMAIL2": "SHAMU@GMAIL.COM", "cONTACT_EMAIL3":
		 * "KALU@GMAIL.COM", "cONTACT_NO1": "9876543219", "cONTACT_NO2":
		 * "9876543219", "cONTACT_NO3": "9876543219", "cONTACT_DETAILS1":
		 * "GUARD", "cONTACT_DETAILS2": "GUARD", "cONTACT_DETAILS3": "GUARD",
		 * "bRAND_NAME": "ABCD", "iNSTALLATION_DATE": "2016-03-20",
		 * "iP_ADDRESS": "192.168.78.9", "oNLINE": "1", "sTATUS": "ACTIVATED" }
		 */

	}

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/deleteSensorInfo/{sensor_id}")
	public Response deleteSensorInfo(Sensor sensor, @PathParam("sensor_id") int sensor_id) {

		String status = sensor.getSTATUS();
		String result = "Sensor Updation Failed!!!!";

		try {

			Database database = new Database();
			Connection connection = database.Get_Connection();

			AlertDao n = new AlertDao();
			boolean b = n.deleteSensorInfo(connection, sensor_id, status);

			if (b == true) {
				result = "Sensor Records Updated SuccessFully!!!!";

			} else {
				result = "Sensor Records Update Failed !";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return Response.status(200).entity(result).build();
		/*
		 * { "sTATUS": "3" }
		 */
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/deleteBankInfo/{bank_id}")
	public Response deleteBankInfo(Bank_Info bank, @PathParam("bank_id") int bank_id) {

		String status = bank.getSTATUS();
		String result = "Bank Updation Failed!!!!";

		try {

			Database database = new Database();
			Connection connection = database.Get_Connection();

			AlertDao n = new AlertDao();
			boolean b = n.deleteBankInfo(connection, bank_id, status);

			if (b == true) {
				result = "Bank Records Updated SuccessFully!!!!";

			} else {
				result = "Bank Records Update Failed !";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return Response.status(200).entity(result).build();
		/*
		 * { "sTATUS": "3" }
		 */
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/deleteAtmInfo/{atm_id}")
	public Response deleteAtmInfo(Atm_Info atm, @PathParam("atm_id") int atm_id) {

		String status = atm.getSTATUS();
		String result = "ATM Updation Failed!!!!";

		try {

			Database database = new Database();
			Connection connection = database.Get_Connection();

			AlertDao n = new AlertDao();
			boolean b = n.deleteAtmInfo(connection, atm_id, status);

			if (b == true) {
				result = "ATM Records Updated SuccessFully!!!!";

			} else {
				result = "ATM Records Update Failed !";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return Response.status(200).entity(result).build();
		/*
		 * { "sTATUS": "3" }
		 */
	}

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON })
	@Path("/deleteUserInfo/{user_id}")
	public Response deleteUsersInfo(Users user, @PathParam("user_id") int user_id) {

		String status = user.getUSER_STATUS();
		String result = "ATM Updation Failed!!!!";

		try {

			Database database = new Database();
			Connection connection = database.Get_Connection();

			AlertDao n = new AlertDao();
			boolean b = n.deleteUserInfo(connection, user_id, status);

			if (b == true) {
				result = "User Records Updated SuccessFully!!!!";

			} else {
				result = "User Records Update Failed !";
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return Response.status(200).entity(result).build();
		/*
		 * { "sTATUS": "3" }
		 */
	}

}
