public class Test extends Example{
	enum Color {RED, WHITE, BLACK};
	
    Test(int x, int y){
    	a = x;
    	b = y;
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("try, return");
			return;
		}catch(Exception e){
			System.out.println("Caught an exception");
		}finally{
			System.out.println("finally");
		}

	}

}
