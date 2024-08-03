# ARRAYS  `3240a8`
## this file have all array basic problem even advance
### In basic
 - ##### how we create a aaray and how print
 - ##### how perform verius operation like
     - basic sorting a array
     - reverce arrray
     - find max and min value in array
     - and some operation
  ### in advance
   - ##### advance sorting technique
   - ##### advance problem
  #                                     Start Now

  ###### Create an array in java
   ```java
    int arr[] = new int[6]
   ```
 - note 6 is length of array by default all value is zero
##### how we can access data from the array
 - first iterate all data through help of loop(for , while, do while
   ```java
   int arr[] = new int[6]
   for(int i=0; i<arr.length; i++){
       System.out.println(arr[i];
   }
   ```
   ##### How can we take input from the user
   ```java
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter size of element:");
   int size = sc.nextInt();
   int arr[] = new int[size]; // by default value is zero in java
   for(int i=0; i<arr.length; i++){
      System.out.println("Enter your "+i+1+" element: ");
      arr[i] = sc.nextInt();
   }
   ```
   ##### Arrays function argument
    - In array function argument have no concept of coll by value
    - It have concept of call by reference
       - call by referece means we pass address of array which means we pass original array, we can perform
         reverce of array , sort of array without extra memory use
