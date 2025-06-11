package Observer.pattern;
            
            public class ConcreteObserverA implements Observer {
                private String name;
            
                public ConcreteObserverA(String name) {
                    this.name = name;
                }

                public void update(String message) {
                    System.out.println(name + " recebeu: " + message);
                }
            }