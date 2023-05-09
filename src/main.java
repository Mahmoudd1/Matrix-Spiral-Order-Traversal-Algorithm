public class main {
    public static void main(String[] args) {
        SpiralTraversalAlgorithm sol=new SpiralTraversalAlgorithm();
        int[][]myarr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(sol.spiralOrder(myarr).toString());
    }
}
