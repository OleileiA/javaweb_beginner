package Calendar;

import java.util.Calendar;

public class Calendar_demo {
    public static void main(String[] args) {
        // 日历类的使用,很多操纵时间的优秀方法
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR)); // 年
        System.out.println(calendar.get(Calendar.MONTH));// 月
        System.out.println(calendar.get(Calendar.DATE)); // 日期
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        calendar.set(2019,9,9);// 设置日期
        calendar.add(Calendar.YEAR, 1); // 加一年
        System.out.println(calendar.getTime());
        System.out.println(calendar.getTimeInMillis());
    }
}
