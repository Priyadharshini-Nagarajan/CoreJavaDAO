package in.landsellr.injava;

public class Land 
{
	private int id;
	private String name;
	private double area;
	private double price;
	public Land(int id, String name, double area, double price) {
		super();
		this.id = id;
		this.name = name;
		this.area = area;
		this.price = price;
	}
	
	public Land() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
