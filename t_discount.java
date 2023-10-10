
public class t_discount {
	
      //private  String month;
      private float a_price = 25;
	  private float total;
	  private int a_no;
      
      public void a_dis(String month,int a_no) {
  	  
		//this.month = month;
		float total,dis;
		this.a_no = a_no;
	   
		if(month == "feb") { 
			 dis = a_no*a_price*15/100;
			 total = a_no*a_price-dis;
			 
		}
		
		else if (month == "jan" || month == "mar" || month == "may" || month == "jul" || month == "aug" || month == "oct" || month == "dec") {
			dis = a_no*a_price*10/100;
			total = a_no*a_price-dis;
		}
		
		else {
			total = a_no*a_price;
		}
		this.total = total;
		}
			
		public String toString(){
			return "ticket price for "+a_no + " adult is "+total;   
		}

		public void printShowSchedule(int ID){
    

			switch(ID){
		
				case(1): System.out.println("Show ID: 1\tShow: Bird show\tSchedsule: 12:30 PM"); break;
				case(2): System.out.println("Show ID: 2\tShow: Splash Safari show\tSchedsule: 2:00 PM");break;
				case(3): System.out.println("Show ID: 3\tShow: Animal Friends Show\tSchedsule: 12:00 PM, 2:30 PM");break;
				case(4): System.out.println("Show ID: 4\tShow: Lion Feeding\tSchedsule: 09:00 AM, 03:00 PM");break;
				case(5): System.out.println("Show ID: 5\tShow: Zoo theatre\tSchedsule: 09:00 AM, 12:30 PM, 3:00 PM");break;
		
			}
		
		}
		public void printRecipt() {
			System.out.println("|********************************************************");
			System.out.println("|              Item|          Quantity|            Price|");
			System.out.println("|********************************************************");
			System.out.println("|Adult              |           ")
		
		}
      
}
