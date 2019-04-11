
public class GnomeFactory extends AbstractFactoryGui{

	public GnomeFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Botao criarBotao() {
		// TODO Auto-generated method stub
		return new BotaoGnome();
	}

	@Override
	public Janela criarJanela() {
		// TODO Auto-generated method stub
		return new JanelaGnome();
	}

}
