package app.behavioral.visitor;

/*
 * created by Mahbod Kh with ❤️.
 */


public interface ShoppingCartVisitor {

    int visit(Book book);

    int visit(Fruit fruit);
}
