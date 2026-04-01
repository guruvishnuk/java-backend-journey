import java.util.*;

public class ArrayListBasic{
    public static void main(String[] args) {
     List<String> names = new ArrayList<>();
     
     names.add("Guruvishnu");
     names.add("Satyarth");
     names.add("Satyarthh");

     for(String name:names){
        System.out.println(name);
     }
    }
}