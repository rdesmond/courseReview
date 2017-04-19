package course.review.resources;

import org.junit.Test;

import static org.junit.Assert.*;

public class CastNestControlResourceTest {

    CastNestControlResource castNestControlResource = new CastNestControlResource();

    @Test
    public void casting() throws Exception {
        assertNotNull(castNestControlResource.casting());
    }

    @Test
    public void nesting() throws Exception {
        assertNotNull(castNestControlResource.nesting());
    }

    @Test
    public void control() throws Exception {
        assertNotNull(castNestControlResource.control());
    }
}