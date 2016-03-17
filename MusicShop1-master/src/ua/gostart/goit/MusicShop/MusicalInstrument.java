package ua.gostart.goit.MusicShop;

public abstract class MusicalInstrument {
    private String typeName;

    public MusicalInstrument(String name) {
        this.typeName = name;
    }

    protected MusicalInstrument() {
    }

    public String getName() {
        return typeName;
    }
}
