public class StackDiziYapısı {
    Integer[] dizi = new Integer[10];
    int sira = 0;

    public void pushStack(int data) {
        if (sira < 10) {
            dizi[sira] = data;
            sira++;
        }
    }

    public void popStack() {
        if (sira > 0) {
            sira--;
            dizi[sira] = null;
        }
    }

    public void isEmptyStack() {
        if (sira == 0) {
            System.out.println("Stack şu an boştur");
        } else {
            System.out.println("Stack boş değil");
        }
    }

    public void isFullStack() {
        if (sira == 10) {
            System.out.println("Stack doludur...");
        } else {
            System.out.println("Stack dolu değildir...");
        }
    }
}
