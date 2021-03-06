package application.actioncontext;

import java.io.Closeable;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public interface GenericContext extends Closeable {
    public Scanner getScanner();

    public PrintStream getPrintStream();

    public void setInputStream(InputStream stream);

    public void close();
}