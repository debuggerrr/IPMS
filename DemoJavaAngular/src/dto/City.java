package dto;

public class City {
	
	private Integer CITY_ID;
	private String CITY_NAME;
	private Integer DISTRICT_ID;
	
	public City()
	{
		
	}

	public Integer getCITY_ID() {
		return CITY_ID;
	}

	public void setCITY_ID(Integer cITY_ID) {
		CITY_ID = cITY_ID;
	}

	public String getCITY_NAME() {
		return CITY_NAME;
	}

	public void setCITY_NAME(String cITY_NAME) {
		CITY_NAME = cITY_NAME;
	}

	public Integer getDISTRICT_ID() {
		return DISTRICT_ID;
	}

	public void setDISTRICT_ID(Integer dISTRICT_ID) {
		DISTRICT_ID = dISTRICT_ID;
	}
	
	

}
