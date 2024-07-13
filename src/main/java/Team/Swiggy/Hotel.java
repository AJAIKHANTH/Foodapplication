package Team.Swiggy;

public class Hotel {
	String Hotel_1 = "Saravana Bhavan";
	String Hotel_2 = "anandhavan Bhavan";
	String Hotel_3 = "adayar Bhavan";
	String Hotel_4 = "A to B Bhavan";
	String Hotel_5 = "Amma Bhavan";

	
	public Boolean Hot_1(String Hotel_name) {
		if (Hotel_name.equalsIgnoreCase(Hotel_1) || Hotel_name.equalsIgnoreCase(Hotel_2)
				|| Hotel_name.equalsIgnoreCase(Hotel_3)|| Hotel_name.equalsIgnoreCase(Hotel_4)
				|| Hotel_name.equalsIgnoreCase(Hotel_5))
		{
//		System.out.println(  Hotel_name+" Hotel is available  ");
			return true;
	}
	
	
	else {
		return false;
//		System.out.println(Hotel_name+" is not available");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotel A = new Hotel();
		A.Hot_1("Saravana Bhavan");
	}

}
