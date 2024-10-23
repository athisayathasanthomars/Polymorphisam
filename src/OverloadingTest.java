class Dog{
    public void bark(){
        System.out.println("sniff ");
    }
    //overloading method
    public void bark(int num){
        for(int i=0; i<num; i++)
            System.out.println("woof ");
    }
}
public class OverloadingTest{
    public static void main(String [] args){
        Dog dog = new Dog();
        dog.bark();
    }
}
/*
class Dog{
    public void bark(){
        System.out.println("sniff ");
    }
    //overloading method
    public void bark(int num){
        for(int i=0; i<num; i++)
            System.out.println("woof ");
    }
}
public class OverridingTest{
    public static void main(String [] args){
        Dog dog = new Dog();
        dog.bark();
    }
}


 */

