// Student Name 	: Filip Raguz
// Student Id Number: C00301624
// Date 			: 24th September
// Purpose 			: Lab 3 Question 1

package lab3;

import java.util.Calendar;

public class Clock
{
    public static void main(String[] args)
    {
        Calendar cal = Calendar.getInstance();
        Time t = new Time(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));

        int count = 0;
        long mil = System.currentTimeMillis();

        while (count < 60)
        {
            
        }
    }
}
