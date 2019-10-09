package lesson5_6;

public class Boxer {

        public int age;
        public int weight;
        public int strength;

        public Boxer(int age, int weight, int strength) {
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Boxer anotherBoxer) {
            // write your code here
            if(anotherBoxer.age>this.age
               && anotherBoxer.weight>this.age
               && anotherBoxer.strength<this.strength)
                return true;
            else
                return false;
        }

        public static void main(String[] args) {
            Boxer boxer1 = new Boxer(18, 70, 100);
            Boxer boxer2 = new Boxer(28, 90, 96);

            System.out.println("Boxer 1 (18, 70, 100) fight = "+ boxer1.fight(boxer2));
            System.out.println("Boxer 2 (18, 70, 100) fight = "+ boxer2.fight(boxer1));

        }

}

