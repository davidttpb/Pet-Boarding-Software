public class Dog extends Pet{
    public int dogSpaceNbr;
    private double dogWeight;
    private boolean grooming;

    public Dog(String name, int age){
        super(name, age, "Dog");
    }

    public double getDogWeight(){
        return this.dogWeight;
    }

    public boolean getGrooming(){
        return this.grooming;
    }

    public void setDogWeight(double weight){
        this.dogWeight = (double) weight;
    }

    public void setGrooming(boolean){
        this.grooming = value;
    }
}
