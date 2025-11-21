
public class products {
	public static void main(String[] argument) {
		Product product = new Product();
		product.setName("Laptop");
		product.setColor("Pink");
		product.setId(1);
		product.setPrice(5999.99);
		product.setDescription("Asus");
		ProductManager productmanager = new ProductManager();
		// productmanager.Add(product);
		
		System.out.println(product.getCode());
		
		
		
	}
}
