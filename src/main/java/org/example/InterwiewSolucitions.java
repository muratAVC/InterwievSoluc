package org.example;

import javafx.print.Collation;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InterwiewSolucitions {


    public static String strReverse(String str){
        String result="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        return result;
    }
    public static String strReverse1(String str){
        String result="";
        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();
        result=stringBuilder.toString();

        return result;
    }
    public static String strReverse2(String str){
        String result="";
        //List<Character> chr=new ArrayList<>();
        char[] chr=str.toCharArray();
        for (int i = chr.length-1; i >=0 ; i--) {
            result+=chr[i];
        }
        return result;
    }

    public static boolean primeNumber(int a){
        if (a<=1) return false;
        for (int i = 2; i < Math.sqrt(a) ; i++) {
            if (a%i==0) return false;
        }
        return true;
    }

      public static boolean isPalindromeChar(String str){
        char[] chars=str.toCharArray();
        String result="";
        for (int i = chars.length-1; i >=0 ; i--) {
            result+=chars[i];
        }
        if (result.equals(str)) return true;

        return false;
    }

    public static String reverseString(String str1){
        StringBuilder result= new StringBuilder();
        char[] chars=str1.toCharArray();
        List<Character> str=new ArrayList<>();
        for (char aChar : chars) {
            str.add(aChar);
        }
        Collections.reverse(str);
        for (Character c: str) {
            result.append(c.toString());
        }
        return result.toString();
    }

    public static long factorial(int a){
        long result=1;
        for (int i = 1; i <=a ; i++) {
            result=result*i;
        }
        return result;
    }

    public static boolean isPalindrome(String str){
        boolean result=false;
            StringBuilder stringBuilder=new StringBuilder(str);
            stringBuilder.reverse();
            if (stringBuilder.toString().equals(str)) result=true;
        return result;
    }
    public static boolean isPalindrome(int num){
        boolean result=false;
        String str = Integer.toString(num);
        result=isPalindrome(str);
        return result;
    }

   public static long sumOfDigit(int num){
        long result=0;
        while (true){
            int lastDigit=num%10;
            num=num/10;
            result=result+lastDigit;
            if (num%10==0) break;
        }
        return result;
   }

   public static boolean isArmstrongNumber(int num){
       int rslt=0;
       int num2=num;
       int digitCount=String.valueOf(num).length();
       for (int i = 0; i <digitCount ; i++) {
          int a=num%10;
          num=num/10;
          a=(int)Math.pow(a,digitCount);
          rslt=rslt+a;
       }
       return num2==rslt;
   }
//1,1,2,3,5,8
   public static void fibonacci(int num){
        int num1=1,num2=1;
       System.out.println(num1);

       for (int i = 0; i < num; i++) {
           int num3=num1+num2;
           System.out.println(num3);
           num1=num2;
           num2=num3;
       }
   }

   public static int reverseNumber(int num){
       //123-->321
       String strResult="";
        int numDigits=Integer.toString(num).length();
       for (int i = numDigits; i > 0; i--) {
            int lastnum=num%10;
            int newNum=num/10;
            num=newNum;
            strResult+=String.valueOf(lastnum);
       }
        return Integer.parseInt(strResult);
   }
   public static int reverseInteger(int num){
      return Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString());
   }

   public static int[] firstTwoNumber(int[] arr){
       Arrays.sort(arr);
       int[] result=new int[2];
       result[0]=arr[arr.length-1];
       result[1]=arr[arr.length-2];
       return result;

   }

   public static int division(int bolunen,int bolen){
        int bolum=0;
        while (bolunen>=bolen){
            bolunen=bolunen-bolen;
            bolum++;
        }
        return bolum;
   }
    public static int divisionK(int bolunen,int bolen){
        while (bolunen>=bolen){
            bolunen=bolunen-bolen;
        }
        return bolunen;
    }


}
