package ru.otus.java.basic.homework17;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Tree implements SearchTree {
    private Node rootNode;
    private List<Integer> list;

    public Tree(List<Integer> list) {
        this.list = list;
        List<Integer> sortedList = getSortedList();
        rootNode = addNode(list, 0, list.size() - 1);
    }

    private Node addNode(List<Integer> list, int first, int last) {
        if (first > last) {
            return null;
        }
        int middle = (first + last) / 2;
        Node node = new Node(list.get(middle));
        node.setLeftChild(addNode(list, first, middle - 1));
        node.setRightChild(addNode(list, middle + 1, last));
        return node;
    }

    @Override
    public Integer find(Integer element) {
        return getElement(rootNode, element);
    }

    private Integer getElement(Node root, Integer element) {
        if (root == null) return null;
         if (element < root.getValue()) {
            return getElement(root.getLeftChild(), element);
        } else if (element > root.getValue()) {
            return getElement(root.getRightChild(), element);
        } else {
            return root.getValue();
        }
    }

    @Override
    public List getSortedList() {
        Collections.sort(list);
        return list;
    }

    public Node getRootNode() {
        return rootNode;
    }
}
