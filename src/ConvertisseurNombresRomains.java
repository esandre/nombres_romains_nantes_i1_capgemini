public abstract class ConvertisseurNombresRomains {
    public static String
    Convertir(int nombreArabe)
            throws Exception {
        if(nombreArabe <= 3)
            return "I".repeat(nombreArabe);

        if(nombreArabe == 4) return "IV";

        if(nombreArabe <= 8)
            return "V" + "I".repeat(nombreArabe - 5);

        if(nombreArabe == 9) return "IX";

        throw new Exception();
    }
}
