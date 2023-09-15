package _01_introduction_java.exerice;

import java.util.Scanner;

public class E2_ReadNumber {
    static String onenumber(int n)
    {
        String result =" ";
        switch (n)
        {
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            case 6:
                result = "six";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "eight";
                break;
            case 9:
                result = "nine";
                break;
            case 10:
                result = "ten";
                break;
        }
        return result;
    }
    static String twonumber(int n)
    {
        int m = n%10;
        int x = n/10;
        String result ="";
      if(n>=20)
      {

              switch (x){
                  case 6:
                  case 7:
                  case 9:
                      result= onenumber(x)+"ty";
                      break;
                  case 2:
                      result= "twenty ";
                      break;
                  case 3:
                      result= "thirty ";
                      break;
                  case 4:
                      result= "forty ";
                      break;
                  case 5:
                      result= "fifty ";
                      break;
                  case 8:
                      result= "eighty ";
                      break;
          }

      }else {
          switch (m)
          {
              case 1:
                  result = "eleven";
                  break;
              case 2:
                  result = "twelve";
                  break;
              case 4:
              case 6:
              case 7:
              case 9:
                  result = onenumber(m)+"teen";
                  break;
              case 8:
                  result = "eighteen";
                  break;
              case 3:
                  result = "thirteen";
                  break;
              case 5:
                  result = "fifteen";
                  break;

          }

      }
      if(x!=1&& m!=0)
      {
          result = result +" "+onenumber(m);
      }
      return result;
    }
    static String threenumber(int n)
    {
        String  result =" ";
        String x = n/10%10+""+ n%10;
        result = onenumber(n/10/10)+" hundred "+twonumber(Integer.parseInt(x));
       return result;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n  ;
        do{
            n=sc.nextInt();
            if(n>=0 && n<=10)
            {
                System.out.println( onenumber(n));
            }else if(n>10 && n<100)
            {
                System.out.println( twonumber(n));
            }else if(n>=100&&n<1000)
            {
                System.out.println(threenumber(n));
            }
            else {
                System.out.println("ban hay nhap so tu 0 den 999 :");
            }


        }while (n<0 || n>999);

    }
}
