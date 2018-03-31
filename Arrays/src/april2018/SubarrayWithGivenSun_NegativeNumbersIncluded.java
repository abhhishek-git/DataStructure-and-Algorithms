package april2018;

import java.util.HashMap;
import java.util.Map;

//O(n)
//https://stackoverflow.com/questions/39322019/using-a-map-to-find-subarray-with-given-sum-with-negative-numbers

/*curr_sum = curr_sum + arr[i];
Here: curr_sum holds the sum of all the entries(up to arr[i]) starting from arr[0]

if (curr_sum == sum)
{
System.out.printf("Subarray equal to given sum found between 0 to %d \n",i);
return;
}

Here: The if condition checks if the curr_sum is equal to the given sum. Remember, curr_sum holds the sum starting from arr[0].

So, if the indexes for your result subarray is 2 and 4, the above condition is not enough.

Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Ouptut: Sum found between indexes 2 and 4

In that example,

when i = 4, curr_sum would be 38. But if you take 1 and 4 out(arr[0] and arr[1] which is a subarray), you get 33.

if(map.containsKey(curr_sum-sum)) {
				System.out.printf("Subarray equal to given sum found between %d to %d \n", map.get(curr_sum-sum)+1, i);
				return;
			}
map.put(curr_sum, i);

The above code does that.

map[curr_sum] = i;

map stores the index value (i) with the subarray sum ( sum of the arr between indexes 0 and i ) as key. 
So for the example, it would be:

map[1]=0
map[5]=1
map[25]=2
map[28]=3
map[38]=4

This code:

map.find(curr_sum - sum)

searches the map is if it has an entry with key (curr_sum - sum).

In our example, when i = 4, curr_sum would be 38 and sum as given would be 33. If we eliminate the subarray arr[0,2],
 we get 33. So, map.find(curr_sum - sum) => map.find(38-33) is a hit since we have entry map[5] = 1.
*/

public class SubarrayWithGivenSun_NegativeNumbersIncluded {
	public static void main(String[] args) {
		//int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
		int[] arr = {10, 2, -2, -20,1,-5, 10};
		int len = arr.length;
		int sum = -24;
		subArraySum(arr,len, sum);
	}
	
	public static void subArraySum(int[] arr, int n, int sum) {
		Map<Integer, Integer> map = new HashMap<>();
		int curr_sum = 0;
		for(int i=0; i<n ; i++) {
			curr_sum = curr_sum + arr[i];
			//System.out.println(curr_sum+ " --> " + i+ " and curr_sum-sum = " + (curr_sum-sum));
			
			if(curr_sum == sum) {
				System.out.printf("Subarray equal to given sum found between 0 to %d \n",i);
				return;
			}
			
			if(map.containsKey(curr_sum-sum)) {
				System.out.printf("Subarray equal to given sum found between %d to %d \n", map.get(curr_sum-sum)+1, i);
				return;
			}
			
			map.put(curr_sum, i);
			System.out.println(map);
		}
		System.out.println("No array found");
	}
	
}
