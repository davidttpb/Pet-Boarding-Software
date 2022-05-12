public class Cat extends Pet{
    private int catSpaceNbr;

public Cat(String name, int, age){
    super(name, age, "Cat");
}

public int getCatSpace(){
    return this.catSpaceNbr;
}

public void setCatSpace(int number){
    this.catSpaceNbr = number;
}
}
