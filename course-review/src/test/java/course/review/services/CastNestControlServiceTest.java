package course.review.services;

import org.junit.Test;

import static org.junit.Assert.*;

public class CastNestControlServiceTest {

    CastNestControlService castNestControlService = new CastNestControlService();

    @Test
    public void casting() throws Exception {
        assertNotNull(castNestControlService.casting());
    }

    @Test
    public void nesting() throws Exception {
        assertNotNull(castNestControlService.nesting());
    }

    @Test
    public void control() throws Exception {
        assertNotNull(castNestControlService.control());
    }
}