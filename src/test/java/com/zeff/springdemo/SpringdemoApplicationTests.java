package com.zeff.springdemo;

import com.zeff.springdemo.combinations.Combinations;
import com.zeff.springdemo.linked.LinkedListCreator;
import com.zeff.springdemo.linked.LinkedListReverse;
import com.zeff.springdemo.linked.Node;
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

        Node.printLinked(LinkedListCreator.createLinkedList(Arrays.asList(1)));
        Node.printLinked( LinkedListReverse.reverse(LinkedListCreator.createLinkedList(Arrays.asList(1))));

        Node.printLinked(LinkedListCreator.createLinkedList(new ArrayList<>()));
        Node.printLinked( LinkedListReverse.reverse(LinkedListCreator.createLinkedList(new ArrayList<>())));


    }


    @Test
    public void testCombination() {
//        Combinations.combinations(new ArrayList<>(),Arrays.asList(1,2,3),2);
        Combinations.combinations(new ArrayList<>(),Arrays.asList(1,2,3,4,5),3);
    }
}

