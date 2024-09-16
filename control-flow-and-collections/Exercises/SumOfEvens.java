import java.util.ArrayList;

public class SumOfEvens {
    public static void main (String[] args) {
       ArrayList <Integer> numAList = new ArrayList<>();
       numAList.add(1);
        numAList.add(2);
        numAList.add(3);
        numAList.add(4);
        numAList.add(5);
        numAList.add(6);
        numAList.add(7);
        numAList.add(8);
        numAList.add(9);
        numAList.add(10);
        System.out.println(numAList);
        int total = 0;
        for (Integer i : numAList){
            if (i % 2 == 0){
                total += i;
            }
        }
        System.out.println(total);
    }
}
