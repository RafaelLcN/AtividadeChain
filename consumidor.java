public class consumidor{
    public static void main(String[] args) {
        absHandler cadeia = chainFactory.criarCadeiaAprovacao();
        cadeia.handleRequest(500);
        cadeia.handleRequest(3000);
        cadeia.handleRequest(15000);
        cadeia.handleRequest(50000);
        cadeia.handleRequest(150000);
    }
}
