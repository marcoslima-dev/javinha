package NivelIntermediario;

public class Main {

    public static void main(String[] args) {

        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da folha";
        Naruto.idade = 17;
        Naruto.ModoSabioAtivado();

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.idade = 18;
        Sasuke.SharinganAtivado();


        Haruno Sakura =  new Haruno();
        Sakura.nome =  "Sakura Haruno";
        Sakura.aldeia = "Aldeia da folha";
        Sakura.idade = 18;
        Sakura.AtivarCura();

        Hyuga Hinata =  new Hyuga();
        Hinata.nome =  "Hinata Hyuga";
        Hinata.aldeia = "Aldeia da folha";
        Hinata.idade = 18;
        Hinata.Byakugan();

    }

}
