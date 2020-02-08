package model;

public class DataTypes {
	
	private int id;
	private String dataType;
	
	public DataTypes(int id, String dataType) {
		this.id = id;
		this.dataType = dataType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	@Override
	public String toString() {
		return getDataType();
	}
	
	

}
