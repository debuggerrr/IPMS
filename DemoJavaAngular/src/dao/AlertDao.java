package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Date;
import org.joda.time.*;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

import dto.Alert;
import dto.Atm_Info;
import dto.Bank_Info;
import dto.City;
import dto.Atm_Sensor_Relation;
import dto.Sensor;
import dto.State;
import dto.Country;
import dto.District;

public class AlertDao {

	public ArrayList<Alert> GetAlert1(Connection connection) throws Exception {
		ArrayList<Alert> alertData = new ArrayList<Alert>();
		try {

			PreparedStatement ps = connection.prepareStatement(
					"SELECT ALERT_ID,ALERT_NAME,ALERT_TYPE,ALERT_DATE,ALERT_DATETIME,IMEI_NO,ATM_ID,TICKET_NUMBER,TICKET_STATUS,ALERT_ATTENDED_BY,ATTEND_TIME FROM alert ORDER BY ALERT_ID DESC");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Alert alert = new Alert();
				System.out.println(rs.getString("ALERT_NAME"));
				alert.setALERT_NAME(rs.getString("ALERT_NAME"));
				alert.setALERT_TYPE(rs.getString("ALERT_TYPE"));
				alert.setALERT_DATE(rs.getDate("ALERT_DATE"));
				alert.setALERT_DATETIME(rs.getTime("ALERT_DATETIME"));
				alert.setIMEI_NO(rs.getString("IMEI_NO"));
				alert.setATM_ID(rs.getString("ATM_ID"));
				alert.setTICKET_NUMBER(rs.getString("TICKET_NUMBER"));
				alert.setTICKET_STATUS(rs.getString("TICKET_STATUS"));
				alert.setALERT_ATTENDED_BY(rs.getString("ALERT_ATTENDED_BY"));
				alert.setATTEND_TIME(rs.getTimestamp("ATTEND_TIME"));
				alertData.add(alert);
			}
			return alertData;
		} catch (Exception e) {
			throw e;
		}
	}
	public ArrayList<Country> GetCountry(Connection connection)
			throws Exception {
		ArrayList<Country> countryList = new ArrayList<Country>();
		try {
			PreparedStatement ps = connection
					.prepareStatement("SELECT COUNTRY_ID,COUNTRY_NAME FROM COUNTRY");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Country countryObj = new Country();

				countryObj.setCOUNTRY_ID(rs.getInt("COUNTRY_ID"));
				countryObj.setCOUNTRY_NAME(rs.getString("COUNTRY_NAME"));

				System.out.println("Execute");
			countryList.add(countryObj);
			}
			return countryList;
		} catch (Exception e) {
			throw e;
		}
	}
	public ArrayList<Bank_Info> GetBankInfo(Connection connection)
			throws Exception {
		ArrayList<Bank_Info> bankList = new ArrayList<Bank_Info>();
		try {
			PreparedStatement ps = connection
					.prepareStatement("SELECT BANK_ID,BANK_NAME,STATUS,CREATED FROM BANK_INFO");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Bank_Info bankObj = new Bank_Info();

				bankObj.setBANK_ID(rs.getInt("BANK_ID"));
				bankObj.setBANK_NAME(rs.getString("BANK_NAME"));
				bankObj.setSTATUS(rs.getString("STATUS"));
				bankObj.setCREATED(rs.getDate("CREATED"));
				System.out.println("Execute");
				bankList.add(bankObj);
			}
			return bankList;
		} catch (Exception e) {
			throw e;
		}
	}
	
	public ArrayList<Sensor> GetSensorInfo(Connection connection)
			throws Exception {
		ArrayList<Sensor> sensorList = new ArrayList<Sensor>();
		try {
			PreparedStatement ps = connection
					.prepareStatement("SELECT SENSOR_ID,SENSOR_NAME,MIN_VALUE,MAX_VALUE,THRESHOLD_VALUE,STATUS,CREATED FROM SENSOR");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Sensor sensorObj = new Sensor();

				sensorObj.setSENSOR_ID(rs.getInt("SENSOR_ID"));
				sensorObj.setSENSOR_NAME(rs.getString("SENSOR_NAME"));
				sensorObj.setMIN_VALUE(rs.getString("MIN_VALUE"));
				sensorObj.setMAX_VALUE(rs.getString("MAX_VALUE"));
				sensorObj.setTHRESHOLD_VALUE(rs.getString("THRESHOLD_VALUE"));
				sensorObj.setSTATUS(rs.getString("STATUS"));
				sensorObj.setCREATED(rs.getDate("CREATED"));
				
				System.out.println("Execute");
				sensorList.add(sensorObj);
			}
			//return sensorList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sensorList;
	}

	public ArrayList<State> GetStateInfo(Connection connection)
			throws Exception {
		ArrayList<State> stateList = new ArrayList<State>();
		try {
			PreparedStatement ps = connection
					.prepareStatement("SELECT STATE_ID,STATE_NAME,COUNTRY_ID FROM STATE");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				State stateObj = new State();

				stateObj.setSTATE_ID(rs.getInt("STATE_ID"));
				stateObj.setSTATE_NAME(rs.getString("STATE_NAME"));
				stateObj.setCOUNTRY_ID(rs.getInt("COUNTRY_ID"));
				System.out.println("Execute");
				stateList.add(stateObj);
			}
			return stateList;
		} catch (Exception e) {
			throw e;
		}
	}

	
	public ArrayList<District> GetDistrict(Connection connection)
			throws Exception {
		ArrayList<District> districtList = new ArrayList<District>();
		try {
			PreparedStatement ps = connection
					.prepareStatement("SELECT DISTRICT_ID,DISTRICT_NAME,STATE_ID FROM DISTRICT");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				District districtObj = new District();

				districtObj.setDISTRICT_ID(rs.getInt("DISTRICT_ID"));
				districtObj.setDISTRICT_NAME(rs.getString("DISTRICT_NAME"));
				districtObj.setSTATE_ID(rs.getInt("STATE_ID"));

				System.out.println("Execute");
				districtList.add(districtObj);
			}
			return districtList;
		} catch (Exception e) {
			throw e;
		}
	}
	public ArrayList<City> GetCityInfo(Connection connection)
			throws Exception {
		ArrayList<City> cityList= new ArrayList<City>();
		try {
			PreparedStatement ps = connection
					.prepareStatement("SELECT CITY_ID,CITY_NAME,DISTRICT_ID FROM CITY ");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				City cityObj = new City();

				cityObj.setCITY_ID(rs.getInt("city_id"));
				cityObj.setCITY_NAME(rs.getString("city_name"));
				cityObj.setDISTRICT_ID(rs.getInt("district_id"));
				System.out.println("Execute");
				cityList.add(cityObj);
			}
			return cityList;
		} catch (Exception e) {
			throw e;
		}
	}

	public List<Object[]> GetAlert(Connection connection) {

		PreparedStatement ps;

		int count = 1;

		List<Object[]> data = new ArrayList<Object[]>();

		try {

			System.out.println("HI In GetAlert!!!!!!");

			List<Object[]> HighAlert = new ArrayList<Object[]>();

			List<Integer> HighAlertCount = new ArrayList<Integer>();

			ps = connection.prepareStatement("SELECT ATM_ID FROM ALERT WHERE ALERT_TYPE = ? ");

			ps.setString(1, "CRITICAL");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				List<Object[]> temp = new ArrayList<Object[]>();

				List<Object[]> alertInfo = new ArrayList<Object[]>();

				ArrayList<Alert> alertData = new ArrayList<Alert>();

				Alert alert = new Alert();

				alert.setATM_ID(rs.getString(1));

				alertData.add(alert);

				temp.add(alertData.toArray());

				ps = connection.prepareStatement(
						"SELECT A.SENSOR_ID, A.SENSOR_IMEI, A.SENSOR_STATUS, B.SENSOR_NAME FROM ATM_SENSOR_RELATION AS A INNER JOIN SENSOR AS B ON A.SENSOR_ID = B.SENSOR_ID WHERE ATM_ID = ? ");
				ps.setString(1, rs.getString(1));
				ResultSet rs2 = ps.executeQuery();

				System.out.println("After Second select query!!!");
				while (rs2.next()) {

					ArrayList<Atm_Sensor_Relation> atmSensorRelationData = new ArrayList<Atm_Sensor_Relation>();

					ArrayList<Sensor> sensorData = new ArrayList<Sensor>();

					Atm_Sensor_Relation atmSensorRelation = new Atm_Sensor_Relation();

					Sensor sensor = new Sensor();

					atmSensorRelation.setSENSOR_ID(rs2.getInt(1));
					atmSensorRelation.setSENSOR_IMEI(rs2.getString(2));
					atmSensorRelation.setSENSOR_STATUS(rs2.getString(3));

					sensor.setSENSOR_NAME(rs2.getString(4));

					atmSensorRelationData.add(atmSensorRelation);
					sensorData.add(sensor);

					temp.add(atmSensorRelationData.toArray());
					temp.add(sensorData.toArray());

					System.out.println("Inside While!!!");
				}

				System.out.println(rs.getString(1));

				ps = connection.prepareStatement(
						"SELECT A.ATM_NAME, A.AREA_NAME, A.CONTACT_EMAIL1, A.CONTACT_EMAIL2, A.CONTACT_EMAIL3, A.CONTACT_PERSON1, A.CONTACT_PERSON2, A.CONTACT_PERSON3, A.CONTACT_NO1, A.CONTACT_NO2, A.CONTACT_NO3, B.BANK_NAME FROM ATM_INFO AS A INNER JOIN BANK_INFO AS B ON A.BANK_ID = B.BANK_ID WHERE ATM_ID = ? ");

				ps.setString(1, rs.getString(1));

				System.out.println("After third query!!!");

				ResultSet rs3 = ps.executeQuery();

				while (rs3.next()) {

					ArrayList<Atm_Info> atmInfoData = new ArrayList<Atm_Info>();

					ArrayList<Bank_Info> bankInfoData = new ArrayList<Bank_Info>();

					Atm_Info atm_Info = new Atm_Info();

					Bank_Info bank_Info = new Bank_Info();

					atm_Info.setATM_NAME(rs3.getString(1));
					atm_Info.setAREA_NAME(rs3.getString(2));
					atm_Info.setCONTACT_EMAIL1(rs3.getString(3));
					atm_Info.setCONTACT_EMAIL2(rs3.getString(4));
					atm_Info.setCONTACT_EMAIL3(rs3.getString(5));
					atm_Info.setCONTACT_PERSON1(rs3.getString(6));
					atm_Info.setCONTACT_PERSON2(rs3.getString(7));
					atm_Info.setCONTACT_PERSON3(rs3.getString(8));
					atm_Info.setCONTACT_NO1(rs3.getString(9));
					atm_Info.setCONTACT_NO2(rs3.getString(10));
					atm_Info.setCONTACT_NO3(rs3.getString(11));

					bank_Info.setBANK_NAME(rs3.getString(12));

					atmInfoData.add(atm_Info);
					bankInfoData.add(bank_Info);

					temp.add(atmInfoData.toArray());
					temp.add(bankInfoData.toArray());

					System.out.println("Inside forth while!!sss!");

				}
				List<Object[]> bData = new ArrayList<Object[]>();

				ArrayList<Object> type1 = new ArrayList<Object>();
				ArrayList<Object> type2 = new ArrayList<Object>();

				type1.add("Type 1 : Fire");
				type2.add("Type 2 : Vibration");

				bData.add(type1.toArray());
				bData.add(type2.toArray());

				alertInfo.addAll(bData);
				temp.addAll(alertInfo);

				System.out.println("Danger!!");

				count = count + 1;

				HighAlert.addAll(temp);

				data.addAll(HighAlert);

			}

			HighAlertCount.add(count);

			System.out.println(count);

			data.add(HighAlertCount.toArray());

		} catch (Exception e) {
			System.out.println(e);
		}
		return data;
	}

	public boolean insertCountry(Connection connection, String countryName) {

		PreparedStatement ps;
		boolean insertStatus = false;

		try {
			ps = connection.prepareStatement("SELECT COUNTRY_ID FROM COUNTRY WHERE COUNTRY_NAME = ?");

			ps.setString(1, countryName);

			ResultSet rs = ps.executeQuery();

			if (!rs.next()) {

				ps = connection.prepareStatement("INSERT INTO COUNTRY (COUNTRY_NAME) VALUES (?) ");

				ps.setString(1, countryName);
				int records = ps.executeUpdate();
				if (records > 0) {
					insertStatus = true;
				}

			}

			ps.close();

			connection.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		return insertStatus;

	}

	public boolean insertState(Connection connection, String stateName, int countryId) {

		PreparedStatement ps;
		boolean insertStatus = false;

		try {
			ps = connection.prepareStatement("SELECT STATE_ID FROM STATE WHERE STATE_NAME = ? AND COUNTRY_ID = ?");

			ps.setString(1, stateName);
			ps.setInt(2, countryId);

			ResultSet rs = ps.executeQuery();

			if (!rs.next()) {

				ps = connection.prepareStatement("INSERT INTO STATE (STATE_NAME , COUNTRY_ID) VALUES (? , ?) ");

				ps.setString(1, stateName);
				ps.setInt(2, countryId);
				int records = ps.executeUpdate();
				if (records > 0) {
					insertStatus = true;
				}

			}

			ps.close();

			connection.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		return insertStatus;

	}

	public boolean insertDistrict(Connection connection, String districtName, int stateId) {

		PreparedStatement ps;
		boolean insertStatus = false;

		try {
			ps = connection
					.prepareStatement("SELECT DISTRICT_ID FROM DISTRICT WHERE DISTRICT_NAME = ? AND STATE_ID = ?");

			ps.setString(1, districtName);
			ps.setInt(2, stateId);

			ResultSet rs = ps.executeQuery();

			if (!rs.next()) {

				ps = connection.prepareStatement("INSERT INTO DISTRICT (DISTRICT_NAME , STATE_ID) VALUES (? , ?) ");

				ps.setString(1, districtName);
				ps.setInt(2, stateId);
				int records = ps.executeUpdate();
				if (records > 0) {
					insertStatus = true;
				}

			}

			ps.close();

			connection.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		return insertStatus;

	}

	public boolean insertCity(Connection connection, String cityName, int districtId) {

		PreparedStatement ps;
		boolean insertStatus = false;

		try {
			ps = connection.prepareStatement("SELECT CITY_ID FROM CITY WHERE CITY_NAME = ? AND DISTRICT_ID = ?");

			ps.setString(1, cityName);
			ps.setInt(2, districtId);

			ResultSet rs = ps.executeQuery();

			if (!rs.next()) {

				ps = connection.prepareStatement("INSERT INTO CITY (CITY_NAME , DISTRICT_ID) VALUES (? , ?) ");

				ps.setString(1, cityName);
				ps.setInt(2, districtId);
				int records = ps.executeUpdate();
				if (records > 0) {
					insertStatus = true;
				}

			}

			ps.close();

			connection.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		return insertStatus;

	}

	public boolean insertSensor(Connection connection, String sensorName, String minValue, String maxValue,
			String thresholdValue, String status) {

		PreparedStatement ps;
		boolean insertStatus = false;
		LocalDate localDate = new LocalDate();
		String created = localDate.toString();
		System.out.println(created);

		// Code to insert in modified column with proper format of mysql
		// datetime
		DateTime dateTime = new DateTime();

		String modified = new String(dateTime.toString());

		System.out.println(modified);

		String customFormat = "yyyy-MM-dd HH:mm:ss";

		DateTimeFormatter dtf = ISODateTimeFormat.dateTime();
		LocalDateTime parsedDate = dtf.parseLocalDateTime(modified);

		String dateWithCustomFormat = parsedDate.toString(DateTimeFormat.forPattern(customFormat));
		System.out.println(dateWithCustomFormat);
		// ends here

		try {
			ps = connection.prepareStatement("SELECT SENSOR_ID FROM SENSOR WHERE SENSOR_NAME = ?");

			ps.setString(1, sensorName);

			ResultSet rs = ps.executeQuery();

			if (!rs.next()) {

				ps = connection.prepareStatement(
						"INSERT INTO SENSOR (SENSOR_NAME , MIN_VALUE , MAX_VALUE , THRESHOLD_VALUE , STATUS , CREATED , MODIFIED) VALUES (? , ? , ? , ? , ? , ? , ?) ");

				ps.setString(1, sensorName);
				ps.setString(2, minValue);
				ps.setString(3, maxValue);
				ps.setString(4, thresholdValue);
				ps.setString(5, status);
				ps.setString(6, created);
				ps.setString(7, dateWithCustomFormat);
				int records = ps.executeUpdate();
				if (records > 0) {
					insertStatus = true;
				}

			}

			ps.close();

			connection.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		return insertStatus;

	}

	public boolean insertBank(Connection connection, String bankName, String bankStatus) {

		PreparedStatement ps;
		boolean insertStatus = false;
		LocalDate localDate = new LocalDate();
		String created = localDate.toString();
		System.out.println(created);

		// Code to insert in modified column with proper format of mysql
		// datetime
		DateTime dateTime = new DateTime();

		String modified = new String(dateTime.toString());

		System.out.println(modified);

		String customFormat = "yyyy-MM-dd HH:mm:ss";

		DateTimeFormatter dtf = ISODateTimeFormat.dateTime();
		LocalDateTime parsedDate = dtf.parseLocalDateTime(modified);

		String dateWithCustomFormat = parsedDate.toString(DateTimeFormat.forPattern(customFormat));
		System.out.println(dateWithCustomFormat);
		// ends here

		try {
			ps = connection.prepareStatement("SELECT BANK_ID FROM BANK_INFO WHERE BANK_NAME = ?");

			ps.setString(1, bankName);

			ResultSet rs = ps.executeQuery();

			if (!rs.next()) {

				ps = connection.prepareStatement(
						"INSERT INTO BANK_INFO (BANK_NAME , STATUS , CREATED , MODIFIED) VALUES (? , ? , ? , ?) ");

				ps.setString(1, bankName);
				ps.setString(2, bankStatus);
				ps.setString(3, created);
				ps.setString(4, dateWithCustomFormat);

				int records = ps.executeUpdate();
				if (records > 0) {
					insertStatus = true;
				}

			}

			ps.close();

			connection.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		return insertStatus;

	}

	public boolean insertAtm(Connection connection, String atmId, String atmName, int bankId, String areaName,
			int cityId, String pincode, double latitude, double longitude, String contactPerson1, String contactPerson2,
			String contactPerson3, String contactEmail1, String contactEmail2, String contactEmail3, String contactNo1,
			String contactNo2, String contactNo3, String contactDetails1, String contactDetails2,
			String contactDetails3, String brandName, String installationDate, String ipAddress, String online,
			String status) {

		PreparedStatement ps;
		boolean insertStatus = false;
		LocalDate localDate = new LocalDate();
		String created = localDate.toString();
		System.out.println(created);

		// Code to insert in modified column with proper format of mysql
		// datetime
		DateTime dateTime = new DateTime();

		String modified = new String(dateTime.toString());

		System.out.println(modified);

		String customFormat = "yyyy-MM-dd HH:mm:ss";

		DateTimeFormatter dtf = ISODateTimeFormat.dateTime();
		LocalDateTime parsedDate = dtf.parseLocalDateTime(modified);

		String dateWithCustomFormat = parsedDate.toString(DateTimeFormat.forPattern(customFormat));
		System.out.println(dateWithCustomFormat);
		// ends here

		try {
			ps = connection.prepareStatement("SELECT ATM_ID FROM ATM_INFO WHERE ATM_ID = ? AND ATM_NAME = ?");

			ps.setString(1, atmId);
			ps.setString(2, atmName);

			ResultSet rs = ps.executeQuery();

			if (!rs.next()) {

				ps = connection.prepareStatement(
						"INSERT INTO ATM_INFO (ATM_ID , ATM_NAME , BANK_ID , AREA_NAME , CITY_ID , PINCODE , LATITUDE , LONGITUDE , CONTACT_PERSON1 , CONTACT_PERSON2 , CONTACT_PERSON3 , CONTACT_EMAIL1 , CONTACT_EMAIL2 , CONTACT_EMAIL3 , CONTACT_NO1 , CONTACT_NO2 , CONTACT_NO3 , CONTACT_DETAILS1 , CONTACT_DETAILS2 , CONTACT_DETAILS3 , BRAND_NAME , INSTALLATION_DATE , IP_ADDRESS , ONLINE , STATUS , CREATED , MODIFIED) VALUES (? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?) ");

				ps.setString(1, atmId);
				ps.setString(2, atmName);
				ps.setInt(3, bankId);
				ps.setString(4, areaName);
				ps.setInt(5, cityId);
				ps.setString(6, pincode);
				ps.setDouble(7, latitude);
				ps.setDouble(8, longitude);
				ps.setString(9, contactPerson1);
				ps.setString(10, contactPerson2);
				ps.setString(11, contactPerson3);
				ps.setString(12, contactEmail1);
				ps.setString(13, contactEmail2);
				ps.setString(14, contactEmail3);
				ps.setString(15, contactNo1);
				ps.setString(16, contactNo2);
				ps.setString(17, contactNo3);
				ps.setString(18, contactDetails1);
				ps.setString(19, contactDetails2);
				ps.setString(20, contactDetails3);
				ps.setString(21, brandName);
				ps.setString(22, installationDate);
				ps.setString(23, ipAddress);
				ps.setString(24, online);
				ps.setString(25, status);
				ps.setString(26, created);
				ps.setString(27, dateWithCustomFormat);

				int records = ps.executeUpdate();

				if (records > 0) {
					insertStatus = true;
				}

			}

			ps.close();

			connection.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		return insertStatus;

	}

	public boolean addUser(Connection connection, String firstName, String lastName, String email, String password,
			String phoneNo, int roleId, String token, String userStatus) {

		PreparedStatement ps;
		boolean insertStatus = false;
		LocalDate localDate = new LocalDate();
		String created = localDate.toString();
		System.out.println(created);

		// Code to insert in modified column with proper format of mysql
		// datetime
		DateTime dateTime = new DateTime();

		String modified = new String(dateTime.toString());

		System.out.println(modified);

		String customFormat = "yyyy-MM-dd HH:mm:ss";

		DateTimeFormatter dtf = ISODateTimeFormat.dateTime();
		LocalDateTime parsedDate = dtf.parseLocalDateTime(modified);

		String dateWithCustomFormat = parsedDate.toString(DateTimeFormat.forPattern(customFormat));
		System.out.println(dateWithCustomFormat);
		// ends here

		try {
			ps = connection.prepareStatement("SELECT USER_ID FROM USERS WHERE EMAIL = ?");

			ps.setString(1, email);

			ResultSet rs = ps.executeQuery();

			if (!rs.next()) {

				ps = connection.prepareStatement(
						"INSERT INTO USERS (FIRST_NAME , LAST_NAME , EMAIL , PASSWORD , PHONE_NUMBER , ROLE_ID , LAST_LOGIN , TOKEN , USER_STATUS , CREATED , MODIFIED) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

				ps.setString(1, firstName);
				ps.setString(2, lastName);
				ps.setString(3, email);
				ps.setString(4, password);
				ps.setString(5, phoneNo);
				ps.setInt(6, roleId);
				ps.setString(7, created);
				ps.setString(8, token);
				ps.setString(9, userStatus);
				ps.setString(10, created);
				ps.setString(11, dateWithCustomFormat);

				int records = ps.executeUpdate();

				if (records > 0) {
					insertStatus = true;
				}

			}

			ps.close();

			connection.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		return insertStatus;

	}

}
