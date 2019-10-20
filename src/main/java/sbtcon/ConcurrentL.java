package sbtcon;

 import java.util.concurrent.locks.Lock;
 import java.util.concurrent.locks.ReentrantLock;

public class ConcurrentL implements Counter {
    Lock lock = new ReentrantLock();
    private long value;
    @Override
    public void increment() {
        lock.lock();
        value++;
        lock.unlock();
    }

    @Override
    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }
}