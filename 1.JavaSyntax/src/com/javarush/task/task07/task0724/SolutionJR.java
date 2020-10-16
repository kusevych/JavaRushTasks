package com.javarush.task.task07.task0724;

public class SolutionJR {
    public static void main(String[] args) {
        Solution.Human paternalGrandfather = new Solution.Human("Петр", true, 61);
        Solution.Human paternalGrandmother = new Solution.Human("Мария", false, 60);

        Solution.Human maternalGrandfather = new Solution.Human("Александр", true, 63);
        Solution.Human maternalGrandmother = new Solution.Human("Ольга", false, 62);


        Solution.Human father = new Solution.Human("Андрей", true, 35, paternalGrandfather, paternalGrandmother);
        Solution.Human mother = new Solution.Human("Елена", false, 30, maternalGrandfather, maternalGrandmother);

        Solution.Human firstChild = new Solution.Human("Игорь", true, 15, father, mother);
        Solution.Human secondChild = new Solution.Human("Сергей", false, 10, father, mother);
        Solution.Human thirdChild = new Solution.Human("Виктор", true, 5, father, mother);

        System.out.println(paternalGrandfather);
        System.out.println(paternalGrandmother);
        System.out.println(maternalGrandfather);
        System.out.println(maternalGrandmother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(firstChild);
        System.out.println(secondChild);
        System.out.println(thirdChild);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Solution.Human father;
        Solution.Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Solution.Human father, Solution.Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
