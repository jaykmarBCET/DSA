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
`````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````
# Doubly Linked List Implementation
===========================

## Description
---------------

This is a Java implementation of a doubly linked list, providing various operations for manipulating and traversing the list.

## Features
------------

* **Add**: Add elements to the list at the beginning, end, or at a specific position.
* **Remove**: Remove elements from the list at the beginning, end, or at a specific position.
* **View**: Print the contents of the list.
* **View Reverse**: Print the contents of the list in reverse order.

## Implementation
-----------------

The implementation uses a Node class to represent individual elements in the list, with each node containing an integer value and references to the next and previous nodes. The DoublyLL class provides methods for manipulating and traversing the list.

## Code
-----

```java
package linkedlist;

public class DoublyLL {
    class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data) {
            this.next = null;
            this.prev = null;
            this.data = data;
        }
    }

    private Node head = null;
    private Node tail = null;
    int size = 0;

    // Methods for adding, removing, and viewing the list
    // ...
}
``````````````````````````````````````````````````````````````````````````````````````````````````````````````````

# Doubly Circular Linked List Implementation
===========================

## Description
---------------

This is a Java implementation of a doubly circular linked list, providing various operations for manipulating and traversing the list.

## Features
------------

* **Add**: Add elements to the list at the beginning, end, or at a specific position.
* **Remove**: Remove elements from the list at the beginning, end, or at a specific position.
* **View**: Print the contents of the list.

## Implementation
-----------------

The implementation uses a Node class to represent individual elements in the list, with each node containing an integer value and references to the next and previous nodes. The DoublyCircular class provides methods for manipulating and traversing the list.

## Code
-----

```java
package linkedlist;

public class DoublyCircular {
    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node tail = null;
    int size = 0;

    // Methods for adding, removing, and viewing the list
    // ...
}
