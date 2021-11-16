package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class DepartmentTest {
    private Department setUpNewDepartment() {
        return new Department("sports","sports related news",5);
    }
    @Test
    public void newHeroInstantiatesCorrectly_true() throws Exception {
        Department testDepartment = setUpNewDepartment();
        assertTrue(testDepartment instanceof Department);
    }



    @Test
    public void newDepartment_getsName_String() throws Exception {
        Department testDepartment = setUpNewDepartment();
        assertEquals("sports",testDepartment.getName());
    }

    @Test
    public void getAge__getsDescription_sportsrelated() throws Exception {
        Department testDepartment = setUpNewDepartment();
        assertEquals("sports related news", testDepartment.getDescription());
    }

    @Test
    public void getPower_getsNumberofemployees_String() throws Exception{
        Department testDepartment = setUpNewDepartment();
        assertEquals(5, testDepartment.getNumberOfEmployees());
    }







    @Test
    public void getId_heroInstantiatesWithAnId_1() {
        Department newDepartment = setUpNewDepartment();
        assertEquals(0,newDepartment.getId());
    }

}