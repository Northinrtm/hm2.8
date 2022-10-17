import java.util.Objects;

public class Products {
    private final String name;
    private float price;
    private float weight;

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price > 0.0f) {
            this.price = price;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight > 0.0f) {
            this.weight = weight;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
    }

    public Products(String name, float price, float weight) {
        if (name != null) {
            this.name = name;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
        setPrice(price);
        setWeight(weight);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Products)) return false;
        Products products = (Products) o;
        return getName().equals(products.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}

