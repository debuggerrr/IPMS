package dto;

public class Atm_Sensor_Relation {
	
	private Integer ID;
	private String ATM_ID;
	private Integer SENSOR_ID;
	private String SENSOR_IMEI;
	private String SENSOR_STATUS;
	
	public Atm_Sensor_Relation()
	{
		
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getATM_ID() {
		return ATM_ID;
	}

	public void setATM_ID(String aTM_ID) {
		ATM_ID = aTM_ID;
	}

	public Integer getSENSOR_ID() {
		return SENSOR_ID;
	}

	public void setSENSOR_ID(Integer sENSOR_ID) {
		SENSOR_ID = sENSOR_ID;
	}

	public String getSENSOR_IMEI() {
		return SENSOR_IMEI;
	}

	public void setSENSOR_IMEI(String sENSOR_IMEI) {
		SENSOR_IMEI = sENSOR_IMEI;
	}

	public String getSENSOR_STATUS() {
		return SENSOR_STATUS;
	}

	public void setSENSOR_STATUS(String sENSOR_STATUS) {
		SENSOR_STATUS = sENSOR_STATUS;
	}
	
	

}
