package Observer.pattern;
            
            public class ConcreteObserverB implements Observer {
                private String name;
            
                public ConcreteObserverB(String name) {
                    this.name = name;
                }

                public void update(String message) {
                    System.out.println(name + " recebeu: " + message);
                }
            }