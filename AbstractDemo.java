

class AbstractDemo
{
    public static void main(String Arg[])
    {
        // RBI robj = new RBI(); //We cant create object of abstract class
        RBI robj1 = new SBI();
        RBI robj2 = new BOM();

        SBI sobj = new SBI();
        BOM bobj = new BOM();

        sobj.DisplayRules();
        bobj.DisplayRules();

        float fRet =0.0f;
        fRet = sobj.CalculateROI();
        System.out.println("ROI of SBI is :"+fRet);

        fRet = bobj.CalculateROI();
        System.out.println("ROI of BOM is :"+fRet);
        
    }
}
abstract class RBI
{
   public abstract float CalculateROI();
   // virtual float CalulateROI()= 0; // in C++;

   public void DisplayRules()
   {
    System.out.println("YOU haveto submit Adhar card and Pan card");
    System.out.println("Minimum balance is 10000");
   }
}
class SBI extends RBI
{
    public float CalculateROI()
       {
        return 5.7f;
       }
}
class BOM extends RBI
{
    public float CalculateROI()
    {
        return 7.7f;
    }
}