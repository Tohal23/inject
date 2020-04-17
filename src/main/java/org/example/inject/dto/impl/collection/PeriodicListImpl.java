package org.example.inject.dto.impl.collection;

import org.example.inject.dto.Periodic;
import org.example.inject.dto.PeriodicList;

import java.io.*;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeriodicListImpl implements PeriodicList, Serializable {

    private static final long serialVersionUID = 1L;
    private List<Periodic> periodicList;

    private PeriodicListImpl(List<Periodic> periodicList) {
        this.periodicList = periodicList;
    }

    public PeriodicListImpl() {
        this.periodicList = new ArrayList<>();
    }

    @Override
    public PeriodicList getPeriodic() {
        List<Periodic> periodicList = this.periodicList.stream()
                .filter((Periodic::isPeriodic))
                .collect(Collectors.toList());

        return new PeriodicListImpl(periodicList);
    }

    private void writeObject(ObjectOutputStream ous) throws IOException {
        ous.defaultWriteObject();

        ous.writeObject(this.periodicList.stream()
                    .filter((Periodic::isPeriodic))
                    .collect(Collectors.toList()));
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();

        periodicList = (List<Periodic>) ois.readObject();
    }

    @Override
    public String toString() {
        return periodicList.toString();
    }

    @Override
    public int size() {
        return periodicList.size();
    }

    @Override
    public boolean isEmpty() {
        return periodicList.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return periodicList.contains(o);
    }

    @Override
    public Iterator<Periodic> iterator() {
        return periodicList.iterator();
    }

    @Override
    public void forEach(Consumer<? super Periodic> action) {
        periodicList.forEach(action);
    }

    @Override
    public Object[] toArray() {
        return periodicList.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return periodicList.toArray(a);
    }

    @Override
    public <T> T[] toArray(IntFunction<T[]> generator) {
        return periodicList.toArray(generator);
    }

    @Override
    public boolean add(Periodic periodic) {
        return periodicList.add(periodic);
    }

    @Override
    public boolean remove(Object o) {
        return periodicList.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return periodicList.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Periodic> c) {
        return periodicList.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends Periodic> c) {
        return periodicList.addAll(index, c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return periodicList.removeAll(c);
    }

    @Override
    public boolean removeIf(Predicate<? super Periodic> filter) {
        return periodicList.removeIf(filter);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return periodicList.retainAll(c);
    }

    @Override
    public void replaceAll(UnaryOperator<Periodic> operator) {
        periodicList.replaceAll(operator);
    }

    @Override
    public void sort(Comparator<? super Periodic> c) {
        periodicList.sort(c);
    }

    @Override
    public void clear() {
        periodicList.clear();
    }

    @Override
    public Periodic get(int index) {
        return periodicList.get(index);
    }

    @Override
    public Periodic set(int index, Periodic element) {
        return periodicList.set(index, element);
    }

    @Override
    public void add(int index, Periodic element) {
        periodicList.add(index, element);
    }

    @Override
    public Periodic remove(int index) {
        return periodicList.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return periodicList.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return periodicList.lastIndexOf(o);
    }

    @Override
    public ListIterator<Periodic> listIterator() {
        return periodicList.listIterator();
    }

    @Override
    public ListIterator<Periodic> listIterator(int index) {
        return periodicList.listIterator(index);
    }

    @Override
    public List<Periodic> subList(int fromIndex, int toIndex) {
        return periodicList.subList(fromIndex, toIndex);
    }

    @Override
    public Spliterator<Periodic> spliterator() {
        return periodicList.spliterator();
    }

    @Override
    public Stream<Periodic> stream() {
        return periodicList.stream();
    }

    @Override
    public Stream<Periodic> parallelStream() {
        return periodicList.parallelStream();
    }
}