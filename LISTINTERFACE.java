import java.util.*;
public class ListInterface
  {
    public static void main(String args[])
    {
      List city =new ArrayList();
      city.add("pune");
      city.add("kanpur");
      city.add("nagpur");
      city.add("hyderabad");
      System.out.println(city);
      city.remove("hyderabad");
      System.out.println(city);
      city.set(2,"kanpur");
      System.out.println(city);
      city.add(2,"nanded");
      city.add(1,"tuljapur");
      System.out.println(city);
      Collections.sort(city);
      System.out.println(city);
    }
  }

