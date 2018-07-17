package app.creational.builder;

/*
 * created by Mahbod Kh with ❤️.
 */


public class Animal {

    private String name;
    private String color;
    private int code;

    public Animal(AnimalBuilder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.code = builder.code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", code=" + code +
                '}';
    }

    public static class AnimalBuilder {
        private String name;
        private String color;
        private int code;

        public AnimalBuilder(String name, int code) {
            this.name = name;
            this.code = code;
        }

        public AnimalBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }
}
