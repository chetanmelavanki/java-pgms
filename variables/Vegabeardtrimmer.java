class Vegabeardtrimmer{
	
	static int price=909;
	
	public static void main(String []args)
	{
		String brand="VEGA";
		System.out.println("brand="+brand);
	
		System.out.println("price="+price);

		bottle("black");
		
		short itemWeight=900;
		System.out.println("itemWeight="+itemWeight+"gm");
	}
	static void bottle(String color)
	{
		System.out.println("color="+color);
	}
}
