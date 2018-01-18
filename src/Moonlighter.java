public class Moonlighter extends Personage {
    String type = "Лунатик";

    Moonlighter (String name){
        this.name = name;
        this.type = "Лунатик";
    }

    Moonlighter (String name, double x, double y, int height){
        this.name = name;
        this.type = "Лунатик";
        this.x = x;
        this.y =y;
        this.force = 7;
        this.height = height;
    }

    /**
     *  Поднять голову
     */
    public void headUp() {
        System.out.println(this.name + " поднял голову.");
    }

    /**
     * Увидеть коротышку
     */
    public void seeShorties(Shorties k, Shorties... p ){
        System.out.println(this.name + " увидел " + p.length + " коротышек.");
        this.feel();
        for (int i = 0; i < p.length; ++i){
            p[i].compare(k);
        }
    }

    /**
     * Битва Лунатика и Клопа
     * @param p - Клоп
     * @return true - Лунатик победил, false - иначе
     */
    public boolean battle(Flea p){
        if (p.force >= this.force){
            System.out.println(this.name + " не в силах расправиться с ничтожным " + p.name + "ом.");
            if (this.mood != Mood.FURY){
                changeMood(Mood.FURY);
            }
            return true;
        }
        else {
            System.out.println(this.name + " расправился с " + p.name + ".");
            if (this.mood != Mood.HAPPY){
                changeMood(Mood.HAPPY);
            }
            return false;
        }
    }

    /**
     * Метод, который меняет настроение
     * @param newMood - новое настроение персонажа
     */
    public void changeMood(Mood newMood){
        switch (newMood){
            case NORMAL: {
                System.out.println("У " + this.name + " снова пришел в норму.");
                break;
            }
            case SAD: {
                System.out.println(this.name + " расстроился.");
                break;
            }
            case FURY: {
                System.out.println(this.name + " пришел в бешенство.");
                break;
            }
            case HAPPY: {
                System.out.println(this.name + " обрадовался.");
                break;
            }
            default: {
                System.out.println("У " + this.name + " что-то случилось с настроением.");
            }
        }
    }


}
