import java.util.function.UnaryOperator;

public class SquareOperator {
    public static UnaryOperator<Integer> getSquareOperator() {
        return (number) -> number * number;
    }
}
