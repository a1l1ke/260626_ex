import java.util.Random;

public class Solution02 {
    public static void main(String[] args) {
//        throw new CustomException(); // Exception이 checked이므로
        // throws or exception block
        try {
            Random random = new Random();
//            int r = random.nextInt(10); // 끝점 제외 (0,9)
//            int r = random.nextInt(1, 10); // 끝점 제외 (1,9)
            boolean f = random.nextBoolean(); // t, f 반반
            if (f) {
                throw new CustomException(); // 발생하면 뒤로 안 감
            }
            throw new CustomException("뭔가 잘못됐어 단단히");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e); // 체크만 푸는 느낌으로 보면 된다
        }
    }
}

// Exception
// RuntimeException
// -> Custom Exception

class CustomException extends Exception {
    private static final String defaultMessage = "너 무슨 짓을 저지른 거야?";

    CustomException() {
        super(defaultMessage);
    }

    CustomException(String message) {
        super(message);
    }
}