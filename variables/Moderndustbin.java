class Moderndustbin
{
    static String color="grey";
    public static void main(String []args)
    {
        String brand=" Signoraware ";
        System.out.println("brand="+brand );

        double price=836.00;
        System.out.println("price="+price);

        System.out.println("color="+color);

        String usefor="Garbage collection";
		System.out.println("usefor="+usefor);


        garbage("1200ml");
    }  
    static void garbage(String capacity)
    {
        System.out.println("capacity="+capacity );

    }
 
}
