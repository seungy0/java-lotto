import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {

    List<Integer> numbers;

    Lotto() {
        generateLottoNumbers();
    }

    private void generateLottoNumbers() {
        numbers = new ArrayList<>();

        for (int i = 1; i <= 45; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);

        numbers = numbers.subList(0, 6);
        Collections.sort(numbers);
    }
}
