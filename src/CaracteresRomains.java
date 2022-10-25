class CaracteresRomains {
    public static CaracteresRomains X = new CaracteresRomains(10, "X");
    public static CaracteresRomains V = new CaracteresRomains(5, "V");
    public static CaracteresRomains XV = Add(X, V);
    public static CaracteresRomains Zero = new CaracteresRomains(0, "");
    public static CaracteresRomains XX = Add(X, X);

    private final int valeur;
    private final String representation;

    private CaracteresRomains(int valeur, String representation){
        this.valeur = valeur;
        this.representation = representation;
    }

    public String ReprésenterSuiteNombre(int nombreAReprésenter)
    {
        return this.representation + "I".repeat(nombreAReprésenter - this.valeur);
    }

    private static CaracteresRomains Add(CaracteresRomains a, CaracteresRomains b){
        return new CaracteresRomains(
                a.valeur + b.valeur,
                a.representation + b.representation
        );
    }

    public String ReprésenterUnitéAvantBase() {
        var length =  this.representation.length();
        var prefix = this.representation.substring(0, length - 1);
        var suffix = this.representation.substring(length - 1);
        return prefix + "I" + suffix;
    }
}
