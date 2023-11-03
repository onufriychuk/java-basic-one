package ru.otus.java.basic.homework17;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 127; i++) {
            list.add(i);
        }

        Tree searchTree = new Tree(list);
        print(searchTree.getRootNode(), "");
        System.out.println(searchTree.find(22));
        System.out.println(searchTree.find(73));

    }

    public static void print(Node node, String prefix) {
        System.out.println(node);
        System.out.println(prefix + "->" + node.getValue());
        if (node.getLeftChild() != null) {
            print(node.getLeftChild(), prefix + "->" + node.getValue());
        }
        if (node.getRightChild() != null) {
            print(node.getRightChild(), prefix + "->" + node.getValue());
        }
    }
}
