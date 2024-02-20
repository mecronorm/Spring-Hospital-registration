package org.example;

import org.example.commands.Register;
import org.example.commands.Report;
import org.example.configs.ApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        Register register = context.getBean(Register.class);
        Report report = context.getBean(Report.class);

        while (true){
            System.out.println("Give in a command (empty quits):\nregister: register an appointement\nreport: Show a report of every appointement");
            String command = scanner.nextLine();
            if (command.isEmpty()){
                break;
            }
            switch (command){
                case "register":
                    register.execute();
                    System.out.println();
                    break;
                case "report":
                    report.execute();
                    System.out.println();
                    break;
                default:
                    System.out.println(command+" not found");
                    break;
            }
        }

    }
}
