
public class Point {
	int x,y;
	public Point(int y) {
		this.y=y;
	}
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	} 
	public Point() {
		this(3,5);
	}
	public String toString() {
		return "p=>"+x+" "+y;
	}
	
}
