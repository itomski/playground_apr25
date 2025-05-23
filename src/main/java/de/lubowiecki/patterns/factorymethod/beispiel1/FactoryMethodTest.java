package de.lubowiecki.patterns.factorymethod.beispiel1;

public class FactoryMethodTest {

    public static void main(String[] args) {

        doSomething(new BrotFactory());
        //doSomething(new StreichFettFactory());

    }

    public static void doSomething(ProductFactory factory) {
        Product product = factory.create();
        System.out.println(product.getDescription());
        product.use();
    }
}
