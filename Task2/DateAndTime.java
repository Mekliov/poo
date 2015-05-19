package Task2;
import java.util.*;


public class DateAndTime {

    public static void main(String[] args) {
        Time nowTime = new Time("Some description");
        List<String> list= new ArrayList<String>();
        list.add(nowTime.getDate()+"  " +nowTime.getTime()+" "+nowTime.getInfo());
        System.out.println(list);
       
       

    }

}
