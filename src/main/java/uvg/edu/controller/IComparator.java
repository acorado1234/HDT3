package uvg.edu.controller;

/**
 * Comparator interface for comparing two objects.
 *
 * @param <T> the type of objects that may be compared by this comparator
 */
public interface IComparator<T> {
    /**
     * Compares two objects and returns an integer based on the comparison.
     *
     * @param _object1 the first object to be compared
     * @param _object2 the second object to be compared
     * @return a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second
     */
    public int Compare(T _object1, T _object2);
}