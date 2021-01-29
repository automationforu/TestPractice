public class Encapsulation {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>=18 && age<25){
            this.age=age;
        }
        if(age>=0 && age<=18){
            this.age=age;
            System.out.println("not valid age criteria");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
