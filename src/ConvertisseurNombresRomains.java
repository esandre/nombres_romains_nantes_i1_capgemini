public abstract class ConvertisseurNombresRomains {
    public static String
    Convertir(int nombreArabe)
            throws Exception {
        if(nombreArabe <= 3)
            return CaracteresRomains.Zero.ReprésenterSuiteNombre(nombreArabe);

        if(nombreArabe == 4) return "IV";

        if(nombreArabe <= 8)
            return CaracteresRomains.V.ReprésenterSuiteNombre(nombreArabe);

        if(nombreArabe == 9) return "IX";

        if(nombreArabe <= 13)
            return CaracteresRomains.X.ReprésenterSuiteNombre(nombreArabe);

        if(nombreArabe == 14) return "XIV";

        if(nombreArabe <= 18)
            return CaracteresRomains.XV.ReprésenterSuiteNombre(nombreArabe);

        if(nombreArabe == 19) return "XIX";
        if(nombreArabe == 20) return "XX";

        throw new Exception();
    }
}
