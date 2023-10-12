public class StopWatch {
    private long startTime, endTime;
    boolean isRunning = false;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public StopWatch() {
    }

    public StopWatch(long startTime, long endTime, boolean isRunning) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.isRunning = isRunning;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
        isRunning = true;
    }

    public void end() {
        this.endTime = System.currentTimeMillis();
        isRunning = false;
    }

    public long getElapsedTime() {
        if (isRunning) {
            return System.currentTimeMillis() - startTime;
        } else {
            return endTime - startTime;
        }
    }
}
