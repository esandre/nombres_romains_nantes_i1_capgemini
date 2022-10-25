public abstract class ConvertisseurNombresRomains {
    public static String
    Convertir(int nombreArabe)
            throws Exception {
        if(nombreArabe <= 3)
            return "I".repeat(nombreArabe);

        if(nombreArabe == 4) return "IV";

        throw new Exception();
    }
}
