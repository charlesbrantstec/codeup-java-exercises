

public class Person {
    private String name;


    public static void main (String[] args){
//        Person john = new Person();
//        john.name = "John";
//        Person john1 = new Person();
//        john1.name = "John";
//        System.out.println(john.getName().equals(john1.getName()));

//        System.out.println(john == john1);
//        Person person1 = new Person();
//        person1.name = "John";
//        Person person2 = person1;
//        System.out.println(person1 == person2);
//
//        Person person1 = new Person();
//        person1.name = "John";
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    }

    public String getName(){
//TODO: return the person's name
        return name;
    }
    public void setName(String name){
//TODO: change the name property to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello, " + name);
    }



}
