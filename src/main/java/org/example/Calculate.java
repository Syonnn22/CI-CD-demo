package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculate {
    public static final int so_luong_max = 100;
    private static final Logger logger = LoggerFactory.getLogger(Calculate.class);

    public int tinhTong(int x, int y) {
        logger.info("Đang thực hiện tính tổng cho: {} và {}", x, y);

        if (x < 0 || y < 0) {
            logger.warn("Cảnh báo: Có số âm truyền vào: x={}, y={}", x, y);
        }

        int res = x + y;
        logger.debug("Kết quả tạm tính được: {}", res); // Chỉ hiện nếu Root level là DEBUG
        return res;
    }

    public static double chiaw(double x, double y) {
        return x / y;
    }
}
