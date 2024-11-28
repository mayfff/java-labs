import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DecodeStream extends FilterInputStream {
    char key;

    public DecodeStream(InputStream in, char key) {
        super(in);
        this.key = key;
    }

    @Override
    public int read() throws IOException {
        int b = super.read();
        return (b == -1) ? -1 : b - key;
    }
}
