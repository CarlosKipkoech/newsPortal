package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserTest {
    private User setUpNewUser() {
        return new User("John","manager",5);
    }
    @Test
    public void newuserInstantiatesCorrectly_true() throws Exception {
        User testUser = setUpNewUser();
        assertTrue(true);
    }



    @Test
    public void newuser_getsName_String() throws Exception {
        User testUser = setUpNewUser();
        assertEquals("john",testUser.getName());
    }

    @Test
    public void getAge__getsDescription_manager() throws Exception {
        User testUser = setUpNewUser();
        assertEquals("manager", testUser.getRole());
    }

    @Test
    public void getPower_getsNumberofemployees_String() throws Exception{
        User testUser = setUpNewUser();
        assertEquals(5, testUser.getDepartmentId());
    }







    @Test
    public void getId_userInstantiatesWithAnId_0() {
        User testUser = setUpNewUser();
        assertEquals(0,testUser.getId());
    }
}
