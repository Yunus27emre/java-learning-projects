import java.util.Random;
public class Average {

	public static void main(String[] args) {
		Random rand=new Random();
		int[] arr=new int[100];
		
		for(int i=0;i<100;i++) {
			int temp=rand.nextInt(1000);
			arr[i]=temp;
		}
		double result=average(arr);
		System.out.println("Result:"+result);
			
	}
	public static double average(int[] arr) {
		double total=0.0;
		for(int i=0;i<100;i++) {
			total+=arr[i];
			if(i>=0&&i<=5) {
				System.out.println(arr[i]);
			}
		}
		return total/100;
	}

}
