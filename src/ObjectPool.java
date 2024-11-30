import java.util.concurrent.*;

public abstract class ObjectPool<T> {

    public T getObject(){
        T obj = null;
        obj = pool.poll();
        if (obj == null) {
            //create object add in the pool and return
        }
        return obj;
    }
    public void returnObjectToPool(T obj){
        if(obj != null){
            pool.offer(obj);
        }

    }

    private ScheduledExecutorService executor;
    private ConcurrentLinkedDeque<T> pool ;

    public ObjectPool(final int minObject) {
        initialize(minObject);
    }
    public ObjectPool(final int minObject , final int maxObject , final long timeToLive) {
        initialize(minObject);
        executor = Executors.newSingleThreadScheduledExecutor();
        executor.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                int size = pool.size();
                if(size < minObject){
                    int objectToBeAdded = size - minObject;

                }



            }
        } , timeToLive,timeToLive, TimeUnit.MILLISECONDS);
    }

    void initialize(final int minObject){
        pool = new ConcurrentLinkedDeque<>();
        for(int i = 0 ; i < minObject ; i++){
            T obj = createObject();
            pool.add(obj);

        }

    }

    protected abstract  T createObject();

}
