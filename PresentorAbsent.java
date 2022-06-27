public class PresentorAbsent {
    void present()
    {
        int wage_per_hour = 20;
        int full_day_hour = 8;
        int part_time = 4;
        int daily_wage;
        int random = (int)(Math.random() * 10)%3;
        if(random==1)
        {
            System.out.println("Employee is present");
            daily_wage = wage_per_hour *  full_day_hour ;
            System.out.println("daily wage :"+daily_wage);
        } else if (random==2) {
        System.out.println("employee is absent");
            daily_wage = 0;
            System.out.println("Daily wage:"+daily_wage);
        }
        else {
            System.out.println("employee is Partime");
            daily_wage = wage_per_hour * part_time;
            System.out.println("Daily wage:"+daily_wage);

        }

    }
}
