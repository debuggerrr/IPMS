package dto;

import java.util.Date;

public class Tickets {
	
	private int TICKET_ID;
	private int ALERT_ID;
	private String TICKET_TO;
	private String TICKET_SUBJECT;
	private String TICKET_DESCRIPTION;
	private String TICKET_STATUS;
	private String TICKET_PRIORITY;
	private Date CREATED;
	private Date MODIFIED;
	
	public Tickets() {
		// TODO Auto-generated constructor stub
	}
	
	public int getTICKET_ID() {
		return TICKET_ID;
	}

	public void setTICKET_ID(int tICKET_ID) {
		TICKET_ID = tICKET_ID;
	}

	public int getALERT_ID() {
		return ALERT_ID;
	}

	public void setALERT_ID(int aLERT_ID) {
		ALERT_ID = aLERT_ID;
	}

	public String getTICKET_TO() {
		return TICKET_TO;
	}

	public void setTICKET_TO(String tICKET_TO) {
		TICKET_TO = tICKET_TO;
	}

	public String getTICKET_SUBJECT() {
		return TICKET_SUBJECT;
	}

	public void setTICKET_SUBJECT(String tICKET_SUBJECT) {
		TICKET_SUBJECT = tICKET_SUBJECT;
	}

	public String getTICKET_DESCRIPTION() {
		return TICKET_DESCRIPTION;
	}

	public void setTICKET_DESCRIPTION(String tICKET_DESCRIPTION) {
		TICKET_DESCRIPTION = tICKET_DESCRIPTION;
	}

	public String getTICKET_STATUS() {
		return TICKET_STATUS;
	}

	public void setTICKET_STATUS(String tICKET_STATUS) {
		TICKET_STATUS = tICKET_STATUS;
	}

	public String getTICKET_PRIORITY() {
		return TICKET_PRIORITY;
	}

	public void setTICKET_PRIORITY(String tICKET_PRIORITY) {
		TICKET_PRIORITY = tICKET_PRIORITY;
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
