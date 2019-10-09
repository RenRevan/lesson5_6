package lesson5_6;

public class Dog {
    private String name;
    private int age;

    public void setDogParam(String name, int age){
        if (name.equals("")) this.name="NoName";
           else  this.name = name;
        if(age<0)this.age=0;
        else this.age = age;
    }

    public String getDogName(){
        return this.name;
    }
    public int getDogAge(){
        return this.age;
    }

    public static void main(String[] arg){
        Dog dog1 = new Dog();
        dog1.setDogParam("Leo", 4);
        System.out.print("our dog params: "+dog1.getDogName()+", "+dog1.getDogAge());
    }


}
