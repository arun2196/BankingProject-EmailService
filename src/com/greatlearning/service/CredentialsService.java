package com.greatlearning.service;
import com.greatlearning.model.Employee;
import com.greatlearning.interfaces.ICredentials;
import java.util.Random;

public class CredentialsService implements ICredentials {
    //specific implementation for each method in ICredentials
    //public void displayCredentials()

    @Override
    public String generateEmail(String firstName, String lastName, String department) {
        //generate email
        String emailAddress = firstName+lastName+"@"+department+".gl.com";
        return emailAddress;
    }

    @Override
    public String generatePassword() {
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$%^&*()_+=<>'";
        String numbers = "1234567890";
        String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
        Random random = new Random();
        String password ="";

        password += lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
        password += capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
        password += specialCharacters.charAt(random.nextInt(specialCharacters.length()));
        password += numbers.charAt(random.nextInt(numbers.length()));

        for(int i = 4; i< 10 ; i++) {
            int boundValue = combinedChars.length();
            int randomIndex = random.nextInt(boundValue);
            char randomChar = combinedChars.charAt(randomIndex);
            password += String.valueOf(randomChar);
        }
        return password;
    }

    @Override
    public void showCredentials(Employee employee) {
        System.out.println("Dear " + employee.getFirstName() + ", your generated credentials are \n");
        System.out.println("Email:  " + employee.getEmail());
        System.out.println("Password:  " + employee.getPassword());
    }
}
