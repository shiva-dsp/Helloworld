package com.jsp.model;

import java.util.Scanner;

public class Employee {
	int Id;
	String Name;
	int contanctnumber;
	

	private Readable Employee;
	
Scanner scanner=new Scanner(Employee);

public int getId() {
	return Id;
}

public void setId(int id) {
	Id = id;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}
public int getContanctnumber() {
	return contanctnumber;
}

public void setContanctnumber(int contanctnumber) {
	this.contanctnumber = contanctnumber;
}


public Scanner getScanner() {
	return scanner;
}

public void setScanner(Scanner scanner) {
	this.scanner = scanner;
}
	

}
