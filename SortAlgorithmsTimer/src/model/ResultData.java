package model;

public class ResultData {
	
	private String sorter;
	private String time;
	
	public ResultData(String sorter, String time) {
		this.sorter = sorter;
		this.time = time;
	}
	public String getSorter() {
		return sorter;
	}
	public void setSorter(String sorter) {
		this.sorter = sorter;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	

}
