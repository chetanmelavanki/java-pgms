class Wirelessmouse 
{
    static String brand="Logitech";
    public static void main(String []args)
    {
        
        System.out.println("brand="+brand );
    
        double price=599.00;
        System.out.println("price="+price );

        String connectivitytechnology="wireless";
        System.out.println("connectivitytechnology="+connectivitytechnology );

        mouse("optical");
    }
    static void mouse(String movwmentdetection)
    {
        System.out.println("movwmentdetection="+movwmentdetection );

    }

}
