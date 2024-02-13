public class CastSpell implements Strategy {
    public void attackStrategy(){
        System.out.println("Wizard casts a spell!");
    }
    public void defenseStrategy(){
        System.out.println("Creating a magic barrier for defense!");
    }
}