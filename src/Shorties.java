public class Shorties extends Personage{

    String type = "Коротышка";
    Shorties (String name){
        this.name = name;
        this.type = "Коротышка";
    }

    Shorties (String name, double x, double y, int height){
        this.name = name;
        this.type = "Коротышка";
        this.x = x;
        this.y = y;
        this.force = 5;
        this.height = height;
    }

    /**
     * Сравнение коротышек.
     * @param s - второй коротышка
     * @return true - коротышки похожи, false - разные коротышки
     */
    public boolean compare(Shorties s){
        if (equals(s)) {
            System.out.println(this.type + " похож на " + this.name + ".");
            return true;
        }
        else {
            System.out.println(this.type + " не похож на " + this.name + ".");
            return false;
        }
    }

    public void come(Personage p){
        this.x = p.x;
        this.y = p.y;
        System.out.println("Какой-то " + this.type + " подошел к " + p.name + ".");
    }

    /**
     * Коротышка скрылся за деревом
     */
    public void goForThree(Tree t){
        this.x = t.x;
        this.y = t.y;
        System.out.println(this.type + " скрылся за " + t.name + ".");
    }
}
