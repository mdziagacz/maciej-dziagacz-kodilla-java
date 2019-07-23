package com.kodilla.hibernate.manytomany.facade;

public class CompanyEmployeeSearchFacadeException extends Exception {
    public static final String ERR_NO_COMPANY = "Company not found";
    public static final String ERR_NO_EMPLOYEE = "Employee not found";
    public static final String ERR_SEARCHING = "Searching failed";

    public CompanyEmployeeSearchFacadeException(String message) {
        super(message);
    }
}
