package CMS;

import java.util.Scanner;

public class Showroom implements utility {

	public String showroom_name;
	public String showroom_address;
	public String manager_name;
	public int total_number_of_employees;
	public int total_number_of_cars;
	public int total_cars_in_stock;

	@Override
	public void get_details() {
		System.out.println("Showroom Name: " + showroom_name);
		System.out.println("Showroom Address: " + showroom_address);
		System.out.println("Manager Name: " + manager_name);
		System.out.println("Total Number Of Employee: " + total_number_of_employees);
		System.out.println("Total Number Of Stock Cars: " + total_number_of_cars);
	}

	@Override
	public void set_details() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Showroom Name: ");
		showroom_name = sc.nextLine();
		System.out.print("Enter Showroom Address: ");
		showroom_address = sc.nextLine();
		System.out.print("Enter Manager Name: ");
		manager_name = sc.nextLine();
		System.out.print("Enter Total Number Of Employee: ");
		total_number_of_employees = sc.nextInt();
		System.out.print("Enter Total Number Of Stock Cars: ");
		total_number_of_cars = sc.nextInt();
	}

}
