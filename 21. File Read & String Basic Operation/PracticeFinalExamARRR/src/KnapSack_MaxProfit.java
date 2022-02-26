import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

public class KnapSack_MaxProfit {
    public void test(){
    Scanner sc = new Scanner(System.in);
    int tItem;
    tItem = sc.nextInt();
    int wLimit;
    wLimit = sc.nextInt();
    HashMap<Double, Integer> UnitpriceWeight = new HashMap<Double, Integer>();

    for (int i = 0; i < tItem; i++)
    {
//        System.out.println("Item "+i+":");
//        System.out.print("Price "+i+":");
        int price = sc.nextInt();
//        System.out.print("Weight "+i+":");
        int weight = sc.nextInt();
        double unitPrice = (double)price/weight;
        UnitpriceWeight.put(unitPrice, weight);
    }
    long startTime = Instant.now().toEpochMilli();

    HashMap<Double, Integer> sortedUnitpriceWeight = hmDescSortByKey(UnitpriceWeight);

    double maxProfit = 0;
    while (wLimit > 0){
        for (Double iterator: sortedUnitpriceWeight.keySet()){
            if(wLimit >= sortedUnitpriceWeight.get(iterator)){
                wLimit = wLimit - sortedUnitpriceWeight.get(iterator);
                maxProfit = maxProfit + sortedUnitpriceWeight.get(iterator)*iterator;
            } else {
                maxProfit = maxProfit + wLimit*iterator;
                wLimit = 0;
            }
        }
    }
       System.out.println("Max profit = "+maxProfit);


    long endTime = Instant.now().toEpochMilli();

    long timeElapsed = endTime - startTime;
       System.out.println((double) timeElapsed/1000+" second");


}

    public static HashMap<Double, Integer> hmDescSortByKey(HashMap<Double,Integer> hm)
    {
        HashMap<Double, Integer> temp = hm.entrySet().stream().sorted(HashMap.Entry.comparingByKey(Comparator.reverseOrder())).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1, e2) -> e1, LinkedHashMap::new));
        return temp;
    }
}
