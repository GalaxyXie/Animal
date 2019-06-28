public class Animals {
    public int age;
    public int weight;
    public Animals(){}
    public Animals(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    public void run(){
        System.out.println("I can run");
    }
    public void eat(){
        System.out.println("I can eat");
    }
}
