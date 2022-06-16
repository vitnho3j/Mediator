public class Viatura {

    private static Viatura instacia = new Viatura();
    private Viatura(){}


    public static Viatura getInstacia(){
        return instacia;
    }

    public String atenderChamado(String localizacao) {
        return "\nUma Viatura está dirigindo-se para a localização: " + localizacao;
    }
}
