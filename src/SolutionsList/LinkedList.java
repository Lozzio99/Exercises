package SolutionsList;

import ExercisesList.IList;
import ExercisesList.Node;

public class LinkedList<E> implements IList<E> {

    private Node<E> first;
    private int size;
    public LinkedList() {
        this.first = null;
        this.size = 0;
    }

    @Override
    public E first() {
        return this.first == null ? null : this.first.getElement();
    }

    @Override
    public E removeFirst() {
        if (this.first == null) return null;
        Node<E> oldFirst = this.first;
        this.first = oldFirst.getNext();
        this.size--;
        return oldFirst.getElement();
    }

    @Override
    public void add(E element) {
        if (this.first == null) {
            this.first = new Node<>(element);
            this.size++;
            return;
        }
        Node<E> e = this.first;
        while(e.getNext() != null) {
            e = e.getNext();
        }
        e.setNext(new Node<>(element));
        this.size++;
    }


    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        if (first == null) return "[]";
        StringBuilder sb = new StringBuilder();
        Node<E> e = first;
        sb.append("[").append(e.getElement());
        while(e.getNext() != null) {
            e = e.getNext();
            sb.append(",").append(e.getElement());
        }
        sb.append("]");
        return sb.toString().trim();
    }

    public E getItemAt(int index) {
        if (this.first() == null) return null;
        int count = 0;
        Node<E> atIndex = first;
        while(count < index && atIndex.getNext()!= null){
            atIndex = atIndex.getNext();
            count++;
        }
        return atIndex.getElement();
    }
}
