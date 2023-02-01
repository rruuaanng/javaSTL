package org.ruang.functions;

public interface LongCurryFunction<T> {
    LongFunction<T> apply(T x);

    interface LongFunction<T> {
        long apply(T x);
    }
}
