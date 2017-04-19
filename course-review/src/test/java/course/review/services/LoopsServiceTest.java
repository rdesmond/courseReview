package course.review.services;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoopsServiceTest {

    LoopsService loopsService = new LoopsService();

    @Test
    public void forLoop() throws Exception {
        assertNotNull(loopsService.forLoop());
    }

    @Test
    public void enhancedForLoop() throws Exception {
        assertNotNull(loopsService.enhancedForLoop());
    }

    @Test
    public void whileLoop() throws Exception {
        assertNotNull(loopsService.whileLoop());
    }

    @Test
    public void doWhileLoop() throws Exception {
        assertNotNull(loopsService.doWhileLoop());
    }
}