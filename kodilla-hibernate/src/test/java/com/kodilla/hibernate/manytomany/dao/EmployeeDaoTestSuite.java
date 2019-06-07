package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeDaoTestSuite {
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    CompanyDao companyDao;

    @Test
    public void testFindEmployeeByLastName() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(dataMaesters);
        stephanieClarckson.getCompanies().add(softwareMachine);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);

        softwareMachine.getEmployees().add(johnSmith);
        softwareMachine.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);

        companyDao.save(softwareMachine);
        int id1 = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int id2 = dataMaesters.getId();

        //When
        List<Employee> foundEmplyee = employeeDao.findEmployeeByLastName("Smith");

        //Then
        Assert.assertEquals(1, foundEmplyee.size());
        Assert.assertEquals("Smith", foundEmplyee.get(0).getLastName());
        try {
            companyDao.deleteById(id1);
            companyDao.deleteById(id2);
        } catch (Exception e) {
            //do nothing
        }
    }
}
