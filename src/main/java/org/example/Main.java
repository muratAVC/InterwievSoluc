package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
//        System.out.println(InterwiewSolucitions.sumOfDigit(123456789));
        System.out.println(InterwiewSolucitions.isArmstrongNumber(407));


//       System.out.println(InterwiewSolucitions.strReverse2("Murat Avcı"));
//        System.out.println(InterwiewSolucitions.primeNumber(123));
//        System.out.println(InterwiewSolucitions.isPalindrome("namazzaman"));
//        System.out.println(InterwiewSolucitions.isPalindromeChar("zamannamaf"));
//        System.out.println(InterwiewSolucitions.reverseString("selam nasılsın"));
//        System.out.println(InterwiewSolucitions.factorial(10));
//        System.out.println("InterwiewSolucitions.isPalindrom(\"murat\") = " + InterwiewSolucitions.isPalindrome(123321));

//        IntStream.of(50, 20, 10, 40).reduce(1, (i, i1) -> {
//            System.out.println(i * i1);
//            return i * i1;
//        });

//        List<String> list=Arrays.asList("\"murat\",\"selim\",\"semra\",\"esra\",\"sultan\"");
        //list.stream().distinct().sorted().forEach(System.out::println);

//        List<String> sonuc=list.stream().filter(list->!"esra".equals(list)).collect(Collectors.toList());
//        for(int x = 1; x<=5; x++) { for(int y=1; y<=x; y++) { System.out.print(y+""); }
//            System.out.println(); }
//        InterwiewSolucitions.fibonacci(10);
//        int a=3,b=6;
//        System.out.println(a);
//        System.out.println(b);
//        a = a ^ b ^ (b = a);
//        System.out.println(a);
//        System.out.println(b);

//        System.out.println("reverseNumber(123) = " + InterwiewSolucitions.reverseNumber(21545));
//        System.out.println("reverseInteger(123) = " + InterwiewSolucitions.reverseInteger(123));
//        int[] arr={1,25,4,58,8,788,528};
//        System.out.println("InterwiewSolucitions.firstTwoNumber(arr) = " + Arrays.toString(InterwiewSolucitions.firstTwoNumber(arr)));
        System.out.println("division(10,2) = " + InterwiewSolucitions.division(10, 4));

    }
}