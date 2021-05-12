package sims.finance;

//TODO: showdown between Calendar and Time (virtually the same) #codeslinging
public class Time implements PassesTime {
	static Integer year = 0;
	static Integer month = 0;

	@Override
	public boolean nextMonth() {
    if(month == 11) {
      year++;
	    month = 0;
    }
    else month++;
  }

  public Integer getMonth() {
    return month; 
  }

  public Integer getYear() { 
    return year; 
  }

  boolean isNewYear() { 
    return month == 0 && year != 0; 
  }
}
