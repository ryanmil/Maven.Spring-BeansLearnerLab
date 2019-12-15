package com.beanslearner.beans;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public abstract class People<T extends Person> implements Iterable<T>{

    List<T> personList;

    public People(List<T> people) {
        this.personList = people;
    }

    public void add(T person) {
        personList.add(person);
    }

    public void remove(T person) {
        personList.remove(person);
    }

    public int size() {
        return personList.size();
    }

    public void clear() {
        personList.clear();
    }

    public void addAll(Iterable<T> people) {
        personList.addAll((List<T>)people);
    }

    public T findById(Long id) {
        for(T p : personList) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public List<T> findAll() {
        return personList;
    }

    @Override
    public Iterator<T> iterator() {
        return personList.iterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        personList.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return personList.spliterator();
    }
}
