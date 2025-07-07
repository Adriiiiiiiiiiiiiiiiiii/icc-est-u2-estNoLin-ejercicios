package main.Ejercicio_01_insert;

import main.Materia.Models.Node;
import java.util.LinkedList;
import java.util.Queue;

public class InsertBST {
    public Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.getValue()) {
            root.setLeft(insert(root.getLeft(), value));
        } else if (value > root.getValue()) {
            root.setRight(insert(root.getRight(), value));
        }
        return root;
    }
    public void printByLevels(Node root) {
        if (root == null) return;
        Queue<Node> A = new LinkedList<>();
        A.add(root);
        while (!A.isEmpty()) {
            int size = A.size();
            for (int i = 0; i < size; i++) {
                Node cur = A.poll();
                System.out.print(cur.getValue() + " ");
                if (cur.getLeft()  != null) A.add(cur.getLeft());
                if (cur.getRight() != null) A.add(cur.getRight());
            }
            System.out.println();
        }
    }
}