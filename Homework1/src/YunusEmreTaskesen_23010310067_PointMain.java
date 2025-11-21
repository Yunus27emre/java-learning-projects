import java.util.Set;
import java.util.HashSet;
public class YunusEmreTaskesen_23010310067_PointMain {
	public static void main(String[] args) {
		Point p1=new Point(5,9);
		System.out.println(p1.toString());
		System.out.println("p1: "+p1.getX()+" "+p1.getY());
		Set<Point> points =new HashSet<Point>();
		
		points.add(p1);
		points.add(new Point(2,5));
		points.add(new Point(7,6));
		
		System.out.println(points.toString());
		
		for(Point p:points) {
			System.out.println("p"+": "+p.getX()+" "+p.getY());
			
		}
	}
}
