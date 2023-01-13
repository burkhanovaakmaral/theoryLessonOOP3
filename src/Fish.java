public class Fish {
    private String name;
    private int age;
    private String size;
    private String color;
    private String habitat;
    private  String wildOrPets;


    public Fish(String name, int age,String size, String color,String habitat, String wildOrPets){
        this.name = name;
        this.age = age;
        this.size = size;
        this.color = color;
        this.habitat = habitat;
        this.wildOrPets = wildOrPets;
    }

    public Fish(int age) {
        this.age = age;
    }

    public Fish(String name) {
        this.name = name;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getWildOrPets() {
        return wildOrPets;
    }

    public void setWildOrPets(String wildOrPets) {
        this.wildOrPets = wildOrPets;
    }
}
