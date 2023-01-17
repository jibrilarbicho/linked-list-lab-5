
package setandhashset;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.ArrayList;
public class Setandhashset<t1,t2,t3> {
    public  void dis(t1 name,t2 addres,t3 euee){
        System.out.println("name of the school is :"+name +    " address is:   " +addres+ "the largest EUEE  "+euee);   
   
    }
    public static <E> void display(E[] inputarray){
for(E d:inputarray){
    System.out.print(" "+d);
    
}
        System.out.println();

}
    
    public static void main(String[] args) {
        LinkedList<Integer> kulle=new LinkedList<>();
    kulle.add(7);
    kulle.add(8);
    kulle.add(9);
    kulle.add(10);
    kulle.add(9);
    kulle.add(10);
    System.out.println(kulle); 
      Set<Integer> wabi=new HashSet<>(kulle);
    wabi.add(1);   
    wabi.add(2);     
    wabi.add(3);
    wabi.add(4); 
    wabi.add(1); 
    System.out.println(wabi);
           
    //wabi.addAll(kulle); 
   // System.out.println(wabi);
    Set<String> jibril=new TreeSet<>();
    jibril.add("WABI");
     jibril.add("TOKUMMA");
     jibril.add("GELENA");
     jibril.add("CHALTU");
     jibril.add("KEMAL");
    System.out.println(jibril);
    Set<String> walin=new LinkedHashSet<>();
    walin.add("GERESU");
    walin.add("JHON");
    walin.add("SANTOSH");
    walin.add("GETLUCK");
    System.out.println(walin);
    ArrayList<String> ko=new ArrayList<>();
    ko.add("HAWAS");
     ko.add("JEBIRL");
     ko.add("GUTU");
     ko.add("SISAY");
     ko.add("SHUMI");
     System.out.println(ko);
     System.out.println(ko.contains("jebril"));
     System.out.println(ko.contains("jebril"));
    ko.remove("SHUMI");
        System.out.println(ko);
        
       LinkedList<String> jib=new LinkedList<>();
       // stack
       jib.push("sedin");
        jib.push("kiran");
        jib.push("selin");
        jib.push("buki");
        jib.push("sela");
        jib.pop();
        System.out.println(jib);
        //queue
        jib.offer("medina");
        jib.offer("melaku");
        jib.offer("sancho");
        jib.offer("mensur");
        jib.poll();
        jib.poll();
         System.out.println(jib.peekFirst());
          System.out.println(jib.peekLast());
        System.out.println(jib);
        Integer []Intarray={1,2,3,4,5,6};
        Double []dubarray={1.2,3.2,3.5,4.6};
        Character []chararray={'W','A','B','I'};
        System.out.println("INTEGER NUMBERS ARE :");
        display(Intarray);
        System.out.println("DECIMAL NUMBERS ARE :");
        display(dubarray);
        System.out.println("CHARACTERS ARE :");
        display(chararray);
        Setandhashset<String,String,Integer> walle=new Setandhashset<>();
       walle.dis(" EXCEL PREPARATORY SCHOLL","ADAMA ",677); 
         Setandhashset<String,String,Integer> wall=new Setandhashset<>();
         wall.dis("HAWAS PREPARATORY SCHOLL","ADAMA ",599);
          Setandhashset<String,String,Integer> wal=new Setandhashset<>();
          wall.dis("St.JOSEPH PREPARATORY SCHOLL", "FINFINNE ",679);
    }
    
}
