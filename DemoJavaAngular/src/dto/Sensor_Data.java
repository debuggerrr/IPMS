package dto;

import java.sql.Timestamp;

public class Sensor_Data {
	
	private String ATM_ID;
	private String SENSOR_ID;
	private String SENSOR_VALUE;
	private Timestamp SENSOR_TIMESTAMP;
	
	public Sensor_Data()
	{
		
	}

	public String getATM_ID() {
		return ATM_ID;
	}

	public void setATM_ID(String aTM_ID) {
		ATM_ID = aTM_ID;
	}

	public String getSENSOR_ID() {
		return SENSOR_ID;
	}

	public void setSENSOR_ID(String sENSOR_ID) {
		SENSOR_ID = sENSOR_ID;
	}

	public String getSENSOR_VALUE() {
		return SENSOR_VALUE;
	}

	public void setSENSOR_VALUE(String sENSOR_VALUE) {
		SENSOR_VALUE = sENSOR_VALUE;
	}

	public Timestamp getSENSOR_TIMESTAMP() {
		return SENSOR_TIMESTAMP;
	}

	public void setSENSOR_TIMESTAMP(Timestamp sENSOR_TIMESTAMP) {
		SENSOR_TIMESTAMP = sENSOR_TIMESTAMP;
	}
	
	
	

}
