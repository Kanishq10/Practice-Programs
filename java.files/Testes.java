public class Testes extends Exception {}
class derived extends Testes{}
class test12{
    public static void main(String[] args) {
        try{
            throw new derived();
        }catch(derived t){
           System.out.println("derived");
        }   //catch(Testes s){            //unreachable 
        //     System.out.println(s);
        // }
    }
}
