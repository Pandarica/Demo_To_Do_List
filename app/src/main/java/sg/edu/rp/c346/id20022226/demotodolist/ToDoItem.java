package sg.edu.rp.c346.id20022226.demotodolist;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ToDoItem {
    private String title;
    private Calendar date;

    public ToDoItem(String title, Calendar date) {
        this.title = title;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public Calendar getDate() {
        return date;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    @Override
    public String toString() {
        Date date = this.date.getTime();

        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        String date1 = format1.format(date);

        SimpleDateFormat format2 = new SimpleDateFormat("EEEE");
        String day = format2.format(date);

        String str = date1 + "(" + day + ")";

        return str;
    }

    private String getDay(int day) {
        switch (day) {
            case 1: return "Monday";

            case 2: return "Tuesday";

            case 3: return "Wednesday";

            case 4: return "Thursday";

            case 5: return "Friday";

            case 6: return "Saturday";

            case 7: return "Sunday";

            default: return "";
        }
    }
}
