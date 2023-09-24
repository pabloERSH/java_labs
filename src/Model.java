public class Model {
    public static void move_animals(Zoo zoo, Aquarium aquarium, Aviary_with_grid aviary_with_grid, Aviary_with_infrared_lighting aviary_with_infrared_lighting, Open_aviary open_aviary){
        for(int i = 0; i < zoo.animals.size(); i++){
            if(zoo.animals.get(i).getClass().getName() == "Waterfowl"){
                zoo.animals.get(i).move(aquarium);
            }
        }
        System.out.println("Животные распределены по вальерам!");
    }
}
