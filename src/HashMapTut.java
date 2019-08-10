import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTut {

    public static void main(String[] args) {
        HashMapTut hm = new HashMapTut();

        HashMap<Integer,String> list = new HashMap<>();
        list.put(0,"zero");
        list.put(1,"one");
        list.put(2,"two");
        list.put(3,"three");
        list.put(4,"four");

//        hm.printList(list);

        System.out.println("=========== Get =================");
//        System.out.println(list.get(0));

        System.out.println("=========== After Removing =================");
        list.remove(1);
//        hm.printList(list);


        String str = "aaaa";
        String[] arr = str.split("");
        HashMap<String,Integer> hmap = new HashMap<>();

        for(int i=0;i<arr.length;i++){

            Integer count = hmap.get(arr[i]);

            if(count == null){
                hmap.put(arr[i],1);
            }else{
                hmap.put(arr[i],count + 1);
            }
        }

        hm.printList(hmap);
    }

    public void printList(HashMap<String,Integer> map){
        map.forEach((key, value) -> {
            System.out.println("Key = " + key +", Value = " + value);
        });
    }
}
