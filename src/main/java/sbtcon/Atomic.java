package sbtcon;

import java.util.concurrent.atomic.AtomicLong;

import static org.graalvm.compiler.debug.DebugOptions.Count;

public class Atomic implements Counter {
    private AtomicLong value = new AtomicLong(0);
    @Override
    public void increment() {
        this.value.incrementAndGet();
    }

    @Override
    public long getValue() {
        return value.longValue();
    }

    public void setValue(int value) {
        this.value.set(value);
    }
}