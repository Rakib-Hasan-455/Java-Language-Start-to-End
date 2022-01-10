public class FunctionPassByValue {

	public static void main(String[] args) {
		//Primitive data always stays in stack memory separately and It's range only inside it's own block
    
    int i = 10; // this i value is only for main function
		changeIntValue(i);
		System.out.println("i after changeIntValue():\t" + i);
		
		i = changeInt(i);
		System.out.println("i after chngeInt():\t\t" + i); // So I is unchanged inside main
		
    
    // Wrapper Class passed value is always passed by reference so if inside the function ref value changed 
    // main functions array value will also change
		int[] array = {1, 2, 3};
		
		System.out.println("array before changeArray():\t" + Arrays.toString(array));
		changeArray(array);
		System.out.println("array after changeArray():\t" + Arrays.toString(array));
		
    // But it doesn't allow to clear the arrays heap memory reference of both.
    // It clears the ref address only of that class where that class is in what function
		clearArray(array);
		System.out.println("array after clearArray():\t" + Arrays.toString(array));
	}

	private static void changeIntValue(int i) {
		i += 100;
	}
	
	private static int changeInt(int i) {
		i += 100;
		return i;
	}
	
	private static void changeArray(int[] array) {
		array[1] = 200;
	}
	

	private static void clearArray(int[] array) {
		array = null;
	}
	
}
