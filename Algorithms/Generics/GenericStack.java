public class GenericStack<E> {

	private E[] list = (E[])new Object[3];
  private int size = 0;
  private int capacity = 3;

	public int getSize() {
		return size;
	}

	public E peek() {
		return list[getSize()-1];
	}

	public void push(E o) {
		
    if (size < capacity) {
      list[size] = o;
    }
    else {

      E[] tempList = (E[])new Object[capacity];
      capacity *= 2;
      
      for (int i=0;i<size;++i)
        tempList[i] = list[i];

      list = (E[])new Object[capacity];

      for (int i=0;i<size;++i)
        list[i] = tempList[i];

      list[size] = o;

    }

    size++;

	}

  public void remove(int index) {

    E[] tempList = (E[])new Object[size-1];

    for (int i=0,k=0;i<size;++i) {

      if (index != i) {
        
        tempList[k] = list[i];
        k++;
      
      }

    }

    size--;

    list = (E[])new Object[capacity];

    for (int i=0;i<size;++i)
      list[i] = tempList[i];

  }

	public E pop() {
	
  	E o = peek();
		remove(getSize() - 1);
		return o;
	
  }

	public boolean isEmpty() {
	
  	return size == 0;
	
  }

}
