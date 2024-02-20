package org.example.data;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Appointment {
    private String firstName;
    private String lastName;
    private String reason;
    private LocalDateTime date;

    public Appointment(String firstName, String lastName, int reason){
        this.firstName = firstName;
        this.lastName = lastName;
        if (reason == 1){
            this.reason = "Doctor Stone visit";
        } else if (reason == 2) {
            this.reason = "Doctor Strange visit";
        }else{
            this.reason = "Patient visit";
        }
        this.date = LocalDateTime.now();
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getReason() {
        return reason;
    }

    @Override
    public String toString() {
        return "Patient: "+firstName+" "+ lastName+" | Appointment reason: "+reason+" | Time: "+date;
    }
}
