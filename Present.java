import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

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

    public ArrayList<Double> Sorting(Candies... args) {
        ArrayList<Double> sorted_list1 = new ArrayList<>();
        System.out.println("Enter weight or sugar_amount: ");
        Scanner s = new Scanner(System.in); //here you need to enter weight or sugar_amount.
        String s1 = s.next();
        if (s1.equals("weight")) {
            variable = s1;
            ArrayList<Double> sorted_list = new ArrayList<>();
            for (Candies candies : args) {
                sorted_list.add(candies.weight);
            }
            Collections.sort(sorted_list);
            sorted_list1 = sorted_list;
        }
        if (s1.equals("sugar_amount")) {
            variable = s1;
            ArrayList<Double> sorted_list = new ArrayList<>();
            for (Candies candies : args) {
                sorted_list.add(candies.sugar_amount);
            }
            Collections.sort(sorted_list);
            sorted_list1 = sorted_list;
        }
        return sorted_list1;
    }

    public static String getVariable() {
        return variable;
    }
}
