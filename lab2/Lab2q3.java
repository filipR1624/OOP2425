class Lab2q3
{
    public static void main(String[] args) 
    {
        // creating new roomA object
        HotelRoom roomA = new HotelRoom();

        // setting its values
        roomA.setNumber(200);
        roomA.setType("Single");

        // creating new roomB object
        HotelRoom roomB = new HotelRoom();

        // settings its values
        roomB.setNumber(201);
        roomB.setType("asd");

        // printing roomA contents
        System.out.println("Room A number is " + roomA.getNumber());
        System.out.println("Room A type is " + roomA.getType());

        // printing roomB contents
        System.out.println("Room B number is " + roomB.getNumber());
        System.out.println("Room B type is " + roomB.getType());
        System.out.println(); // new line

        // updating roomA values
        roomA.setVacant(1);
        roomA.setRate(100);

        // updating roomB values
        roomB.setVacant(0);
        roomB.setRate(80);

        //printing roomA values
        System.out.println("Room A is " + roomA.getVacant());
        System.out.println("Room A rate is " + roomA.getRate());

        // printing roomB values
        System.out.println("Room B is " + roomB.getVacant());
        System.out.println("Room B rate is " + roomB.getRate());

        HotelRoom roomC = new HotelRoom(202, "Double", 1, 120);
        System.out.println(); // new line

        System.out.println("Room C number is " + roomC.getNumber());
        System.out.println("Room C type is " + roomC.getType());
        System.out.println("Room C is " + roomC.getVacant());
        System.out.println("Room C rate is " + roomC.getRate());
    }
}