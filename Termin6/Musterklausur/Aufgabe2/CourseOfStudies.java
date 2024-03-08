package Termin6.Musterklausur.Aufgabe2;

public enum CourseOfStudies {
    WI("Wirtschaftsinformatik"),
    INF("Informatik"),
    BWL("Betriebswirtschaftslehre");

    private final String description;

    private CourseOfStudies(String description) {
        this.description = description;
    }

    public String description() {
        return description;
    }
}