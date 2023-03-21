package TesteEquacao;

public class TesteEquacao {
    public static void main(String[] args) throws Exception {
        EquacaoQuadratica eq1 = new EquacaoQuadratica();
        EquacaoQuadratica eq2 = new EquacaoQuadratica();

        eq1.setA(1);
        eq1.setB(5);
        eq1.setC(-3);

        eq2.setA(-5);
        eq2.setB(-5);
        eq2.setC(-3);

        System.out.println("Equacao 1");
        System.out.println(eq1.getA() + "x² + " + eq1.getB() + "x + " + eq1.getC());
        
        System.out.println("Equacao 2");
        System.out.println(eq2.getA() + "x² + " + eq2.getB() + "x + " + eq2.getC());

        double [] raizesEq1 = new double[2];
        double [] raizesEq2 = new double[2];
        raizesEq1 = eq1.getRaizes();
        raizesEq2 = eq1.getRaizes();

        System.out.printf("S1 = {%s, %s}\n", raizesEq1[0], raizesEq1[1]);
        System.out.printf("S2 = {%s, %s}\n", raizesEq2[0], raizesEq2[1]);
        
    }

}
