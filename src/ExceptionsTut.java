/*
 * 1. Try
 * 2. Catch
 * 3. Finally
 * 4. Throw
 * 5. Throws
 *
 * */

public class ExceptionsTut {

    public static void main(String[] args) {
        ExceptionsTut ext = new ExceptionsTut();
//        HashMapTut hashMapTut = new HashMapTut();
//        hashMapTut.err();


//        System.out.println("1. " + ext.divide("4", "2"));
//        System.out.println("2. " + ext.divide("2", "0"));
//        System.out.println("3. " + ext.divide(null, "2"));

        try{
            ext.divide2("1", "0");
            ext.divide2("2", "2");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        ext.divide2("2", "2");

    }



    public long divide2(String a, String b) {

        if(a=="2"){
            throw new ArithmeticException("2 cannot be used in this method");
        }

        return 0;
    }

    public long divide(String a, String b)  throws NumberFormatException, ArithmeticException{
        long ans = 0;

        try {

            int a1 = Integer.parseInt(a);
            int b1 = Integer.parseInt(b);
            ans = a1 / b1;

        } catch (NumberFormatException ne) {
            System.out.println("erro: passed value is not number");
        } catch (ArithmeticException ae) {
            System.out.println("error: zero cannot be used for divison");
        } catch (Exception e) {
            System.out.println("global exception");
        } finally {
            System.out.println("Finally Block");
        }


        return ans;
    }
}
