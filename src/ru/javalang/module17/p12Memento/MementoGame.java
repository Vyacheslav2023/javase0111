package ru.javalang.module17.p12Memento;

public class MementoGame {
    public static void main(String[] args) {
        Game game = new Game();
        game.set("LVL 1", 30000);
        System.out.println(game);

        File file = new File();
        file.setSave(game.save());

        game.set("LVL 2", 55000);
        System.out.println(game);

        System.out.println("Загружаемся");
    }
}

class Game {
    private String level;
    private int ms;

    public void set(String level, int ms){
        this.level = level;
        this.ms = ms;
    }

    public void load(Save save){
        level=save.getLevel();
        ms = save.getMs();
    }

    public Save save(){
        return new Save(level,ms);
    }

    @Override
    public String toString() {
        return "level = " + level + " ms = " + ms;
    }
}

class Save{
    private final String level;

    private final int ms;

    Save(String level, int ms) {
        this.level = level;
        this.ms = ms;
    }

    public int getMs() {
        return ms;
    }

    public String getLevel() {
        return level;
    }
}

class File{
    Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}