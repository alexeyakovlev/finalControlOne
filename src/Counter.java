public class Counter implements AutoCloseable {

    private int count;

    public void add(){
        count++;
    }

    public int getCount(){
        return count;
    }

    @Override
    public void close() {
        if (count == 0){
            throw new RuntimeException("Counter was not used");
        }
    }
}
