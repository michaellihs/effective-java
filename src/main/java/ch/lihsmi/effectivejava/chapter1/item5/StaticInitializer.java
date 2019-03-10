package ch.lihsmi.effectivejava.chapter1.item5;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class StaticInitializer {

    // DON'T DO THIS
    public boolean isBabyBoomerNonStatic(final Date birthDate) {
        // Problem: create unnecessary object each time, method is called
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomStart = cal.getTime();
        cal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        Date boomEnd = cal.getTime();
        return birthDate.compareTo(boomStart) >= 0 &&
                birthDate.compareTo(boomEnd) < 0;
    }

    // DO THIS INSTEAD: use static initializer instead
    private static final Date BOOM_START;
    private static final Date BOOM_END;

    static {
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        cal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        BOOM_START = cal.getTime();
        cal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        BOOM_END = cal.getTime();
    }


    public boolean isBabyBoomer(final Date birthDate) {
        int boomStart = birthDate.compareTo(BOOM_START);
        int boomEnd   = birthDate.compareTo(BOOM_END);
        return boomStart >= 0 &&
                boomEnd < 0;
    }

}
