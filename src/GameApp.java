public class GameApp{
    public static void main(String[] args) {
        Strategy castSpell = new CastSpell();
        Strategy shootArrow = new ShootArrow();
        Strategy swingSword = new SwingSword();

        Character knight = new Character(CharacterType.Knight, swingSword);
        Character wizard = new Character(CharacterType.Wizard, castSpell);
        Character archer = new Character(CharacterType.Archer, shootArrow);

        System.out.println();
        knight.attack();
        knight.defend();

        System.out.println();
        wizard.attack();
        wizard.defend();


        System.out.println();
        archer.attack();
        archer.defend();
    }
}