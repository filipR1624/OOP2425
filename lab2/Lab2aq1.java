// Student Name 	: Filip Raguz
// Student Id Number: C00301624
// Date 			: 24th September
// Purpose 			: Lab 2a Question 1

class Lab2q1
{
    public static void main(String[] args) 
    {
        HotelRoom roomA = new HotelRoom();

        roomA.setNumber(200);
        roomA.setType("Single");

        HotelRoom roomB = new HotelRoom();

        roomB.setNumber(201);
        roomB.setType("asd");

        System.out.println("Room A number is " + roomA.getNumber());
        System.out.println("Room A type is " + roomA.getType());

        System.out.println("Room B number is " + roomB.getNumber());
        System.out.println("Room B type is " + roomB.getType());
        System.out.println(); // new line
    }
}