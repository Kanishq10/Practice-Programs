package advance__java;

class ExcepTION
{
   static int i1, i2, i3;
   public static void main(String[] args)
   {
      try
      {
         test(i1 = 7, oops(i2=2), i3 = 10);
      } catch (Exception e)
      {
         System.out.println(i1+" "+i2+" "+i3);
      }
   }
   static int oops(int i) throws Exception
   {
      throw new Exception("oops");
   }
   static int test(int a, int b, int c) {   
      return a + b + c;   
   }
}