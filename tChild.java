
public class tChild {
    private  String month;
    public float a_price = 18;
    //public float c_price = 18;
    
    public float a_dis(String month,int a_no) {
  	  
  	 this.month = month;
  	 float total=0,dis;
  	
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
  		 return total;
  	}
}
