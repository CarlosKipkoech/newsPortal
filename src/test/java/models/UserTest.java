package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserTest {
    private User setUpNewUser() {
        return new User("John","manager",5);
    }
    @Test
    public void newHeroInstantiatesCorrectly_true() throws Exception {
        User testUser = setUpNewUser();
        assertTrue(testUser instanceof User);
    }



    @Test
    public void newDepartment_getsName_String() throws Exception {
        Department testDepartment = setUpUser();
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
    public void getId_DepartmentInstantiatesWithAnId_0() {
        Department newDepartment = setUpNewDepartment();
        assertEquals(0,newDepartment.getId());
    }
}
