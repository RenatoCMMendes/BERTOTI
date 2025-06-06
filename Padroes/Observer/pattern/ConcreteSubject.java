package Observer.pattern;

            import java.util.ArrayList;
            import java.util.List;

            public class ConcreteSubject implements Subject {
                private List<Observer> observers = new ArrayList<>();

                public void attach(Observer o) {
                    observers.add(o);
                }

                public void detach(Observer o) {
                    observers.remove(o);
                }

                public void notifyObservers(String message) {
                    for (Observer o : observers) {
                        o.update(message);
                    }
                }
            }