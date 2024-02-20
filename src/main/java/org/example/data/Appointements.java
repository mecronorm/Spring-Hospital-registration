package org.example.data;

import org.example.commands.Command;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class Appointements {
    private ArrayList<Appointment> list = new ArrayList<>();

    public void addAppointment(Appointment appointment){
        list.add(appointment);
    }

    public ArrayList<Appointment> getList() {
        return list;
    }
}
