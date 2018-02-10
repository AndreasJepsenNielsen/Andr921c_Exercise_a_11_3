import java.util.LinkedList;
import java.util.List;

// opgave 3

public class Opgave3
{

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList<Integer>();

        list1.add(0,1);
        list1.add(1,1);
        list1.add(2,2);
        list1.add(3,0);
        list1.add(4,4);
        list1.add(5,5);
        list1.add(6,8);
        list1.add(7,8);
        list1.add(8,8);
        list1.add(9,9);
        list1.add(10,8);
        list1.add(11,8);
        list1.add(12,8);
        list1.add(13,6);
        list1.add(14,14);
        list1.add(15,2);
        list1.add(16,16);

       System.out.println(list1 + "\n");// udskriver listen før den bliver ændret

        removeEvenInRange(list1,5,13);
    }
    public static void removeEvenInRange(List<Integer> list, int startIndex, int endIndex)
    {

        list.subList(startIndex,endIndex).removeIf(a -> a % 2 == 0); //fundet på oracle, går igennem listen fra stardIndex til endIndex og fjerner alle værdier som er lige

        System.out.println(list); // udskriver listen for at se om den gør det rigtigt

    }
}



