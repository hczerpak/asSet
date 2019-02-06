package es.coffeebyt.collections;

import org.junit.Test;

import java.util.HashSet;

import static es.coffeebyt.collections.Collections.asSet;
import static java.util.Arrays.asList;
import static java.util.Collections.emptySet;
import static java.util.Collections.singleton;
import static org.junit.Assert.assertEquals;

public class CollectionsTest {
    @Test
    public void testAsSet() {
        String[] letters = {"a", "b", "c", "d", "e"};

        assertEquals(emptySet(), asSet());
        assertEquals(singleton("a"), asSet("a"));
        assertEquals(singleton("a"), asSet("a", "a"));
        assertEquals(new HashSet<>(asList(letters)), asSet(letters));
    }
}
