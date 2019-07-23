package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.facade.CompanyEmployeeSearchFacade;
import com.kodilla.hibernate.manytomany.facade.CompanyEmployeeSearchFacadeException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CompanyEmployeeSearchFacadeTestSuite {

    @Autowired
    private CompanyEmployeeSearchFacade companyEmployeeSearchFacade;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyDao companyDao;

    @Test
    public void testFindCompany() throws CompanyEmployeeSearchFacadeException {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        companyDao.save(softwareMachine);
        int softwareMachineID = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersID = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterID = greyMatter.getId();

        //When
        List<Company> companyList = companyEmployeeSearchFacade.findCompany("mach");

        //Then
        Assert.assertEquals(1, companyList.size());
        Assert.assertTrue(companyList.get(0).getName().equals(softwareMachine.getName()));

        //CleanUp
        companyDao.deleteById(softwareMachineID);
        companyDao.deleteById(dataMaestersID);
        companyDao.deleteById(greyMatterID);
    }

    @Test
    public void testFindEmployee() throws CompanyEmployeeSearchFacadeException{
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        employeeDao.save(johnSmith);
        int johnSmithID = johnSmith.getId();
        employeeDao.save(stephanieClarckson);
        int stephanieClarcksonID = stephanieClarckson.getId();
        employeeDao.save(lindaKovalsky);
        int lindaKovalskyID = lindaKovalsky.getId();

        //When
        List<Employee> employeeList = companyEmployeeSearchFacade.findEmployee("Smi");

        //Then
        Assert.assertEquals(1, employeeList.size());
        Assert.assertTrue(employeeList.get(0).getLastName().equals(johnSmith.getLastName()));

        //CleanUp
        employeeDao.deleteById(johnSmithID);
        employeeDao.deleteById(stephanieClarcksonID);
        employeeDao.deleteById(lindaKovalskyID);
    }
}
