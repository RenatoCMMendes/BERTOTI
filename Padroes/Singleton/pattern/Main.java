package Singleton.pattern;
            
            public class Main {
                public static void main(String[] args) {
                    Singleton instance = Singleton.getInstance();
                    instance.doSomething();
                }
            }