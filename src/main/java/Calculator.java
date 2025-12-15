public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        return a / b;
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver(int a, int b, String type){
        switch (type) {
            case "add":
                return add(a, b);
            case "dif":
                return dif(a, b);
            case "div":
                return div(a, b);
            case "times":
                return times(a, b);
            default:
                return add(a, b);
        }
    }
}
