package dto;

import java.util.Date;

public class Sensor {
	
	private Integer SENSOR_ID;
	private String SENSOR_NAME;
	private String MIN_VALUE;
	private String MAX_VALUE;
	private String THRESHOLD_VALUE;
	private String STATUS;
	private Date CREATED;
	private Date MODIFIED;
	
	public Sensor() {
		// TODO Auto-generated constructor stub
	}
	public Integer getSENSOR_ID() {
		return SENSOR_ID;
	}

	public void setSENSOR_ID(Integer sENSOR_ID) {
		SENSOR_ID = sENSOR_ID;
	}

	public String getSENSOR_NAME() {
		return SENSOR_NAME;
	}

	public void setSENSOR_NAME(String sENSOR_NAME) {
		SENSOR_NAME = sENSOR_NAME;
	}

	public String getMIN_VALUE() {
		return MIN_VALUE;
	}

	public void setMIN_VALUE(String mIN_VALUE) {
		MIN_VALUE = mIN_VALUE;
	}

	public String getMAX_VALUE() {
		return MAX_VALUE;
	}

	public void setMAX_VALUE(String mAX_VALUE) {
		MAX_VALUE = mAX_VALUE;
	}

	public String getTHRESHOLD_VALUE() {
		return THRESHOLD_VALUE;
	}

	public void setTHRESHOLD_VALUE(String tHRESHOLD_VALUE) {
		THRESHOLD_VALUE = tHRESHOLD_VALUE;
	}

	public String getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}

	public Date getCREATED() {
		return CREATED;
	}

	public void setCREATED(Date cREATED) {
		CREATED = cREATED;
	}

	public Date getMODIFIED() {
		return MODIFIED;
	}

	public void setMODIFIED(Date mODIFIED) {
		MODIFIED = mODIFIED;
	}
	
	

}
