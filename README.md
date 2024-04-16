# Java Programming With Telusko

1.Setup the Environment
2.started with variables and its behaviour

# Variables and Data Types

1.The thing that suprised me is the string that can be treated as an integer

# Switch Case

1.Completed the switch case with the respected example

# Methods And Objects

1.Completed the basic foundation for the methods and objects in java 
*class Calculator{

   public int sub(int num1,int num2){
    int result = num1-num2;
    return result;
  }
}
that the public keyword in the method is optional 

# Some keyword meaning

 public static void main(String a[])

 void keyword:

   it is used when the coder is doesn't expect any return value from the method


# Method Overloading

   class Calculator{

   public int add(int num1,int num2){
        int cal = num1+num2;
        return cal;
   }                                      //this is called method overloading that we can have the same method name but with different arguments and parameters we can do it this is called method overloading

   public int add(int num1,int num2,int num3){
       int res = num1+num2+num3;
       return res;
   }
   }

# Stack and heap memory

# please learn stack and heap memory in java clearly in any other channel 
# learn jagged array properly with some other video


# String buffer and String Buffer

Strings are immutable only the reference will change while you change the value of the variable

String buffer will allow you change the variable as well and also to perform more operations

The single difference between the String buffer and the String Builder is that String buffer is thread safe anf the String Builder is not thread safe

# Static key word is used to create a static varialble that is shared among all the objects and not instance variable and is class component not a object component so it is called staticaly with class like Employer.name not emp.name;
class Employer{
 
   int age;
  static String name;
   String pos;

   public void print(){
    System.out.println(name + " " + age + " " + pos);
   }

}

public class Hello{
  public static void main(String a[]){

     Employer emp = new Employer();
     Employer.name = "Vasanth";
     emp.age = 25;
     emp.pos = "Frontend Dev";

     Employer emp2 = new Employer();
     Employer.name = "Jasvanth";
     emp2.age = 25;
     emp2.pos = "Ui Dev";

     Employer emp3 = new Employer();
     Employer.name = "Vikram";
     emp3.age = 25;
     emp3.pos = "Backend Dev";
  
    Employer.name = "sharukhan";
     emp.print();
     emp2.print();
     emp3.print();

  }
}




# learn static methods from a another clear video





# Inheritance that in a constructor the super kewy word plays a major role
# defaulty all the classes in the java extends to a object 
# default java the every constructor has the super() class which call the its super class

class A{

    public A(){
      System.out.println("in A");
    }

    public A(int n){
      System.out.println("in int A");
    }


}

class B extends A{
    
    public B(){
      System.out.println("in B");
    }

    public B(int a){
      
      this();
      
      System.out.println("IN INT B");
    }
}

public class Hello{
  public static void main(String[]args){
    
   B stud = new B(8);



  }
}  
*****this() === this keyword is called to execute the constructor that is in the same class


# Object creator shortcut  

instead of doing this like

Student =  new Student();

we can also rewrite the above statement like

new Student() // like this also we can initialize a object

# inheritance

# java does not support multiple inheritance
# refer the commit multiple inheritance

# method overiding is nothing but it has same name and same arguments and the operation ius different
# refer the commit method overide

# refer a channel for public ,private,protected ,default kewword explnation

# learned clearly the polymorphism and how it works at different suitation so will to see see at the commit of polymorphism

# final key word

final key word used in Class,Methods,asa well as variables

when you think a particular thing is constant and no one should overide or inherit or change the value you can add the final keyword before the method,class,or varialbel



# read further about object hascode and how it compares with the other object

# UPCASTING AND DOWN CASTING REFERENCE THE COMMIT UPCAS AND DOWN CAST


# Abstract class

*this nothing but that the method is declared when it is unknown and initialized in a new lass while known and using the abstract 

*using the abstract methosd inside a abstract class is not compulsory

*we cannot create a onbect with the abstract class

*we can only create the object with the all the abstract methods are initialized in a different class

*refer the commit abstract







# Inner class

*inner class refer the commit inner class


# interface and implements

* they are basicaly static and final
* the variables are static and final

* we can also impements two more methods with interface


# how to inherit from the class and interface 


class => class = "extends"
class => interface = "implements"
interface => interface = "extends"



# enum with if else and switch check the commit enum,enum with if else,and enum with switch


*// read more about the behaviour of enum class in clearly



# Annotations

@Override is useful while overiding a method it show error if any problem or mistake in the overiding