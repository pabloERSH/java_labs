public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Aquarium aquarium = new Aquarium();
        Aviary_with_grid aviary_with_grid = new Aviary_with_grid();
        Open_aviary open_aviary = new Open_aviary();
        Aviary_with_infrared_lighting aviary_with_infrared_lighting = new Aviary_with_infrared_lighting();
        Controller.create_zoo(zoo);
        Model.move_animals(zoo);

    }
}