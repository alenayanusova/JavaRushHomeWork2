package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human grandPaOne = new Human("Василий", true, 80, null, null);
        System.out.println(grandPaOne.toString());
        Human grandPaTwo = new Human("Аркадий", true, 82, null, null);
        System.out.println(grandPaTwo.toString());
        Human grandMaOne = new Human("Тамара", false, 78, null, null);
        System.out.println(grandMaOne.toString());
        Human grandMaTwo = new Human("Галина", false, 79, null, null);
        System.out.println(grandMaTwo.toString());
        Human father = new Human("Григорий", true, 48, grandPaOne, grandMaOne);
        System.out.println(father.toString());
        Human mother = new Human("Глафира", false, 45, grandPaTwo, grandMaTwo);
        System.out.println(mother.toString());
        Human childOne = new Human("Анна", false, 25, father, mother);
        System.out.println(childOne.toString());
        Human childTwo = new Human("Сергей", true, 21, father, mother);
        System.out.println(childTwo.toString());
        Human childThree = new Human("Анатолий", true, 15, father, mother);
        System.out.println(childThree.toString());

    }

    public static class Human
    {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        Human father, mother;

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
