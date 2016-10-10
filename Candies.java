public class Candies implements Comparable<Candies>{
    String name;
    int weight;
    double sugar_amount;
    public Candies(String name, int weight, double sugar_amount){
        this.name = name;
        this.weight = weight;
        this.sugar_amount = sugar_amount;
    }
    @Override
    public int compareTo(Candies b){
        return (this.weight - b.weight);
    }
//    public double compareTo1(Candies c){
//        return  (this.sugar_amount - c.sugar_amount);
//    }

    public String toString(){
        return this.name + " - " + this.weight;
    }
}

