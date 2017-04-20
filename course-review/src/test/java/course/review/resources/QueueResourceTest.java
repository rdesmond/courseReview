package course.review.resources;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueResourceTest {

    QueueResource queueResource = new QueueResource();

    @Test
    public void putQueue() throws Exception {
        assertNotNull(queueResource.putQueue());
    }

    @Test
    public void getQueue() throws Exception {
        assertNotNull(queueResource.getQueue());
    }

}