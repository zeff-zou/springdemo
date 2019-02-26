package com.zeff.springdemo.tree;

import java.util.List;

public class TreeTraversal {

    public static void preOrder(TreeNode treeNode){
        if (treeNode == null) return;

        System.out.print(treeNode.getValue());
        preOrder(treeNode.getLeft());
        preOrder(treeNode.getRight());
    }

    public static void inOrder(TreeNode treeNode){
        if (treeNode == null) return;

        inOrder(treeNode.getLeft());
        System.out.print(treeNode.getValue());
        inOrder(treeNode.getRight());
    }

    public static void postOrder(TreeNode treeNode){
        if (treeNode == null) return;

        postOrder(treeNode.getLeft());
        postOrder(treeNode.getRight());
        System.out.print(treeNode.getValue());
    }


    public static TreeNode createTree(List<String> preOder, List<String> inOrder){
        if (inOrder.isEmpty()){
           return null;
        }
        TreeNode root = new TreeNode(preOder.get(0));

        int i = inOrder.indexOf(preOder.get(0));
        root.setLeft(createTree(preOder.subList(1,preOder.size()),inOrder.subList(0,i)));
        root.setRight(createTree(preOder.subList(i+1,preOder.size()),inOrder.subList(i+1,inOrder.size())));

        return root;
    }
}
