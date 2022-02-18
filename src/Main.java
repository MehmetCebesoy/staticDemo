public class Main {

    public static void main(String[] args) {
	// static:sabit
        // static,araç amacıyla kullanılır, Bir  kere oluşur
        // static tanımlandığında uygulama sıfırlanana kadar bellek durmaya devam eder
        // ana class static olamaz
        // !:değilse
        ProductManager manager=new ProductManager();
        Product product=new Product();
        product.price=10;
        product.name="";

        manager.add(product);

    }
}
