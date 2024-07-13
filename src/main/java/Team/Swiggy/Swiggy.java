package Team.Swiggy;

	public class Swiggy extends Item{
		
		public void SWIG_ALL(String HT) {
			
		if(Items(HT))	{
			System.out.println(HT+" is available");
			
		}
		else {
			
			System.out.println(HT+" is not available");
			
		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swiggy ALL =new Swiggy();
		ALL.SWIG_ALL("Bismi hotel");
	}

}
