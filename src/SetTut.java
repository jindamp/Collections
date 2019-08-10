import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTut {
    public static void main(String[] args) {
        SetTut st = new SetTut();

        String str = "asdfagfh";
        String bool = st.isRepeatedChars(str);

        System.out.println(bool);
    }

    public String isRepeatedChars(String str){
        String[] arr = str.split("");
        Set<String> set = new HashSet<>();
        String repeatedChars = "";
        for(int i=0;i<arr.length;i++){
            boolean bool = set.add(arr[i]);
            if(bool==false){
                repeatedChars = repeatedChars + arr[i];
            }
        }
        return repeatedChars;
    }

    public void print(Set<String> data){
        // Creating an iterator
        Iterator value = data.iterator();

        // Displaying the values after iterating through the set
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }
}
