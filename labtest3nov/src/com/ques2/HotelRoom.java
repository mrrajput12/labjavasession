/*
 * wap to print the hotel deatils 
 * @author:Abhishek Raj
 * @date:3 Nov 2022
 */
package com.ques2;

//declaring a class
public class HotelRoom {
//takinfg variable
	private int roomno;
	private String type;
	private float price;
	private double area;

	// default constructor
	public HotelRoom() {
		super();
		this.roomno = 0;
		this.type = "unknown";
		this.price = 2000.0f;
		this.area = 5D;
		System.out.println("Default------");

	}

//paramterized contructor
	public HotelRoom(int roomno, String type, float price, double area) {
		super();
		System.out.println("Paramaterized1......");
		this.roomno = roomno;
		this.type = type;
		this.price = price;
		this.area = area;
	}
	// paramaterized ccontructor

	public HotelRoom(int roomno, String type, float price) {
		super();
		System.out.println("Paramaterized2......");
		this.roomno = roomno;
		this.type = type;
		this.price = price;
	}

//declaring
	public HotelRoom(HotelRoom HR) {
		this.roomno = HR.roomno;
		this.type = HR.type;
		this.price = HR.price;
		this.area = HR.area;

	}

//getting aget and set values
	public int getRoomno() {
		return roomno;
	}

	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "HotelRoom [roomno=" + roomno + ", type=" + type + ", price=" + price + ", area=" + area + "]";
	}

}
//end od class