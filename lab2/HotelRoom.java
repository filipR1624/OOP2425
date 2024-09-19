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

    public String getVacant()
    {
        String result = "";
        if (vacancy == 0)
        {
            result = "vacant";
        }
        else if (vacancy == 1)
        {
            result = "occupied";
        }
        return result;
    }

    public double getRate()
    {
        return rate;
    }
}