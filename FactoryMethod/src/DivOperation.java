public class DivOperation extends AbstractOperation {
    @Override
    public double getResult() {
        double result = 0;
        double numberA = getNumberA();
        double numberB = getNumberB();
        if (numberB == 0) {
            try {
                throw new Exception("除数不能为0");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        result = numberA / numberB;
        return result;
    }
}
