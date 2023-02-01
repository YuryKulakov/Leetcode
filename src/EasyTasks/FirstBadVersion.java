package EasyTasks;

public class FirstBadVersion {
    final static int BAD = 4;

    public static void main(String[] args) {
        int answer = firstBadVersion(13);
        System.out.println(answer);
    }

    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static boolean isBadVersion(int bad) {
        return bad >= BAD;
    }
}
