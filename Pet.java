package Assignments;

public class Pet {
    public static void main(String[] args) {
        Pet starr = new Pet();
        Pet pet1 = new Pet("Axy", 1, "Gastonia, NC", "Fish");
        Pet pet2 = new Pet();
        pet2.setName("Loofy");
        pet2.setAge(8);
        pet2.setLocation("Charlotte, NC");
        pet2.setType("Dog");
        Pet pet3 = new Pet();
        pet3.setName("Lizzy");
        pet3.setAge(2);
        pet3.setLocation("Belmont, NC");
        pet3.setType("Lizard");
        // System.out.println(starr.getLocation());
    }

    // Create a Pet Class with the following instance variables:
    private String name;
    private String location;
    private String type;
    private int age;

    // two constructors empty
    Pet() {
        this.name = "Starr";
        this.age = 2;
        this.location = "Gastonia, NC";
        this.type = "Dog";
    }

    // two constructors all attributes
    Pet(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }

    // Code to be able to access the following (Get Methods):
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }

    // Code to be able to change (Set Methods):
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setType(String type) {
        this.type = type;
    }
}