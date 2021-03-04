public class GenericStack<E> {

	private E[] list;
  private int capacity;

	public GenericStack(int capacity) {
		E[] list = (E[])new Object[capacity];
	}
	
	public int getSize() {
		return capacity;
	}

	public E peek() {
		return list[getSize() - 1];
	}

  public void remove(int index) {

    E[] newList = (E[])new Object[capacity];

    for (int i=0;i<capacity;++i)
      if (index != i)
        newList[i] = list[i];

    E[] list = (E[])new Object[capacity];

    list = newList;
    capacity--;

  }

	public void push(E o) {

    if (list.length < capacity) {
      list[list.length+1] = o;
      return; }

		capacity += 1;
    E[] newList = list;

    for (int i=0;i<capacity-1;++i)
      newList[i] = list[i];

    E[] list = (E[])new Object[capacity];

    for (int i=0;i<capacity-1;++i)
      list[i] = newList[i];

    list[capacity-1] = o;

	}

	public E pop() {
		E o = list[getSize() - 1];
		remove(getSize() - 1);
		return o;
	}

	public boolean isEmpty() {
		return capacity == 0;
	}

}
