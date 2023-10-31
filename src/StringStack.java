import java.util.EmptyStackException;

public class StringStack {
   String[] strings = new String[2];
   private int index = 0;

   public StringStack() {

   }

   public void push(String str) {
       if(index>=strings.length) {
           String[] multString = new String[strings.length*2];
           System.arraycopy(strings,0,multString,0,strings.length);
           strings = multString;
       }
       strings[index++] = str;
   }

   public String pop() {
       if (index <= 0) {
           throw new EmptyStackException();
       }
       return strings[--index];
   }

   public boolean isEmpty() {
       if (index <= 0)
           return true;
       return false;

   }

   public int getSize() {
       return index;
   }

   public int getArraySize() {
       return strings.length;
   }

   public String get(int idx) {
       if(idx<=strings.length) {
           throw new IndexOutOfBoundsException();
       }
       return strings[index-1];
   }
}

