package Strategy.anti_pattern;
            
class Calculator {
    private String type;

    public Calculator(String type) {
        this.type = type;
    }

    public void calculate() {
        if (type.equals("A")) {
            System.out.println("Cálculo com algoritmo A");
        } else if (type.equals("B")) {
            System.out.println("Cálculo com algoritmo B");
        } else {
            System.out.println("Algoritmo desconhecido");
        }
    }
}

public class StrategyAntiPattern {
    public static void main(String[] args) {
        Calculator c1 = new Calculator("A");
        c1.calculate();

        Calculator c2 = new Calculator("B");
        c2.calculate();
    }
}