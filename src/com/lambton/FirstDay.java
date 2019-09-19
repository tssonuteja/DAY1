package com.lambton;

public class FirstDay {
  public static void main(String[] args)
  {
      System.out.println("saiteja");
      //Variable declaration
      int a,b,c;
      //Value assignment
      a=2;
      b=3;

      c=a+b;
      System.out.println("sum : "+c);
      int x= Integer.MAX_VALUE;
      System.out.println("x : "+x);

      int y=x+1;
      System.out.println(y);

      System.out.println("MIN : "+Integer.MIN_VALUE);

      SaiTeja s1 =new SaiTeja();
      s1.setValues();
      s1.display();


       for(int i=1;i<10;i++)
       {
           System.out.println("SAITEJA");
       }

  }
}
