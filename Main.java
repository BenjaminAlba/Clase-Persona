package com.company;

class Persona
{
    private int edad;
    private String name;

    public void cumplirAnios()
    {
        edad++;
    }

    public void setName(String name)
    {
        this.name =  name;
    }

    public void getEdad()
    {
        return edad;
    }

    public void getName()
    {
        return name;
    }

}



public class Main {

    public static void main(String[] args)
    {
        Persona panchito = new Persona();
        Persona lupita = new Persona();

        panchito.cumplirAnios();
        panchito.cumplirAnios();
        panchito.cumplirAnios();
        panchito.cumplirAnios();
        panchito.setName("Panchito");
        lupita.setName("Lupita");

        lupita.cumplirAnios();
        //panchito.edad=10;
        //lupita.edad=20;

        System.out.println(panchito.getName() + "tiene" + panchito.getEdad() + "años.");
        System.out.println(lupita.getName() + "tiene" + lupita.getEdad() + "años.");






    }
}
