
public class InsertionSort {
	public static void main(String[] args) {
		
		int[] array= {87,54,897,21,5,8,1};
		Insertion(array);
	}
	static void Insertion(int[] array) {
		int key,i;
		
		for(int j=1;j<array.length;j++) {
			key=array[j];
			i=j-1;
			while(i>=0&&array[i]>key) {
				array[i+1]=array[i];
				i--;
			}
			array[i+1]=key;
		}
		for(int k=0;k<array.length;k++) {
			System.out.print(array[k]+" ");
		}
	}
}
