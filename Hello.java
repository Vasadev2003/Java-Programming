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


































