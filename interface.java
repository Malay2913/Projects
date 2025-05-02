interface A {
    void methodA();
}

interface B {
    void methodB();
}

class Multiple implements A, B {
    public void methodA() {
        System.out.println("Method A");
    }

    public void methodB() {
        System.out.println("Method B");
    }

    public static void main(String[] args) {
        Multiple obj = new Multiple();
        obj.methodA();
        obj.methodB();
    }
}