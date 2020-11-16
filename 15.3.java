class MyInteger {

  int myInt;

  MyInteger(int myInt) {

    this.myInt = myInt;

  }

  int getInt() {

    return myInt;

  }

  boolean isEven() {

    return myInt % 2 == 0;

  }

  boolean isOdd() {

    return !isEven();

  }

  boolean isPrime() {

    for (int i=2;i<=Math.ceil(Math.sqrt(myInt));++i) {

      if (myInt % i == 0)
        return false;

    }

    return true;

  }

  boolean equals(int num) {

    return num == myInt;

  }

  boolean equals(MyInteger num) {

    return num.myInt == this.myInt;

  }

  static int parseInt(char[] digits) {

    int len = digits.length;
    int num = 0;

    for (int i=0;i<len;++i) {

      num += digits[i] - '0';

      if (i != len - 1)
        num *= 10;

    }

    return num;

  }
  
  static int parseInt(String digits) {

    int len = digits.length();
    int num = 0;

    for (int i=0;i<len;++i) {

      num += digits.charAt(i) - '0';

      if (i != len - 1)
        num *= 10;

    }

    return num;

  }

}
