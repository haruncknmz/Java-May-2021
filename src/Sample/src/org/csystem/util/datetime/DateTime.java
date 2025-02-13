/*----------------------------------------------------------------------
	FILE        : DateTime.java
	AUTHOR      : Java-May-2021 Group
	LAST UPDATE : 30.10.2021

	DateTime class for date and time operations

	Copyleft (c) 1993 by C and System Programmers Association (CSD)
	All Rights Free
-----------------------------------------------------------------------*/
package org.csystem.util.datetime;

public class DateTime {
    private final Date m_date;
    private final Time m_time;

    public DateTime()
    {
        m_date = new Date();
        m_time = new Time();
    }

    //...

    public DateTime(int day, int month, int year, int hour, int minute, int second, int millisecond)
    {
        m_date = new Date(day, month, year);
        m_time = new Time(hour, minute, second, millisecond);
    }

    public int getDay()
    {
        return m_date.getDay();
    }

    public void setDay(int day)
    {
        m_date.setDay(day);
    }

    public int getMonthValue()
    {
        return m_date.getMonthValue();
    }

    public void setMonthValue(int month)
    {
        m_date.setMonthValue(month);
    }

    public Month getMonth()
    {
        return m_date.getMonth();
    }

    public void setMonth(Month month)
    {
        m_date.setMonth(month);
    }

    public int getYear()
    {
        return m_date.getYear();
    }

    public void setYear(int year)
    {
        m_date.setYear(year);
    }

    public DayOfWeek getDayOfWeek()
    {
        return m_date.getDayOfWeek();
    }

    public String getDayOfWeekTR()
    {
        return m_date.getDayOfWeekTR();
    }

    public String getDayOfWeekEN()
    {
        return m_date.getDayOfWeekEN();
    }

    public boolean isLeapYear()
    {
        return m_date.isLeapYear();
    }

    public boolean isWeekend()
    {
        return m_date.isWeekend();
    }

    public boolean isWeekday()
    {
        return m_date.isWeekday();
    }

    public int getDaysOfMonth()
    {
        return m_date.getDaysOfMonth();
    }

    public String toString(char delimiter)
    {
        return m_date.toString(delimiter);
    }

    public String toLongDateStringTR()
    {
        return m_date.toLongDateStringTR();
    }

    public String toLongDateStringEN()
    {
        return m_date.toLongDateStringEN();
    }

    public String toShortDateStringTR()
    {
        return m_date.toShortDateStringTR();
    }

    public String toShortDateStringEN()
    {
        return m_date.toShortDateStringEN();
    }

    public int getHour()
    {
        return m_time.getHour();
    }

    public void setHour(int val)
    {
        m_time.setHour(val);
    }

    public int getMinute()
    {
        return m_time.getMinute();
    }

    public void setMinute(int val)
    {
        m_time.setMinute(val);
    }

    public int getSecond()
    {
        return m_time.getSecond();
    }

    public void setSecond(int val)
    {
        m_time.setSecond(val);
    }

    public int getMillisecond()
    {
        return m_time.getMillisecond();
    }

    public void setMillisecond(int val)
    {
        m_time.setMillisecond(val);
    }

    public String toShortTimeString()
    {
        return m_time.toShortTimeString();
    }

    public String toLongTimeString()
    {
        return m_time.toLongTimeString();
    }

    public String toLongDateTimeStringTR()
    {
        return String.format("%s %s", m_date.toLongDateStringTR(), m_time.toLongTimeString());
    }

    public String toLongDateTimeStringEN()
    {
        return String.format("%s %s", m_date.toLongDateStringEN(), m_time.toLongTimeString());
    }

    public String toString()
    {
        return String.format("%s %s", m_date.toString(), m_time.toString());
    }

    public String toStringTR()
    {
        return String.format("%s %s", m_date.toShortDateStringTR(), m_time.toString());
    }

    public String toStringEN()
    {
        return String.format("%s %s", m_date.toShortDateStringEN(), m_time.toString());
    }
}
