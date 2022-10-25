public abstract class ConvertisseurNombresRomains {
    public static String
    Convertir(int nombreArabe)
            throws Exception {
        if(nombreArabe <= 3)
            return CaracteresRomains.Zero.ReprésenterSuiteNombre(nombreArabe);

        if(nombreArabe == 4) return UnitéAvantBase(CaracteresRomains.V);

        if(nombreArabe <= 8)
            return CaracteresRomains.V.ReprésenterSuiteNombre(nombreArabe);

        if(nombreArabe == 9) return UnitéAvantBase(CaracteresRomains.X);

        if(nombreArabe <= 13)
            return CaracteresRomains.X.ReprésenterSuiteNombre(nombreArabe);

        if(nombreArabe == 14) return UnitéAvantBase(CaracteresRomains.XV);

        if(nombreArabe <= 18)
            return CaracteresRomains.XV.ReprésenterSuiteNombre(nombreArabe);

        if(nombreArabe == 19) return UnitéAvantBase(CaracteresRomains.XX);
        if(nombreArabe == 20) return "XX";

        throw new Exception();
    }

    private static String UnitéAvantBase(CaracteresRomains base){
        return base.ReprésenterUnitéAvantBase();
    }
}
