package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NewsTest {
    private News setUpNews() {
        return new News("manchester looses","drury");
    }
    @Test
    public void newsInstantiatesCorrectly_true() throws Exception {
        News testNews = setUpNews();
        assertTrue(true);
    }



    @Test
    public void newNews_getsName_String() throws Exception {
        News testNews = setUpNews();
        assertEquals("manchester looses",testNews.getContent());
    }

    @Test
    public void getAuthor__getsDescription_drury() throws Exception {
        News testNews = setUpNews();
        assertEquals("drury", testNews.getAuthor());
    }



    @Test
    public void getId_userInstantiatesWithAnId_0() {
        News testNews = setUpNews();
        assertEquals(0,testNews.getId());
    }
}
