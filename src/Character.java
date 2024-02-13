public class Character{

    CharacterType characterType;
    private Strategy strategy;

    public Character(CharacterType characterType, Strategy strategy){
        this.characterType = characterType;
        this.strategy = strategy;
    }
    public void attack(){
        strategy.attackStrategy();

    }
    public void defend(){
        strategy.defenseStrategy();

    }

}