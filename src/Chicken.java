public class Chicken extends Animal implements Edible {

    @Override
    public String sound(){
        return "Chicken: Buck buck buckeeeee!";
    }

    @Override
    public String howToEat(){
        return "Chicken: Fry it!";
    }
}
