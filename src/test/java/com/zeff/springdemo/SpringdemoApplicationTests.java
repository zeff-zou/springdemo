package com.zeff.springdemo;

import com.zeff.springdemo.binary.BinarySearch;
import com.zeff.springdemo.combinations.Combinations;
import com.zeff.springdemo.consistenthash.TreeMapConsistentHash;
import com.zeff.springdemo.linked.LinkedListCreator;
import com.zeff.springdemo.linked.LinkedListDelete;
import com.zeff.springdemo.linked.LinkedListReverse;
import com.zeff.springdemo.linked.Node;
import com.zeff.springdemo.tree.TreeNode;
import com.zeff.springdemo.tree.TreeTraversal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringdemoApplicationTests {

	@Test
	public void contextLoads() {
        Node.printLinked(LinkedListCreator.createLinkedList(Arrays.asList(1, 2, 3, 4, 5, 6)));
        Node.printLinked(LinkedListReverse.reverse(LinkedListCreator.createLinkedList(Arrays.asList(1, 2, 3, 4, 5, 6))));
        Node.printLinked(LinkedListReverse.loopReverse(LinkedListCreator.createLinkedList(Arrays.asList(1, 2, 3, 4, 5, 6))));
        Node.printLinked(LinkedListDelete.delete(LinkedListCreator.createLinkedList(Arrays.asList(2,1, 2, 3, 2,4,2, 5,2, 6,2)),2));

        Node.printLinked(LinkedListCreator.createLinkedList(Arrays.asList(1)));
        Node.printLinked( LinkedListReverse.reverse(LinkedListCreator.createLinkedList(Arrays.asList(1))));

        Node.printLinked(LinkedListCreator.createLinkedList(new ArrayList<>()));
        Node.printLinked( LinkedListReverse.reverse(LinkedListCreator.createLinkedList(new ArrayList<>())));


    }

    @Test
    public void testCombination() {
        Combinations.combinations(new ArrayList<>(),Arrays.asList(1,2,3),2);
        Combinations.combinations(new ArrayList<>(),Arrays.asList(1,2,3,4,5),3);
    }

    @Test
    public void testBinary(){
        System.out.println(BinarySearch.search(new int[]{1,2,3,4,5,6},11));
        System.out.println(BinarySearch.search(new int[]{1,2,3,4,5,6},2));
        System.out.println(BinarySearch.search(new int[]{1,2,3,4,5,6},5));
    }

    @Test
    public void testTree(){
	    //初始化树
        TreeNode treeNode = new TreeNode("A");
        treeNode.setLeft(new TreeNode("B"));
        treeNode.getLeft().setLeft(new TreeNode("D"));
        treeNode.getLeft().setRight(new TreeNode("E"));
        treeNode.getLeft().getRight().setLeft(new TreeNode("G"));

        treeNode.setRight(new TreeNode("C"));
        treeNode.getRight().setRight(new TreeNode("F"));

        //前序遍历
        TreeTraversal.preOrder(treeNode);
        System.out.println(" ");
        //中序遍历
        TreeTraversal.inOrder(treeNode);
        System.out.println(" ");
        //后序遍历
        TreeTraversal.postOrder(treeNode);
        System.out.println(" ");

        TreeTraversal.createTree(Arrays.asList("A","B","D","E","G","C","F"),Arrays.asList("D","B","G","E","A","C","F"));
    }

    @Test
    public void  testConsistentHash(){
        ArrayList<String> arrayList = new ArrayList<String>(){{
            add("note1");
            add("note2");
            add("note3");
            add("note4");
            add("note5");
        }};

        TreeMapConsistentHash consistentHash = new TreeMapConsistentHash();
        arrayList.stream().forEach(note -> {
            consistentHash.addNode(note);
        });

        consistentHash.toNodeString();
        System.out.println(consistentHash.getNode("test1"));
        System.out.println(consistentHash.getNode("test2"));
        System.out.println(consistentHash.getNode("test3"));
        System.out.println(consistentHash.getNode("test4"));
        System.out.println(consistentHash.getNode("test5"));
        System.out.println(consistentHash.getNode("test6"));
        System.out.println(consistentHash.getNode("test7"));
    }
}

