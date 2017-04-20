package course.review.services;

//This class demonstrates a queue
public class QueueService {
    int q[];
    int putlocation;
    int getlocation;

    public QueueService(int size) {
        q = new int[size];
        putlocation = getlocation = 0;
    }

    //Puts integers in the queue
    public String putQueue(int x) {
        if(putlocation == q.length) {
            return "Queue is full.";
        }

        return "Put location: " + q[putlocation++];
    }

    //Gets integers from the queue
    public String getQueue() {
        if(getlocation == putlocation) {
            return "Queue is empty.";
        }

        return "Get location: " + q[getlocation++];
    }
}