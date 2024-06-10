package org.example;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<String> studentNameList = List.of("佐藤", "鈴木", "七五三掛", "田中", "田母神", "小鳥遊", "山口", "伊藤", "田口", "山田");

    for (String studentName : studentNameList) {
      if (studentName.length() >= 3) {
        System.out.println(studentName);
      }
    }
  }
}
