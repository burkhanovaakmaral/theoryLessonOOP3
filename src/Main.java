

public class Main {
    public static void main(String[] args) {

        Fish fish = new Fish("Trout",5,"Small","Gray","River","Wild");
         Fish fish1 = new Fish(" Trout");
        System.out.println("bye");
        System.out.println("bye");




        System.out.println(fish.getName()+","+fish.getAge()+","+fish.getSize()+","+fish.getColor()+", "+fish.getHabitat()+","+fish.getWildOrPets());
        System.out.println(fish1.getName());

    }
  }