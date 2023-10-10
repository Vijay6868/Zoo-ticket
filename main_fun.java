class main_fun {


    public static void main(String[] args) {
        t_discount t = new t_discount();
        tChild tC = new tChild();
        t.a_dis("feb", 3);
        System.out.println(t.toString());
       
        main_fun test = new main_fun();

        
        
        //System.out.println(tC.a_dis("feb",3));
        //System.out.println(tC.a_dis("mar",3));
        //System.out.println(tC.a_dis("apr",3));

        
        test.printShowSchedule(5);
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
}