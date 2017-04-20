package course.review.services;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueServiceTest {

    QueueService queueService = new QueueService(10);

    @Test
    public void putQueue() throws Exception {
        assertNotNull(queueService.putQueue(1));
    }

    @Test
    public void getQueue() throws Exception {
        assertNotNull(queueService.getQueue());
    }

}