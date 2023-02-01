package org.ruang.functions;

public interface DoubleCurryFunction<T> {
    DoubleFunction<T> apply(T x);

    interface DoubleFunction<T> {
        double apply(T x);
    }
}
