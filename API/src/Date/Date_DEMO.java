package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_DEMO {

    public static void main(String[] args) {
        // 获取时间戳
        System.out.println(System.currentTimeMillis());

        // Date构造
        Date date = new Date();
        System.out.println(date);
        Date date1 = new Date(1595254682557L);
        System.out.println(date1);

        // getTime, 获取日期对应的毫秒值
        System.out.println(date.getTime());

        // 日期的格式化
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(simpleDateFormat.format(date));
        try {
            // 将符合格式的字符串转换为Date对象
            System.out.println(simpleDateFormat.parse("2020-07-20 00:00:00"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
