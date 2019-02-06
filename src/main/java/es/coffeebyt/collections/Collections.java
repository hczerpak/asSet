package es.coffeebyt.collections;

import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.asList;

public class Collections {
    /**
     * Why is this missing from standard library 🤷‍?
     */
    public static <T> Set<T> asSet(T... items) {
        return new HashSet<>(asList(items));
    }
}
