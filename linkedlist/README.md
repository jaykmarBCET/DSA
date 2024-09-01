# LinkedList Implementation
===========================

## Description
---------------

This is a Java implementation of a singly linked list, providing various operations for manipulating and traversing the list.

## Features
------------

* **Add**: Add elements to the list at the beginning, end, or at a specific position.
* **Remove**: Remove elements from the list at the beginning, end, or at a specific position.
* **Search**: Search for an element in the list.
* **Reverse**: Reverse the order of the list.
* **Set**: Set the value of an element at a specific position.
* **Find Mid**: Find the middle element of the list.
* **View**: Print the contents of the list.

## Implementation
-----------------

The implementation uses a Node class to represent individual elements in the list, with each node containing an integer value and a reference to the next node. The LinkedList class provides methods for manipulating and traversing the list.

## Code
-----

```java
public class LinkedList {
    // Node class
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // LinkedList class
    Node head = null;
    Node tail = null;
    int size = 0;

    // Methods for adding, removing, searching, reversing, setting, and finding mid
    // ...
}
````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````
# Circular Linked List Implementation
===========================

## Description
---------------

This is a Java implementation of a circular linked list, providing various operations for manipulating and traversing the list.

## Features
------------

* **Add**: Add elements to the list at the beginning, end, or at a specific position.
* **Remove**: Remove elements from the list at the beginning, end, or at a specific position.
* **View**: Print the contents of the list.

## Implementation
-----------------

The implementation uses a Node class to represent individual elements in the list, with each node containing an integer value and a reference to the next node. The CircularLL class provides methods for manipulating and traversing the list.

## Code
-----

```java
package linkedlist;

class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        next = null;
    }
}

public class CircularLL {
    private int size = 0;
    private Node head = null;
    private Node tail = null;

    // Methods for adding, removing, and viewing the list
    // ...
}
