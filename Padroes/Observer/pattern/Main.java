package Observer.pattern;
            
            public class Main {
                public static void main(String[] args) {
                    ConcreteSubject subject = new ConcreteSubject();
                    Observer obs1 = new ConcreteObserverA("Observer A");
                    Observer obs2 = new ConcreteObserverB("Observer B");

                    subject.attach(obs1);
                    subject.attach(obs2);

                    subject.notifyObservers("Nova atualização disponível!");
                }
            }