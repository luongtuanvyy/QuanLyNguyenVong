package com.controller;

import com.database.Database;
import com.modal.Aspirations;
import com.modal.Score;
import com.modal.Student;
import com.modal.Supervisors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Controller {

  Database db = new Database();
  Scanner sc = new Scanner(System.in);

  public void addStudent() {
    System.out.print("Nhập mã số sinh viên: ");
    String id = sc.nextLine();

    System.out.print("Nhập họ và tên: ");
    String fullName = sc.nextLine();

    System.out.print("Nhập giới tính: ");
    String gender = sc.nextLine();

    System.out.print("Nhập năm sinh: ");
    String YoB = sc.nextLine();

    System.out.print("Nhập quê quán: ");
    String homeTown = sc.nextLine();

    System.out.println("Nhập điểm Toán:");
    float toan = Float.parseFloat(sc.nextLine());

    System.out.println("Nhập điểm Văn:");
    float van = Float.parseFloat(sc.nextLine());

    System.out.println("Nhập điểm Anh:");
    float anh = Float.parseFloat(sc.nextLine());

    System.out.println("Nhập điểm Lý:");
    float ly = Float.parseFloat(sc.nextLine());

    System.out.println("Nhập điểm Hóa:");
    float hoa = Float.parseFloat(sc.nextLine());

    System.out.println("Nhập điểm Sinh:");
    float sinh = Float.parseFloat(sc.nextLine());

    System.out.println("Nhập điểm ưu tiên:");
    float diemUT = Float.parseFloat(sc.nextLine());

    Student student = new Student(
      id,
      fullName,
      gender,
      YoB,
      homeTown,
      new Score(toan, van, anh, ly, hoa, sinh, diemUT),
      null
    );
    db.getListStudent().add(student);
  }

  public void deleteStudent() {
    int index = findIndex();
    db.getListStudent().remove(index);
  }

  public void updateStudent() {
    int index = findIndex();
    Student st = db.getListStudent().get(index);
    System.out.println("-----Chọn nội dung sửa----");
    System.out.println("1. Sửa thông tin sinh viên");
    System.out.println("2. Sửa điểm sinh viên");
    int choose = Integer.parseInt(sc.nextLine());
    switch (choose) {
      case 1:
        System.out.print("Nhập họ và tên: ");
        st.setFullName(sc.nextLine());
        System.out.print("Nhập giới tính: ");
        st.setGender(sc.nextLine());
        System.out.print("Nhập năm sinh: ");
        st.setYoB(sc.nextLine());
        System.out.print("Nhập quê quán: ");
        st.setHomeTown(sc.nextLine());
        break;
      case 2:
        System.out.println("Nhập điểm Toán");
        st.getScore().setToan(Float.parseFloat(sc.nextLine()));
        System.out.println("Nhập điểm Văn");
        st.getScore().setVan(Float.parseFloat(sc.nextLine()));
        System.out.println("Nhập điểm Anh");
        st.getScore().setAnh(Float.parseFloat(sc.nextLine()));
        System.out.println("Nhập điểm Lý");
        st.getScore().setLy(Float.parseFloat(sc.nextLine()));
        System.out.println("Nhập điểm Hóa");
        st.getScore().setHoa(Float.parseFloat(sc.nextLine()));
        System.out.println("Nhập điểm Sinh");
        st.getScore().setSinh(Float.parseFloat(sc.nextLine()));
        System.out.println("Nhập điểm ưu tiên");
        st.getScore().setDiemUT(Float.parseFloat(sc.nextLine()));
        break;
      default:
        break;
    }
    db.getListStudent().set(index, st);
  }

  public void getAllStudent() {
    System.out.printf(
      "%-12s | %-13s | %-12s | %-12s | %-18s | %s \n",
      "Mã sinh viên",
      "Họ và tên",
      "Giới tính",
      "Năm sinh",
      "Quê quán",
      "Điểm ưu tiên"
    );
    System.out.println(
      "----------------------------------------------------------"
    );
    for (Student st : db.getListStudent()) {
      System.out.printf(
        "%-12s | %-13s | %-12s | %-12s | %-18s | %s \n",
        st.getId(),
        st.getFullName(),
        st.getGender(),
        st.getYoB(),
        st.getHomeTown(),
        st.getDUT()
      );
    }
    System.out.println(
      "----------------------------------------------------------"
    );
  }

  public void viewNV() {
    int index = findIndex();
    Student st = db.getListStudent().get(index);

    List<Aspirations> listAspirations = st.getAspirations();
    System.out.println(
      "----------------------------------------------------------"
    );
    System.out.printf(
      "%-12s | %-20s | %-12s | %-12s | %-18s  \n",
      "Mã ngành",
      "Tên ngành",
      "Mã trường",
      "Khối xét tuyển",
      "Điểm thi"
    );
    for (Aspirations asp : listAspirations) {
      System.out.printf(
        "%-12s | %-20s | %-12s | %-14s | %-18s \n",
        asp.getMaNganh(),
        asp.getTenNganh(),
        asp.getMaTruong(),
        asp.getKhoiXT(),
        asp.getDiemThi()
      );
    }
    System.out.println(
      "----------------------------------------------------------"
    );
  }

  public void addNV() {
    int index = findIndex();
    Student st = db.getListStudent().get(index);
    System.out.print("Nhập số nguyện vọng: ");
    int countNV = Integer.parseInt(sc.nextLine());
    List<Aspirations> nv = new ArrayList<>();
    for (int i = 0; i < countNV; i++) {
      System.out.print("Nhập mã nguyện vọng: ");
      String maNganh = sc.nextLine();
      System.out.print("Nhập tên nguyện vọng: ");
      String tenNganh = sc.nextLine();
      System.out.print("Nhập mã trường: ");
      String maTruong = sc.nextLine();
      System.out.print("Nhập khối xét tuyển: ");
      String khoiXT = sc.nextLine();
      System.out.print("Nhập điểm thi: ");
      float diemThi = Float.parseFloat(sc.nextLine());
      nv.add(new Aspirations(maNganh, tenNganh, maTruong, khoiXT, diemThi));
    }
  }

  public void sortNguyenVong() {
    System.out.println("Nhập chuyên ngành: ");
    List<Student> students = new ArrayList<Student>();
  }

  public void viewTT() {
    System.out.println("Danh sách trúng tuyển ");
    System.out.printf(
      "%-12s | %-20s | %-12s | %-20s | %-12s | %-16s | %-12s | %-12s \n",
      "Mã Sinh viên",
      "Tên sinh viên",
      "Mã ngành",
      "Tên Ngành",
      "Mã trường",
      "Khối xét tuyển",
      "Điểm sàn",
      "Điểm thi"
    );
    float score = 0f;
    for (Student student : Database.getListStudent()) {
      for (Aspirations asp : student.getAspirations()) {
        switch (asp.getKhoiXT()) {
          case "A":
          score = student.getScore().getA();
            if (score >= asp.getDiemThi()) {
              showStudent(student, asp, score);
            }
            break;
          case "B":
          score = student.getScore().getB();
            if (student.getScore().getB() >= asp.getDiemThi()) {
              showStudent(student, asp, score);
            }break;
            case "C":
            score = student.getScore().getC();
            if (student.getScore().getC() >= asp.getDiemThi()) {
              showStudent(student, asp, score);
            }
            break;
            case "D":
            score = student.getScore().getD();
            if (student.getScore().getD() >= asp.getDiemThi()) {
              showStudent(student, asp, score);
            }
            break;
        }
      }
    }
  }

  public void showStudent(Student student, Aspirations asp,float scoreStudent) {
    System.out.printf(
      "%-12s | %-20s | %-12s | %-20s | %-12s | %-16s | %-12s | %-12s \n",
      student.getId(),
      student.getFullName(),
      asp.getMaNganh(),
      asp.getTenNganh(),
      asp.getMaTruong(),
      asp.getKhoiXT(),
      asp.getDiemThi(),
      scoreStudent
    );
  }

  public void listGTHCM() {
    for (Supervisors sup : Database.getListSupervisori()) {
      if(sup.getHomeTown().equals("Ho Chi Minh City")) {
        System.out.printf(
          "%-12s | %-20s | %-12s | %-20s | %-12s | %-16s \n",
          sup.getID(),
          sup.getFullName(),
          sup.getUnit(),
          sup.getGender(),
          sup.getYoB(),
          sup.getHomeTown()
        );
      }
    }
  }

  public int findIndex() {
    System.out.print("Nhập mã số sinh viên: ");
    String id = sc.nextLine();
    for (int i = 0; i < Database.getListStudent().size(); i++) {
      if (Database.getListStudent().get(i).getId().equals(id)) {
        return i;
      }
    }
    return -1;
  }
}
