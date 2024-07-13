package Team.Swiggy;

public class Item extends Hotel {

	String Item_1 = "Biriyani";
	String Item_2 = "Dosa";
	String Item_3 = "Pongal";
	String Item_4 = "Poori";
	String Item_5 = "fried rice";
	
	
	public Boolean Items(String Item_names) {
		
		if(Hot_1(Item_names)) {
//			System.out.print( " Hotel  is available");
			return true  ;
		}
		else {
			
		
		if(Item_names.equalsIgnoreCase(Item_1)||Item_names.equalsIgnoreCase(Item_2)||Item_names.equalsIgnoreCase(Item_3)
		||Item_names.equalsIgnoreCase(Item_4)||Item_names.equalsIgnoreCase(Item_5))
		{
//		System.out.println(Item_names + " are available");
		return true ;
			
		}
		else {
//			System.out.println(Item_names + " is  not available");	
			return false ;

		}
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Item B = new Item();
//		B.Items("Biriyani");
	}

}