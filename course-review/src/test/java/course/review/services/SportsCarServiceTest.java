package course.review.services;

import org.junit.Test;

import static org.junit.Assert.*;

public class SportsCarServiceTest {

    SportsCarService sportsCarService = new SportsCarService();

    @Test
    public void switchExample() throws Exception {
        assertNotNull(sportsCarService.switchExample());
    }

    @Test
    public void getSportsCar() throws Exception {
        assertNotNull(sportsCarService.getSportsCar());
    }
}