import java.util.*;

public class HashMapDemo
{
    public static void main(String[] args)
    {
        Map<Character,String> item=new HashMap<Character,String>();
        item.put('A',"Idly");
        item.put('B',"Puri");
        item.put('I',"Dosa");
        item.put('P',"Egg");
        item.put('H',"Vada");
        item.put('D',"Bonda");
        item.put('M',"Bread");
      //  System.out.println(item);
        Set<Map.Entry<Character,String>> s=item.entrySet();
        Iterator<Map.Entry<Character,String>> itr=s.iterator();
        while (itr.hasNext())
        {
            Map.Entry<Character,String> map=itr.next();
            System.out.println(map.getKey()+" "+map.getValue());
        }
//        for (Character i: item.keySet())
//        {
//            System.out.println("The value of key "+i+" is "+item.get(i));
//        }
    }
}
