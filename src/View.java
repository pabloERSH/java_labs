public class View {
    public static void print_animals(Aquarium aquarium, Aviary_with_grid aviary_with_grid, Aviary_with_infrared_lighting aviary_with_infrared_lighting, Open_aviary open_aviary){
        if(aquarium.animals.size() != 0) {
            System.out.println("Животные, живущие в аквариумах: ");
            for (int i = 0; i < aquarium.animals.size(); i++) {
                aquarium.animals.get(i).print_animal();
            }
        }
        if(aviary_with_grid.animals.size() != 0) {
            System.out.println("Животные, живущие в вольерах покрытых сеткой: ");
            for (int i = 0; i < aviary_with_grid.animals.size(); i++) {
                aviary_with_grid.animals.get(i).print_animal();
            }
        }
        if(open_aviary.animals.size() != 0) {
            System.out.println("Животные, живущие в открытых вольерах: ");
            for (int i = 0; i < open_aviary.animals.size(); i++) {
                open_aviary.animals.get(i).print_animal();
            }
        }
        if(aviary_with_infrared_lighting.animals.size() != 0){
            System.out.println("Животные, живущие в вольерах с инфракрасным освещением: ");
            for (int i = 0; i < aviary_with_infrared_lighting.animals.size(); i++) {
                aviary_with_infrared_lighting.animals.get(i).print_animal();
            }
        }
    }
}
