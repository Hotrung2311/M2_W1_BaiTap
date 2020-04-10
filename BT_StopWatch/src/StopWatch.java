import java.util.Arrays;

public class StopWatch {
    private long startTime, endTime;

    private long getStartTime(){
        return this.startTime;
    }
    private long getEndTime(){
        return this.endTime;
    }
    public StopWatch(){
        this.startTime = System.currentTimeMillis();
        this.endTime = 0;
    }
    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
