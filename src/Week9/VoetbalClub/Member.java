package Week9.VoetbalClub;

public class Member {
    private int id;
    private String name;
    private MemberType type;

    public Member(int id, String name, MemberType type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public MemberType getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
