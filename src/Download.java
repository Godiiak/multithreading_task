import model.DownloadResult;

import java.util.Random;

public class Download {
    public DownloadResult downloadNext(int id) throws InterruptedException {
        Random r = new Random();
        Thread.sleep(r.nextInt(50)); //download process
        return new DownloadResult(id, r.nextInt(100000));
    }
}
