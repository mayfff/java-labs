import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class EncodeStream extends FilterOutputStream {
    char key;

    public EncodeStream(OutputStream out, char key) {
        super(out);
        this.key = key;
    }

    @Override
    public void write(int b) throws IOException {
        super.write(b + key);
    }
}
