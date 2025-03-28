public enum LetraPoltrona {
    A(1), B(2), C(3), D(4), E(5), F(6), G(7), H(8), I(9), J(10), K(11), L(12), M(13),
    N(14), O(15), P(16), Q(17), R(18), S(19), T(20), U(21), V(22), W(23), X(24), Y(25), Z(26),
    AA(27), AB(28), AC(29), AD(30), AE(31), AF(32), AG(33), AH(34), AI(35), AJ(36), AK(37), 
    AL(38), AM(39), AN(40), AO(41), AP(42), AQ(43), AR(44), AS(45), AT(46), AU(47), AV(48), 
    AW(49), AX(50), AY(51), AZ(52);

    private final int numFileira;

    LetraPoltrona(int numFileira) {
        this.numFileira = numFileira;
    }

    public int getNumFileira() {
        return numFileira;
    }

    public static LetraPoltrona fromInt(int numFileira)
    {
        for (LetraPoltrona tipo : LetraPoltrona.values())
        {
            if (tipo.getNumFileira() == numFileira)
            {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Valor inválido: " + numFileira);
    }

}
