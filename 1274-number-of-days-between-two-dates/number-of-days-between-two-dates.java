class Solution {
    public int daysBetweenDates(String date1, String date2) {
        int d1 = Integer.parseInt(date1.substring(8));
        int m1 = Integer.parseInt(date1.substring(5, 7));
        int y1 = Integer.parseInt(date1.substring(0, 4));

        int d2 = Integer.parseInt(date2.substring(8));
        int m2 = Integer.parseInt(date2.substring(5, 7));
        int y2 = Integer.parseInt(date2.substring(0, 4));

        if (y1 > y2 || (y1 == y2 && m1 > m2) ||(y1 == y2 && m1 == m2 && d1 > d2)) {

            int temp;

            temp = d1;
            d1 = d2;
            d2 = temp;

            temp = m1;
            m1 = m2;
            m2 = temp;

            temp = y1;
            y1 = y2;
            y2 = temp;
        }

        int days = 0;

        while (d1 != d2 || m1 != m2 || y1 != y2) {
            days++;
            d1++;

            int maxdays;

            if (m1 == 2) {
                if ((y1 % 400 == 0) ||
                    (y1 % 4 == 0 && y1 % 100 != 0)) {
                    maxdays = 29;
                } else {
                    maxdays = 28;
                }
            } else if (m1 == 4 || m1 == 6 ||
                       m1 == 9 || m1 == 11) {
                maxdays = 30;
            } else {
                maxdays = 31;
            }

            if (d1 > maxdays) {
                d1 = 1;
                m1++;

                if (m1 > 12) {
                    m1 = 1;
                    y1++;
                }
            }
        }

        return days;
    }
}