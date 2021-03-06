package com.company;

abstract class Prototyp
{
    public int Id;

    public Prototyp(int id)
    {
        Id = id;
    }
    public abstract Prototyp Klonuj() throws CloneNotSupportedException;
}

class PrototypX extends Prototyp implements Cloneable
{
    public PrototypX(int id)
    {
        super(id);
    }

    @Override
    public Prototyp Klonuj() throws CloneNotSupportedException
    {
        return (Prototyp)super.clone();
    }
}

class PrototypY extends Prototyp implements Cloneable
{
    public PrototypY(int id)
    {
        super(id);
    }

    @Override
    public Prototyp Klonuj() throws CloneNotSupportedException
    {
        return (Prototyp)super.clone();
    }
}

class ProgramMainPrototyp 
{
    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypY prototyp1 = new PrototypY(1);
        PrototypY klon1 = (PrototypY)prototyp1.Klonuj();
        System.out.println("Sklonowano: " + klon1.Id);

        PrototypX prototyp2 = new PrototypX(2);
        PrototypX klon2 = (PrototypX)prototyp2.Klonuj();
        System.out.println("Sklonowano: " + klon2.Id);
    }

}