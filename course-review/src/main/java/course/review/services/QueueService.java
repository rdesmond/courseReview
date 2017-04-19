package course.review.services;

public class QueueService {
    int q[];
    int putlocation;
    int getlocation;

    public QueueService(int size) {
        q = new int[size];
        putlocation = getlocation = 0;
    }

    public String putQueue(int x) {
        if(putlocation == q.length) {
            return "Queue is full.";
        }

        return "Put location: " + q[putlocation++];
    }

    public String getQueue() {
        if(getlocation == putlocation) {
            return "Queue is empty.";
        }

        return "Get location: " + q[getlocation++];
    }
}