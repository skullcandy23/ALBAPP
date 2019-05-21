package nougat.team.team_nougat_app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class SeniaAleatoria
{
    private List<Senia> senias;
    private Random rnd;
    private Senia senia_elegida;
    private List<String> lista_nombre_senias;

    public SeniaAleatoria()
    {
        rnd = new Random();
        senias = new ArrayList<Senia>();
        lista_nombre_senias = new ArrayList<String>();
        for (Senia senia1 : Senia.values())
        {
            senias.add(senia1);
            lista_nombre_senias.add(senia1.getNombre());
        }
    }

    public void obtenerSeniaAleatoria()
    {
        int posicion_elegida = rnd.nextInt(senias.size()); // Obtiene una posicion al azar de la lista
        senia_elegida = senias.get(posicion_elegida);    // la asigna a la variable global
        senias.remove(posicion_elegida); //Como ya se eleigio esa seña se remueve de la LISTA
    }

    /**
     * @param numero_opciones : Cantidad de  opciones a elegir de manera aleatoria.
     */
    public List<String> getOpciones(int numero_opciones)
    {
        int semaforo = numero_opciones;
        if (numero_opciones > lista_nombre_senias.size())
            semaforo = lista_nombre_senias.size();

        String nombre_elegido = "";
        int posicion_elegida = 0;
        int contador = 1;
        List<String> opciones = new ArrayList<String>();
        try
        {
            opciones.add(senia_elegida.getNombre());
        }
        catch (Exception e)
        {
            System.out.println("Debes generar una seña primero antes de pedir los valores");
            opciones.add("Revisa la clase");
            return opciones;
        }


        while(contador < semaforo && opciones.size() < lista_nombre_senias.size()) //Rellena las opciones
        {
            posicion_elegida = rnd.nextInt(lista_nombre_senias.size());
            nombre_elegido = lista_nombre_senias.get(posicion_elegida);

            if(opciones.contains(nombre_elegido))
                continue;


            opciones.add(nombre_elegido);
            contador++;
        }

        List<String> opciones_azar = new ArrayList<String>();

        while(!opciones.isEmpty()) // Agarra al azar y los deja en una nueva lista (opciones_azar)
        {
            int posicion = rnd.nextInt(opciones.size());
            opciones_azar.add(opciones.get(posicion));
            opciones.remove(posicion);
        }

        return opciones_azar;
    }

    public String getNombre()
    {
        return senia_elegida.getNombre();
    }

    public int getRuta()
    {
        return senia_elegida.getRuta();
    }

    public Senia getSenia()
    {
        return senia_elegida;
    }

    public boolean haySenias()
    {
        if (senias.isEmpty())
            return false;
        return true;
    }
}
