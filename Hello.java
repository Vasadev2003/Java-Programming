/*  class Hello 
 {
    public static void main(String a[]) 
    {
        int num1 = 10;
        int num2 = 20;
        int ans = num1+num2;

        System.out.print("Sum of is "+ans);

        // Literals this some thing fishy that the charater is treated as an integer and we can perform actions on it 

        char name = 'v';
        System.out.println(++name);

        //Type conversion and Casting

        int num3 = 50;
        float num = 12.5f;
        int change = (int)num;
        float change2 = (float)num3;
        System.out.println(change);
        System.out.println(change2); 

        // pre increment and post increment 

        int num1 = 8;
         int post = num1++; 
        int pre = num1++;
        System.out.println(post); 
        System.out.println(pre);
    }
}



 */


//SWITCH CASE


/* 
public class Hello {
  public static void main(String a[]){
    //switch case

    int num = 36;

    switch(num){
      case 1:
        System.out.println("January");
        break;
      case 2 :
        System.out.println("February");
        break;
      default :
      System.out.println("nothing");
    
    }
   
  }
} */

// METHODS AND OBJECTS

/* class Calculator{

   public int sub(int num1,int num2){
    int result = num1-num2;
    return result;
  }
}

public class Hello{
  public static void main(String a[]){
    int num1 = 10;
    int num2 = 220;

    Calculator calc = new Calculator();
    int result = calc.sub(num1,num2);
    System.out.println(result);
  }
}
 */


/* class PlayingMusic{

    public void playMusic(){
      System.out.println("Music Is Playing");
    }
    
    public String phone(int amount){ */
       /* if(amount >= 50000){
        return "Yeah..You Got The Phone";
       }
       else{
        return "Sorry ...You did'nt have the correct amount to buy the phone";
       } */

    /*    if(amount >= 50000)
        return "Yeah You Got The Phone";

        return "Sorry";
    }

}
 */
/* public class Hello{
  public static void main(String a[]){
      PlayingMusic music = new PlayingMusic();
      music.playMusic();
      String phone = music.phone(5000);
      System.out.println(phone);
      
  }
}
 */

/* class Calculator{

   public int add(int num1,int num2){
        int cal = num1+num2;
        return cal;
   }                                      //this is called method overloading that we can have the same method name but with different arguments and parameters we can do it this is called method overloading

   public int add(int num1,int num2,int num3){
       int res = num1+num2+num3;
       return res;
   }

}



public class Hello{
  public static void main(String a[]){
    int num1 = 10;
    int num2 = 20;
    int num3 = 30;
   
  Calculator calc = new Calculator();
  int result = calc.add(num1,num2,num3);
  System.out.println(result);

  }
}
 */

// Array

/* 
public class Hello{
  public static void main(String a[]){

    int array[] = new int[6];
    array[0] = 5;
    array[1] = 6;
    array[2] = 5;
    array[3] = 6;
    array[4] = 5;
    array[5] = 6;
    
    for(int i=0;i<=5;i++){
      System.out.println(array[i]);
    }


  }
}
 */

/* 
public class Hello{
  public static void main(String a[]){

      int array[][]= new int[5][6];

      int random = (int) (Math.random()*100);
      
      for(int i = 0; i<5 ; i++){
          
          for(int j = 0; j<6 ;j++){
            array[i][j] = random;
          }

      }
  
      for(int i = 0;i<5;i++){
        for(int j = 0; j<6 ; j++){
          System.out.print(array[i][j] + " ");
        }
        System.out.println();
      }
      // enhanced for loop

for(int n[]:array)
{
    for(int m: n){
      System.out.print(m + " ");
    }

    System.out.println();
}
     

  }
  
}
 */



/* 
 class Student{

    int mark;
    String name;


 }
 */
 /*  public class Hello{ 
  public static void main(String a[]){


    Student s1 = new Student();
    s1.name = "Vasanth";
    s1.mark = 85;

    Student s2 =new Student();
    s2.name = "Vikram";
    s2.mark = 85;

    Student s3 = new Student();
    s3.name = "ramji";
    s3.mark = 85;

    Student person[] = new Student[3];

    person[0] = s1;
    person[1] = s2;
    person[2] = s3;

    for(Student stud : person){
      System.out.println(stud.name + ":" +stud.mark);
    }

  }
 } */


 // String Buffer And String Builder

/* 
 public class Hello{
  public static void main(String a[]){

     String name =  new String("vasanth"); 
    System.out.println(name.length()); 


    StringBuffer sb = new StringBuffer("vasanth");
    System.out.println(sb.capacity());


  }
 }
 */



//STATIC KEY WORD
/* 
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

 */


 /* class Student{

     int rollNo;
     static String name;

     public Student(){
       rollNo = 58;
       System.out.println("Iam Constructor");
     }

     static{
      name = "vasanth";
      System.out.println("Iam Static");
     }

     public void print(){
      System.out.println(name+":"+rollNo);
    
     }

 }


public class Hello {
  public static void main(String a[]){

    Student stud = new Student();
    Student.name =  "vasanth";
    stud.rollNo = 85;

    Student stud2 = new Student();

    stud.print();
    
   
  }
}
 */

//Encapsulation

//Getter and Setters

