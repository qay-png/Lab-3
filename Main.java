// STUDENT NAME:
// DATE: 

public class Main
{
    public static void main(String[] args)
    {

        /***** DECLARATION SECTION *****/
        int cmonth=2;
        int cyear=2020;
        int cdate=2;
        int bmonth=8;
        int bdate=26;
        int byear=1918;



        /***** INITIALIZATION SECTION *****/

        /***** INPUT SECTION *****/
        // N/A (no input for this lab)

        /***** CALCULATION & PROCESSING SECTION *****/
        int a=(14-cmonth)/12;
        int m= cmonth+12*a-3;
        int y= cyear+4800-a;
        int cJDN= cdate+(153*m+2)/5+365*y+y/4-y/100+y/400-32045;
        a=(14-bmonth)/12;
        m= bmonth+12*a-3;
        y= byear+4800-a;
        int bJDN= bdate+(153*m+2)/5+365*y+y/4-y/100+y/400-32045;

        /***** OUTPUT SECTION *****/
        System.out.println("Julian Day Number for today's date, 2/2/2020, is "+cJDN);
        System.out.println ();
        System.out.println("Julian Day Number for birthday, 8/26/1918, is "+bJDN);
        System.out.println ();
        int fdate=cJDN-bJDN;
        int yearsold= fdate/365;
        System.out.println("The difference in days is " +fdate+", which makes you approximately " +yearsold+" years old!");




    }
}
