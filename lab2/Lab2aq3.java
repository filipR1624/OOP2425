class Lab2q3
{
    public static void main(String[] args) 
    {
       
        HotelRoom roomA = new HotelRoom();

        roomA.setNumber(200);
        roomA.setType("Single");
        
        HotelRoom roomB = new HotelRoom();
        
        roomB.setNumber(201);
        roomB.setType("Double");
       
        System.out.println("Room A number is " + roomA.getNumber());
        System.out.println("Room A type is " + roomA.getType());
        System.out.println("Room B number is " + roomB.getNumber());
        System.out.println("Room B type is " + roomB.getType());
        System.out.println(); // new line
    
        roomA.setVacant(1);
        roomA.setRate(100);
        roomB.setVacant(0);
        roomB.setRate(80);
       
        System.out.println("Room A vacancy: " + roomA.getVacant());
        System.out.println("Room A rate is " + roomA.getRate());
        System.out.println("Room B vacancy: " + roomB.getVacant());
        System.out.println("Room B rate is " + roomB.getRate());

        HotelRoom roomC = new HotelRoom(202, "Double", 1, 120);
        System.out.println(); // new line

        System.out.println("Room C number is " + roomC.getNumber());
        System.out.println("Room C type is " + roomC.getType());
        System.out.println("Room C vacancy: " + roomC.getVacant());
        System.out.println("Room C rate is " + roomC.getRate());
    }
}