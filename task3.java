import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class task3{
public static void main(String[] args){
Pattern p=Pattern.compile("[0-9]{2}[A-Z]{2}[0-9]{1}[A-Z][0-9]{4}");
Matcher m=p.matcher("16EM1A0525");
while(m.find())
{
System.out.println(m.group());
}
}
}
