package Composite.pattern;

            import java.util.ArrayList;
            import java.util.List;
            
            public class Composite implements Component {
                private List<Component> children = new ArrayList<>();
            
                public void add(Component component) {
                    children.add(component);
                }

                public void operation() {
                    for (Component child : children) {
                        child.operation();
                    }
                }
            }