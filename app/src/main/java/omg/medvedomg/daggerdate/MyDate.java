package omg.medvedomg.daggerdate;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by medvedomg on 12.12.16.
 */

public class MyDate {
    public String getMyDate() {
        return String.valueOf(Calendar.getInstance().get(Calendar.DATE));
    }
}
