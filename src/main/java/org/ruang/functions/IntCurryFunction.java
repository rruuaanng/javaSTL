package org.ruang.functions;

public interface IntCurryFunction<T> {
    IntFunction<T> apply(T x);

    interface IntFunction<T> {
        int apply(T x);
    }
}

