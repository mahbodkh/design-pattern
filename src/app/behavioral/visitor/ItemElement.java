package app.behavioral.visitor;

/*
 * created by Mahbod Kh with ❤️.
 */


public interface ItemElement {

	public int accept(ShoppingCartVisitor visitor);
}
