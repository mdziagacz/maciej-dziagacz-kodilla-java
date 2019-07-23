package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyEmployeeSearchFacade {
    private CompanyDao companyDao;
    private EmployeeDao employeeDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyEmployeeSearchFacade.class);

    public CompanyEmployeeSearchFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Company> findCompany(String namePart) throws CompanyEmployeeSearchFacadeException {
        List<Company> companyList;
        boolean wasError = false;
        try {
            LOGGER.info("Starting for searching companies which names contains: " + namePart);
            companyList = companyDao.findByNamePart(namePart);
            if (companyList.size() == 0) {
                LOGGER.error(CompanyEmployeeSearchFacadeException.ERR_NO_COMPANY);
                wasError = true;
                throw new CompanyEmployeeSearchFacadeException(CompanyEmployeeSearchFacadeException.ERR_NO_COMPANY);
            } else {
                LOGGER.info("Companies found");
                return companyList;
            }
        } finally {
            if (wasError) {
                LOGGER.error(CompanyEmployeeSearchFacadeException.ERR_SEARCHING);
            }
        }
    }

    public List<Employee> findEmployee(String namePart) throws CompanyEmployeeSearchFacadeException{
        List<Employee> employeeList;
        boolean wasError = false;
        try {
            LOGGER.info("Starting for searching employees which last name contains: " + namePart);
            employeeList = employeeDao.findByNamePart(namePart);
            if (employeeList.size() == 0) {
                LOGGER.error(CompanyEmployeeSearchFacadeException.ERR_NO_EMPLOYEE);
                wasError = true;
                throw new CompanyEmployeeSearchFacadeException(CompanyEmployeeSearchFacadeException.ERR_NO_EMPLOYEE);
            } else {
                LOGGER.info("Employees found");
                return employeeList;
            }
        } finally {
            if (wasError) {
                LOGGER.error(CompanyEmployeeSearchFacadeException.ERR_SEARCHING);
            }
        }
    }
}
