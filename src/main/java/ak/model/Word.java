package ak.model;

public class Word extends AbstractComposite<Symbol> implements Composite<Symbol>, SentencePart {

    public Word() {
    }

    @Override
    public String toSourceString() {
        return super.toSourceString();
    }

    @Override
    public void add(Symbol symbol) {
        super.add(symbol);
    }
}
