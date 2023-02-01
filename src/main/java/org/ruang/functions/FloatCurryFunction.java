package org.ruang.functions;

public interface FloatCurryFunction<T> {
    FloatFunction<T> apply(T x);

    interface FloatFunction<T> {
        float apply(T x);
    }
}



