package decorator;

import java.io.*;

class LowerCaseInputStream extends FilterInputStream {
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c= super.read();
        return (c == -1 ? c : Character.toLowerCase(c));
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i = offset; i < offset+len; i++) {
            b[i] = (byte)Character.toLowerCase(b[i]);
        }
        return result;
    }
}

public class InputStreamDecoratorExample {
    public static void main(String[] args) throws IOException {
        try {
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(System.in));
            try {
                int c;
                while ((c = in.read()) >= 0) {
                    System.out.print((char)c);
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
