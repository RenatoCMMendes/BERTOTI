package Observer.anti_pattern;

            import java.util.ArrayList;
            import java.util.List;

            class Notifier {
                private List<Client> clients = new ArrayList<>();

                public void add(Client client) {
                    clients.add(client);
                }

                public void updateAll(String msg) {
                    for (Client c : clients) {
                        c.receive(msg);
                    }
                }
            }

            class Client {
                public void receive(String msg) {
                    System.out.println("Mensagem recebida: " + msg);
                }
            }

            public class ObserverAntiPattern {
                public static void main(String[] args) {
                    Notifier notifier = new Notifier();
                    notifier.add(new Client());
                    notifier.updateAll("Atualização direta sem contrato!");
                }
            }