package it.unibo.oop.lab.nesting2;

import java.util.Iterator;
import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {

	private final List<T> list;

	public OneListAcceptable(List<T> list) {
		this.list = list;
	}

	public Acceptor<T> acceptor() {
		Iterator<T> temp = list.iterator();
		return new Acceptor<T>() {

			public void accept(T newElement) throws ElementNotAcceptedException {
				if (temp.hasNext()) {
					if (newElement.equals(temp.next())) {
						return;
					} else
						throw new Acceptor.ElementNotAcceptedException(newElement);
				}
				System.out.println("Can't accept any more elements!");
				throw new Acceptor.ElementNotAcceptedException(newElement);
			}

			public void end() throws EndNotAcceptedException {
				if (temp.hasNext()) {
					throw new Acceptor.EndNotAcceptedException();
				} else
					return;
			}

		};

	}
}
