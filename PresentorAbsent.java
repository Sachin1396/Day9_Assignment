public class PresentorAbsent {
    void present()
    {
        int wage_per_hour = 20;
        int full_day_hour = 8;
        int part_time = 4;
        int daily_wage = 0;
         final int full_time = 0 ;
        final int part = 1 ;
         final int absent = 2 ;
         int number_working_days = 20;
         int total_wage = 0;
         for(int i=1;i<=number_working_days;i++) {
             int random = (int) (Math.random() * 10) % 3;
             switch (random) {
                 case full_time:
                     daily_wage = wage_per_hour * full_day_hour;
                     break;
                 case absent:
                     daily_wage = 0;
                     break;
                 case part:
                     daily_wage = wage_per_hour * part_time;
                     break;
                 default:
                     System.out.println("enter correct");

             }
             //System.out.println("daily wage:" +daily_wage);
             total_wage = total_wage + daily_wage;
         }

         System.out.println("total_wage:"+total_wage);
    }
}
