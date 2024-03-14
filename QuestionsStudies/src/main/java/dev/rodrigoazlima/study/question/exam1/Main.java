package dev.rodrigoazlima.study.question.exam1;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        callQuestion1();

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Question 1");
        System.out.printf("Question 1");

    }

    // Techinical interview
    public static void callQuestion1() {
        System.out.println("Question 1 - leastOfNumbers");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        Integer least = numbers.stream()
                .min(Integer::compareTo)
                .orElseThrow();
        System.out.println("Result:" + least);
    }


    public static void callQuestion2() {
    }

    public static void callQuestion3() {
    }

    public static void callQuestion4() {
    }

    public static void callQuestion5() {
    }

    public static void callQuestion6() {
    }

    public static void callQuestion7() {
    }

    /*
// Least of numbers

List<Integer> numbers = new ArrayList<>();
numbers.add(1);
numbers.add(2);
numbers.add(3);
numbers.add(4);
numbers.add(5);

// Average
Integer total = numbers.stream()
  .mapToInt(Integer::intValue)
  .sum();


// Interface
public interface TestInterface {
	void test1();
	default void test2();
	static void test3();
	private void test4();
}

// Map Interface
LinkedHashMap

Whats the complexity of search on a...
HashMap?
// O(1)

TreeMap? (?)
// O(n)

// Thread Safe Collecitons
ArrayList.stream().parallelStream() // maybe typo

Other tham this i do not know
SynchronizedHashMap (no locks)
ConcurrentHashMap
Vector
HashTable
CopyOnWriteArrayList
CopyOnWriteArraySet
Stack
Collections.synchronizedCollection(Collection<T> c)
// Finished

Project
No information
Project manager

Good he likes working
Dependts on projects
Finance outsource




*/
}