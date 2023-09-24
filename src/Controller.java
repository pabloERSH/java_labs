import java.util.Scanner;

public class Controller {
    public static void create_zoo(Zoo zoo){
        System.out.println("Введите информацию о животных в зоопарке: ");
        System.out.println("Введите количество животных в зоопарке: ");
        Scanner s = new Scanner(System.in);
        int n = Input.num_int();
        for(int i = 0; i<n; i++){
            System.out.println("Выберете вид животного\n(1 - водоплавающие\n2 - пернатые\n3 - копытные\n4 - хладнокровные): ");
            int k;
            while(true){
                k = Input.num_int();
                if(k>0 & k<5){
                    break;
                }else{
                    System.out.println("Неверный ввод!");
                }
            }
            switch (k) {
                case 1 -> {
                    Waterfowl waterfowl = new Waterfowl();
                    waterfowl.set_animal();
                    zoo.add_animal(waterfowl);
                }
                case 2 -> {
                    Feathered feathered = new Feathered();
                    feathered.set_animal();
                    zoo.add_animal(feathered);
                }
                case 3 -> {
                    Ungulates ungulates = new Ungulates();
                    ungulates.set_animal();
                    zoo.add_animal(ungulates);
                }
                case 4 -> {
                    Cold_blooded cold_blooded = new Cold_blooded();
                    cold_blooded.set_animal();
                    zoo.add_animal(cold_blooded);
                }
            }
        }
    }
}
