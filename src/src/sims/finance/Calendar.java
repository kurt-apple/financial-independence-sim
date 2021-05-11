package sims.finance;

public class Calendar implements PassesTime {
    private Integer year;
    private Integer month;

    public Calendar() {
        year    = 0;
        month   = 0;
    }

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
}
