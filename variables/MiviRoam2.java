class MiviRoam2{		
	
	static String connectType="Wireless,Bluetooth,Axyilary";

	public static void main(String []args)
	{
		double price =999.00;
		System.out.println("price"+price);

		System.out.println("connectType="+connectType);		
		
		skin("Mivi");

		String special_feature="Water Proof";
		System.out.println("special_feature="+special_feature);
	}
	static void skin(String brand)
	{
		System.out.println("brand="+brand);
	}
}