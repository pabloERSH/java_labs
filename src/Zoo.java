import java.util.ArrayList;

public class Zoo {
    public Zoo(){
        this.animals = new ArrayList<Animal>();
    }
    protected ArrayList<String> animals;
    void add_animal(Animal animal){
        animals.add(animal);
    }
}
