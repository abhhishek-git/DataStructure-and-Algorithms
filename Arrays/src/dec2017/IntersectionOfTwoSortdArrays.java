package dec2017;

public class IntersectionOfTwoSortdArrays {
	
	
	public static void main(String[] args) {
		int[] arr1= {1,3,4,5,6,7,9,10};
		int[] arr2= {2,3,5,7};
		int len1 = arr1.length;
		int len2 = arr2.length;
		findIntersection(arr1, arr2, len1, len2);
	}	
	
	public static void findIntersection(int[] arr1, int[] arr2, int len1, int len2) {
		int i=0, j=0;
		
		while(i<len1 && j<len2) {
			if(arr1[i] < arr2[j])
				i++;
			else if(arr1[i] > arr2[j])
				j++;
			else { //(arr1[i] == arr2[j])
				System.out.print(arr1[i]+ " ");
				i++;
				j++;
			}
	
		}
	}
}
