// Student Name 	: Filip Raguz
// Student Id Number: C00301624
// Date 			: 24th September
// Purpose 			: Lab 3 Question 1

package lab3.Q1;

import java.util.Calendar;

public class Clock
{
    public static void main(String[] args)
    {
        Calendar cal = Calendar.getInstance();
        Time t = new Time(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));

        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= 60; i++)
        {
            long currentTime;
            do
            {
                currentTime = System.currentTimeMillis();
            } while (currentTime < startTime + (i * 1000));
            t.tick();
            System.out.println(t.toString());
        }
    }
}
