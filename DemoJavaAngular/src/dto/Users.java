package dto;

import java.util.Date;
import java.sql.Timestamp;

public class Users {
	
	private Integer USER_ID;
	private String FIRST_NAME;
	private String LAST_NAME;
	private String EMAIL;
	private String PASSWORD;
	private String PHONE_NUMBER;
	private Integer ROLE_ID;
	private String LAST_LOGIN;
	private String TOKEN;
	private String USER_STATUS;
	private Date CREATED;
	private Timestamp MODIFIED;
	
	public Users(){
		
	}

	public Integer getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(Integer uSER_ID) {
		USER_ID = uSER_ID;
	}

	public String getFIRST_NAME() {
		return FIRST_NAME;
	}

	public void setFIRST_NAME(String fIRST_NAME) {
		FIRST_NAME = fIRST_NAME;
	}

	public String getLAST_NAME() {
		return LAST_NAME;
	}

	public void setLAST_NAME(String lAST_NAME) {
		LAST_NAME = lAST_NAME;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}

	public String getPHONE_NUMBER() {
		return PHONE_NUMBER;
	}

	public void setPHONE_NUMBER(String pHONE_NUMBER) {
		PHONE_NUMBER = pHONE_NUMBER;
	}

	public Integer getROLE_ID() {
		return ROLE_ID;
	}

	public void setROLE_ID(Integer rOLE_ID) {
		ROLE_ID = rOLE_ID;
	}

	public String getLAST_LOGIN() {
		return LAST_LOGIN;
	}

	public void setLAST_LOGIN(String lAST_LOGIN) {
		LAST_LOGIN = lAST_LOGIN;
	}

	public String getTOKEN() {
		return TOKEN;
	}

	public void setTOKEN(String tOKEN) {
		TOKEN = tOKEN;
	}

	public String getUSER_STATUS() {
		return USER_STATUS;
	}

	public void setUSER_STATUS(String uSER_STATUS) {
		USER_STATUS = uSER_STATUS;
	}

	public Date getCREATED() {
		return CREATED;
	}

	public void setCREATED(Date cREATED) {
		CREATED = cREATED;
	}

	public Timestamp getMODIFIED() {
		return MODIFIED;
	}

	public void setMODIFIED(Timestamp mODIFIED) {
		MODIFIED = mODIFIED;
	}
	
	

}
