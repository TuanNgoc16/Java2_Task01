import java.util.ArrayList;
import java.util.List;
public class SearchElementsInArrayListExample{
    public static void main(String[] args){
        List<String> names=new ArrayList<>();
        names.add("John");
        names.add ("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");

        System.out.println("Does names array contain \"Bob\"?:"+names.contains ("Bob"));



        System.out.println("indexof \"Steve\": " +names.indexOf ("Steve"));
        System.out.println("indexof \"Mark\":" +names.indexOf ("Mark"));
                     


        System.out.println("lastIndexof \"John\": "  +names.lastIndexOf ("John"));
        System.out.println("lastIndexof \"Bill\": " +names.lastIndexOf ("Bill"));
    }
}
