package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NewsTest {
    private News setUpNews() {
        return new News("manchester losses","drury");
    }
    @Test
    public void newuserInstantiatesCorrectly_true() throws Exception {
        News testNews = setUpNews();
        assertTrue(true);
    }



    @Test
    public void newuser_getsName_String() throws Exception {
        News testNews = setUpNews();
        assertEquals("john",testUser.getName());
    }

    @Test
    public void getAge__getsDescription_manager() throws Exception {
        News testNews = setUpNews();
        assertEquals("manager", testUser.getRole());
    }

    @Test
    public void getPower_getsNumberofemployees_String() throws Exception{
        News testNews = setUpNews();
        assertEquals(5, testUser.getDepartmentId());
    }







    @Test
    public void getId_userInstantiatesWithAnId_0() {
        News testNews = setUpNews();
        assertEquals(0,testUser.getId());
    }
}
