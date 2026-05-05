package com.pluralsight;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {



    @Test
    public void punchInAndPunchOut_shouldCalculateHoursWorked() {

        Employee employee = new Employee(101, "Mubarak", "IT", 20.0, 0);

        employee.punchIn(9);
        employee.punchOut(17);

        assertEquals(8, employee.getHoursWorked());
    }


    @Test
    public void punchOut_shouldAddHoursToExistingHoursWorked() {

        Employee employee = new Employee(101, "Mubarak", "IT", 20.0, 5);

        employee.punchIn(10);
        employee.punchOut(14);

        assertEquals(9, employee.getHoursWorked());
    }











}
