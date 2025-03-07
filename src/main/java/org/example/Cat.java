package org.example;

class Cat extends Animal {
    public static int count = 0;
    private boolean satiety;

    public Cat(String name) {
        count++;
        this.name = name;
        this.runLimit = 200;
        this.swimLimit = 0;
        this.satiety = false; // Кот изначально голоден
    }

    public void eat(Bowl bowl, int amount) {
        if (bowl.decreaseFood(amount)) {
            satiety = true;
            System.out.println(name + ": Я покушал " + amount + " единиц еды и теперь сыт!");
        } else {
            satiety = false;
            System.out.println(name + ": Мне не хватило еды в миске!");
        }
    }

    public boolean isSatiated() {
        return satiety;
    }

    public static int getCount() {
        return count;
    }
}
