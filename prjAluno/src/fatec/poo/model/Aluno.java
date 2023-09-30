package fatec.poo.model;

/**
 *
 * @author grazi
 */
public class Aluno {

    private int RA;
    private double NtPrv1;
    private double NtPrv2;
    private double NtTrab1;
    private double NtTrab2;

    public void setRA(int ra) {
        RA = ra;
    }

    public void setNtPrv1(double prv1) {
        NtPrv1 = prv1;
    }

    public void setNtPrv2(double prv2) {
        NtPrv2 = prv2;
    }

    public void setNtTrab1(double trab1) {
        NtTrab1 = trab1;
    }

    public void setNtTrab2(double trab2) {
        NtTrab2 = trab2;  // atribuir o valor da variavel do parametro trab2 no atributo NtTrab2 
    }

    public int getRA() {
        return RA; //retorna o atributo
    }

    public double getNtPrv1() {
        return NtPrv1;
    }

    public double getNtPrv2() {
        return NtPrv2;
    }

    public double getNtTrab1() {
        return NtTrab1;
    }

    public double getNtTrab2() {
        return NtTrab2;
    }

    public double calcMediaProva() {
        return 0.75 * (NtPrv1 + 2 * NtPrv2) / 3;

    }
    public double calcMediaTrab(){
        return 0.25 * (NtTrab1 + NtTrab2);
    }
    public double calcMediaFinal(){
        return (calcMediaProva() + calcMediaTrab());
    }

}
