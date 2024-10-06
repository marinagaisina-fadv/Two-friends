package workerpool;
public class WorkerPool {
    private final int poolSize;

    public WorkerPool(int poolSize) {
        this.poolSize = poolSize;
    }

    public static class Worker {
        private static int counter = 0; //counts number of instances

        public Worker() {
            counter++;
        }
        public void doWork(String taskSummary) {
                System.out.printf("Worker %d is doing %s%n", counter-1, taskSummary);
        }
    }

    public int getPoolSize() {
        return poolSize;
    }

    public Worker getWorker() {
        if (Worker.counter < getPoolSize()) {
            Worker worker = new Worker();
            System.out.println("Worker " + (Worker.counter-1)); // + " created");
            return worker;
        } else {
            System.out.println("You've run out of pool size.");
        }
        return null;
    }
}
