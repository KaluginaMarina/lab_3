public class Forest implements Location {
    Sound sound = Sound.SILENCE;
    String type = "Лес";

    @Override
    public void stepsShorties() {
        this.sound = Sound.SOUND_STEPS;
        System.out.println("Послышались шаги коротышек.");
    }

    @Override
    public int hashCode(){
        final int power = 239;
        int hash = 0;

        for (int i = 0; i < type.length(); ++i) {
            hash = hash * power + (int)type.charAt(i);
        }

        if (sound == Sound.SOUND_STEPS) {
            hash *= 2;
        } else if (sound == Sound.SILENCE) {
            hash *= 3;
        } else if (sound == Sound.RUSTLE_OF_LEAVES) {
            hash *= 4;
        }
        return hash;
    }

    @Override
    public boolean equals(Object s) {
        if (s == null) {
            return false;
        }
        if (this == s) {
            return true;
        }
        if (!(getClass() == s.getClass())){
            return false;
        }
        else {
            Forest tmp = (Forest) s;
            return (sound == tmp.sound && tmp.type.equals(type));
        }
    }

    @Override
    public String toString(){
        return type;
    }
}
