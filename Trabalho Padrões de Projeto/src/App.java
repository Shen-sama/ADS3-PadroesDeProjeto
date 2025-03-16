public class App {
    public static void main(String[] args) throws Exception {

        AreaDirector areaDirector = new AreaDirector();
        AreaBuilder areaBuilder = new AreaBuilder();

        areaDirector.constructPlateiaA(areaBuilder);

        Area plateiaA = areaBuilder.getResultArea();

        areaDirector.constructPlateiaB(areaBuilder);

        Area plateiaB = areaBuilder.getResultArea();

        areaDirector.constructFrisa(areaBuilder);

        Area frisa = areaBuilder.getResultArea();

        areaDirector.constructCamarote(areaBuilder);

        Area camarote = areaBuilder.getResultArea();

        areaDirector.constructBalcaoNobre(areaBuilder);

        Area balcaoNobre = areaBuilder.getResultArea();

        System.out.println(plateiaA.toString());
        System.out.println(plateiaB.toString());
        System.out.println(frisa.toString());
        System.out.println(camarote.toString());
        System.out.println(balcaoNobre.toString());
    }
}
