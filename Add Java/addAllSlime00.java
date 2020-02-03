import java.util.*;

public class addAllSlime00 {

   public static void main(String[] args) {
   
      //convert data array to a list
      String[] data ={"cars","clothes","jewelry","women"};
      List<String> list1 = Arrays.asList(data);
      
      ArrayList<String> list2 = new ArrayList<String>();
      list2.add("youtube");
      list2.add("snapchat");
      list2.add("instagram");
      
      for(String x : list2)
         System.out.printf("%s ", x);
         
      Collections.addAll(list2, data);
      
      System.out.println();
      for(String x : list2)
         System.out.printf("%s ", x);
      System.out.println();
      
      System.out.println(Collections.frequency(list2, "cars"));
      
      boolean tof = Collections.disjoint(list1, list2);
      System.out.println(tof);
      
      if(tof)
         System.out.println("these list do not have anything in common");
      else 
         System.out.println("these list do have something in common!");
   
   }

}