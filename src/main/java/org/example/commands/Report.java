package org.example.commands;

import org.example.data.Appointements;
import org.example.data.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Report implements Command {

    @Autowired
    private Appointements appointements;

    @Override
    public void execute() {
        ArrayList<Appointment> list = appointements.getList();
        for (Appointment appointment: list){
            System.out.println(appointment);
        }
    }
}
