public class AreaDirector {
    
    public void constructPlateiaA(IAreaBuilder builder) {
        
        builder.setTipoArea(TipoArea.PLATEIA_A);
        builder.setPoltronasFileira(5);
        builder.setFileiras(5);

    }

    public void constructPlateiaB(IAreaBuilder builder) {
        
        builder.setTipoArea(TipoArea.PLATEIA_B);
        builder.setPoltronasFileira(10);
        builder.setFileiras(10);

    }

    public void constructFrisa(IAreaBuilder builder) {
        
        builder.setTipoArea(TipoArea.FRISA);
        builder.setPoltronasFileira(5);
        builder.setFileiras(6);

    }

    public void constructCamarote(IAreaBuilder builder) {
        
        builder.setTipoArea(TipoArea.CAMAROTE);
        builder.setPoltronasFileira(10);
        builder.setFileiras(5);

    }

    public void constructBalcaoNobre(IAreaBuilder builder) {
        
        builder.setTipoArea(TipoArea.BALCAO_NOBRE);
        builder.setPoltronasFileira(10);
        builder.setFileiras(5);

    }

}
