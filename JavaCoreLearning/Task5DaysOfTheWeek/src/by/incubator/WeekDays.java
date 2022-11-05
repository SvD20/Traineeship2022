package by.incubator;

public enum WeekDays {
    MONDAY(" is not a weekend"),
    TUESDAY(" is not a weekend"),
    WEDNESDAY(" is not a weekend"),
    THURSDAY(" is not a weekend"),
    FRIDAY(" is not a weekend"),
    SATURDAY(" is a weekend"),
    SUNDAY(" is a weekend");

    private String aboutThisDay;

    private WeekDays(String aboutThisDay){
        this.aboutThisDay = aboutThisDay;
    }

    public String getInfoAboutThisDay(){
        return aboutThisDay;
    }
}
