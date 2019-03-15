public class ComplicatedObject{

    private int a;
    private String b;
    private boolean c;

    public static class Builder{
        private int a;
        private String b;
        private boolean c;

        public Builder a(int a){
            this.a = a;
            return this;
        }

        public Builder b(String b){
            this.b = b;
            return this;
        }

        public Builder c(boolean c){
            this.c = c;
            return this;
        }

        public ComplicatedObject build(){
            return new ComplicatedObject(this);
        }
    }

    private ComplicatedObject(Builder builder){
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
    }

    @Override
    public String toString(){
        return a + ", " + b +", " + c;
    }

    public static void main(String[] args){
        ComplicatedObject.Builder builder = new ComplicatedObject.Builder();

        ComplicatedObject o = builder.a(10).b("X").c(false).build();

        System.out.println(o);
    }


}