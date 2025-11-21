
public class Product {
	private int id;
	private String name;
	private double price;
	private String code;
	private String description;
	private int stockAmount;
	private String color;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getCode() {
		return this.name.substring(0, 1) + id;
	}

	public String getDescription() {
		return description;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public String getColor() {
		return color;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setstockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
