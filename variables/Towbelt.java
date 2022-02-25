class Towbelt
{
	static String brand=("AUTO MT");
	
	public static void main(String []args)
{
	System.out.println("Brand=" + brand);

	int load_capacity=(1000); 
	System.out.println("Load capacity=" + load_capacity + "kg");

	belt("nylon");

	int price=(149);
	System.out.println("price="+price);
}	
		static void belt(String material)
	{
		System.out.println("material=" + material);
	}
}