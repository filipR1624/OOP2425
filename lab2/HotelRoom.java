class HotelRoom
{
    private int roomNumber;
    private String roomType;

    public HotelRoom()
    {
        roomNumber = 0;
        roomType = "";
    }

    // setters
    public void setNumber(int num)
    {
        roomNumber = num;
    }

    public void setType(String type)
    {
        if ((type.equals("Single")) || (type.equals("Double")))
        {
            roomType = type;
        }
        else
        {
            roomType = "invalid type";
        }
    }

    // getters
    public int getNumber()
    {
        return roomNumber;
    }

    public String getType()
    {
        return roomType;
    }
}