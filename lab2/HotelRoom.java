// Student Name 	: Filip Raguz
// Student Id Number: C00301624
// Date 			: 24th September
// Purpose 			: My hotel room class

class HotelRoom
{
    private int roomNumber;
    private String roomType;

    // Question 2 update
    private int vacancy;
    private double rate;

    // constructors
    public HotelRoom()
    {
        roomNumber = 0;
        roomType = "";
    }

    public HotelRoom(int rNum, String type, int vacant, double rate)
    {
        setNumber(rNum);
        setType(type);
        setVacant(vacant);
        setRate(rate);
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
    }

    public void setVacant(int num)
    {
        if ((num == 1) || (num == 2))
        {
            vacancy = num;
        }
    }

    public void setRate(double num)
    {
        rate = num;
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

    public boolean getVacant()
    {
        if (vacancy == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public double getRate()
    {
        return rate;
    }
}