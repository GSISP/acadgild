
public class ForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaration and initialization of value
		int no=5,fact=1;
		
		//(initialization , condition , increment/ decrement for termination)
		for(int i=1;i<=no;i++){
			fact=fact*i;
		}
		
		System.out.println(fact);
	}

}
