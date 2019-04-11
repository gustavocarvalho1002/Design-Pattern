
public abstract class AbstractFactoryGui {

	public static AbstractFactoryGui obterFactory()
	{
	    switch(Configuracao.obterInterfaceGraficaAtual())
	    {
	        case"Gnome":
	            return new GnomeFactory();
	        case"KDE":
	            return new KDEFactory();
	        default:
	           return null;
	    }
	}
	
	public abstract Botao criarBotao();
	public abstract Janela criarJanela();

}
