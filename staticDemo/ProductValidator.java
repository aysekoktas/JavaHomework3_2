package staticDemo;

public class ProductValidator {
//stqtic olan yapılarda direk sınıf ismi ile çağrılabilir..
	
	//ana class static olamaz
	
	static {
		System.out.println("Statik yapıcı blok çalıştı."); // static yapının çalışması için new lenmesine gerek yoktur 
	}
	
	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı."); //sistem new lenince yapıcı blok çalıştı
	}
	
	public static  boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
}
	public void bisey() {
		
	}
	//inner class
	public class BaskaBirClass{
		public static void Sil() {
			
		}
	}

}
