package com.greatlearning.interfaces;
import com.greatlearning.model.Employee;
public interface ICredentials {
    //generate email address
    //generate password
    //display Credentials
    public String generateEmail(String firstName, String lastName, String department);
    public String generatePassword();
    public void showCredentials(Employee employee);
}
