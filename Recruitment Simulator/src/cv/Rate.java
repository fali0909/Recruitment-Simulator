package cv;

public class Rate {
		private static int previous = 0;  
		
		private int num;
		private String buyer;
		
		public Rate(String name) {
			previous++;
			num = previous;
			buyer = name;
		}
		
		public int num() {
			return num;
		}
		
		public String buyer() {
			return buyer;
		}
		
		@Override
		public String toString() {
			return String.format("Ticket Ref: %3d\tPurchase by: %s", num, buyer);
		}
}
