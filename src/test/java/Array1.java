public class Array1 {
    int a;
    public static void main(String[] args) {
        int[] x={2,3,4,5,3,7,10};
        Array1 a1=new Array1();
        System.out.println(a1.a);
        int max=x[0],min=x[0];
        for (int i=0;i<x.length;i++){
            if(x[i]>max){
                max=x[i];
            }
        }
        System.out.println("Maximum value is :"+max);
        for (int j=0;j<x.length;j++){
            if(x[j]<min){
                min=x[j];
            }
        }
        System.out.println("minimum value is :"+min);

    }
}
