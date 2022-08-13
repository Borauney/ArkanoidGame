import java.util.Comparator;

public class MyComparator implements Comparator<String>{

	 MyComparator(){}
	@Override
	public int compare(String o1, String o2) {
		String[] arr1= o1.split(" ");
		String[] arr2=o2.split(" ");
		int z=Integer.parseInt(arr1[1]);
		int y=Integer.parseInt(arr2[1]);
	 return(y-z);
		 
	

}
}
