package PrototypeDp;

public interface Prototype <T> {
    // Making copy method more generic so that it can be used by any of the class
    public T copy();
}