/* 
class Family{

    private String wife;
    private int salary;
    private int countOfamily;

    //getter

    public void getFamily(){
      System.out.println(wife + " "+salary+" "+countOfamily);

    }

    public void setFamily(String wife,int salary,int countOfamily){
      this.wife = wife;
      this.salary = salary;
      this.countOfamily = countOfamily;

    }
    

  
  }


public class Hello {
  public static void main(String a[]){


    Family fam = new Family();
    fam.setFamily("abinaya", 8500000, 4);
    fam.getFamily();

  }
}

 */


 //CONSTRUCTORS AND THIS

/* 
 class Student{

   private int no;
   private String name;
   

   public Student(){
       no = 20;
       name = "vasanth";
   }

   public void setStudent(int no,String name){
       this.no = no;
       this.name = name;
   }
  
   public void getStudent(){
    System.out.println(name+" "+no);
   }


 }

 public class Hello{
  public static void main(String a[]){
       
      Student stud = new Student();
      stud.setStudent(20, "vikram");
       stud.getStudent();
      
    

  }
 } */


// Inheritance

/* class A{

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






 */


 // basic calculator
//Multiple Inheritance
/*  class Calculator1{
    
      public int add(int n1,int n2){
        return n1+n2;
      }

      public int sub(int n1,int n2){
        return n1-n2;
      }

 }


 class Calculator2 extends Calculator1{
   public int mul(int n1,int n2){
    return n1*n2;
   }
   public int div(int n1,int n2){
    return n1/n2;
   }
 }

 class AdvCal extends Calculator2{
  public int mod(int n1,int n2){
        return n1%n2;
  }

  public int pow(int n1,int n2){
    return (int)Math.pow(n1,n2);
  }
 }

public class Hello{
  public static void main(String a[]){

      AdvCal cal = new AdvCal();
      System.out.println(cal.add(5,8));
      System.out.println(cal.sub(8,9));
      System.out.println(cal.mul(8,9));
      System.out.println(cal.div(10,8));
      System.out.println(cal.pow(8,9));

  }
}


 */
// Method Overiding

 /* class Calc{

    public int add(int num1 ,int num2){
       return num1+num2;
    }
 }

 class Calc2 extends Calc{
    public int add(int num1,int num2){
      return num1+num2+1;
    }
 }

 public class Hello{
  public static void main(String a[]){
 
      Calc2 cal = new Calc2();
      int r = cal.add(2,5);
      System.out.println(r);


  }
 } */ 

 //packages

/* import numbers.*;

 public class Hello{
  public static void main(String a[]){
  
    first num = new first();
    System.out.println(num.add(2,6));
        
  }
 } */

 // Polymorphism 

  // it is defined that it behaves differently to the suitation
  // there are two types run time polymorphism and compile time polymorphish


 /* class A{
  public void show(){
    System.out.println("this is from A");
  }
 }

 class B extends A{
  public void show(){
    System.out.println("this is from B");
  }

 }

 class C extends A{

    public void show(){
      System.out.println("this is from c");
    }
 }

  public class Hello{
    public static void main(String a[]){

        A stud = new B();
        stud.show();

        stud = new C();
        stud.show();


    }
  } */


/*   class A{
 
     public void show(){
      System.out.println("this is from A");
     }


    
  }

  class B extends A{
 
      public void show1(){
        System.out.println("this is from b");
      }
  }

  public class Hello{
    public static void main(String a[]){
      
      A stud = new B();
      stud.show();

      B stud1 = (B)stud;
      stud1.show1();

    }
  } */

  // Abstract class


/* abstract class Car{
  
    abstract public void drive();

    public void song(){
      System.out.println("playing music..");
    }

 }

 class BMW extends Car{

    public void drive(){
      System.out.println("Driving...");
    }

 }
  public class Hello{
    public static void main(String a[]){
  

       BMW car = new BMW();
       car.drive();
       car.song();

    }
  } */


  // inner class

  /* class A{
 
     public void print(){
      System.out.println("iam a in the class A");
     }

    static class B{
      public void print1(){
        System.out.println("Iam inner class");
      }
    }

  }

public class Hello{
  public static void main(String a[]){

      A parent = new A();
      parent.print();

      A.B inner = new A.B();
      inner.print1();

  }
}
 */


 // Inner class Anonymous inner Class
 /* class A{

  public void run(){
    System.out.println("vasanth is running");
  }  

}
public class Hello{
  public static void main(String a[]){
     
       A vasa = new A()
       {

          public void run(){
            System.out.println("Ram is running");
          }

       };

       vasa.run();
       

  }
}

 */


// Anonymus inner class with abstract class

/* abstract class A{

   public abstract void pushUp();
   public abstract void pullUp();

}


public class Hello{
  public static void main(String a[]){

       A abclass = new A()
       {
        public void pushUp(){
          System.out.println("Do hundered push ups");
        }
        public void pullUp(){
          System.out.println("Do hundred Pull up");
        }
       };
     
       abclass.pushUp();
       abclass.pullUp();
  }
}
 */

 // interface

 /**
  * Hello
  */
  interface A {
 
    void run();
    void sleep();  



 } 

 interface Be{

  void pushUp();
 }

 class B implements A,Be{
   
    public void run(){
      System.out.println("it is running");

    }

    public void sleep(){
      System.out.println("Sleep 8 hours a day");
    }

    public void pushUp(){
      System.out.println("push up is going on");
    }

 }



public class Hello{
  public static void main(String a[]){
    
     B stud = new B();
     stud.run();
     stud.sleep();
     stud.pushUp();
    



     
  }
}













