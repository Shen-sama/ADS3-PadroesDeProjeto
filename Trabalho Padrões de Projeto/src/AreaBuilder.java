public class AreaBuilder implements IAreaBuilder {

    private TipoArea tipoArea;
    private int maxPoltronasFileira, maxFileiras;

    @Override
    public void setTipoArea(TipoArea tipoArea) {
        this.tipoArea = tipoArea;
    }

    @Override
    public void setPoltronasFileira(int maxPoltronasFileira) {
        this.maxPoltronasFileira = maxPoltronasFileira;
    }

    @Override
    public void setFileiras(int maxFileiras) {
        this.maxFileiras = maxFileiras;
    }

    public Area getResultArea() {
        return new Area(tipoArea, maxPoltronasFileira, maxFileiras);
    }

}
