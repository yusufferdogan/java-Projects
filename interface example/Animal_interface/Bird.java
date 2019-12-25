public class Bird implements Animal {
    int age;
    String breed;
    String Colour;

    Bird(int D_age, String D_Breed, String D_Colour) {
        age    = D_age;
        breed  = D_Breed;
        Colour  = D_Colour;
    }
    @Override
    public void Walk() {
        System.out.println("i can walk");
    }

    @Override
    public void Fly() {
        System.out.println("i can't fly");
    }

    @Override
    public void Eat() {
        System.out.println("i can eat");
    }
    @Override
    public void Print(){
        Animal.super.Print();
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Bird {" +
                "age= " + age +
                ", breed= '" + breed + '\'' +
                ", Colour= '" + Colour + '\'' +
                '}';
    }
}
