package np.com.nabinkhadka;

import org.joda.time.DateTime;

/**
 * Created by nabin_khadka on 11/18/16.
 */
public class EnglishDate {

    public static final String WEEK_DAYS[] = {"Sunday", "Monday", "Tuesday",
            "Wednesday", "Thursday", "Friday", "Saturday"};

    public DateTime englishDate;

    public EnglishDate(DateTime englishDate){
        this.englishDate = englishDate;
    }

    public String toString(){
        return englishDate.getYear() + " / " + englishDate.getMonthOfYear() + " / " +
                englishDate.getDayOfMonth() + " " + WEEK_DAYS[englishDate.getDayOfWeek()];
    }
}