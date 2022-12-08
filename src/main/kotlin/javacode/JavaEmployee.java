package javacode;

public class JavaEmployee {
    private String firstName;
    private final boolean fullTime;

    public JavaEmployee(String firstName, boolean fullTime) {
        this.firstName = firstName;
        this.fullTime = fullTime;
    }

    public JavaEmployee(String firstName) {
        this.firstName = firstName;
        this.fullTime = true;
    }
}
