public class Dog implements Animal {
    int age;
    String breed;
    String owner;

    public Dog(int D_age, String D_Breed, String D_owner) {
        age    = D_age;
        breed  = D_Breed;
        owner  = D_owner;
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
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Dog{ " +
                "age= " + age +
                ", breed= '" + breed + '\'' +
                ", owner= '" + owner + '\'' +
                '}';
    }
}
