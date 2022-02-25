class Waterbottle{
	
	static int price=449;
	
	public static void main(String []args)
	{
		String brand="Cello";
		System.out.println("brand="+brand);
	
		System.out.println("price="+price);

		bottle("pink");
		
		short capacity=900;
		System.out.println("capacity="+capacity+"ml");
	}
	static void bottle(String color)
	{
		System.out.println("color="+color);
	}
}
