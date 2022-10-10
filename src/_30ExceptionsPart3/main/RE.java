package _30ExceptionsPart3.main;

public class RE implements AutoCloseable {

    @Override
    public void close() throws Exception {
        throw new Exception("E");
    }
}
