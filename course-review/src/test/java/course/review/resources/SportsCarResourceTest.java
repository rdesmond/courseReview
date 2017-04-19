package course.review.resources;

import org.junit.Test;

import static org.junit.Assert.*;

public class SportsCarResourceTest {

    SportsCarResource sportsCarResource = new SportsCarResource();

    @Test
    public void getSportsCar() throws Exception {
        assertNotNull(sportsCarResource.getSportsCar());
    }

    @Test
    public void switchExample() throws Exception {
        assertNotNull(sportsCarResource.switchExample());
    }
}