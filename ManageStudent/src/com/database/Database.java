package com.database;

import java.util.ArrayList;
import java.util.List;

import com.modal.Aspirations;
import com.modal.Score;
import com.modal.Student;
import com.modal.Supervisors;

public class Database {

	public static ArrayList<Student> getListStudent() {
		return listStudent;
	}

	public static ArrayList<Supervisors> getListSupervisori() {
		return listSupervisori;
	}

	static ArrayList<Student> listStudent = new ArrayList<Student>();
	static ArrayList<Supervisors> listSupervisori = new ArrayList<Supervisors>();

	public void addDatabase() {
		Student st1 = new Student("SV001", "Nguyen Van A", "Nam", "2000", "Hanoi", new Score(8.5f, 7.5f, 6.5f, 8.0f, 7.5f, 9.0f, 0.5f), new ArrayList<>());
		Student st2 = new Student("SV002", "Tran Thi B", "Nữ", "1999", "Ho Chi Minh City", new Score(7.0f, 8.0f, 9.0f, 8.5f, 7.0f, 8.5f, 1.0f), new ArrayList<>());
		Student st3 = new Student("SV003", "Le Thanh C", "Male", "2001", "Da Nang", new Score(9.0f, 7.5f, 7.0f, 8.0f, 9.0f, 9.5f, 0.0f), new ArrayList<>());
		
		st1.getAspirations().add(new Aspirations("CNTT", "Công nghệ thông tin", "DHQGHN", "A", 26.0f));
		st1.getAspirations().add(new Aspirations("KETOAN", "Kế toán", "DHKT", "B", 27.5f));
		st1.getAspirations().add(new Aspirations("BANHANG", "Bán hàng", "DHKTVT", "D", 16.5f));
		st2.getAspirations().add(new Aspirations("CNTT", "Công nghệ thông tin", "DHQGHN", "A",  24.0f));
		st2.getAspirations().add(new Aspirations("QUANTRI", "Quản trị kinh doanh", "DHBKDN", "C", 27.5f));
		st2.getAspirations().add(new Aspirations("BANHANG", "Bán hàng", "DHKTVT", "D", 24.5f));
		st3.getAspirations().add(new Aspirations("QUANTRI", "Quản trị kinh doanh", "DHBKDN", "C", 21.5f));
		st3.getAspirations().add(new Aspirations("MARKETING", "Marketing", "DHBKHN", "A", 28.0f));
		st3.getAspirations().add(new Aspirations("DUOC", "Dược", "DHYD", "B", 29.5f));
		
		listStudent.add(st1);
		listStudent.add(st2);
		listStudent.add(st3);

		Supervisors supervisor1 = new Supervisors("ID1", "Unit1", "John Doe", "Male", "1990", "Hanoi");
		Supervisors supervisor2 = new Supervisors("ID2", "Unit2", "Jane Smith", "Female", "1985", "Ho Chi Minh City");
		Supervisors supervisor3 = new Supervisors("ID3", "Unit1", "Maria Rodriguez", "Female", "1988", "Barcelona");
		Supervisors supervisor4 = new Supervisors("ID4", "Unit2", "David Lee", "Male", "1983", "New York");
		Supervisors supervisor5 = new Supervisors("ID5", "Unit3", "Jasmine Chen", "Female", "1992", "Ho Chi Minh City");
		Supervisors supervisor6 = new Supervisors("ID6", "Unit3", "Kevin Wong", "Male", "1995", "Hong Kong");

		listSupervisori.add(supervisor1);
		listSupervisori.add(supervisor2);
		listSupervisori.add(supervisor3);
		listSupervisori.add(supervisor4);
		listSupervisori.add(supervisor5);
		listSupervisori.add(supervisor6);
	}

}
