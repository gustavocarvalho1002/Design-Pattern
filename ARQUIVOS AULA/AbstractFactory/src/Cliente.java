
public class Cliente {

	public Cliente() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args)
    {
        AbstractFactoryGui factory = AbstractFactoryGui.obterFactory();

        Janela janela = factory.criarJanela();
        janela.desenhar();
    }

}
