package stack;

import java.awt.image.BufferedImage;
import java.util.EmptyStackException;

public class BufferedImageStack {
    BufferedImage[] arr = new BufferedImage[2];
    private int counter = 0;


    public void push(BufferedImage someBufferedImage) {
        if(counter>=arr.length) {
            BufferedImage[] arr1 = new BufferedImage[arr.length*2];
            arr = arr1;
        }
        arr[counter] = someBufferedImage;
        ++counter;
    }

    public BufferedImage pop() {
        if(arr.toString().isEmpty()) {
            throw new EmptyStackException();
        }
        else {
            counter-=1;
            BufferedImage img = arr[counter];
            arr[counter] = null;
            return img;
        }
    }

    public boolean isEmpty() {
        if(arr.toString().isBlank()) {
            return true;
        }
        return false;
    }

    public BufferedImage get(int index) {
        if(index>=arr.length) {
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
    }

    public int getSize() {
        return counter;
    }

    public int getArraySize() {
        return arr.length;
    }
}



