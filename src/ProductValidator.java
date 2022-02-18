public class ProductValidator {
    // ProductValidator:ürünün kurallara uygunluğunu kotrol eder
   static {
        System.out.println("Static Yapıcı blok çalıştı");

    }
    public ProductValidator(){
        System.out.println("Yapıcı blok çalıştı");
    }

    public static boolean isValid(Product product) {
        if (product.price>0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public void bisey(){

    }
    // altaki class a : inner class denir, gruplandırma amaçlı kullanılır
    public static class BaskaBirClass{
       public static void Sil(){

       }
    }
}