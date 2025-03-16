import java.util.ArrayList;
import java.util.List;

public class Area 
{
    private TipoArea tipoArea;
    private int maxPoltronasFileira, maxFileiras;
    private List<Poltrona> poltronas;
    private boolean lotada;

    public Area(TipoArea tipoArea, int maxPoltronasFileira, int maxFileiras) {
        
        this.tipoArea = tipoArea;
        this.maxPoltronasFileira = maxPoltronasFileira;
        this.maxFileiras = maxFileiras;
        this.lotada = false;

        preencherListaPoltronas();
    }

    private void preencherListaPoltronas() {
        
        poltronas = new ArrayList<>();

        for (int i = 1; i <= maxFileiras; i++)
        {
            for (int j = 1; j <= maxPoltronasFileira; j++)
            {
                poltronas.add(new Poltrona(LetraPoltrona.fromInt(i), j));
            }
        }

    }

    public TipoArea getTipoArea() {
        return tipoArea;
    }

    public int getMaxPoltronasFileira() {
        return maxPoltronasFileira;
    }

    public int getMaxFileiras() {
        return maxFileiras;
    }

    public List<Poltrona> getPoltronas() {
        return poltronas;
    }

    public boolean isLotada() {

        lotada = true;

        for (Poltrona poltrona : poltronas)
        {
            if (poltrona.isDisponivel())
            {
                lotada = false;
                break;
            }
        }

        return lotada;
    }

    @Override
    public String toString() {

        String areaString;
        String poltronaString = "";

        for (Poltrona p : poltronas) {
            poltronaString += p.toString() + " ";
        }

        areaString = "Tipo da Área: " + tipoArea + "\nNúmero de Fileiras de Poltronas: " + maxFileiras + "\nNúmero de Poltronas por Fileira: " + maxPoltronasFileira + "\nPoltronas:\n" + poltronaString + "\n";

        return areaString;
    }
}
