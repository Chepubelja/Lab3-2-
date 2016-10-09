public class Main extends Present {
    public static void main(String[] args) {
        Picnic picnic = new Picnic("picnic", 100, 25.6);
        KitKat kitkat = new KitKat("kitkat", 125, 34.5);
        Twix twix = new Twix("twix", 150, 36.6);
        Present p = new Present();
        System.out.println("Weight of the New Year's present: " + p.FindWeight(picnic, kitkat, twix));
        System.out.println("Candies with given amount of sugar: " + p.SugarInRange(26, 48));
        System.out.println(p.Sorting(picnic, kitkat, twix)+ " = list, sorted by " + getVariable() + ".");
    }
}
