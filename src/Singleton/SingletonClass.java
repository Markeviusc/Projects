//Java Singleton Pattern is one of the Gangs of Four Design patterns and comes in the Creational Design Pattern category
//Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists
package Singleton;

public class SingletonClass {

        private static SingletonClass instance; //Private static variable of the same class that is the only instance of the class.
        private String data;

    private SingletonClass(String data) { //Private constructor to restrict instantiation of the class from other classes.
        this.data = data;
    }

    public synchronized SingletonClass getInstance() { //Public method that returns the instance of the class, this is the global access point for the outer world to get the instance of the singleton class.
            if(instance == null) {
                instance = new SingletonClass("");
                System.out.println("Object created...!");
            } else {
                System.out.println("Object already exists.");
            }
            return instance;
        }
        public void message(String str) {
            System.out.println("Message function called, Hello"+str);
        }


    public static void main(String[] args) {
        System.out.println("Hello world!");
        SingletonClass obj = new SingletonClass("Look at what I made!");
        System.out.println(obj.data);
        obj.message(", how are you?");
        obj.getInstance(); // checking to see if Singleton object is created
        obj.getInstance(); //checking to see if getInstance method checks for object existence
    }

}