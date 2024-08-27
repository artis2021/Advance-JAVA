public class SingleGenericHolder<T> {
    T obj;
    SingleGenericHolder(T obj){
        this.obj = obj;
    }

    public T getObj(){
        return obj;
    }

    public static void main(String[] args) {
        SingleGenericHolder<Integer> obj = new SingleGenericHolder<>(10);
        System.out.println(obj.getObj());

        SingleGenericHolder<String> newObj = new SingleGenericHolder<>("Arti");
        System.out.println(newObj.getObj());
    }
}
