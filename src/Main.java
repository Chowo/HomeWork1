public class Main {
    public static void main(String[] args) {
        //task01
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task02
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task03
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task04
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //task05
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //task06
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var boxersWeight = firstBoxerWeight + secondBoxerWeight;
        var weightDifference = firstBoxerWeight - secondBoxerWeight;
        System.out.println(boxersWeight);
        System.out.println(weightDifference);

        //task07
        weightDifference = secondBoxerWeight % firstBoxerWeight;
        System.out.println(weightDifference);

        //task08
        var workTime = 640;
        var workTimeProPerson = 8;
        var workersAmount = workTime / workTimeProPerson;
        System.out.println("Всего работников в компании - " + workersAmount + " человек");

        workersAmount = workersAmount + 94;
        workTime = workTimeProPerson * workersAmount;
        System.out.println("Если в компании работает " + workersAmount + " человек, то всего " + workTime + " часов работы может быть поделено между сотрудниками");


    }
}