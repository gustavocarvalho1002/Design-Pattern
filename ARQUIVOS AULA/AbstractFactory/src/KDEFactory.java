
public class KDEFactory extends AbstractFactoryGui{

	public KDEFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Botao criarBotao() {
		// TODO Auto-generated method stub
		return new BotaoKDE();
	}

	@Override
	public Janela criarJanela() {
		// TODO Auto-generated method stub
		return new JanelaKDE();
	}

}
