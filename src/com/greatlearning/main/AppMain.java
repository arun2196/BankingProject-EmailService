package com.greatlearning.main;

import com.greatlearning.interfaces.ICredentials;
import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialsService;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        //setting up objects
        Employee e1 = new Employee("Arun", "Tiwari" );
        ICredentials credentialService = new CredentialsService();
        //user inputs for department
        System.out.println(" Please enter the department from the following \n1. Technical \n2. Admin \n3. Human Resources \n4. Legal");
        Scanner userInput = new Scanner(System.in);
        int option = userInput.nextInt();

        String generatedEmail;
        String generatedPassword;

        switch (option){
            case 1:{
                e1.setDepartment("Technical");
                generatedEmail = credentialService.generateEmail(e1.getFirstName(), e1.getLastName(), e1.getDepartment());
                e1.setEmail(generatedEmail);
                generatedPassword = credentialService.generatePassword();
                e1.setPassword(generatedPassword);
                credentialService.showCredentials(e1);
                break;
            }
            case 2:{
                e1.setDepartment("Admin");
                generatedEmail = credentialService.generateEmail(e1.getFirstName(), e1.getLastName(), e1.getDepartment());
                e1.setEmail(generatedEmail);
                generatedPassword = credentialService.generatePassword();
                e1.setPassword(generatedPassword);
                credentialService.showCredentials(e1);
                break;
            }
            case 3:{
                e1.setDepartment("HumanResources");
                generatedEmail = credentialService.generateEmail(e1.getFirstName(), e1.getLastName(), e1.getDepartment());
                e1.setEmail(generatedEmail);
                generatedPassword = credentialService.generatePassword();
                e1.setPassword(generatedPassword);
                credentialService.showCredentials(e1);
                break;
            }
            case 4:{
                e1.setDepartment("Legal");
                generatedEmail = credentialService.generateEmail(e1.getFirstName(), e1.getLastName(), e1.getDepartment());
                e1.setEmail(generatedEmail);
                generatedPassword = credentialService.generatePassword();
                e1.setPassword(generatedPassword);
                credentialService.showCredentials(e1);
                break;
            }
            default :{
                System.out.println("incorrect input");
                break;
            }
        }
    }
}
