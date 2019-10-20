package sbtcon;

public class Synchronized implements Counter {
    private long value;
    @Override
    public synchronized void increment() {
        value++;
    }

    @Override
    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }
}