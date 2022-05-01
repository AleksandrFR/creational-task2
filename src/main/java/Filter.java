import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (Integer integer : source) {
            if (integer < treshold) {
                logger.log("Элемент " + integer + " проходит");
            } else {
                logger.log("Элемент " + integer + " не проходит");
            }
        }
        source.stream()
                .filter(x -> x < treshold)
                .forEach(result::add);

        logger.log("Прошло фильтр " + result.size() + " элементов из " + source.size());

        StringBuilder sb = new StringBuilder();
        result.forEach(x -> sb.append(x).append(" "));

        logger.log("Выводим результат на экран: " + sb);
        return result;
    }
}
