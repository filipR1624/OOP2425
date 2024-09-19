class HotelRoomDriver
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
    }
}