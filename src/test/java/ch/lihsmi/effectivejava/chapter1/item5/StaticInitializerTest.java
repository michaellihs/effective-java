package ch.lihsmi.effectivejava.chapter1.item5;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import static org.junit.Assert.*;

public class StaticInitializerTest {

    @Test
    public void isBabyBoomerReturnsTrueForBirthDateWithinBabyBoomerStartAndBabyBoomerEnd() {
        StaticInitializer babyBoomerCheck = new StaticInitializer();
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(1950, Calendar.NOVEMBER, 30);
        Date babyBoomerDate = cal.getTime();
        boolean result = babyBoomerCheck.isBabyBoomer(babyBoomerDate);
        assertTrue(result);
    }

}