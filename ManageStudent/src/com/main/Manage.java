package com.main;

import com.controller.Controller;
import com.database.Database;
import java.util.Scanner;

public class Manage {

  static Controller ct = new Controller();
  static Scanner sc = new Scanner(System.in);
  static Database db = new Database();

  public static void menu() {
    while (true) {
      System.out.println("++++++++++++++++++    Menu    ++++++++++++++++++++");
      System.out.println("+ 1.Xem danh sách các sinh viên                  +");
      System.out.println("+ 2.Xem danh sách các nguyên vọng của sinh viên  +");
      System.out.println("+ 3.Thêm thông tin sinh viên                     +");
      System.out.println("+ 4.Sửa thông tin sinh viên                      +");
      System.out.println("+ 5.Xóa thông tin sinh viên                      +");
      System.out.println("+ 6.Thêm nguyên vọng cho sinh viên               +");
      System.out.println("+ 7.Điều chỉnh nguyên vọng cho sinh viên         +");
      System.out.println("+ 8.Danh sách các sinh viên đã trúng tuyển       +");
      System.out.println("+ 9.Danh sách giám thị ở TP HCM                  +");
      System.out.println("+ 0.Thoát chương trình                           +");
      System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
      System.out.print("Chọn một yêu cầu [0-8]: ");
      int choice = Integer.parseInt(sc.nextLine());
      switch (choice) {
        case 0:
          System.exit(0);
          break;
        case 1:
          ct.getAllStudent();
          break;
        case 2:
          ct.viewNV();
          break;
        case 3:
          ct.addStudent();
          break;
        case 4:
          ct.updateStudent();
          break;
        case 5:
          ct.deleteStudent();
          break;
        case 6:
          break;
        case 7:
          break;
        case 8:
          ct.viewTT();
          break;
        case 9:
        
          break;
        default:
          break;
      }
    }
  }

  public static void main(String[] args) {
    db.addDatabase();
    menu();
  }
}
