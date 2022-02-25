class Havelsextensionboard
{
	static String brand=("Havels");
	
	public static void main(String []args)
{
	System.out.println("Brand=" + brand);

	int load_capacity=(1000); 
	System.out.println("Load capacity=" + load_capacity + "kg");

	belt("plastic");

	int price=(453);
	System.out.println("price="+price);

    String color=("white");
    System.out.println("color="+color); 
}	
		static void belt(String material)
	{
		System.out.println("material=" + material);
	}
}