package lesson5_6;

// Hide all the field and methods which allow to change the inner state of the class

public class Task5 {

        public static void main(String[] args) {
        }

        public class Cat {
            private String name;
            private int age;
            private int weight;

            private Cat(String name, int age, int weight) {
                this.name = name;
                this.age = age;
                this.weight = weight;
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

            public int getWeight() {
                return weight;
            }

            public void setWeight(int weight) {
                this.weight = weight;
            }
        }

}
