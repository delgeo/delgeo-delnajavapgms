package com.example;

public class Sum {

    static int a = 10 ;
    static int b = 23 ;
    
    /*
    o declarative statement
    o this variable is in class level which is not inside method
    o Only class level variable have default values
    o int, byte, char will have default value of 0 and string has null
    o null is not void and null is a value, where void is nothing and no memory is allocated for void
    o string is an object
    o Everything in a Java is considered as object
    o byte, char, int, float, double etc are primitive datatype
    o we can even give values to the variables like int a = 10; int b = 5+2;
    o this cannot be an expression
    o unsigned int can also be declared [ unsigned int a = 10; ]
    o by default it is signed

    o if we don't specify the correct sized variable, then it will create some ambiguity as below:
    o eg: we declared a var of 8 bits, we need to store a var of 9 bits, 
    o then 8 bits will be stored as usual and 9th bit again starts to store in the same location.
    o so we won't get correct number.

    */
    

    public static int add(){ 

        //public int add(){ //This is a private method,only main needs to be public
        // This method was without static at first.
        // since we need static variable here as the main method is static, we add static in this line as above.
        
        int sum = a + b ; //executable statement

        // This is method level variable
        // This fnunction level variable should be defined at the time of declaration
        // Otherwise it will be junk
        // value of a+b will be stored in the memory location of the variable sum

        // This can also be written as
        /* int sum;
         * sum = a + b;
         * 
         * sum here will have junk value before giving the value in it.
         * so put values in it befor using it.
         */
        
        return sum ;
        
        // this method should return an integer value.

        // static variables can be used only in static functions, that's why it is static here.
        // a static function can call only static functions.
        // non-static means object

        // return can either be printed here or can be printed at the main()

    }

    public static void main(String[] args) { // psvm is the shortcut for this line
        
        // this line should be this, only this can be act as the main method
        // we can call the function as 'add();'
        // a static method can only create another static method/variable.
        // static cannot be created as an object
        // so instead of "public int add(){ ", we need to make it as:
        // public static int add(){
        // if a function/variable is Static means it is connected with the class and not connected with object, here Sum
        // plan of a house is class and created house is object
        // static cannot be created in object
        // if we give static for a variable, then no object will be created for that variable as below:
        // static int a = 20 ;
        // for primitive variables, memory location is created at the time we declare it.
        // Unlike these, we craete a memory location and put variables inside it in case of objects.
        // In objects, we can group variables for objects
        // we don't know where the primitive datatype variables are located, these are called stack variables.
        // except main(), we can create all the variables without static.
        // we use 'new' to craete objects.
        // if we use objects, then there will be a datatype called Sum will be created and variables a & b will be inside Sum.
        // Class can be used to create an object, this is called instantiation.
        // Each object will have all the variables and methods inside this
        // if a variable inside a class object is static, then that variable will be in the same memory location for all objects.
        // But in case of non- static variables, there will be a copy of all variables inside the object.
        // eg: for object1, there will be a1 and b1 for it. simillarly, for object2, there will be a2 and b2 in a diff memory location and so on.
        // static variables will not be inside the objects, it is in the class level and these variables will be pointed to the same memory locations.
        // these value can be changed for all objects if we change it inside an object.
        // 48 min

        // add();

        // it is best practise to give a max of 5 lines in a method and use this data to call another function and so on,
        // so that we can reduce complexity.
        // this is called divide and conquer.
        // An object is an instance of a class. 
        // A class is a template or blueprint from which objects are created. 
        // So, an object is the instance(result) of a class.

        System.out.println(add()); // sout is the shortcut for System.out.println();
        
    }

}

// Right-click -> 'Run Java' will print 33