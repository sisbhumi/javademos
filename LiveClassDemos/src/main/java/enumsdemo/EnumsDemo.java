package enumsdemo;

public class EnumsDemo {
	public static void main(String args[]) {
		PaymentType pt = PaymentType.DEBITCARD;
		System.out.println(pt);
		
		PaymentType[] values = PaymentType.values();//enum array
		
		for(PaymentType paymentType: values) {
			System.out.println(paymentType);
			System.out.println(paymentType.ordinal());
		}
	}
}

enum PaymentType{
	DEBITCARD(5),
	CREDITCARD(10),
	CASH(1);
	
	int fee;
	PaymentType(int fee){
		this.fee = fee;
	}
	
	public int getFee() {
		return this.fee;
	}
}

class PaymentT{
	static final Payment DEBITCARD = new PaymentT();
	
	
}