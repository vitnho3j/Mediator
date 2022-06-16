public class PostoPolicial {

    private static PostoPolicial instancia = new PostoPolicial();

    private PostoPolicial(){}

    public static PostoPolicial getInstancia() {
        return instancia;
    }

    public String receberChamadoViatura(String mensagem, String localizacao) {
        return  "Uma viatura está sendo chamada pelo seguinte motivo: " + mensagem +

                Viatura.getInstacia().atenderChamado(localizacao);
    }
}
