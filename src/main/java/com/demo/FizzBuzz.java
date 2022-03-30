package com.demo;

public class FizzBuzz 
{
    String processNumber(int num)
    {    
        // Copy your code here
        if (num % 15 == 0) {
            return "FizzBuzz";
        }
            else if (num % 3 == 0) {
            return "Fizz";
        }
            else if (num % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(num);
            }
    }
    
    String processNumbers (int[] numList)
    {
        // Copy your code here
        String res = "";
        for (int i = 0; i < numList.length; i++){
            if (i != numList.length-1) {
                res += processNumber(numList[i]) + ", ";
                }
            else {
                res += processNumber(numList[i]);
                }
        }
        return res;
    }

}
