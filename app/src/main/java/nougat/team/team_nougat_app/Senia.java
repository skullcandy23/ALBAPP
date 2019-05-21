package nougat.team.team_nougat_app;

public enum Senia
{
    AMARILLO("Amarillo", R.drawable.amarillo),
    AZUL("Azul", R.drawable.azul),
    BLANCO("Blanco", R.drawable.blanco),
    CAFE("Cafe", R.drawable.cafe),
    GRIS("Gris", R.drawable.gris),
    GOMA("Goma", R.drawable.goma),
    HOJA("Hoja", R.drawable.hoja),
    LAPICERO("Lapicero", R.drawable.lapicero),
    LAPIZ("Lapiz", R.drawable.lapiz),
    LIBRO("Libro", R.drawable.libro);

    private final String nombre;
    private final int ruta;

    Senia(String nombre, int ruta)
    {
        this.nombre = nombre;
        this.ruta = ruta;
    }

    public String getNombre()
    {
        return nombre;
    }

    public int getRuta()
    {
        return ruta;
    }
}
