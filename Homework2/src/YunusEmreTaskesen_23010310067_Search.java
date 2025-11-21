import java.util.*;
public class YunusEmreTaskesen_23010310067_Search {
	public static void main(String[] args) {
		useBinarySearch1();
		useBinarySearch2();

		 int[] numbers= {1,2,15,18,24,35,36,42,48,57,58,69,79,83,94};
		System.out.println(binarySearch(numbers,58));
	
	}
	public static void useBinarySearch1() {
		int[] number= {-12,-5,2,6,7,8,9,16,24,35,48,65};
		int index=Arrays.binarySearch(number, 65);
		System.out.println(index);
		
	}
	public static void useBinarySearch2() {
		
		int[] numbers= {-12,-5,2,6,7,8,9,16,24,35,48,65};
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i:numbers) {
			list.add(i);
		}
		int index=Collections.binarySearch(list, 24);
		System.out.println(index);
		
	} 
	
	
	
	public static int binarySearch(int[] numbers,int target) {
		int min=0;
		int max=numbers.length-1;
		
		while (min<=max) {
			int mid=(min+max)/2;
			if(numbers[mid]==target) {
				return mid;
			}else if(numbers[mid]<target) {
				min=mid+1;
			}else if(numbers[mid]>target) {
				max=mid-1;
			}
		}
		
		return -1;
	}
	


}
