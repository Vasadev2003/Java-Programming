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


class PlayingMusic{

    public void playMusic(){
      System.out.println("Music Is Playing");
    }
    
    public String phone(int amount){
       /* if(amount >= 50000){
        return "Yeah..You Got The Phone";
       }
       else{
        return "Sorry ...You did'nt have the correct amount to buy the phone";
       } */

       if(amount >= 50000)
        return "Yeah You Got The Phone";

        return "Sorry";
    }

}

public class Hello{
  public static void main(String a[]){
      PlayingMusic music = new PlayingMusic();
      music.playMusic();
      String phone = music.phone(5000);
      System.out.println(phone);
      
  }
}







