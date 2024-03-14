package dev.rodrigoazlima.study.versions.jdk17.future;

public class SealedClasses {
    static interface Shape {
        int getNumberOfSides();
    }

    int getNumberOfSides(Shape shape) {
        return switch (shape) {
            case WeirdTriangle t -> t.getNumberOfSides();
            case Circle c -> c.getNumberOfSides();
            case Triangle t -> t.getNumberOfSides();
            case Rectangle r -> r.getNumberOfSides();
            case Square s -> s.getNumberOfSides();
            default -> throw new IllegalStateException("Unexpected value: " + shape);
        };
    }

    static record Human(String name, int age, String profession) implements Shape {
        @Override
        public int getNumberOfSides() {
            return 1;
        }
    }

    static record WeirdTriangle(String name, int age, String profession) implements Shape {
        @Override
        public int getNumberOfSides() {
            return 4;
        }
    }

    static record Circle(String name, int age, String profession) implements Shape {
        @Override
        public int getNumberOfSides() {
            return 4;
        }
    }

    static record Triangle(String name, int age, String profession) implements Shape {
        @Override
        public int getNumberOfSides() {
            return 3;
        }
    }

    static record Rectangle(String name, int age, String profession) implements Shape {
        @Override
        public int getNumberOfSides() {
            return 4;
        }
    }

    static record Square(String name, int age, String profession) implements Shape {
        @Override
        public int getNumberOfSides() {
            return 4;
        }
    }
}
