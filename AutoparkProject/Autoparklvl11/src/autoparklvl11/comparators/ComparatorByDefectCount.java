package autoparklvl11.comparators;

import java.util.Comparator;

public class ComparatorByDefectCount implements Comparator<String> {
    @Override
    public int compare(String breaking1, String breaking2) {
        char[] chars1 = breaking1.toCharArray();
        char[] chars2 = breaking2.toCharArray();
        int count1 =Character.getNumericValue(chars1[chars1.length-1]);
        int count2 =Character.getNumericValue(chars2[chars2.length-1]);
        if(count1<count2){
            return -1;
        }
        else{
            if(count1>count2){
                return 1;
            }
            return 0;
        }
    }
}
