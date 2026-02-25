//~ For loop using Star Pattern Question 

//! Formula:-  
            11 12 13 14 15
            21 22 23 24 25
            31 32 33 34 35
            41 42 43 44 45
            51 52 53 54 55
//! Code:-

/*

? Q1: - X like patter 
    
*       *
  *   *
    *
  *   *
*       *

logic -   if i==j or i+j==n-1 then print * else print space

*/

/*
?Q2: - Hollow Square Pattern

* * * * *
*       *
*       *
* * * * *
*****
logic - if i==1 or j==1 or i==n or j==n then print * else print space
*/



/*
! Number pattern  Question
   ~Pattern 1
    1 2 3 4 5 
    1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5
    1 2 3 4 5
    print(j)--- for 1,2,3,4,5 

    ~Pattern 2
    1 1 1 1 1 
    2 2 2 2 2
    3 3 3 3 3
    4 4 4 4 4
    5 5 5 5 5
     print(i)--- for 1,1,1,1,1--beacuse 1st of i=1; then goes to j loop (inner loop ) and its  rn 5 time and print 
               i value  like 1  5 time.
               
   ~Pattern 3
    1 2 3 4 5 
    6 7 8 9 10
    11 12 13 14 15
    16 17 18 19 20
    21 22 23 24 25
    take a Count varible count =1; and increment every time  then gives 1 to 25

    ~Pattern 4
    a b c d e 
    a b c d e
    a b c d e
    a b c d e
    a b c d e

   ~Pattern 5
    A A A A A
    B B B B B
    C C C C C
    D D D D D
    E E E E E


   ~Pattern 6
    A B C D E 
    F G H I J
    K L M N O
    P Q R S T
    U V W X Y
    ?Take char ch=A and innner loo[ print ch and increment ch++ then gives A to Y]

    ~Pattern 7
    z z z 
    y y y 
    x x x 

~Pattern 8
    1 0 1 0 1 
    0 1 0 1 0 
    1 0 1 0 1 
    0 1 0 1 0
    1 0 1 0 1

   ? odd position print 1 and even position print 0
   ? logic - if((i+j)%2==0) then print 1 else print 0

*  Pattern 9
    0 1 0 1 0 
    1 0 1 0 1 
    0 1 0 1 0 
    1 0 1 0 1 
    0 1 0 1 0 
*

*  Pattern 10
     1
     2 2
     3 3 3
     4 4 4 4
     5 5 5 5 5
*

*  Pattern 11
1  2  3  4  5  
1  2     4  5
1     3     5
1  2     4  5
1  2  3  4  5

?Logic --Make box +X ->       
                      !    if(i==1 ||j==1||i==5||j==5 || i+j==6)
*
*/
