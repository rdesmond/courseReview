package course.review.resources;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoopsResourceTest {

    LoopsResource loopsResource = new LoopsResource();

    @Test
    public void forLoop() throws Exception {
        assertNotNull(loopsResource.forLoop());
    }

    @Test
    public void enhancedForLoop() throws Exception {
        assertNotNull(loopsResource.enhancedForLoop());
    }

    @Test
    public void whileLoop() throws Exception {
        assertNotNull(loopsResource.whileLoop());
    }

    @Test
    public void doWhileLoop() throws Exception {
        assertNotNull(loopsResource.doWhileLoop());
    }
}