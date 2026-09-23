interface Player {
    void play();
}

class Child implements Player {
    public void play() {
        System.out.println("Child plays with toys.");
    }
}

class Musician implements Player {
    public void play() {
        System.out.println("Musician plays music.");
    }
}

class Actor implements Player {
    public void play() {
        System.out.println("Actor plays a role.");
    }
}

public class PlayerDemo {
    public static void main(String[] args) {
        Player child = new Child();
        Player musician = new Musician();
        Player actor = new Actor();

        child.play();
        musician.play();
        actor.play();
    }
}
