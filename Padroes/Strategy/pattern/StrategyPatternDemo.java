public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(new StrategyA());
        context.execute();

        context.setStrategy(new StrategyB());
        context.execute();
    }
}