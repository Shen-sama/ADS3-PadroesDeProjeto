public class Poltrona 
{
    private LetraPoltrona letraFileira;
    private int numPoltrona;
    private boolean disponivel;

    public Poltrona (LetraPoltrona letraFileira, int numPoltrona) {

        this.letraFileira = letraFileira;
        this.numPoltrona = numPoltrona;
        this.disponivel = true;

    }

    public LetraPoltrona getLetraFileira() {
        return letraFileira;
    }

    public int getNumPoltrona() {
        return numPoltrona;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return this.letraFileira + "" + this.numPoltrona;
    }
}
