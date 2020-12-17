package Pr21.Ex2;

public class FactoryOfChair implements Factory{
    @Override
    public VictorianChair createVictorian() {
        return (new VictorianChair());
    }

    @Override
    public MultiFunctionChair createMultiFunctionChair() {
        return (new MultiFunctionChair());
    }

    @Override
    public MagicChair createMagicChair() {
        return (new MagicChair());
    }
}