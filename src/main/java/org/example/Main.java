package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    List<String> studentNameList = List.of("佐藤", "鈴木", "七五三掛", "田中", "田母神", "小鳥遊", "山口", "伊藤", "田口", "山田");

    for (String studentName : studentNameList) {
      if (studentName.length() >= 3) {
        System.out.println(studentName);
      }
    }

    Map<Integer, String> studentNameMap = new HashMap<>();
    studentNameMap.put(1, "佐藤");
    studentNameMap.put(2, "鈴木");
    studentNameMap.put(3, "七五三掛");
    studentNameMap.put(4, "田中");
    studentNameMap.put(5, "田母神");
    studentNameMap.put(6, "小鳥遊");
    studentNameMap.put(7, "山口");
    studentNameMap.put(8, "伊藤");
    studentNameMap.put(9, "田口");
    studentNameMap.put(10, "山田");

    studentNameMap.entrySet().removeIf(entry -> entry.getKey() % 2 == 0);
    System.out.println(studentNameMap);

  }
}
