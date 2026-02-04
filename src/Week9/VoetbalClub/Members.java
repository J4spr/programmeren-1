package Week9.VoetbalClub;

public class Members {
    private static int counter;
    private Member[] members;
    private int amount;

    public Members(Member[] members, int amount) {
        this.members = members;
        this.amount = amount;
        Members.counter++;
    }

    public Members() {
        this.members = new Member[100];
        this.amount = 0;
    }

    public void addMember(Member member) {
        this.members[counter] = member;
    }

    public int getAmount() {
        return this.amount;
    }

    public Member getMember(int index) {
        if (index > this.members.length)
            return null;
        return this.members[index];
    }

    public boolean printActiveMembers(){
        return false;
    }
}
