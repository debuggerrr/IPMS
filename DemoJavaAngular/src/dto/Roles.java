package dto;

import java.util.Date;

public class Roles {
	
	private Integer ROLE_ID;
	private String ROLE_NAME;
	private Date CREATED;
	
	public Roles()
	{
		
	}

	public Integer getROLE_ID() {
		return ROLE_ID;
	}

	public void setROLE_ID(Integer rOLE_ID) {
		ROLE_ID = rOLE_ID;
	}

	public String getROLE_NAME() {
		return ROLE_NAME;
	}

	public void setROLE_NAME(String rOLE_NAME) {
		ROLE_NAME = rOLE_NAME;
	}

	public Date getCREATED() {
		return CREATED;
	}

	public void setCREATED(Date cREATED) {
		CREATED = cREATED;
	}
	
	

}
