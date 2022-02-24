package qualRound;

public final class Skill {
    final int level;
    final String name;

    public Skill(int level, String name) {
        this.level = level;
        this.name = name;
    }

    public Skill(Skill other) {
        this.level = other.level;
        this.name = other.name;
    }
    public Skill changeName(String otherN){
        return new Skill(level, otherN);
    }
    public Skill incrementLevel(){
        return new Skill(level+1,name);
    }
    public Skill changeLevel(int to){
        return new Skill(to,name);
    }
}
