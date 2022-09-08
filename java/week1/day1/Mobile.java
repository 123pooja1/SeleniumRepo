package week1.day1;

public class Mobile {
	public void makecall() {
		System.out.println("Call Pooja");
	}
	public void sendsms() {
		System.out.println("Hi Pooja");
	}
	String mobileModel="Readme Note 9 Max Pro";
	float mobileWeight=200.1f;
	
	boolean FullCharged=true;
	int mobileCost=18000;
    public static void main(String[] args) {
    	Mobile obj=new Mobile();
    	System.out.println("This is my mobile");
    	obj.makecall();
    	obj.sendsms();
    	
		
	}

}
