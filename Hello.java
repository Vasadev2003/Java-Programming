/* class Hello 
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


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
  * Hello
  */
  /* interface A {
 
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
} */

// Enum
/* 
enum Status{

  running,pending,sucess,fulfilled

}

public class Hello{
  public static void main(String a[]){
    
      Status st[] = Status.values();   
    
      for(Status ss : st){
          System.out.println(ss+" "+ss.ordinal());
      }
  }
}

 */

// ENUM WITH IF ELSE AND SWTICH


/* enum Status{
  Running,Pending,Success,Fulfilled
}

public class Hello{
  public static void main(String args[]){
    
       Status st = Status.Pending;

      if(st == Status.Running){
            System.out.println("It's Running");
      }
      else if(st == Status.Pending){
        System.out.println("it is pending");
      }
      
      else if(st == Status.Success){
        System.out.println("it is sucess");
      }

      else if(st == Status.Fulfilled){
        System.out.println("it is fullfilled");
      }

  }
} */

/* enum Status{
  Success,Pending,Fulfilled,Running
}

public class Hello{
  public static void main(String args[]){
   
      Status st = Status.Success;

      switch(st){
        case Running:
          System.out.println("It is running");
          break;

        case Success:
          System.out.println("It is Sucess");
          break;

        case Pending:
          System.out.println("It is pending");
          break;

        case Fulfilled:
          System.out.println("It is Fullfilled");
          break;

        default:
        System.out.println("please wait....");
      }
  }
} */

// Enum class

/* enum Laptop{
      
   Macbook(50000),Hp(600000),PcDocPc(70000);

   private int price;

   private Laptop(int price){
       this.price = price;
   }

  
}

public class Hello{

  public static void main(String a[]){

       for(Laptop lap : Laptop.values()){
            System.out.println(lap);
       }
  }
} */

//Annotations

/* class A{
    
    public void show(){
      System.out.println("This is from class A");
    }

}

class B extends A{
      @Override
      public void show(){
        System.out.println("this is from B OVERIDED");
      }
}

public class Hello{
  public static void main(String a[]){
    B be = new B();
    be.show();
  }
} */


// Funtional interface with lamba expression

/* interface A{
      void show();
}

class B implements A{
  public void show(){
    System.out.println("Priting A...normal method");
  }
}

public class Hello{
    public static void main(String a[]){
      A clas = new B();
      clas.show();
    }
} */

//Functional interface with inner class method
/* @FunctionalInterface
interface A{
  void show();

}

public class Hello{
  public static void main(String a[]){
     A ne = new A(){
      public void show(){
        System.out.println("This is inner class");
      }
     };
     ne.show();
  }
} */

// Functional interface with lambda expression 

/* @FunctionalInterface
interface A{
  int show(int num1,int num2);
}

public class Hello{
  public static void main(String args[]){
    
      A show = () -> System.out.println("Hai from lambda");
       show.show();
     
      A show = (num1,num2) ->{
        return num1+num2;
      };

      int ans = show.show(20, 30);
      System.out.println(ans);
 
      
  }
} */

// try Catch method

/*  public class Hello{
  public static void main(String a[]){
    
       int num1 = 0;
       int num2 = 20;
       try{
        int ope = num2/num1;
        System.out.println(ope);
       }
       catch(Exception E){
         System.out.println("Error happened");
       }
       

    
       System.out.println("This is next line");
  }
 } */

 //advance try catch method

 /*public class Hello{
  public static void main(String a[]){
       
       int i =20;
       int j = 0;
       String s = "vasanth";
       int num[] = new int[5];

       

       try{
         j = 18/i;
         s.length();
         System.out.println(num[5]);
         
        }

        catch(ArithmeticException e){
          System.out.println("cannot divide a numbe rwith zero");
        }

       

        catch(ArrayIndexOutOfBoundsException e){
          System.out.println("Array with limit"+e);
        }

        catch(Exception e){
          System.out.println("Something went wrong "+ e);
        }
        System.out.println(j);
        System.out.println("remaing else");


  }
 }*/


 /* public class Hello{
  public static void main(String a[]){

        int i = 5;
        int j = 0;

        try{
          j = 18/20;
          if(j == 0){
            throw new ArithmeticException("iam expection");
          }
        }
        catch(ArithmeticException e){
          System.out.println("This is arithmetic erro"+e);
        }

  }
 } */


 /* public class Hello{
  public static void main(String a[]) throws IOException,NumberFormatException{
    BufferedReader br =null;
       
       try{
        InputStreamReader in = new InputStreamReader(System.in);
          br = new BufferedReader(in);
         int num = Integer.parseInt(br.readLine());
         System.out.println(num);
       }
       
       

       finally{

        br.close();


       }

       
  }
 } */

//Threads 
// used divide a task into different threads and allow to run parallel 

/* class A extends Thread {

    public void run(){
      for(int i = 0;i<=100;i++){
        System.out.println("Hi from A");
      }
    }
}

class B extends Thread{
  public void run(){
    for(int i = 0; i <= 100; i++){
        System.out.println("Hi from B");
    }
  }
}

public class Hello{
  public static void main(String a[]){

      A ae = new A();
      B be = new B();
      ae.start();
      be.start();


  }
} */


// Thread with sleep and priorty

