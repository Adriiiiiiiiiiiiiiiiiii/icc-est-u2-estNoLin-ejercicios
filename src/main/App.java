package main;

import main.Ejercicio_01_insert.InsertBST;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Ejercicio_04_depth.Depth;
import main.Materia.Models.Node;
import utils.StudentValidator;

import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

        // ➤ EJERCICIO 1: Insertar nodos en un BST (árbol binario de búsqueda)
        System.out.println("\n\tEJERCICIO 1");
        InsertBST bst = new InsertBST();
        Node root = null;

        int[] valores = {5, 3, 7, 2, 4, 6, 8};
        for (int val : valores) {
            root = bst.insert(root, val);
        }

        System.out.println("Resultado (niveles del árbol):");
        bst.printByLevels(root);

        // ➤ EJERCICIO 2: Invertir un árbol binario
        System.out.println("\n\tEJERCICIO 2");

        // Crear un nuevo árbol desde cero
        root = null;
        int[] datosInvertir = {4, 2, 7, 1, 3, 6, 9};
        for (int num : datosInvertir) {
            root = bst.insert(root, num);
        }

        InvertBinaryTree inverter = new InvertBinaryTree();
        root = inverter.invertTree(root);

        System.out.println("Árbol luego de invertir:");
        bst.printByLevels(root);

        // ➤ EJERCICIO 3: Convertir árbol en listas por nivel
        System.out.println("\n\tEJERCICIO 3");

        ListLevels lister = new ListLevels();
        List<List<Node>> niveles = lister.listLevels(root);

        System.out.println("Contenido por niveles (listas enlazadas):");
        for (List<Node> nivel : niveles) {
            for (int i = 0; i < nivel.size(); i++) {
                System.out.print(nivel.get(i).getValue());
                if (i != nivel.size() - 1) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }

        // ➤ EJERCICIO 4: Determinar profundidad máxima del árbol
        System.out.println("\n\tEJERCICIO 4");

        // Estructura manual del árbol
        root = new Node(4);
        Node n2 = new Node(2);
        Node n7 = new Node(7);
        Node n1 = new Node(1);
        Node n3 = new Node(3);
        Node n8 = new Node(8);

        root.setLeft(n2);
        root.setRight(n7);
        n2.setLeft(n1);
        n2.setRight(n3);
        n1.setLeft(n8);

        Depth calculator = new Depth();
        int profundidad = calculator.maxDepth(root);
        System.out.println("La profundidad del árbol es: " + profundidad);
    }
}
