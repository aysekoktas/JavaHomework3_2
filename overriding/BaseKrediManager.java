package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) { //final methodu ile overriding yapılamaz 
		return tutar * 1.18;
	}
}
