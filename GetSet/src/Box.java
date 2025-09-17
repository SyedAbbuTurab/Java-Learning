
public class Box <T, U> {
	
	T item;
	U price;
	
	Box(T item, U price) {
		this.item = item;
		this.price = price;
	}
	
	public T getItem() {
		return item;
	};
	
	public U getPrice() { return price; }
	
}
