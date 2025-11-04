public class chainFactory {
    public static absHandler criarCadeiaAprovacao() {
        absHandler comprador = new compradorHandler();
        absHandler gerente = new gerenteHandler();
        absHandler diretor = new diretorHandler();

        comprador.setNextHandler(gerente);
        gerente.setNextHandler(diretor);

        return comprador; // o início da cadeia
    }
}
