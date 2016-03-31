//Alert POJO
package dto;

import java.util.Date;
import java.sql.Timestamp;

public class Alert {

	private Integer ALERT_ID;
	private String ALERT_NAME;
	private String ALERT_TYPE;
	private Date ALERT_DATE;
	private Date ALERT_DATETIME;
	private String IMEI_NO;
	private String ATM_ID;
	private String TICKET_NUMBER;
	private String TICKET_STATUS;
	private String ALERT_ATTENDED_BY;
	private Timestamp ATTEND_TIME;

	public Alert() {
		// TODO Auto-generated constructor stub
	}
	public Integer getALERT_ID() {
		return ALERT_ID;
	}

	public void setALERT_ID(Integer aLERT_ID) {
		ALERT_ID = aLERT_ID;
	}

	public String getALERT_NAME() {
		return ALERT_NAME;
	}

	public void setALERT_NAME(String aLERT_NAME) {
		ALERT_NAME = aLERT_NAME;
	}

	public String getALERT_TYPE() {
		return ALERT_TYPE;
	}

	public void setALERT_TYPE(String aLERT_TYPE) {
		ALERT_TYPE = aLERT_TYPE;
	}

	public Date getALERT_DATE() {
		return ALERT_DATE;
	}

	public void setALERT_DATE(Date aLERT_DATE) {
		ALERT_DATE = aLERT_DATE;
	}

	public Date getALERT_DATETIME() {
		return ALERT_DATETIME;
	}

	public void setALERT_DATETIME(Date aLERT_DATETIME) {
		ALERT_DATETIME = aLERT_DATETIME;
	}

	public String getIMEI_NO() {
		return IMEI_NO;
	}

	public void setIMEI_NO(String iMEI_NO) {
		IMEI_NO = iMEI_NO;
	}

	public String getATM_ID() {
		return ATM_ID;
	}

	public void setATM_ID(String aTM_ID) {
		ATM_ID = aTM_ID;
	}

	public String getTICKET_NUMBER() {
		return TICKET_NUMBER;
	}

	public void setTICKET_NUMBER(String tICKET_NUMBER) {
		TICKET_NUMBER = tICKET_NUMBER;
	}

	public String getTICKET_STATUS() {
		return TICKET_STATUS;
	}

	public void setTICKET_STATUS(String tICKET_STATUS) {
		TICKET_STATUS = tICKET_STATUS;
	}

	public String getALERT_ATTENDED_BY() {
		return ALERT_ATTENDED_BY;
	}

	public void setALERT_ATTENDED_BY(String aLERT_ATTENDED_BY) {
		ALERT_ATTENDED_BY = aLERT_ATTENDED_BY;
	}

	public Timestamp getATTEND_TIME() {
		return ATTEND_TIME;
	}

	public void setATTEND_TIME(Timestamp aTTEND_TIME) {
		ATTEND_TIME = aTTEND_TIME;
	}

}
