package dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.joda.time.*;

public class Atm_Info {
	
	private String ATM_ID;
	private String ATM_NAME;
	private Integer BANK_ID;
	private String AREA_NAME;
	private Integer CITY_ID;
	private String PINCODE;
	private Double LATITUDE;
	private Double LONGITUDE;
	private String CONTACT_PERSON1;
	private String CONTACT_PERSON2;
	private String CONTACT_PERSON3;
	private String CONTACT_EMAIL1;
	private String CONTACT_EMAIL2;
	private String CONTACT_EMAIL3;
	private String CONTACT_NO1;
	private String CONTACT_NO2;
	private String CONTACT_NO3;
	private String CONTACT_DETAILS1;
	private String CONTACT_DETAILS2;
	private String CONTACT_DETAILS3;
	private String BRAND_NAME;
	private String INSTALLATION_DATE;
	private String IP_ADDRESS;
	private String ONLINE;
	private String STATUS;
	private Date CREATED;
	private Date MODIFIED;
	
	
	public Atm_Info()
	{
		
	}


	public String getATM_ID() {
		return ATM_ID;
	}


	public void setATM_ID(String aTM_ID) {
		ATM_ID = aTM_ID;
	}


	public String getATM_NAME() {
		return ATM_NAME;
	}


	public void setATM_NAME(String aTM_NAME) {
		ATM_NAME = aTM_NAME;
	}


	public Integer getBANK_ID() {
		return BANK_ID;
	}


	public void setBANK_ID(Integer bANK_ID) {
		BANK_ID = bANK_ID;
	}


	public String getAREA_NAME() {
		return AREA_NAME;
	}


	public void setAREA_NAME(String aREA_NAME) {
		AREA_NAME = aREA_NAME;
	}


	public Integer getCITY_ID() {
		return CITY_ID;
	}


	public void setCITY_ID(Integer cITY_ID) {
		CITY_ID = cITY_ID;
	}


	public String getPINCODE() {
		return PINCODE;
	}


	public void setPINCODE(String pINCODE) {
		PINCODE = pINCODE;
	}


	public Double getLATITUDE() {
		return LATITUDE;
	}


	public void setLATITUDE(Double lATITUDE) {
		LATITUDE = lATITUDE;
	}


	public Double getLONGITUDE() {
		return LONGITUDE;
	}


	public void setLONGITUDE(Double lONGITUDE) {
		LONGITUDE = lONGITUDE;
	}


	public String getCONTACT_PERSON1() {
		return CONTACT_PERSON1;
	}


	public void setCONTACT_PERSON1(String cONTACT_PERSON1) {
		CONTACT_PERSON1 = cONTACT_PERSON1;
	}


	public String getCONTACT_PERSON2() {
		return CONTACT_PERSON2;
	}


	public void setCONTACT_PERSON2(String cONTACT_PERSON2) {
		CONTACT_PERSON2 = cONTACT_PERSON2;
	}


	public String getCONTACT_PERSON3() {
		return CONTACT_PERSON3;
	}


	public void setCONTACT_PERSON3(String cONTACT_PERSON3) {
		CONTACT_PERSON3 = cONTACT_PERSON3;
	}


	public String getCONTACT_EMAIL1() {
		return CONTACT_EMAIL1;
	}


	public void setCONTACT_EMAIL1(String cONTACT_EMAIL1) {
		CONTACT_EMAIL1 = cONTACT_EMAIL1;
	}


	public String getCONTACT_EMAIL2() {
		return CONTACT_EMAIL2;
	}


	public void setCONTACT_EMAIL2(String cONTACT_EMAIL2) {
		CONTACT_EMAIL2 = cONTACT_EMAIL2;
	}


	public String getCONTACT_EMAIL3() {
		return CONTACT_EMAIL3;
	}


	public void setCONTACT_EMAIL3(String cONTACT_EMAIL3) {
		CONTACT_EMAIL3 = cONTACT_EMAIL3;
	}


	public String getCONTACT_NO1() {
		return CONTACT_NO1;
	}


	public void setCONTACT_NO1(String cONTACT_NO1) {
		CONTACT_NO1 = cONTACT_NO1;
	}


	public String getCONTACT_NO2() {
		return CONTACT_NO2;
	}


	public void setCONTACT_NO2(String cONTACT_NO2) {
		CONTACT_NO2 = cONTACT_NO2;
	}


	public String getCONTACT_NO3() {
		return CONTACT_NO3;
	}


	public void setCONTACT_NO3(String cONTACT_NO3) {
		CONTACT_NO3 = cONTACT_NO3;
	}


	public String getCONTACT_DETAILS1() {
		return CONTACT_DETAILS1;
	}


	public void setCONTACT_DETAILS1(String cONTACT_DETAILS1) {
		CONTACT_DETAILS1 = cONTACT_DETAILS1;
	}


	public String getCONTACT_DETAILS2() {
		return CONTACT_DETAILS2;
	}


	public void setCONTACT_DETAILS2(String cONTACT_DETAILS2) {
		CONTACT_DETAILS2 = cONTACT_DETAILS2;
	}


	public String getCONTACT_DETAILS3() {
		return CONTACT_DETAILS3;
	}


	public void setCONTACT_DETAILS3(String cONTACT_DETAILS3) {
		CONTACT_DETAILS3 = cONTACT_DETAILS3;
	}


	public String getBRAND_NAME() {
		return BRAND_NAME;
	}


	public void setBRAND_NAME(String bRAND_NAME) {
		BRAND_NAME = bRAND_NAME;
	}


	public String getINSTALLATION_DATE() {
		return INSTALLATION_DATE;
	}


	public void setINSTALLATION_DATE(String iNSTALLATION_DATE) {
		INSTALLATION_DATE = iNSTALLATION_DATE;
	}


	public String getIP_ADDRESS() {
		return IP_ADDRESS;
	}


	public void setIP_ADDRESS(String iP_ADDRESS) {
		IP_ADDRESS = iP_ADDRESS;
	}


	public String getONLINE() {
		return ONLINE;
	}


	public void setONLINE(String oNLINE) {
		ONLINE = oNLINE;
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
