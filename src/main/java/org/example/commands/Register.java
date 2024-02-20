package org.example.commands;

import org.example.data.Appointements;
import org.example.data.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class Register  implements Command{

    @Autowired
    private Appointements appointements;
    private Scanner scan = new Scanner(System.in);

    @Override
    public void execute() {
        System.out.print("Give in your first name: ");
        String firstName = scan.nextLine();
        System.out.print("Give in your last name: ");
        String lastName = scan.nextLine();
        System.out.println("Give a number corresponding with your reason for visit:\n1: Doctor Stone\n2: Doctor Strange\n3: Patient visit");
        int choice = Integer.valueOf(scan.nextLine());

        Appointment appointment = new Appointment(firstName, lastName, choice);
        appointements.addAppointment(appointment);
    }
}
