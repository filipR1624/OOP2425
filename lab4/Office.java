// Student Name 	: Filip Raguz
// Student Id Number: C00301624
// Date 			: 1st October
// Purpose 			: My implementation of Office

package lab4;

public class Office
{
    private static int currentRoom = 100;
    private int roomNo;

    public Office()
    {
        setRoomNo(currentRoom);
        currentRoom++;
    }

    public void setRoomNo(int num)
    {
        roomNo = num;
    }

    public int getRoomNo()
    {
        return roomNo;
    }
}
