package com.pavlova.homeworks.lecture04;

public class Task0 {
    public String revertsWord(String word){
      StringBuffer buffer = new StringBuffer(word);
      String revertsWord = buffer.reverse().toString();
      return revertsWord;
    }
}
