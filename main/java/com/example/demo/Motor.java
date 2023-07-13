package com.example.demo;

import java.util.Scanner;

class Vehicle{

	String make;	
	String vehicleNumber;
	String fuelType;
	Integer fuelCapacity;
	Integer cc;
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public Integer getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(Integer fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public Integer getCc() {
		return cc;
	}
	public void setCc(Integer cc) {
		this.cc = cc;
	}
	public Vehicle() {

	}
	public Vehicle(String make, String vehicleNumber, String fuelType, Integer fuelCapacity, Integer cc) {
		super();
		this.make = make;
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}

	void displayMake(){
		System.out.println(make);
	}

	void displayBasicInfo() {
		System.out.println("---Basic Information---");
		System.out.println("Vehicle make=" + make + ", vehicleNumber=" + vehicleNumber + ", fuelType=" + fuelType
				+ ", fuelCapacity=" + fuelCapacity + ", cc=" + cc );
	}


	void displayDetailInfo() {

	}
}

class TwoWheeler extends Vehicle{

	private Boolean	kickStartAvailable;

	public Boolean getKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(Boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}
	public TwoWheeler() {}

	public TwoWheeler(String make, String vehicleNumber, String fuelType, Integer fuelCapacity, Integer cc) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		// TODO Auto-generated constructor stub
	}

	@Override
	void displayDetailInfo(){
		System.out.println("---Detail Information---");
		System.out.println("KickStartAvailable: "+kickStartAvailable);
	}
}

class FourWheeler extends Vehicle{

	public FourWheeler() {}

	public FourWheeler(String make, String vehicleNumber, String fuelType, Integer fuelCapacity, Integer cc) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		// TODO Auto-generated constructor stub
	}
	private String audioSystem;
	private Integer numberOfDoors;

	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public Integer getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(Integer numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	@Override
	void displayDetailInfo() {
		System.out.println("---Detail Information---");
		System.out.println("AudioSystem: "+audioSystem+" NumberOfDoors: "+numberOfDoors);
	}

	@Override
	public String toString() {
		return "FourWheeler [audioSystem=" + audioSystem + ", numberOfDoors=" + numberOfDoors + ", make=" + make
				+ ", vehicleNumber=" + vehicleNumber + ", fuelType=" + fuelType + ", fuelCapacity=" + fuelCapacity
				+ ", cc=" + cc + "]";
	}

}

public class Motor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TwoWheeler bike= new TwoWheeler();
		FourWheeler car= new FourWheeler();

		System.out.println("Enter Vehicle Type");
		System.out.println("1.Four Wheeler\r\n"
				+ "2.Two Wheeler\r\n");
		int num = Integer.parseInt(sc.nextLine());

		if(num==1) {
			System.out.println("Fuel Capacity");
			car.setFuelCapacity(Integer.parseInt(sc.nextLine()));
			System.out.println("Fuel Type");
			car.setFuelType(sc.nextLine());
			System.out.println("VehicleNumber");
			car.setVehicleNumber(sc.nextLine());
			System.out.println("AudioSystem");
			car.setAudioSystem(sc.nextLine());
			System.out.println("NumberOfDoors");
			car.setNumberOfDoors(Integer.parseInt(sc.nextLine()));
			System.out.println("Make");
			car.setMake(sc.nextLine());
			System.out.println("Engine CC");
			car.setCc(Integer.parseInt(sc.nextLine()));
			car.displayBasicInfo();
			car.displayDetailInfo();
		}
		if(num==2) {
			System.out.println("Fuel Capacity");
			bike.setFuelCapacity(Integer.parseInt(sc.nextLine()));
			System.out.println("Fuel Type");
			bike.setFuelType(sc.nextLine());
			System.out.println("VehicleNumber");
			bike.setVehicleNumber(sc.nextLine());
			System.out.println("Make");
			bike.setMake(sc.nextLine());
			System.out.println("Engine CC");
			bike.setCc(Integer.parseInt(sc.nextLine()));
			bike.setKickStartAvailable(true);

			bike.displayBasicInfo();
			bike.displayDetailInfo();

		}	
	}	
}
