public class ExceptionDemo1 {
    public static void main(String[] args) {
        try {
            int[] x={0,20,30};
            System.out.println(x[9]);
        }
        catch (Exception e){
            System.out.println("Bad code"+e);
            System.out.println("Exception is :"+e.getMessage());
            e.printStackTrace();
        }
//        finally {
//            System.out.println("finally");
//        }
        System.exit(0);
    }
}
