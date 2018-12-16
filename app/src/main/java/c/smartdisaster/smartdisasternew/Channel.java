package c.smartdisaster.smartdisasternew;

import java.util.ArrayList;
import java.util.Comparator;

public class Channel {
    int id;
    public int bandwidth; // Bytes transfered per second

    public static ArrayList<Job> jobsTransferring;

    Channel(int bandwidth, int Id){
        this.bandwidth = bandwidth;
        this.id = Id;
    }

    void TransferData(Job j) {
        j.progress += j.channel.bandwidth;

        /*try {
            Thread.sleep(bandwidth*100);
        } catch (InterruptedException e) {
            System.out.println("Channel "+ Id + " has stopped transferring.");
            return;
        }*/
    }
}

class ChannelComparator implements Comparator<Channel> {
    public int compare(Channel c1, Channel c2) {
        if (c1.bandwidth < c2.bandwidth)
            return 1;
        else if (c1.bandwidth  > c2.bandwidth)
            return -1;
        return 0;
    }
}
