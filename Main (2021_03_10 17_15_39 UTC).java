package com.company;
import java.util.*;


public class Main {
    public static <E> void preorder(binarytree<E> root) {
        if (root == null)//if the tree is empty return
            return;
        System.out.print(root.data + " ");//else print root data
        preorder(root.left);// traverse the left subtree
        preorder(root.right);// traverse the right subtree


    }

    public static <E> void postorder(binarytree<E> root) {
        if (root == null)
            return;
        postorder(root.left);// traverse the left subtree
        System.out.print(root.data + " ");// print root data
        postorder(root.right);// traverse the right subtree

    }

    public static <E> void inorder(binarytree<E> root) {
        if (root == null)
            return;
        inorder(root.left);// traverse the left subtree
        inorder(root.right);// traverse the right subtree
        System.out.print(root.data + " ");//print root data
    }

        public static void main (String []args){
             binarytree<String> x = new binarytree<>("*");
             x.left = new binarytree<>("+");
             x.right = new binarytree<>("/");
             x.left.left = new binarytree<>("x");
             x.left.right = new binarytree<>("y");
             x.right.left = new binarytree<>("a");
             x.right.right = new binarytree<>("b");




        System.out.print("This is preorder traversal => ");
        preorder(x);
        System.out.println("\n+++++++++++++++");
        System.out.print("This is postorder traversal => ");
        postorder(x);
        System.out.println("\n+++++++++++++++");
        System.out.print("This is inorder traversal => ");
        inorder(x);

    }}
