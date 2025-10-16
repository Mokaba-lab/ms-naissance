package tech.mouctar.naissance.profiles;

public enum Civility {
    MR("Monsieur"),
    MME("Madame"),
    MLLE("Mademoiselle");

    private final String description;

     Civility(String description) {
        this.description = description;
    }
    public String getLabel() {
        return this.description;
    }
}