/* class A extends Thread{
   public void run(){
     for(int i = 0; i <= 100 ; i++){
      System.out.println("hello from A");
      try{
      Thread.sleep(10);
      }
      catch (Exception E){
        System.out.println("Something went rong");
      }
      
     }
   }
}

class B extends Thread{
   public void run(){
     for(int i = 0; i <= 100 ; i++){
      System.out.println("hi from B");
       try{
      Thread.sleep(10);
      }
      catch (Exception E){
        System.out.println("Something went rong");
      }
      
     }
   }
}

public class Hello{
  public static void main(String args[]){

        A ae =new A();
        B be = new B();
        
        ae.start();
        be.start();
  }
}
 */


 // Thread with Runnable class 

/*  class A implements Runnable{
    
    public void run(){
       for(int i = 0; i<=5; i++){
        System.out.println("Hi from A");
       }
    }

 }

 class B implements Runnable{
    public void run(){
       for(int i = 0; i <= 5; i++){
        System.out.println("Hi from B");
       }
    }
 }

public class Hello{
  public static void main(String a[]){

       Runnable ae = new A();
       Runnable be = new B();
       Thread th1 = new Thread(ae);
       Thread th2 = new Thread(be);
       th1.start();
       th2.start();
  }
}
 */





 // Runnable with lambda expression


 /* public class Hello{
  public static void main(String a[]){

      Runnable ae =() -> {
        for(int i=0;i<=5;i++){
          System.out.println("Hi from ae");
        }
      };
      
      Runnable be = () -> {
        for(int i=0;i<=5;i++){
          System.out.println("Hi from be");
        }
      };

      Thread a1 = new Thread(ae);
      Thread b1 = new Thread(be);

      a1.start();
      b1.start();

  }
 } */

 // Collection

/* public class Hello{
  public static void main(String a[]){

      Collection <Integer>arr = new ArrayList<Integer>();

      arr.add(0);
      arr.add(1);
      arr.add(3);
      arr.add(5);

      for(int num : arr){
        System.out.println(num);
      }


        
  }
}


 */
// List
 /* public class Hello{
  public static void main(String a[]){

      List <Integer>arr = new ArrayList<Integer>();

      arr.add(0);
      arr.add(1);
      arr.add(3);
      arr.add(5);

      for(int num : arr){
        System.out.println(num);
        
      }

       System.out.println(arr.get(3));
       arr.remove(2);

       for(int num : arr){
        System.out.println(num);
        
      }


        
  }
} */


// when you want to avoid duplicate values
// Set


/* public class Hello{
  public static void main(String args[]){

      Set <Integer> arr = new HashSet<Integer>();

      arr.add(5);
      arr.add(5);
      arr.add(5);
      arr.add(5);
      arr.add(5);

      for(int num : arr){
        System.out.println(num);
      }
      

  }
}
 */

/*  // Tree set when you wnat in sequence and order
public class Hello{
  public static void main(String args[]){

      Set <Integer> arr = new TreeSet<Integer>();

      arr.add(5);
      arr.add(90);
      arr.add(20);
      arr.add(10);
      arr.add(5);

      for(int num : arr){
        System.out.println(num);
      } 
      



  }
}

 */

//MAP
/*  public class Hello{
  public static void main(String args[]){

        Map <String,Integer> ma = new HashMap<>();

        ma.put("Vasanth",85);
        ma.put("Sevanthi",95);
        ma.put("Devi",98);
        ma.put("Pugazhenthi",85);

        System.out.println(ma);

        
     for(String k : ma.keySet()){
            System.out.println(k + " "+ ma.get(k));
     }

  }
 } */

/*  public class Hello{
  public static void main(String args[]){


       Comparator <Integer>comp = new Comparator<>() {
            public int compare(Integer i,Integer j){
                  if(i%10 > j%10){
                    return 1;
                  }
                  else{
                    return -1;
                  }
            }
       };

        List <Integer>array = new ArrayList<>();

        array.add(55);
        array.add(68);
        array.add(72);
        array.add(88);

        Collections.sort(array,comp);
        System.out.println(array);
             
  }} 
 */

 //Comparator with string

/*   public class Hello{
    public static void main(String a[]){
        
        Comparator <String> comp = (String i,String j) -> {
             if(i.length()>j.length()){
              return 1;
             }
             else{
              return -1;
             }
        };

         List<String> name = new ArrayList<>();
         name.add("sss");
         name.add("Vikaram");
         name.add("pugazhenthi");
         name.add("devi");
         name.add("s");

         Collections.sort(name,comp);
         System.out.println(name);


    }
  }  */

  class Student{

     int age;
     String name;

     public Student(int age,String name){
       this.age = age;
       this.name = name;
     }
  }


  public class Hello{
    public static void main(String a[]){

      Comparator<Student>com = (Student i,Student j) -> (i.age > j.age)? 1:-1;
        List <Student> std  = new ArrayList<>();
        std.add(new Student(18, "vasanth"));
        std.add(new Student(22, "vikram"));
        std.add(new Student(58, "vasu"));
        std.add(new Student(85, "vendan"));
        std.add(new Student(90, "erropr"));
      
       Collections.sort(std,com);
          
        for(Student st : std){
          System.out.println(st.age+" "+st.name);
        }
        
    }
  }