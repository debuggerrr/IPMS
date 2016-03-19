package dto;

import java.util.Date;


public class Bank_Info {

	
	private Integer BANK_ID;
	private String BANK_NAME;
	private String STATUS;
	private Date CREATED;
	private Date MODIFIED;
	
	public Bank_Info()
	{
		
	}

	public Integer getBANK_ID() {
		return BANK_ID;
	}

	public void setBANK_ID(Integer bANK_ID) {
		BANK_ID = bANK_ID;
	}

	public String getBANK_NAME() {
		return BANK_NAME;
	}

	public void setBANK_NAME(String bANK_NAME) {
		BANK_NAME = bANK_NAME;
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
