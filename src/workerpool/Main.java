package workerpool;

public class Main {
    public static void main(String[] args) {
        WorkerPool workerPool = new WorkerPool(3);
        WorkerPool.Worker worker0 = workerPool.getWorker();
        worker0.doWork("painting"); // if worker is null will throw a NullPointerException
        WorkerPool.Worker worker1 = workerPool.getWorker();
        worker1.doWork("molding");
        WorkerPool.Worker worker2 = workerPool.getWorker();
        worker2.doWork("cleaning");
        WorkerPool.Worker worker3 = workerPool.getWorker();
        //worker3.doWork("supervising");
        WorkerPool.Worker worker4 = workerPool.getWorker();
        //worker4.doWork("mowing");
    }
}
