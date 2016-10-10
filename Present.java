import java.util.ArrayList;
import java.util.Collections;

public class Present {
    static String variable;
    ArrayList<Candies> main_list = new ArrayList<>();
    double present_weight;

    public double FindWeight(Candies... args) {
        for (Candies i : args) {
            main_list.add(i);
            present_weight += i.weight;
        }
        return present_weight;
    }

    public ArrayList<String> SugarInRange(int i, int j) {
        ArrayList<String> range = new ArrayList<>();
        for (Candies candies : main_list) {
            if (candies.sugar_amount >= i && candies.sugar_amount <= j) {
                range.add(candies.name);
            }
        }
        return range;
    }
    public void sort(){
        Collections.sort(main_list);
    }
    public ArrayList<Candies> ArraylistToString(){
        return main_list;
    }
}